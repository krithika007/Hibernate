package com.niit.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.ProductDao;
import com.niit.model.Product;
@Service
@Transactional

public class ProductServiceImpl implements ProductService{
public ProductServiceImpl(){
	System.out.println("ProductServiceImpl object is created");
}
@Autowired
private ProductDao productDao;
public void saveProduct(Product product){
productDao.saveProduct(product);	
	
	
}
public List<Product> getAllProducts(){
return productDao.getAllProducts();	
	
}
}
