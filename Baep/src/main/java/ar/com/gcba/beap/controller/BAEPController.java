package ar.com.gcba.beap.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ar.com.gcba.beap.controller.dto.OficioDto;
import ar.com.gcba.beap.controller.dto.SincroDto;
import ar.com.gcba.beap.model.CategoryValue;
import ar.com.gcba.beap.model.Documento;
import ar.com.gcba.beap.model.DocumentoWorkunit;
import ar.com.gcba.beap.model.Incidencia;
import ar.com.gcba.beap.model.WorkUnit;
import ar.com.gcba.beap.repository.CategoryValueRepository;
import ar.com.gcba.beap.repository.DocumentoRepository;
import ar.com.gcba.beap.repository.DocumentoWorkunitRepository;
import ar.com.gcba.beap.repository.IncidenciaRepository;
import ar.com.gcba.beap.repository.WorkUnitRepository;
import ar.com.gcba.beap.services.BPMService;

@CrossOrigin(value = "*")
@RestController
public class BAEPController {

	@Value("${image.url}")
	private static String imageUrl;

	@Value("${jbpm.container}")
	private String container;

	@Value("${jbpm.process}")
	private String process;

	@Autowired
	private CategoryValueRepository categoryRepository;

	@Autowired
	private WorkUnitRepository workUnitRepository;

	@Autowired
	private IncidenciaRepository incidenciaRepository;

	@Autowired
	private DocumentoRepository documentoRepository;

	@Autowired
	private DocumentoWorkunitRepository documentoWorkunitRepository;

	@Autowired
	private BPMService service;

	@RequestMapping(value = "/sync", method = RequestMethod.GET)
	public SincroDto getSync() {
		SincroDto sincro = new SincroDto();
		sincro.setCategorias(categoryRepository.findAll());
		return sincro;
	}
	
	@RequestMapping(value = "/oficios", method = RequestMethod.GET)
	public Optional<Incidencia> getIncidencias() {
		return incidenciaRepository.findById(289637);

	}

	@RequestMapping(value = "/workunits", method = RequestMethod.GET)
	public Optional<WorkUnit> getWorkUnits() {
		return workUnitRepository.findById(289637);

	}


	@RequestMapping(value = "/oficios", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody OficioDto oficioDto) throws Exception {

		Documento doc = null;
		DocumentoWorkunit docWorkunit = null;

		WorkUnit wu = (WorkUnit) getWorkUnitDto(oficioDto);
		WorkUnit workUnit = workUnitRepository.save(wu);
		int id = wu.getIdWorkUnit();

		Incidencia inc = (Incidencia) getIncidenceDto(oficioDto);
		inc.setIdInicidencia(id);
		incidenciaRepository.save(inc);

		for (String imagen : oficioDto.getImagenes()) {
			doc = new Documento();
			doc.setExtension("jpg");
			doc.setFechaToma(new Date());
			doc.setLat((double) 1);
			doc.setLng((double) 1);
			doc.setIdDominio(2);
			doc.setLocation((Point) wktToGeometry("POINT (1 1)"));
			int idDoc = documentoRepository.save(doc).getIdDoc();

			docWorkunit = new DocumentoWorkunit();
			docWorkunit.setIdDoc(idDoc);
			docWorkunit.setIdWorkUnit(id);
			documentoWorkunitRepository.save(docWorkunit);

			// uploadImage(imagen);

		}

		// crear sesion en jbpm
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("idwu", wu.getIdWorkUnit());
		Long instanceId = service.startNewInstance(container, process, parameters);
		workUnit.setIdInstanciaBPM(instanceId);
		workUnitRepository.save(workUnit);

		return ResponseEntity.ok("");
	}

	private Object getWorkUnitDto(OficioDto oficioDto) {

		WorkUnit wu = new WorkUnit();
		wu.setAltura(oficioDto.getAltura());
		wu.setIdCalle(oficioDto.getIdCalle());
		wu.setIdVereda(oficioDto.getIdVereda());
		wu.setLat(oficioDto.getLat());
		wu.setLng(oficioDto.getLng());
		wu.setIdCreadoPor(177102);
		return wu;
	}

	private Incidencia getIncidenceDto(OficioDto oficioDto) {

		Incidencia inc = new Incidencia();

		inc.setCuit(oficioDto.getCuit());
		inc.setDescripcion(oficioDto.getDescripcion());
		inc.setDetalleFalta(oficioDto.getDetalleFalta());
		inc.setDetallarPermiso(oficioDto.getDetallarPermiso());
		inc.setDuenoTendido(oficioDto.getDuenoTendido()); //
		inc.setFechaDocSade(oficioDto.getFechaDocSade());
		inc.setIdArea(oficioDto.getArea());
		inc.setMail(oficioDto.getMail());
		inc.setMaterialidad(oficioDto.getMaterialidad());
		inc.setMetrosCuadrados(oficioDto.getMetrosCuadrados());
		inc.setMetrosLineales(oficioDto.getMetrosLineales());
		inc.setnActaComprobacion(oficioDto.getnActaComprobacion());
		inc.setnActaIntimacion(oficioDto.getnActaIntimacion());
		inc.setnDisposicion(oficioDto.getnDisposicion());
		inc.setnInicioTramite(oficioDto.getnInicioTramite());
		inc.setOrigen(oficioDto.getOrigen());
		inc.setPerteneceAlTitular(oficioDto.getPerteneceAlTitular());
		inc.setProfundidad(oficioDto.getProfundidad());
		inc.setSeveridad(oficioDto.getSeveridad());
		inc.setSubTipo(oficioDto.getSubTipoIncidencia());
		inc.setTelefono(oficioDto.getTelefono());
		inc.setTipo(oficioDto.getTipoIncidencia());
		inc.setTitular(oficioDto.getTitular());

		return inc;
	}

	private static void uploadImage(String image) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> result = restTemplate.postForEntity(imageUrl, String.class, null);
		System.out.println(result);
	}

	public Geometry wktToGeometry(String wellKnownText) throws ParseException {
		return new WKTReader().read(wellKnownText);
	}

}