package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// The bracketed bit gives the service its "bean name"
@Service("customerService")
public class CustomerServiceImpl implements CustomerService
{
    // Member level injection
    @Autowired
    private CustomerRepository customerRepository;
//
//    // Constructor level injection
//    @Autowired
//    public CustomerServiceImpl(CustomerRepository customerRepository)
//    {
//        System.out.println("This is now using constructor injection");
//        this.customerRepository = customerRepository;
//    }
//
//    // Setter level injection
//    @Autowired
//    public void setCustomerRepository(CustomerRepository customerRepository)
//    {
//        System.out.println("This is now using setter injection");
//        this.customerRepository = customerRepository;
//    }

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
