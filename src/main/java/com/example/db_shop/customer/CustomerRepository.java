package com.example.db_shop.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository /*REPOSITORY!!! DATA ACCESS*/

public interface CustomerRepository extends JpaRepository<Customer, Long> {  /*LONG CUZ ID OF CUSTOMER IS LONG*/
/*
    Void save(Optional<Customer> customerToUpdate);
*/
}
