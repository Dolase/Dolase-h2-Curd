package com.mydata.web.dto;

public class CourseDto {

	private Long cid;
	private String cname;
	private String duration;
	private int fees;
	
	public CourseDto() {}
	
	public CourseDto(Long cid, String cname, String duration, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.fees = fees;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
	
}
