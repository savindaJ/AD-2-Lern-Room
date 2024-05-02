package com.example.microservice.servece;

import com.example.microservice.dto.CustomerDTO;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-05-02
 * @since : 0.1.0
 **/
public interface CustomerService {
    boolean saveCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> getAllCustomers();

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    CustomerDTO deleteCustomer(String id);
}
