package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public List<Customer> orderBy(String property){
        return customerRepository.findAll(Sort.by(Sort.Direction.ASC, property));
    }


    public List<Customer> findByFirstName(String property){
        return customerRepository.findByFirstName();
    }


}
