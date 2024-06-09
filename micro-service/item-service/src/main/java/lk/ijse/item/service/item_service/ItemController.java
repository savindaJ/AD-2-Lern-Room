package lk.ijse.item.service.item_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : savindaJ
 * @date : 2024-05-31
 * @since : 0.1.0
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/items")
public class ItemController {

    private final RestTemplate restTemplate;

    @PostMapping("/save")
    public String saveItem(){
        return restTemplate.postForObject("http://SPRINGBOOT-CUSTOMER-SERVICE/api/v1/customer/save", null, String.class);
    }

    @GetMapping
    public String getItem(){
        return "Item Getted !";
    }

    @PostMapping("/customer-save")
    public String saveCustomer(){
        CustomerDTO customerDTO = new CustomerDTO("C001", "Savinda", "Galle");
        // using restTemplate to call the customer service , by using the service name
        return restTemplate.postForObject("http://SPRINGBOOT-CUSTOMER-SERVICE/api/v1/customer/customer-save", customerDTO, String.class);
    }
}
