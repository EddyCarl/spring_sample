package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

// The bracketed bit gives the repository its "bean name"
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository
{

    @Override
    public List<Customer> findAll()
    {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Bryan");
        customer.setLastname("Hansen");

        customers.add(customer);

        return customers;
    }
}
