package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import com.backend.model.Product;
import com.backend.model.Users;
=======
import com.backend.model.ProductModel;
>>>>>>> initial commit for Backend using DAO's

@Repository("productDaoImpl")
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
<<<<<<< HEAD
	public void addProduct(Product product) {
=======
	public void addProduct(ProductModel product)
	{
>>>>>>> initial commit for Backend using DAO's
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
		System.out.println("product saved");
		
	}

}
