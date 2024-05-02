package com.example.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : savindaJ
 * @date : 2024-05-02
 * @since : 0.1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;
}
