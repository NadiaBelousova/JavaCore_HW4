package com.calculator.calculator.service.api;

import com.calculator.calculator.service.impl.CalculatorService;
import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {


    public String hello() {

        return "Добро пожаловать в примитивный калькулятор";
    }

    public String addition (int num1, int num2)  {
        int sum=num1+num2;
        return  num1 + "+"+ num2+ "="+sum;
    }
    public String substraction (int num1, int num2)  {
        int minus=num1-num2;
        return  num1 + "-"+ num2+ "="+minus;
    }
    public String multiply (int num1, int num2)  {
        int multiply =num1*num2;
        return  num1 + "*"+ num2+ "="+multiply ;
    }
    public String divide (int num1, int num2)  {
        if (num2 != 0) {
            int divide = num1 / num2;
            return num1 + "/" + num2 + "=" + divide;
        } else {
            return "на ноль делить нельзя";
        }

}
}
