package com.capg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> emplist = new ArrayList<Employee>();;
	
	
	
	
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU(String sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public void addList(Employee emp) {
		System.out.println(emp);
		this.emplist.add(emp);
	}
	
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", emplist=" + emplist + "]";
	}
		
	
}
