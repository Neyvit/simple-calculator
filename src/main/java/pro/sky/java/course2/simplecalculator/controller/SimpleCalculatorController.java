package pro.sky.java.course2.simplecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.simplecalculator.service.MessageService;
import pro.sky.java.course2.simplecalculator.service.SimpleCalculatorService;

@RequestMapping("/calculator")
@RestController
public class SimpleCalculatorController {
    private final MessageService messageService;
    private final SimpleCalculatorService simpleCalculatorService;

    public SimpleCalculatorController(MessageService messageService, SimpleCalculatorService simpleCalculatorService) {
        this.messageService = messageService;
        this.simpleCalculatorService = simpleCalculatorService;
    }


    @GetMapping
    public String showGreetings() {
        return messageService.showGreetings();
    }

    @GetMapping( "/plus")
    public String sumUpNumbers(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + simpleCalculatorService.sumUpNumbers(num1, num2);
    }

    @GetMapping( "/minus")
    public String subtractNumbers(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + simpleCalculatorService.subtractNumbers(num1, num2);
    }

    @GetMapping( "/multiply")
    public String multiplyNumbers(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + simpleCalculatorService.multiplyNumbers(num1, num2);
    }

    @GetMapping( "/divide")
    public String divideNumbers(@RequestParam("num1") int num1,
                             @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + simpleCalculatorService.divideNumbers(num1, num2);
    }
}