package ru.gorodnyuk.digitalgrocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gorodnyuk.digitalgrocery.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
