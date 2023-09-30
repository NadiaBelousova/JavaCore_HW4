package com.calculator.calculator.controller;

import com.calculator.calculator.service.api.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }
    @GetMapping (path="/plus")
    public String addition (@RequestParam("num1") int num1,@RequestParam("num2") int num2)  {
        return calculatorService.summation(num1,num2);
    }
    @GetMapping (path="/minus")
    public String substraction (@RequestParam("num1") int num1,@RequestParam("num2") int num2)  {
        return calculatorService.substraction(num1,num2);
    }
    @GetMapping (path="/multiply")
    public String multiply (@RequestParam(required = true) int num1,@RequestParam(required = true) int num2)  {
        return calculatorService.multiply(num1,num2);
    }
    @GetMapping (path="/divide")
    public String divide (@RequestParam("num1") int num1,@RequestParam("num2") int num2)  {
        return calculatorService.divide(num1,num2);
    }

}
