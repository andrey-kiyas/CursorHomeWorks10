package com.CursorHomeWorks10.Service;

import com.CursorHomeWorks10.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

