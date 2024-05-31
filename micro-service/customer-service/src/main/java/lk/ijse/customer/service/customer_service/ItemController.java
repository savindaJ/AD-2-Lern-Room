package lk.ijse.customer.service.customer_service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : savindaJ
 * @date : 2024-05-31
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/customer")
public class ItemController {

    @PostMapping("/save")
    public String saveItem(){
        return "Customer saved";
    }
}
