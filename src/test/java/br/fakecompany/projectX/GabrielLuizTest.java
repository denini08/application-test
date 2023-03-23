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
    public void testFactorial(){        
            myUtils.factorial(-1);
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
}
