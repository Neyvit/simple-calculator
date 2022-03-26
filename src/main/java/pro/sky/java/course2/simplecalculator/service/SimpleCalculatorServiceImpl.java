package pro.sky.java.course2.simplecalculator.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculatorServiceImpl implements SimpleCalculatorService {

    @Override
    public int sumUpNumbers(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1/num2;
    }
}