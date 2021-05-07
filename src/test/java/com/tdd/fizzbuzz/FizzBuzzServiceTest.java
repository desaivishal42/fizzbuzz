package com.tdd.fizzbuzz;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FizzBuzzServiceTest {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    public void ShouldReturnFizzIfNumberDivisibleBy3(int number) {
        //when
        var output = fizzBuzzService.evaluateNumber(number);

        //then
        Assert.assertEquals("Fizz", output);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    public void ShouldReturnBuzzIfNumberDivisibleBy5(int number) {
        //when
        var output = fizzBuzzService.evaluateNumber(number);

        //then
        Assert.assertEquals("Buzz", output);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 90})
    public void ShouldReturnFizzBuzzIfNumberDivisibleBy3And5(int number) {
        //when
        var output = fizzBuzzService.evaluateNumber(number);

        //then
        Assert.assertEquals("FizzBuzz", output);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 11})
    public void ShouldReturnNumberIfNumberNotDivisibleBy3Or5(int number) {
        //when
        var output = fizzBuzzService.evaluateNumber(number);

        //then
        Assert.assertEquals(String.valueOf(number), output);
    }
}
