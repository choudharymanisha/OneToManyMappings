package com.example.SpringMapping.controller;

import com.example.SpringMapping.dto.OrderRequest;
import com.example.SpringMapping.dto.OrderResponse;
import com.example.SpringMapping.entity.Customer;
import com.example.SpringMapping.repository.CustomerRepository;
import com.example.SpringMapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/placeOrder")
    public Customer  placeOrder(@RequestBody OrderRequest request ){
        return customerRepository.save(request.getCustomer());

    }
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }
    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}
