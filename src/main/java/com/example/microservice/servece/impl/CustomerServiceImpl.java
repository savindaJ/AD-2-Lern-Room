package com.example.microservice.servece.impl;

import com.example.microservice.dto.CustomerDTO;
import com.example.microservice.entity.Customer;
import com.example.microservice.repo.CustomerRepo;
import com.example.microservice.servece.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-05-02
 * @since : 0.1.0
 **/
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    private final ModelMapper mapper;

    public CustomerServiceImpl(CustomerRepo customerRepo, ModelMapper mapper) {
        this.customerRepo = customerRepo;
        this.mapper = mapper;
    }
    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        return customerRepo.save(mapper.map(customerDTO, Customer.class)) != null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll().stream().map(customer -> mapper.map(customer, CustomerDTO.class)).toList();
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        return mapper.map(customerRepo.save(mapper.map(customerDTO, Customer.class)), CustomerDTO.class);
    }

    @Override
    public CustomerDTO deleteCustomer(String id) {
        Customer customer = customerRepo.findById(id).orElse(null);
        if (customer != null) {
            customerRepo.delete(customer);
            return mapper.map(customer, CustomerDTO.class);
        }
        return null;
    }
}
