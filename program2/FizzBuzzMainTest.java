package program2;


	
import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzMainTest
{
    @Test
    public void testFizz()
    {
        assertEquals("Fizz", FizzBuzzMain.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzzMain.fizzBuzz(33));
    }

    @Test
    public void testBuzz()
    {
        assertEquals("Buzz", FizzBuzzMain.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzzMain.fizzBuzz(55));
    }

    @Test
    public void testFizzBuzz()
    {
        assertEquals("FizzBuzz", FizzBuzzMain.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzzMain.fizzBuzz(90));
    }

    @Test
    public void testNonFizzBuzz()
    {
        assertEquals("11", FizzBuzzMain.fizzBuzz(11));
        assertEquals("77", FizzBuzzMain.fizzBuzz(77));
    }
}
