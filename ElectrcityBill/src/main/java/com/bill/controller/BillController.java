package com.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bill.electrcity.Electrcity;
import com.bill.service.BillServiceImp;

@RestController
public class BillController {

@Autowired	
private BillServiceImp serviceImp;

@PostMapping("/save")
public String save(@RequestBody Electrcity electrcity) {
	
	Electrcity electrcity2 = serviceImp.saveBill(electrcity);
	
	String status = null;
	
	if(electrcity2!=null) {
		status = "RecordSaved";
	}
	else {
		status = "RecordNotSaved";
	}
	
	return status;
}

@GetMapping("/getall")
 public List<Electrcity> getAll() {
	
	 List<Electrcity> getall = serviceImp.getAll();
	 
	 return getall;
}

@DeleteMapping("/delete/{custid}")
public String delete(@PathVariable int custid) {
	
    	serviceImp.deleteElectrcityRecord(custid);
    	
    	return custid+"..DeletedSuccefully";
    	
}

@GetMapping("/get/{custid}")
public Electrcity getOne(@PathVariable int custid) {
	
	Electrcity get = serviceImp.getOne(custid);
	
	return get;
}

@PutMapping("/update/{custid}")
public Electrcity update(@RequestBody Electrcity electrcity, @PathVariable int custid) {
	
	Electrcity update = serviceImp.updatedRecord(electrcity, custid);
	
	return update;
	
}


}
