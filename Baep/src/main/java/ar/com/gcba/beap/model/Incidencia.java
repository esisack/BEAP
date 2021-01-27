package ar.com.gcba.beap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vividsolutions.jts.geom.Point;

@Entity
@Table(name = "incidencias")
public class Incidencia {

	@Id
	@Column(name = "IdIncidencia")
	private Integer idInicidencia;

	@Column(name = "Tipo")
	private Integer tipo;

	@Column(name = "SubTipo")
	private Integer subTipo;

	@Column(name = "Origen")
	private Integer origen;

	@Column(name = "IdArea")
	private Integer idArea;

	@Column(name = "Descripcion")
	private String descripcion;

	@Column(name = "MetrosCuadradosRotos")
	private Double metrosCuadrados;

	@Column(name = "Profundidad")
	private Double profundidad;

	@Column(name = "Materialidad")
	private Integer materialidad;

	@Column(name = "DetallarPermiso")
	private String detallarPermiso;

	@Column(name = "MetrosLineales")
	private Double metrosLineales;

	@Column(name = "DetalleFalta")
	private String detalleFalta;

	@Column(name = "PerteneceAlTitular")
	private String perteneceAlTitular;

	@Column(name = "DuenoTendido")
	private Integer duenoTendido;

	@Column(name = "Severidad")
	private Integer severidad;

	@Column(name = "CUIT")
	private String cuit;

	@Column(name = "Titular")
	private String titular;

	@Column(name = "Telefono")
	private Integer telefono;

	@Column(name = "Mail")
	private String mail;

	@Column(name = "NActaComprobacion")
	private Integer nActaComprobacion;

	@Column(name = "NActaIntimacion")
	private Integer nActaIntimacion;

	@Column(name = "NDisposicion")
	private Integer nDisposicion;

	@Column(name = "NInicioTramite")
	private Integer nInicioTramite;

	@Column(name = "FechaDocSade")
	private String fechaDocSade;

	@Column(name = "UbicacionRelevamiento")
	private Point ubicacionRelevamiento;

	@Column(name = "Estado")
	private Integer estado;

	
	public Incidencia() {
		super();
		estado = 0;
	}

	public Integer getIdInicidencia() {
		return idInicidencia;
	}

	public void setIdInicidencia(int idInicidencia) {
		this.idInicidencia = idInicidencia;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Integer getSubTipo() {
		return subTipo;
	}

	public void setSubTipo(int subTipo) {
		this.subTipo = subTipo;
	}

	public Integer getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Point getUbicacionRelevamiento() {
		return ubicacionRelevamiento;
	}

	public void setUbicacionRelevamiento(Point ubicacionRelevamiento) {
		this.ubicacionRelevamiento = ubicacionRelevamiento;
	}

}
