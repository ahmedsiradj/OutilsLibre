package src;

public class FizzBuzz {

    public static String fizzbuzz(Integer number) 
    {
        if (number == null) {
            throw new NullPointerException("Input cannot be null");
        }
        if (!(number instanceof Integer)) {
            throw new IllegalArgumentException("Input must be an integer");
        }
        if( (number%3==0) && (number%5==0)) {
            return "FizzBuzz";
        }
        else if( number%3 == 0 ) {
            return "Fizz";
        } else if( number%5 == 0 ) {
            return "Buzz";
        } else {
            return ""+number;
        }
    }
}