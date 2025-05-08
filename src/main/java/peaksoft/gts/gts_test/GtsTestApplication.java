package peaksoft.gts.gts_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GtsTestApplication.class, args);
        Count.countWellFormatedParenthesis(3);
    }

}
