package com.retailstore.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailstore.bill.model.BillDetails;

@Repository
public interface BillDetailsRepository extends JpaRepository<BillDetails, Long> {

}
