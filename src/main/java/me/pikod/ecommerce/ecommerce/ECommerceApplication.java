package me.pikod.ecommerce.ecommerce;

import me.pikod.ecommerce.ecommerce.products.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ECommerceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ECommerceApplication.class, args);
    }

}
