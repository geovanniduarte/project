package com.geo.project.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="pyr_pregunta")
public class PyrPregunta {
	
	@TableGenerator(name = "PYR_PREGUNTA_GEN", 
			table = "pyr_pkid", 
			pkColumnName="pkidnomb", 
			valueColumnName="pkidvalu",
			pkColumnValue="PREGUNTA", 
			initialValue = 1, 
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PYR_PREGUNTA_GEN")
	@Id
	@Column(name="pregid")
	private long pregid;
	@Column(name="pregtext")
	private String pregtext;
	@Column(name="pregusua")
	private int pregusua;
			
	public PyrPregunta() {
	
	}
	
	
	public PyrPregunta( int pregusua, String pregtext) {		
		this.pregtext = pregtext;
		this.pregusua = pregusua;
	}
	
	public long getPregid() {
		return pregid;
	}
	public void setPregid(long pregid) {
		this.pregid = pregid;
	}
	public String getPregtext() {
		return pregtext;
	}
	public void setPregtext(String pregtext) {
		this.pregtext = pregtext;
	}
	public int getPregusua() {
		return pregusua;
	}
	public void setPregusua(int pregusua) {
		this.pregusua = pregusua;
	}

	@Override
	public String toString() {
		return "pregid=" + pregid + ", pregtext=" + pregtext
				+ ", pregusua=" + pregusua ;
	}
	
	
	
}
