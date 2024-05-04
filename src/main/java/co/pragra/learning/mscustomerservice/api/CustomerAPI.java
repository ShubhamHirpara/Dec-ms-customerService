package co.pragra.learning.mscustomerservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerAPI {

    @GetMapping("/getName")
    public String getCustomerfirstName(){
        return "James";
    }
}
