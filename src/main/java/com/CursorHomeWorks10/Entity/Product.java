package com.CursorHomeWorks10.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "ProductCategories")
    private List<Category> category;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ProductDescription")
    private ProductDescription productDescription;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ProductParameter")
    private ProductParameter productParameter;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> categories) {
        this.category = categories;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public ProductParameter getProductParameter() {
        return productParameter;
    }

    public void setProductParameter(ProductParameter productParameter) {
        this.productParameter = productParameter;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + productId +
                ", ProductName='" + productName +
                ", categories=" + category +
                ", productDescription=" + productDescription +
                ", productParameter=" + productParameter +
                '}';
    }
}
