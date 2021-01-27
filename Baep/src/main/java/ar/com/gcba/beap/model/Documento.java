package ar.com.gcba.beap.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.locationtech.jts.geom.Point;



@Entity
@Table(name = "documentos")
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdDoc")
	protected Integer idDoc;

	@Column(name = "IdDominio")
	private Integer idDominio;
	
	@Column(name = "Extension")
	protected String extension;

	@Temporal(TemporalType.DATE)
	@Column(name = "FechaToma")
	protected Date fechaToma;

	@Column(name = "Location", columnDefinition = "POINT")
	protected Point location;
	
	@Column(name = "Lat")
	private Double lat;
	
	@Column(name = "Lng")
	private Double lng;
	
	
	public Documento() {
	}

	public Integer getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}

	public Integer getIdDominio() {
		return idDominio;
	}

	public void setIdDominio(Integer idDominio) {
		this.idDominio = idDominio;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Date getFechaToma() {
		return fechaToma;
	}

	public void setFechaToma(Date fechaToma) {
		this.fechaToma = fechaToma;
	}

	
	public Point getLocation() {
		return location;
	}

	public void setLocation(Point p1) {
		this.location = p1;
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

	@Override
	public String toString() {
		return "Documento [idDoc=" + idDoc + ", extension=" + extension + ", fechaToma=" + fechaToma + "]";
	}

}
