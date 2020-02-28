package com.liuhao.pojo;

import java.io.Serializable;

public class City implements Serializable{

	private Integer id;
	private String cityname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cityname=" + cityname + "]";
	}
	public City(Integer id, String cityname) {
		super();
		this.id = id;
		this.cityname = cityname;
	}
}
