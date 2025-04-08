package vn.edu.iuh.fit.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.orderservice.entities.Customer;
import vn.edu.iuh.fit.orderservice.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer product) {
        return customerRepository.save(product);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public List<Customer> getAllOrders() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Long id, Customer updated) {
        Customer customer = getCustomerById(id);
        customer.setTenKhachHang(updated.getTenKhachHang());
        customer.setNgaySinh(updated.getNgaySinh());
        customer.setDiaChi(updated.getDiaChi());
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}

