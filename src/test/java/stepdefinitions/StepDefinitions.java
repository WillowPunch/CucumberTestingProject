package stepdefinitions;

import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import com.example.cucumber.Calculator;
import static org.junit.Assert.*;

public class StepDefinitions {
    int result = 0;
    Calculator calculator;

    @Допустим("^калькулятор запущен$")
    void calcHasStarted()
    {
        calculator = new Calculator();
    }
    @Когда("^пользователь вводит (\\d+) и (\\d+) и жмёт \"Сложить\"$")
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
