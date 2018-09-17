package com.nibi.springdata.hibernateinheritance.entities.repos;

import org.springframework.data.repository.CrudRepository;

import com.nibi.springdata.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
