package org.exacom.intern.pentafox.sampleprograms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Programs {

    @GetMapping(path = "/fib")
    public int fibonacci() {
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 0;
        int n = 5; // You might want to change this to accept n as a parameter
        while (n > 2) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            n--;
        }
        return fib3;
    }

    @GetMapping(path = "/swap")
    public List<Integer> swap() {
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        return Arrays.asList(a,b);
    }

    @GetMapping(path = "/odd")
    public String odd() {
        int number = 17;
        if (number % 2 != 0) {
            return "odd";
        } else {
            return "even";
        }
    }

    @GetMapping(path = "/fact")
    public int factorial() {
        int n = 5; // You might want to change this to accept n as a parameter
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
