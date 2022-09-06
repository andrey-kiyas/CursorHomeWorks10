package com.CursorHomeWorks10.Service;

import com.CursorHomeWorks10.Entity.Category;
import com.CursorHomeWorks10.Entity.Product;
import com.CursorHomeWorks10.Entity.ProductDescription;
import com.CursorHomeWorks10.Entity.ProductParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    void init() {
        Category category1 = new Category("Drama");
        Category category2 = new Category("Biography");
        Category category3 = new Category("Military");
        Category category4 = new Category("History");
        Category category5 = new Category("Comedy");
        Category category6 = new Category("Crime");
        Category category7 = new Category("Melodrama");
        Category category8 = new Category("Adventures");
        Category category9 = new Category("Fantasy");

        Product product1 = new Product("Green Mile");
        Product product2 = new Product("Schindler's list");
        Product product3 = new Product("The Shawshank Redemption");
        Product product4 = new Product("Forrest Gump");
        Product product5 = new Product("Lord of the Rings");

        ProductParameter productParameter1 = new ProductParameter(1999, 189);
        ProductParameter productParameter2 = new ProductParameter(1993, 195);
        ProductParameter productParameter3 = new ProductParameter(1994, 142);
        ProductParameter productParameter4 = new ProductParameter(1994, 142);
        ProductParameter productParameter5 = new ProductParameter(2003, 201);

        ProductDescription productDescription1 = new ProductDescription("Paul Edgecomb did not believe in miracles. Until I ran into one of them.");
        ProductDescription productDescription2 = new ProductDescription("This list is life.");
        ProductDescription productDescription3 = new ProductDescription("Fear is a shackle. Hope is freedom.");
        ProductDescription productDescription4 = new ProductDescription("The world will never be the same once you see it through the eyes of Forrest Gump.");
        ProductDescription productDescription5 = new ProductDescription("There can be no triumph without loss. No victory without suffering. No freedom without sacrifice.");

        product1.setCategory(Arrays.asList(category1, category6));
        product1.setProductDescription(productDescription1);
        product1.setProductParameter(productParameter1);

        product2.setCategory(Arrays.asList(category1, category2, category3, category4));
        product2.setProductDescription(productDescription2);
        product2.setProductParameter(productParameter2);

        product3.setCategory(Arrays.asList(category1, category7));
        product3.setProductDescription(productDescription3);
        product3.setProductParameter(productParameter3);

        product4.setCategory(Arrays.asList(category1, category3, category4, category5, category7));
        product4.setProductDescription(productDescription4);
        product4.setProductParameter(productParameter4);

        product4.setCategory(Arrays.asList(category1, category8, category9));
        product5.setProductDescription(productDescription5);
        product5.setProductParameter(productParameter5);

        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }
}
