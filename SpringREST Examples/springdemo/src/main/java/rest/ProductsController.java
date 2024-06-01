package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@Autowired
	private ProductRepo productRepo;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

}
