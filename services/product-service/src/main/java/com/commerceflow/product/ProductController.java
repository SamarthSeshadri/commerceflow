
package com.commerceflow.product;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Product Service is running!";
    }

    @GetMapping("/test")
    public Product getTestProduct() {
        return new Product(
            1L,
            "Wireless Headphones",
            "Bluetooth headphones",
            new BigDecimal("2499.00"),
            25
        );
    }
}
