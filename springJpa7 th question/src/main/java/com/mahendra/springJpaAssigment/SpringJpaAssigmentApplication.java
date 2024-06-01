package com.mahendra.springJpaAssigment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mahendra.springJpaAssigment.service.SalesService;

// import com.mahendra.springJpaAssigment.service.productService;

@SpringBootApplication
public class SpringJpaAssigmentApplication implements CommandLineRunner{

	@Autowired
	private SalesService salesService;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAssigmentApplication.class, args);
    
	}

	@Override
	public void run(String... args) throws Exception {

		salesService.getAllSalesByProduct(3);
    //  productService.insertElement();
   //2.//  salesService.valuesBetween(2,30);

	 //3.salesService.page(1, 2).forEach(System.out::println); 

	//   salesService.sort(1, 2).forEach(System.out::println); 
	}

}
