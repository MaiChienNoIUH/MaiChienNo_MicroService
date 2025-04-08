package vn.edu.iuh.fit.orderservice.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.orderservice.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
