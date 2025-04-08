package vn.edu.iuh.fit.productservice.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.productservice.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
