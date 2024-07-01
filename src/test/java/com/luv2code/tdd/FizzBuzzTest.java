package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    //if number is divisible by 3, print Fizz
    //if number is divisible by 5, print Buzz
    //if number is divisible by 3 and 5, print FizzBuzz
    //if number is NOT divisible by 3 or 5, then print the number
    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
  void testForDivisibleByThree(){
      fail("fail");
  }
}
