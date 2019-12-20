package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Product;

public interface ProductDAO {
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProductByName(String name);
	public List<Product> getProductByCompany(String company);
	public List<Product> getProductByCatagory(String catagory);
	public List<Product> getAllProduct();
}
