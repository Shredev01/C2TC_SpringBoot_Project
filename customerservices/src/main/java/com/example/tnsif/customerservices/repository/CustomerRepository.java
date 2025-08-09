package com.example.tnsif.customerservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tnsif.customerservices.entity.*;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}