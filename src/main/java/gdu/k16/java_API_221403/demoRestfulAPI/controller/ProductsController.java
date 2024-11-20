package gdu.k16.java_API_221403.demoRestfulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import gdu.k16.java_API_221403.demoRestfulAPI.model.*;

@RestController
public class ProductsController
{
	@Autowired
	IMyDB myDB;
	
	@GetMapping("/listProducts")
	public List<Product> listProducts()
	{
		return myDB.findAll();
		
		
	}
	
	@PostMapping("/insertProduct")
	public String insertStudent(@RequestBody Product newproduct)
	{		
		myDB.save(newproduct);		
		return "Thêm sản phẩm thành công!";	
		
	}


}
