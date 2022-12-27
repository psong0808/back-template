package io.cloudtype.gs.controller;

import io.cloudtype.gs.exception.ResourceNotFoundException;
import io.cloudtype.gs.model.Customer;
import io.cloudtype.gs.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/potentialCustomer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

//    @GetMapping
//    public List<Customer> getAllGuests() {
//        return customerRepository.findAll();
//    }

    @PostMapping
    public Customer createPhoneNum(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}
