package com.CursorHomeWorks10.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parameterId;
    private int yearProductions;
    private int prodDuration;

    public ProductParameter(int yearProductions, int prodDuration) {
        this.yearProductions = yearProductions;
        this.prodDuration = prodDuration;
    }
}

