    
package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController{

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/sub")
    public double sub(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/mul")
    public double mul(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/div")
    public double div(@RequestParam double a, @RequestParam double b) {
        if (b == 0) throw new ArithmeticException("Divide by zero not allowed");
        return a / b;
    }
}
