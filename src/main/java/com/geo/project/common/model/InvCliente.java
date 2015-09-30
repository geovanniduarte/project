package com.geo.project.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.geo.project.common.Identificable;

@Entity
@Table(name="inv_cliente")
public class InvCliente implements Identificable<Long> {
	
	@TableGenerator(name = "INV_CLIE_GEN", 
			table = "pyr_pkid", 
			pkColumnName="pkidnomb", 
			valueColumnName="pkidvalu",
			pkColumnValue="CLIENTE", 
			initialValue = 1, 
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "INV_CLIE_GEN")
	@Id
	@Column(name="clieid")
	private long clieid;
	
	@Column(name="clienit")
	private String clienit;
	
	@Column(name="clienomb")
	private String clienomb;
	
	@Column(name="cliedire")
	private String cliedire;
	
	@Column(name="clieciud")
	private int clieciud;
	
	@Column(name="clieacti")
	private int clieacti;

	public long getClieid() {
		return clieid;
	}

	public void setClieid(long clieid) {
		this.clieid = clieid;
	}

	public String getClienit() {
		return clienit;
	}

	public void setClienit(String clienit) {
		this.clienit = clienit;
	}

	public String getClienomb() {
		return clienomb;
	}

	public void setClienomb(String clienomb) {
		this.clienomb = clienomb;
	}

	public String getCliedire() {
		return cliedire;
	}

	public void setCliedire(String cliedire) {
		this.cliedire = cliedire;
	}

	public int getClieciud() {
		return clieciud;
	}

	public void setClieciud(int clieciud) {
		this.clieciud = clieciud;
	}

	public int getClieacti() {
		return clieacti;
	}

	public void setClieacti(int clieacti) {
		this.clieacti = clieacti;
	}

	@Override
	public Long getIdentifier() {
		return this.getClieid();
	}
	
}
