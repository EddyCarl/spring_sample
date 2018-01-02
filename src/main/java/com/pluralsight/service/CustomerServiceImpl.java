package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// The bracketed bit gives the service its "bean name"
@Service("customerService")
public class CustomerServiceImpl implements CustomerService
{
    private CustomerRepository customerRepository;

    public CustomerServiceImpl()
    {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository)
    {
        System.out.println("We are using constructor injection.");
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository)
    {
        System.out.println("We are using setter injection.");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
