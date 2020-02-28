package com.liuhao.pojo;

import java.awt.Frame;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String sex;
	private Integer pid;
	private Integer cid;
	private Integer xid;
	private String pname;
	private String cname;
	private String xname;
	private String issue_date;
	private Integer break_num;
	private String driver_num;
	
	
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getXname() {
		return xname;
	}
	public void setXname(String xname) {
		this.xname = xname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getXid() {
		return xid;
	}
	public void setXid(Integer xid) {
		this.xid = xid;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		
		
		this.issue_date = issue_date;
	}
	public Integer getBreak_num() {
		return break_num;
	}
	public void setBreak_num(Integer break_num) {
		this.break_num = break_num;
	}
	public String getDriver_num() {
		return driver_num;
	}
	public void setDriver_num(String driver_num) {
		this.driver_num = driver_num;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(Integer id, String name, String sex, Integer pid, Integer cid, Integer xid, String issue_date,
			Integer break_num, String driver_num) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.pid = pid;
		this.cid = cid;
		this.xid = xid;
		this.issue_date = issue_date;
		this.break_num = break_num;
		this.driver_num = driver_num;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", sex=" + sex + ", pid=" + pid + ", cid=" + cid + ", xid=" + xid
				+ ", issue_date=" + issue_date + ", break_num=" + break_num + ", driver_num=" + driver_num + "]";
	}
	public Driver(Integer id, String name, String sex, Integer pid, Integer cid, Integer xid, String pname,
			String cname, String xname, String issue_date, Integer break_num, String driver_num) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.pid = pid;
		this.cid = cid;
		this.xid = xid;
		this.pname = pname;
		this.cname = cname;
		this.xname = xname;
		this.issue_date = issue_date;
		this.break_num = break_num;
		this.driver_num = driver_num;
	}
	
	

}
