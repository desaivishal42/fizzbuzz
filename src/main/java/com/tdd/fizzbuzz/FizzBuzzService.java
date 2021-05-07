package com.tdd.fizzbuzz;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService {

    /*
        Print FizzBuzz if number divisible by 3 & 5
        Print Fizz if number divisible by 3
        Print Buzz if number divisible by 5
        Print number if none of the condition satisfied
     */
    public void printFizzBuzz() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        numbers.forEach(n -> {
            System.out.println(evaluateNumber(n));
        });
    }

    public String evaluateNumber(int num) {
        if (isFizzBuzz(num)) {
            return "FizzBuzz";
        } else if (isFizz(num)) {
            return "Fizz";
        } else if (isBuzz(num)) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }

    private boolean isFizzBuzz(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    private boolean isFizz(int num) {
        return num % 3 == 0;
    }

    private boolean isBuzz(int num) {
        return num % 5 == 0;
    }
}
