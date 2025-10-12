package com.example.shop.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Long createProduct(ProductCreateRequest request) {

        Product product = new Product(
                request.getName(),
                request.getPrice(),
                request.getStockQuantity(),
                request.getDescription()
        );

        productRepository.save(product);
        return product.getId();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다: " + id);
        }
        return product;
    }

    public void updateProduct(Long id, ProductUpdateRequest request) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다: " + id);
        }

        product.updateInfo(
                request.getName(),
                request.getPrice(),
                request.getStockQuantity(),
                request.getDescription()
        );
    }

    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다: " + id);
        }

        productRepository.deleteById(id);
    }
}
