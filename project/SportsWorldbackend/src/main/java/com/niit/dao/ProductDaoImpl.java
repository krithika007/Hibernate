package com.niit.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	public ProductDaoImpl(){
		System.out.println("ProductDaoImpl object is created");
		
		
	}
@Autowired
private SessionFactory sessionFactory;
public void saveProduct(Product product){
	Session session=sessionFactory.getCurrentSession();
	session.save(product);
}
public List<Product> getAllProducts(){
	Session session=sessionFactory.getCurrentSession();
	Query query=session.createQuery("from Product");
	List<Product> products=query.list();
	return products;
	
}
}
