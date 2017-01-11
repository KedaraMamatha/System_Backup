package com.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;
<<<<<<< HEAD
import com.backend.dao.ProductDao;
import com.backend.dao.UserDaoImpl;
import com.backend.dao.UsersDao;
import com.backend.model.Product;
import com.backend.model.Users;
=======
import com.backend.dao.CategoryDao;
import com.backend.dao.ProductDao;
import com.backend.dao.SupplierDao;
import com.backend.dao.UserDaoImpl;
import com.backend.dao.UsersDao;
import com.backend.model.CategoryModel;
import com.backend.model.ProductModel;
import com.backend.model.SupplierModel;
import com.backend.model.UsersModel;
>>>>>>> initial commit for Backend using DAO's

public class App 
{
    public static void main( String[] args )
    {
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//annotationConfigApplicationContext.refresh();
<<<<<<< HEAD
/*UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
Users user=new Users();
user.setUsername("test");
user.setPassword("test");
userDao.registerUser(user);*/
          
ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
Product product=new Product();
product.setPname("test");
product.setPrice(900.0f);
p.addProduct(product);
=======
UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
UsersModel user=new UsersModel(); 
user.setUsername("mamatha");
user.setPassword("55555");
userDao.registerUser(user);
          
/*ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
ProductModel product=new ProductModel();
product.setPname("watch");
product.setPrice(500.0f);
p.addProduct(product);*/

/*CategoryDao categoryDao=(CategoryDao) annotationConfigApplicationContext.getBean("CategoryDaoImpl");
CategoryModel category=new CategoryModel();
category.setCategoryName("Watches");
categoryDao.addCategory(category);

*/

/*SupplierDao supplierDao=(SupplierDao) annotationConfigApplicationContext.getBean("SupplierDaoImpl");
SupplierModel supplier=new SupplierModel();
supplier.setSupplierName("TITAN");
supplier.setSupplierAddress("Mumbai");
supplierDao.addSupplier(supplier);*/


>>>>>>> initial commit for Backend using DAO's
}

}
