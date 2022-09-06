package com.CursorHomeWorks10.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long descriptionId;
    private String productDescription;

    public ProductDescription() {
    }

    public ProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Long getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(Long productId) {
        this.descriptionId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "ProductDescription{" +
                "productId=" + descriptionId +
                ", productDescription='" + productDescription +
                '}';
    }
}




