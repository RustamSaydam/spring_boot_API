package kameleoon.springbootApp.repository;

import kameleoon.springbootApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
