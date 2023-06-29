package com.mirko.masters.bffservicerest.controller;

import com.mirko.masters.bffservicerest.controller.requests.LoginRequest;
import com.mirko.masters.bffservicerest.entity.Customer;
import com.mirko.masters.bffservicerest.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/customers")
public class CustomerController {

        private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // Perform your custom logic to check the username and password
        if (isValidCredentials(username, password)) {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Login successful");
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }


    private boolean isValidCredentials(String username, String password) {
return true;    }



}
