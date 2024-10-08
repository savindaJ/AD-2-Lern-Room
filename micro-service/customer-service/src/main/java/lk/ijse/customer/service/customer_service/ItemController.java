package lk.ijse.customer.service.customer_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpRequest;

/**
 * @author : savindaJ
 * @date : 2024-05-31
 * @since : 0.1.0
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customer")
public class ItemController {

    private final RestTemplate restTemplate;

    @PostMapping("/save")
    public String saveItem(){
        return restTemplate.getForObject("http://localhost:8080/api/v1/items", String.class);
    }

//    @GetMapping
//    public String getItem(){
//        return restTemplate
//    }

    @PostMapping("/customer-save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO.toString());
        return customerDTO.toString();
    }
}
