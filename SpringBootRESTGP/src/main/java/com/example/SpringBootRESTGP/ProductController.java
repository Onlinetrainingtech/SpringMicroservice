package com.example.SpringBootRESTGP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private IProductService productServices;
	
	@GetMapping(value="/product")
	public List<Product>getProduct()
	{
		List<Product>products=productServices.findAll();
		return products;
	}
}
