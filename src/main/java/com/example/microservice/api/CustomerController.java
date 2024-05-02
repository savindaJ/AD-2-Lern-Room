package com.example.microservice.api;

import com.example.microservice.dto.CustomerDTO;
import com.example.microservice.servece.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

/**
 * @author : savindaJ
 * @date : 2024-05-02
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO customerDTO){
        return ResponseEntity.created(URI.create("/api/v1/customer/"+customerService.saveCustomer(customerDTO))).build();
    }

    @GetMapping
    public ResponseEntity<?> getAllCustomers(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @PutMapping
    public ResponseEntity<?> updateCustomer(@RequestBody CustomerDTO customerDTO){
        return ResponseEntity.ok(customerService.updateCustomer(customerDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable String id){
        return ResponseEntity.ok(customerService.deleteCustomer(id));
    }
}
