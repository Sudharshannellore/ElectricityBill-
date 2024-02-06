package com.bill.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bill.electrcity.Electrcity;

@Repository
public interface BillRepo extends JpaRepository<Electrcity, Integer> {

}
