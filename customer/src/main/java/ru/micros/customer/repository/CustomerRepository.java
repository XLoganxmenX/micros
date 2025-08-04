package ru.micros.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.micros.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
