package com.bill.service;

import java.util.List;

import com.bill.electrcity.Electrcity;

public interface BillService {
	
	public Electrcity saveBill(Electrcity electrcity);
	public List<Electrcity>getAll();
	public void deleteElectrcityRecord(int custid);
	public Electrcity getOne(int custid);
	public Electrcity updatedRecord(Electrcity electrcity, int custid);

	
}
	
