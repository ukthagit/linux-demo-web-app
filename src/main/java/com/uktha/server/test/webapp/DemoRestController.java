package com.uktha.server.test.webapp;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class DemoRestController   
{  
@GetMapping("/hello")  
public String hello()   
{  
return "Hello User, have a nice day.";  
}  
}  