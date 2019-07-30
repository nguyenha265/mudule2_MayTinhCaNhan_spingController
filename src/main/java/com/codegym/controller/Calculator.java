package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/calculator")
    public String Calculator(@RequestParam(value = "number1",required = false, defaultValue = "0") String number1, @RequestParam(value = "number2",required = false,defaultValue = "0") String number2, @RequestParam("operator") String operato, Model model) {
        float result =0;
        switch (operato) {
            case "Addition(+)":
                result = Float.parseFloat(number1) + Float.parseFloat(number2);
                break;
            case "Subtraction(-)":
                result = Float.parseFloat(number1) - Float.parseFloat(number2);
                break;
            case "Multiplication(X)":
                result = Float.parseFloat(number1) * Float.parseFloat(number2);
                break;
            case "Division(/)":
                result = Float.parseFloat(number1) / Float.parseFloat(number2);
                break;

        }
        model.addAttribute("result", result );
        return "index";
    }
    @GetMapping("/")
    public String check(){
        return "index";
    }

}
