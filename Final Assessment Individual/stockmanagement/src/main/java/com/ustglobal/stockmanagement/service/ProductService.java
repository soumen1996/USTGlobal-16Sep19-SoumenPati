package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProductByName(String name);
	public List<Product> getProductByCategory(String category);
	public List<Product> getProductByCompany(String company);
	public List<Product> getAllProduct();

}
