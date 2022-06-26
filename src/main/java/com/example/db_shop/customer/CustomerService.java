package com.example.db_shop.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*Services works for logic, all method*/

@Service  /*SERVICE!!!*/
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public Customer addCustomer(Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public String updateCustomer(Customer customerUpdated) {
        Long num = customerUpdated.getId();
        if(customerRepository.findById(num).isPresent()) {
            Customer customerToUpdate = new Customer();

            customerToUpdate.setId(customerUpdated.getId());
            customerToUpdate.setName(customerUpdated.getName());
            customerToUpdate.setSurname(customerUpdated.getSurname());
            customerToUpdate.setBirthdate(customerUpdated.getBirthdate());
            customerToUpdate.setPhone(customerUpdated.getPhone());
            customerToUpdate.setCountry(customerUpdated.getCountry());
            customerToUpdate.setCity(customerUpdated.getCity());
            customerToUpdate.setDirection(customerUpdated.getDirection());
            customerToUpdate.setPostCode(customerUpdated.getPostCode());

        customerRepository.save(customerToUpdate);
        }
        return "Error al moidicar el Customer";
    }

}
