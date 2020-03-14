package com.project.product.productdemo.repo;

import com.project.product.productdemo.model.Customer;
import com.project.product.productdemo.model.PhoneNumber;
import com.project.product.productdemo.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Set;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepoTest {

    @Autowired
    CustomerRepository customerRepository;


    @Test
    void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setName("John");
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("123123123");
        phoneNumber.setType("Cell");

        PhoneNumber phoneNumber1 = new PhoneNumber();
        phoneNumber1.setNumber("321456");
        phoneNumber1.setType("Home");

        customer.addPhoneNumber(phoneNumber);
        customer.addPhoneNumber(phoneNumber1);

        customerRepository.save(customer);

    }

    @Test
    @Transactional
    void loadCustomerData() {
        Customer customer = customerRepository.findById(1L).get();
        String name = customer.getName();
        System.out.println("NAME: " + name);

        Set<PhoneNumber> phoneNumbers = customer.getNumbers();

        phoneNumbers
                .forEach(number -> System.out.println("NUMBERS: " + number.getNumber()));

    }

    @Test
    void updateCustomerData() {
        Customer customer = customerRepository.findById(1L).get();
        customer.setName("JOHNY");
        customerRepository.save(customer);

        Set<PhoneNumber> phoneNumbers = customer.getNumbers();

        phoneNumbers
                .forEach(number -> number.setType("CELL"));

    }

    //delete

    //update

}
