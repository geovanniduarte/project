package com.geo.project.common.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.geo.project.common.Identificable;

@Entity
@Table(name="pyr_usuario")
public class PyrUsuario implements Identificable<Long> {
	
	@TableGenerator(name = "PYR_USUA_GEN", 
			table = "pyr_pkid", 
			pkColumnName="pkidnomb", 
			valueColumnName="pkidvalu",
			pkColumnValue="USUARIO", 
			initialValue = 1, 
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PYR_USUA_GEN")
	@Id
	@Column(name="usuaid")
	private long usuaid;
	
	@Column(name="usuanomb")	
	private String usuanomb;
	
	@Column(name="usuapass")
	private String usuapass;
	
	@Column(name="usuahabi")
	private boolean usuahabi;
	
	@Column(name="usuac2dm")
	private String usuac2dm;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY )
	@JoinColumn(name="usrousua")
	private List<PyrUsuarole> roles; 

	public PyrUsuario() {
		super();
	}

	/**
	 * Construccion para insercion de nuevo usuario en bd.
	 */
	public PyrUsuario(String usuanomb, String usuapass, String usuac2dm) {	
		this.usuanomb = usuanomb;
		this.usuapass = usuapass;
		this.usuac2dm = usuac2dm;
		this.usuahabi = true;
	}

	public long getUsuaid() {
		return usuaid;
	}

	public void setUsuaid(long usuaid) {
		this.usuaid = usuaid;
	}

	public String getUsuanomb() {
		return usuanomb;
	}

	public void setUsuanomb(String usuanomb) {
		this.usuanomb = usuanomb;
	}

	public String getUsuapass() {
		return usuapass;
	}

	public void setUsuapass(String usuapass) {
		this.usuapass = usuapass;
	}

	public boolean getUsuahabi() {
		return usuahabi;
	}

	public void setUsuahabi(boolean usuahabi) {
		this.usuahabi = usuahabi;
	}

	public String getUsuac2dm() {
		return usuac2dm;
	}

	public void setUsuac2dm(String usuac2dm) {
		this.usuac2dm = usuac2dm;
	}

	public List<PyrUsuarole> getRoles() {
		return roles;
	}

	public void setRoles(List<PyrUsuarole> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "PyrUsuario [usuaid=" + usuaid + ", usuanomb=" + usuanomb
				+ ", usuapass=" + usuapass + ", usuahabi=" + usuahabi + "]";
	}

	@Override
	public Long getIdentifier() {		
		return this.usuaid;
	}
	
	

}
