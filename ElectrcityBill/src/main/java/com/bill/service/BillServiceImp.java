package com.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.electrcity.Electrcity;
import com.bill.repo.BillRepo;

@Service
public class BillServiceImp implements BillService {
	
	 @Autowired
     private BillRepo repo;

	@Override
	public Electrcity saveBill(Electrcity electrcity) {
 
		int units = (electrcity.getCurrentReading())-(electrcity.getPreviousReading());
		
		electrcity.setUnits(units);
		
		double totalBill = 0.0;
		
		if(units<300) {
			totalBill = units*1.75;
		}
		else if ((units>=300)&&(units<500)) {
			totalBill = units*3.75;
		}
	    else if (units>=500) {
			totalBill = units*7.75;
		}
		
		electrcity.setTotalbill(totalBill);
		
		Electrcity save = repo.save(electrcity);
		
		return save;
	}

	@Override
	public List<Electrcity> getAll() {
		
		List<Electrcity>getall = repo.findAll();
		
		return getall;
	}

	@Override
	public void deleteElectrcityRecord(int custid) {
	
		repo.deleteById(custid);
		
	}

	@Override
	public Electrcity getOne(int custid) {

		Electrcity get = repo.findById(custid).get();
		
		return get;
	}

	@Override
	public Electrcity updatedRecord(Electrcity electrcity, int custid) {
		Electrcity oldRecElectrcity = repo.findById(custid).get();
		oldRecElectrcity.setCustname(electrcity.getCustname());
		oldRecElectrcity.setCurrentReading(electrcity.getCurrentReading());
		oldRecElectrcity.setPreviousReading(electrcity.getPreviousReading());
		int units = (electrcity.getCurrentReading())-(electrcity.getPreviousReading());
		
         oldRecElectrcity.setUnits(units);		
		double totalBill = 0.0;
		
		if(units<300) {
			totalBill = units*1.75;
		}
		else if ((units>=300)&&(units<500)) {
			totalBill = units*3.75;
		}
	    else if (units>=500) {
			totalBill = units*7.75;
		}
		oldRecElectrcity.setTotalbill(totalBill);
		
		Electrcity update = repo.save(oldRecElectrcity);
		
		return update;
	}
	

}
