package ar.gob.gbca.baep.model;

import java.util.Date;

public class BaepSecurity {
	
	private String tocken;
	private Date expiration;
	
	
	public String getTocken() {
		return tocken;
	}
	public void setTocken(String tocken) {
		this.tocken = tocken;
	}
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	
	

}
