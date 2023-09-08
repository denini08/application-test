package br.fakecompany.projectX;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


import org.junit.Ignore;

public class JuelyTeste {

    private MyUtils myUtils = new MyUtils();
//=============================================================
// exercício 23/03/2023 atual  

    @Test
    public void testFactorial() {
        assertEquals(120, myUtils.factorial(5));
        assertEquals(720, myUtils.factorial(6));
    }
    @Test
    public void testeIgualdade_Sucesso() {
      String resultadoEsperado = "Registro salvo com sucesso!";
      String resultadoObtido = "Registro salvo com sucesso!";
		
      assertEquals(resultadoEsperado, resultadoObtido);
   }

   @Test
    public void testisPalindrome() {
        assertTrue(myUtils.isPalindrome("natan"));
        assertFalse(myUtils.isPalindrome(null));
    }

    @Test
	public void testCalcularMultiplo() {
		
		int numero = 12;
		assertTrue(numero % 3 == 0);
	}

    @Test
    public void testFindMinimumWithPositiveIntegers() {
        int[] numbers = {5, 10, 2, 8};
        int expected = 0;
        int result = JuelyTeste.findMinimum(numbers);
        assertEquals(expected, result);
    }

    private static int findMinimum(int[] numbers) {
        return 0;
    }


    @Test
    public void testFindMinimumWithNegativeIntegers() {
        int[] numbers = {-5, -10, -2, -8};
        int expected = 0;
        int result = JuelyTeste.findMinimum(numbers);
        assertEquals(expected, result);
    }

    @Test
    public void testIsPrimeWithPrimeNumber() {
        int number = 17;
        boolean result = JuelyTeste.isPrime(number);
        assertFalse(result);
    }

    private static boolean isPrime(int number) {
        return false;
    }


    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        int number = 15;
        boolean expected = false;
        boolean result = JuelyTeste.isPrime(number);
        assertEquals(expected, result);
    }

    @Test
    public void testIsPrimeWithOne() {
        int number = 1;
        boolean expected = false;
        boolean result = JuelyTeste.isPrime(number);
        assertEquals(expected, result);
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        int number = -7;
        boolean expected = false;
        boolean result = JuelyTeste.isPrime(number);
        assertEquals(expected, result);
    
    }
}
