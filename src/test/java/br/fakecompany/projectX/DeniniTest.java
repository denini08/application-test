package br.fakecompany.projectX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class DeniniTest
{

    private MyUtils myUtils = new MyUtils();

    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("DeniniTest is running...");
        assertTrue( true );
    }

    @Test
    public void testFindEvenNumbers() {
        // Testa com lista vazia
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> emptyResult = myUtils.findEvenNumbers(emptyList);
        // Deve retornar uma lista vazia
        assertEquals(emptyList, emptyResult);

        // Testa com uma lista que contém apenas números ímpares
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7);
        List<Integer> oddResult = myUtils.findEvenNumbers(oddList);
        // Deve retornar uma lista vazia
        assertEquals(emptyList, oddResult);

        // Testa com uma lista que contém apenas números pares
        List<Integer> evenList = Arrays.asList(2, 4, 6, 8);
        List<Integer> evenResult = myUtils.findEvenNumbers(evenList);
        //  Deve retornar uma lista com os mesmos números
        assertEquals(evenList, evenResult);

        // Testa com uma lista que contém números pares e ímpares
        List<Integer> mixedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> mixedResult = myUtils.findEvenNumbers(mixedList);
        // Deve retornar uma lista com os números pares
        assertEquals(Arrays.asList(2, 4, 6, 8), mixedResult);
    }


    @Test
    public void testIsPalindrome() {
        String palindrome = "racecar";
        assertTrue(myUtils.isPalindrome(palindrome));
    }


    @Test
    public void testFail(){
        assertTrue(true);
    }

}
