package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductDAO;
import com.ustglobal.stockmanagement.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(Product product) {
		
		return dao.addProduct(product);
		
	}

	@Override
	public boolean updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}

	@Override
	public Product getProductByName(String name) {
		
		return dao.getProductByName(name);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		return dao.getProductByCatagory(category);
	}

	@Override
	public List<Product> getProductByCompany(String company) {
		
		return dao.getProductByCompany(company);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return dao.getAllProduct();
	}

}
