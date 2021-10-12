package com.project.ecommerce.service;

import com.project.ecommerce.dao.CustomerRepository;
import com.project.ecommerce.dto.Purchase;
import com.project.ecommerce.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;

    }
    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
