package com.example.SpringBootRESTGP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService 
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product> products=new ArrayList<>();
		
		products.add(new Product(1001,"mobile1","mobile4",1000.00,6));
		
		products.add(new Product(1002,"mobile1","mobile4",1000.00,6));
		
		products.add(new Product(1003,"mobile1","mobile4",1000.00,6));
		
		return products;
	}
   
}
