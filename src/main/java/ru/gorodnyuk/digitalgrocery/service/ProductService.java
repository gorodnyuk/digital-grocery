package ru.gorodnyuk.digitalgrocery.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gorodnyuk.digitalgrocery.model.Product;
import ru.gorodnyuk.digitalgrocery.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
