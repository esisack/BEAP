package ar.com.gcba.beap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vividsolutions.jts.geom.Geometry;

@Entity
@Table(name = "workunits")
public class WorkUnit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdWorkunit")
	protected Integer idWorkUnit;

	@Column(name = "IdDominio")
	protected Integer idDominio;

	@Column(name = "Clase")
	private String clase;

	@Column(name = "IdCreadoPor")
	private int idCreadoPor;

	@Column(name = "IdVereda")
	protected Integer idVereda;

	@Column(name = "IDCalle")
	protected Integer idCalle;

	@Column(name = "Altura")
	protected Integer altura;

	@Column(name = "Lat")
	protected Double lat;

	@Column(name = "Lng")
	protected Double lng;

	@Column(name = "IdInstanciaBPM")
	protected Long idInstanciaBPM;

	@Column(name = "geom")
	private Geometry geom;

	public WorkUnit() {
		super();
		idDominio = 2;
		clase = "DBIncidencia";
	}

	public Integer getIdWorkUnit() {
		return idWorkUnit;
	}

	public void setIdWorkUnit(Integer idWorkUnit) {
		this.idWorkUnit = idWorkUnit;
	}

	public Integer getIdDominio() {
		return idDominio;
	}

	public void setIdDominio(Integer idDominio) {
		this.idDominio = idDominio;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getIdCreadoPor() {
		return idCreadoPor;
	}

	public void setIdCreadoPor(int idCreadoPor) {
		this.idCreadoPor = idCreadoPor;
	}

	public Integer getIdVereda() {
		return idVereda;
	}

	public void setIdVereda(Integer idVereda) {
		this.idVereda = idVereda;
	}

	public Integer getIdCalle() {
		return idCalle;
	}

	public void setIdCalle(Integer idCalle) {
		this.idCalle = idCalle;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Geometry getGeom() {
		return geom;
	}

	public void setGeom(Geometry geom) {
		this.geom = geom;
	}


	public Long getIdInstanciaBPM() {
		return idInstanciaBPM;
	}

	public void setIdInstanciaBPM(Long idInstanciaBPM) {
		this.idInstanciaBPM = idInstanciaBPM;
	}

}
