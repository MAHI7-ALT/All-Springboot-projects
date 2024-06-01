package rest;

import org.springframework.web.bind.annotation.GetMapping;

//@RestController
public class SecurityDemo {
	
//	@GetMapping("/helloUser") 
//	public String sayHelloToCurrentUser() {
//		var user =  SecurityContextHolder.getContext().getAuthentication().getName();
//		return "Hello " + user;
//	}
	
	@GetMapping("/admin/hello") 
	public String sayHelloToAdmin() {
	    return "Hello Admin";
	}

}
