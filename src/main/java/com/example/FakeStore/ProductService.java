package com.example.FakeStore;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final String API_URL = "https://fakestoreapi.com/products";
    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Product> getAllProducts() {
        Product[] products = restTemplate.getForObject(API_URL, Product[].class);
        return Arrays.asList(products);
    }

    public Product getProductById(Integer id) {
        String url = API_URL + "/" + id;
        return restTemplate.getForObject(url, Product.class);
    }
}
