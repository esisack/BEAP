package ar.com.gcba.beap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentos_workunit")
public class DocumentoWorkunit {

	@Column(name = "IdWorkunit")
	protected Integer idWorkUnit;
	
	@Id
	@Column(name = "IdDoc")
	protected Integer idDoc;

	public Integer getIdWorkUnit() {
		return idWorkUnit;
	}

	public void setIdWorkUnit(Integer idWorkUnit) {
		this.idWorkUnit = idWorkUnit;
	}

	public Integer getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}
	
	
}
