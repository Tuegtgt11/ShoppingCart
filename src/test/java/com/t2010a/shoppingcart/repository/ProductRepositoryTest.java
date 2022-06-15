package com.t2010a.shoppingcart.repository;

import com.t2010a.shoppingcart.ShoppingCartApplication;
import com.t2010a.shoppingcart.config.H2JpaConfig;
import com.t2010a.shoppingcart.entity.Product;
import com.t2010a.shoppingcart.entity.enums.ProductSimpleStatus;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShoppingCartApplication.class, H2JpaConfig.class})
@ActiveProfiles("test")
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void save() {
        Product product = new Product();
        product.setName("Product 01");
        product.setDescription("Helo");
        product.setPrice(new BigDecimal(20));
        product.setSlug("hello-product");
        product.setStatus(ProductSimpleStatus.ACTIVE);
//        product.setProductStatus(ProductStatus.ACTIVE);
        productRepository.save(product);
        System.out.println(productRepository.findAll().size());
        Product product1 = productRepository.findAll().get(0);
        System.out.println(product1.toString());
    }
}