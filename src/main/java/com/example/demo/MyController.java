package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class MyController {
    
 //Sending response to the client when the client hits the endpoint /m   
    @RequestMapping("m")
  public static String myMethod(){
    return "<h1>Hey This Is Satvik</h1>";
  }

  /* 
  @GetMapping("process-form")
  public String getData(@RequestParam int num1,@RequestParam int num2) {
    int res=num1+num2;
      return "Result is:-" +res;
  }
  */

    @PostMapping("process-form")
  public String getData(@RequestParam int num1,@RequestParam int num2) {
    int res=num1+num2;
      return "Result is:-" +res;
  }
  
  
}
