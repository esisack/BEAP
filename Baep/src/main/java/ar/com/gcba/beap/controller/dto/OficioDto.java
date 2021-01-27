package ar.com.gcba.beap.controller.dto;

import java.util.List;

public class OficioDto {

	
	private Integer idEmplazador;
	private Integer tipoIncidencia;
	private Integer subTipoIncidencia;
	private String descripcion;
	private Integer motivo;
	private String fecha;
	private Integer origen;
	private Integer area;
	private Integer idCalle;
	private Integer idVereda;	
	private Integer altura;
	private Double metrosCuadrados;
	private Double profundidad;
	private Integer materialidad;
	private String detallarPermiso;
	private Double metrosLineales;
	private String detalleFalta;
	private String perteneceAlTitular;
	private Integer duenoTendido;
	private Integer severidad;
	private String cuit;
	private String titular;
	private Integer telefono;
	private String mail;
	private Integer nActaComprobacion;
	private Integer nActaIntimacion;
	private Integer nDisposicion;
	private Integer nInicioTramite;
	private String fechaDocSade;
	private Double lat;
	private Double lng;
	
	private List<String> imagenes;
	
	public Integer getIdEmplazador() {
		return idEmplazador;
	}
	public void setIdEmplazador(int idEmplazador) {
		this.idEmplazador = idEmplazador;
	}
	public Integer getTipoIncidencia() {
		return tipoIncidencia;
	}
	public void setTipoIncidencia(int tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}
	public Integer getSubTipoIncidencia() {
		return subTipoIncidencia;
	}
	public void setSubTipoIncidencia(int subTipoIncidencia) {
		this.subTipoIncidencia = subTipoIncidencia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getMotivo() {
		return motivo;
	}
	public void setMotivo(int motivo) {
		this.motivo = motivo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getOrigen() {
		return origen;
	}
	public void setOrigen(int origen) {
		this.origen = origen;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Integer getIdCalle() {
		return idCalle;
	}
	public void setIdCalle(int idCalle) {
		this.idCalle = idCalle;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Integer getIdVereda() {
		return idVereda;
	}
	public void setIdVereda(int idVereda) {
		this.idVereda = idVereda;
	}
	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public Double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}
	public Integer getMaterialidad() {
		return materialidad;
	}
	public void setMaterialidad(int materialidad) {
		this.materialidad = materialidad;
	}
	public String getDetallarPermiso() {
		return detallarPermiso;
	}
	public void setDetallarPermiso(String detallarPermiso) {
		this.detallarPermiso = detallarPermiso;
	}
	public Double getMetrosLineales() {
		return metrosLineales;
	}
	public void setMetrosLineales(Double metrosLineales) {
		this.metrosLineales = metrosLineales;
	}
	public String getDetalleFalta() {
		return detalleFalta;
	}
	public void setDetalleFalta(String detalleFalta) {
		this.detalleFalta = detalleFalta;
	}
	public String getPerteneceAlTitular() {
		return perteneceAlTitular;
	}
	public void setPerteneceAlTitular(String perteneceAlTitular) {
		this.perteneceAlTitular = perteneceAlTitular;
	}
	public Integer getDuenoTendido() {
		return duenoTendido;
	}
	public void setDuenoTendido(int duenoTendido) {
		this.duenoTendido = duenoTendido;
	}
	public Integer getSeveridad() {
		return severidad;
	}
	public void setSeveridad(int severidad) {
		this.severidad = severidad;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getnActaComprobacion() {
		return nActaComprobacion;
	}
	public void setnActaComprobacion(int nActaComprobacion) {
		this.nActaComprobacion = nActaComprobacion;
	}
	public Integer getnActaIntimacion() {
		return nActaIntimacion;
	}
	public void setnActaIntimacion(int nActaIntimacion) {
		this.nActaIntimacion = nActaIntimacion;
	}
	public Integer getnDisposicion() {
		return nDisposicion;
	}
	public void setnDisposicion(int nDisposicion) {
		this.nDisposicion = nDisposicion;
	}
	public Integer getnInicioTramite() {
		return nInicioTramite;
	}
	public void setnInicioTramite(int nInicioTramite) {
		this.nInicioTramite = nInicioTramite;
	}
	public String getFechaDocSade() {
		return fechaDocSade;
	}
	public void setFechaDocSade(String fechaDocSade) {
		this.fechaDocSade = fechaDocSade;
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
	public List<String> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}

	
}
