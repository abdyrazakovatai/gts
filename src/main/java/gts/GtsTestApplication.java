package gts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GtsTestApplication.class, args);
        int n = 5;
        int result = Count.countWellFormatedParenthesis(n);
        System.out.println("Количество правильных скобочных последовательностей для " + n + " пар скобок: " + result);
    }

}
