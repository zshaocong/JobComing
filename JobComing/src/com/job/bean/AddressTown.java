package com.job.bean;

public class AddressTown {
	//区县序号  区县编码 所属城市编码 区县名称
	private  int townId;
	private int townCode;
	private int cityCode;
	private String townName;
	public int getTownId() {
		return townId;
	}
	public void setTownId(int townId) {
		this.townId = townId;
	}
	public int getTownCode() {
		return townCode;
	}
	public void setTownCode(int townCode) {
		this.townCode = townCode;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public AddressTown() {
		super();
	}
	
}
