package com.css.example1;

import java.util.Arrays;

public class Batch implements BatchServiceProvider {
	private String batchCode;
	private String startdate;
	private String enddate;
	private Trainee[] trainees;
	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Batch(String batchCode, String startdate, String enddate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainees = trainees;
	}
	
	
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainees="
				+ Arrays.toString(trainees) + "]";
	}
	@Override
	public Trainee getTrainees(String gender) {
		// TODO Auto-generated method stub
		Trainee test = null;
		for(Trainee t : this.trainees) {
			if(t.getGender()==gender) {
				test=t;
				break;
			}
		}
		return test;
}	
}


