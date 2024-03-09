package src;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


/*
 * Unit test for simple App.
 */
public class FizzBuzzTest 
{
    
    @Test(expected = NullPointerException.class)
    public void should_throw_an_exception_if_null_passed(){
        
            FizzBuzz.fizzbuzz(null);

    }



    @Test
    public void should_return_Fizz_when_number_only_multiply_of_3()
    {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(12));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(18));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(21));
    }

    @Test
    public void should_return_Bizz_when_number_only_multiply_of_5()
    {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(20));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(25));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(35));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(40));
    }


    @Test
    public void should_return_FizzBuzz_when_number_multiply_of_3_and_5()
    {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(45));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(60));
    }

    @Test
    public void should_return_the_same_number_as_string_when_not_number_multiply_of_3_or_5()
    {
        assertEquals("7", FizzBuzz.fizzbuzz(7));
        assertEquals("8", FizzBuzz.fizzbuzz(8));
        assertEquals("11", FizzBuzz.fizzbuzz(11));

    }


}