package ru.micros.customer.service;

import org.springframework.stereotype.Service;
import ru.micros.customer.dto.CustomerRegistrationRequest;
import ru.micros.customer.model.Customer;
import ru.micros.customer.repository.CustomerRepository;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);
    }
}
