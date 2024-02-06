package com.bill.electrcity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Electrcity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custid;
    private String custname;
    private int currentReading;
    private int previousReading;
    private int units;
    private double totalbill;
	public Electrcity() {

		System.out.println("TableCreated");
		
	}
	public Electrcity(int custid, String custname, int currentReading, int previousReading, int units,
			double totalbill) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.currentReading = currentReading;
		this.previousReading = previousReading;
		this.units = units;
		this.totalbill = totalbill;
	}
	@Override
	public String toString() {
		return "Electrcity [custid=" + custid + ", custname=" + custname + ", currentReading=" + currentReading
				+ ", previousReading=" + previousReading + ", units=" + units + ", totalbill=" + totalbill + "]";
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getCurrentReading() {
		return currentReading;
	}
	public void setCurrentReading(int currentReading) {
		this.currentReading = currentReading;
	}
	public int getPreviousReading() {
		return previousReading;
	}
	public void setPreviousReading(int previousReading) {
		this.previousReading = previousReading;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
    
	
    
}
