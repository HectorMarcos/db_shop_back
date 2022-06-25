package com.example.db_shop.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*Controller works for endpoints*/

@RestController /*CONTROLLER!!!*/
@RequestMapping(path = "api/customer")
public class CustomerController {

    private final CustomerService customerService; /*Calling service*/

    @Autowired
    public CustomerController(CustomerService customerService) { /*Constructing object Customer*/
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() { /*Calling method*/
        return customerService.getCustomers();
    }

}
