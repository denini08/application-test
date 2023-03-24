package br.fakecompany.projectX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class GabrielLuizTest {
    
    private MyUtils myUtils = new MyUtils();

    @Test
    public void testIsPalindrome() {
        String palindrome = "casa";
        String arara = "arara";
        boolean result = myUtils.isPalindrome(palindrome);
        boolean araraIsPalidrome = myUtils.isPalindrome(arara);
        assertFalse(result);
        assertTrue(araraIsPalidrome);
    }
    @Test
    public void testFail(){
        assertTrue(true);
    }

    /*
     * @Test
     * public void testFactorial(){        
     *  try{
     *     myUtils.factorial(-1);
     *  }catch(Exception ex){
     *      String resultado = ex.getMessage();
     *      String esperado  = "Número deve ser maior ou igual a zero";
     *      assertEquals(esperado,resultado);
     *  }
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialException(){
            myUtils.factorial(-1);
    }

    @Test
    public void testFactorial(){
        int result   = myUtils.factorial(5);
        int expected = 120;
        assertEquals(expected,result);
    }

    @Test
    public void testConverterNumerosRomanosRecebeStringVazia(){
        int resultado = myUtils.converterNumerosRomanos("");
        int esperado  = -1;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testConverterNumerosRomanosRecebeNull(){
        int resultado = myUtils.converterNumerosRomanos(null);
        int esperado  = -1;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testEncontrarUltimaOcorrenciaRecebeNull(){
        int resultado = myUtils.encontrarUltimaOcorrencia(null, null);
        int esperado  = -1;
        assertEquals(esperado,resultado);
    }
    @Test
    public void testFindMinimum(){
        int resultNull = myUtils.findMinimum(null);
        int expected   = -1;
        assertEquals(expected,resultNull);

        List<Integer> emptyList = new ArrayList<>();
        int resultEmpty = myUtils.findMinimum(emptyList);
        assertEquals(expected,resultEmpty);

        List<Integer> numbersList = Arrays.asList(3,5,20);
        int numbersListMinValue = 3;
        int result = myUtils.findMinimum(numbersList);
        assertEquals(numbersListMinValue,result);
    }

    @Test
    public void testIsListInAscendingOrder(){
        List<Integer> nullList = null;
        List<Integer> listaCrescente   = Arrays.asList(1,2,3,4,5,6,7,8,9,10,20);
        List<Integer> listaDescendente = Arrays.asList(10,9,8,7,6,5,4,3,2,1);
        List<Integer> listaDesordenada = Arrays.asList(12,3,20,40);

            Boolean listaCheia       = myUtils.isListInAscendingOrder(null);
                assertFalse(listaCheia);

            Boolean alistaCrescente  = myUtils.isListInAscendingOrder(listaCrescente);
                assertTrue(alistaCrescente);

            Boolean aListaCrescente  = myUtils.isListInAscendingOrder(listaDescendente);
                assertFalse(aListaCrescente);

            Boolean aListaOrdenada  =  myUtils.isListInAscendingOrder(listaDesordenada);
                assertFalse(aListaOrdenada);
    }
    @Test
    public void testFindEvenNumbers() {
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> emptyResult = myUtils.findEvenNumbers(emptyList);
            assertEquals(emptyList, emptyResult);

        List<Integer> oddList = Arrays.asList(1, 3, 5, 7);
        List<Integer> oddResult = myUtils.findEvenNumbers(oddList);
            assertEquals(emptyList, oddResult);

        List<Integer> evenList = Arrays.asList(28, 42, 64, 82);
        List<Integer> evenResult = myUtils.findEvenNumbers(evenList);
            assertEquals(evenList, evenResult);

        List<Integer> randomList = Arrays.asList(71, 42, 33, 58, 95, 69, 27, 89);
        List<Integer> randomListResult = myUtils.findEvenNumbers(randomList);
            assertEquals(Arrays.asList(42, 58), randomListResult);
    }

}
