package io.cloudtype.gs.repository;

import io.cloudtype.gs.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
