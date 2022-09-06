package com.CursorHomeWorks10.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parameterId;
    private int yearProductions;
    private int prodDuration;

    public ProductParameter() {
    }

    public ProductParameter(int yearProductions, int prodDuration) {
        this.yearProductions = yearProductions;
        this.prodDuration = prodDuration;
    }

    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    public int getYearProductions() {
        return yearProductions;
    }

    public void setYearProductions(int yearProductions) {
        this.yearProductions = yearProductions;
    }

    public int getProdDuration() {
        return prodDuration;
    }

    public void setProdDuration(int prodDuration) {
        this.prodDuration = prodDuration;
    }

    @Override
    public String toString() {
        return "ProductParameter{" +
                "parameterId=" + parameterId +
                ", yearProductions=" + yearProductions +
                ", prodDuration=" + prodDuration +
                '}';
    }
}

