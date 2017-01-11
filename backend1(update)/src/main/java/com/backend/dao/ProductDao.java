package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.backend.model.Product;
=======
import com.backend.model.ProductModel;
>>>>>>> initial commit for Backend using DAO's

@ComponentScan("com")
@Repository
public interface ProductDao {
	
<<<<<<< HEAD
	public void addProduct(Product product);
=======
	public void addProduct(ProductModel product);
>>>>>>> initial commit for Backend using DAO's
}
