package com.rishabhsoft.customer.repository;

import com.rishabhsoft.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByUserNameAndPassword(String userName, String password);
}
