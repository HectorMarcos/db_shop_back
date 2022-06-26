package com.example.db_shop.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*Controller works for endpoints*/

@RestController /*CONTROLLER!!!*/
@CrossOrigin
@RequestMapping(path = "api")
public class CustomerController {

    private final CustomerService customerService; /*Calling service*/



    @Autowired
    public CustomerController(CustomerService customerService) { /*Constructing object Customer*/
        this.customerService = customerService;
    }
    @RequestMapping(value = "/customer")
    public List<Customer> getCustomers() { /*Calling method*/
        return customerService.getCustomers();
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Customer> getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping (value = "/customer/add", produces = "application/json")
    public Customer addCustomer(Customer newCustomer){
        return customerService.addCustomer(newCustomer);
    }


    @RequestMapping(value = "/customer/remove/{id}")
    public void removeCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }

    @RequestMapping(value = "/customer/update")
    public void updateCustomer(Customer customerUpdated){
        customerService.updateCustomer(customerUpdated);
    }

}
