package com.geo.project.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="pyr_usuarole")
public class PyrUsuarole {
	
	@TableGenerator(name = "PYR_USRO_GEN", 
			table = "pyr_pkid", 
			pkColumnName="pkidnomb", 
			valueColumnName="pkidvalu",
			pkColumnValue="USUAROLE", 
			initialValue = 1, 
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PYR_USRO_GEN")
	@Id
	@Column(name="usroid")
	private int usroid;
	
	@Column(name="usrousua")
	private int usrousua;
	
	@Column(name="usrorole")
	private String usrorole;

	public int getUsroid() {
		return usroid;
	}

	public void setUsroid(int usroid) {
		this.usroid = usroid;
	}

	public int getUsrousua() {
		return usrousua;
	}

	public void setUsrousua(int usrousua) {
		this.usrousua = usrousua;
	}

	public String getUsrorole() {
		return usrorole;
	}

	public void setUsrorole(String usrorole) {
		this.usrorole = usrorole;
	}

	@Override
	public String toString() {
		return "PyrUsuarole [usroid=" + usroid + ", usrousua=" + usrousua
				+ ", usrorole=" + usrorole + "]";
	}

	
}
