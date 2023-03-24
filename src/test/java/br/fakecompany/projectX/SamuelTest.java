package br.fakecompany.projectX;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SamuelTest {
    private MyUtils myUtils = new MyUtils();
    @Test
    public void testFactorialSamuel(){

        assertEquals(120, myUtils.factorial(5));



    }

    @Test
    public void testEncontrarUltimaOcorrenciaSamuel(){
        List<Integer> a  = new ArrayList<Integer>() ;

        for(int i = 10;i<21;i++ ){
            a.add(i);
        }



        assertEquals(5, myUtils.encontrarUltimaOcorrencia(a, 15));

    }
    @Test
    public void testConverterNumerosRomanosSamuel(){

        assertEquals(115, myUtils.converterNumerosRomanos("CXV"));

        assertEquals(-1, myUtils.converterNumerosRomanos("CxV"));
    }

    @Test
    public void testIsPalindrome() {
        String palindrome = "racecar";
        assertTrue(myUtils.isPalindrome(palindrome));
    }

    @Test
    public void testFindEvenNumbersSamuel() {
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
    public void testCalcularMediaPonderadaSamuel(){
        double[] a={2,5,4,5.5};
        int[]b={1,3,2,4};

        //calcula o teste normalmente
        assertEquals(4.7,myUtils.calcularMediaPonderada(a,b),0);

        a=new double[] {2,5,4,5.5};
        b=new int[] {0,3,2,4};

        //Como o valor do peso é zero o teste retorna -1
        assertEquals(-1,myUtils.calcularMediaPonderada(a,b),0);

        a=new double[] {2,15,4,5.5};
        b=new int[] {2,3,2,4};

        //como o valor da nota é maior do que 10 ele retorna -1
        assertEquals(-1,myUtils.calcularMediaPonderada(a,b),0);

        a=new double[] {2,1,4,5.5};
        b=new int[] {0,0,0,0};

        assertEquals(-1,myUtils.calcularMediaPonderada(a,b),0);



    }
}

