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
    // This automatically pulls the bean in to this line (The HibernateCustomerRepositoryImpl bean)
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
