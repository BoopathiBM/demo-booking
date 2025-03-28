package com.boopathi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boopathi.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
