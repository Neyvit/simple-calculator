package pro.sky.java.course2.simplecalculator.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public String showGreetings() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }
}