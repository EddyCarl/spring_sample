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

    public void setCustomerRepository(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
