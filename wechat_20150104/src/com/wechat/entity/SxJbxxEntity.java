package com.wechat.entity;

public class SxJbxxEntity {
	
	private String sxbm;
	private String sxmc;
	private String cbjgmc;
	private String sxlbmc;
	private String qllxmc;
	private Integer cnsx;
	
	// Constructors
	/** default constructor */
	public SxJbxxEntity() {
	}

	/** minimal constructor */
	public SxJbxxEntity(String sxbm) {
		this.setSxbm(sxbm);
	}

	public SxJbxxEntity(String sxbm, String sxmc, String cbjgmc, String sxlbmc, String qllxmc, Integer cnsx){
		this.setSxbm(sxbm);
		this.setSxmc(sxmc);
		this.setCbjgmc(cbjgmc);
		this.setSxlbmc(sxlbmc);
		this.setQllxmc(qllxmc);
		this.setCnsx(cnsx);
	}
	
	public String getSxbm() {
		return sxbm;
	}

	public void setSxbm(String sxbm) {
		this.sxbm = sxbm;
	}

	public String getSxmc() {
		return sxmc;
	}

	public void setSxmc(String sxmc) {
		this.sxmc = sxmc;
	}

	public String getCbjgmc() {
		return cbjgmc;
	}

	public void setCbjgmc(String cbjgmc) {
		this.cbjgmc = cbjgmc;
	}

	public String getSxlbmc() {
		return sxlbmc;
	}

	public void setSxlbmc(String sxlbmc) {
		this.sxlbmc = sxlbmc;
	}

	public String getQllxmc() {
		return qllxmc;
	}

	public void setQllxmc(String qllxmc) {
		this.qllxmc = qllxmc;
	}

	public Integer getCnsx() {
		return cnsx;
	}

	public void setCnsx(Integer cnsx) {
		this.cnsx = cnsx;
	}
}
