package com.liuhao.pojo;

import java.io.Serializable;
import java.util.Date;

public class DriverBreak implements Serializable{

	/**
	 * 创建交通违法记录表
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String break_str;
	private Integer bread_money;
	private Integer deduct_marks;
	private Date break_date;
	private Integer state;
	private Integer did;
	private String name;
	private String driver_num;
	
	
	public String getDriver_num() {
		return driver_num;
	}
	public void setDriver_num(String driver_num) {
		this.driver_num = driver_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBreak_str() {
		return break_str;
	}
	public void setBreak_str(String break_str) {
		this.break_str = break_str;
	}
	public Integer getBread_money() {
		return bread_money;
	}
	public void setBread_money(Integer bread_money) {
		this.bread_money = bread_money;
	}
	public Integer getDeduct_marks() {
		return deduct_marks;
	}
	public void setDeduct_marks(Integer deduct_marks) {
		this.deduct_marks = deduct_marks;
	}
	public Date getBreak_date() {
		return break_date;
	}
	public void setBreak_date(Date break_date) {
		this.break_date = break_date;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public DriverBreak() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DriverBreak [id=" + id + ", break_str=" + break_str + ", bread_money=" + bread_money + ", deduct_marks="
				+ deduct_marks + ", break_date=" + break_date + ", state=" + state + ", did=" + did + "]";
	}
	public DriverBreak(Integer id, String break_str, Integer bread_money, Integer deduct_marks, Date break_date,
			Integer state, Integer did) {
		super();
		this.id = id;
		this.break_str = break_str;
		this.bread_money = bread_money;
		this.deduct_marks = deduct_marks;
		this.break_date = break_date;
		this.state = state;
		this.did = did;
	}

	
}
