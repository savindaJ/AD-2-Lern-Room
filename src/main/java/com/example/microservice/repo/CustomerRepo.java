package com.example.microservice.repo;

import com.example.microservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : savindaJ
 * @date : 2024-05-02
 * @since : 0.1.0
 **/
@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {
}
