package stepdefinitions;

import io.cucumber.java.ru.*;
import com.example.cucumber.Calculator;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class StepDefinitions {
    int result = 0;
    Calculator calculator;

    @Допустим("калькулятор запущен")
    void calcHasStarted()
    {
        calculator = new Calculator();
    }
    @Когда("пользователь вводит {int} и {int} и жмёт {string}$")
    void addNumbers(int a, int b)
    {
        result = calculator.add(a,b);
    }

    @Когда("^пользователь вводит (\\d+) и (\\d+) и жмёт \"Вычесть\"$")
    void subNumbers(int a, int b)
    {
        result = calculator.sub(a,b);
    }

    @Тогда("^результат на выходе равен (\\d+)$")
    void verify(int expected)
    {
        assertEquals(expected, result);
    }

}
