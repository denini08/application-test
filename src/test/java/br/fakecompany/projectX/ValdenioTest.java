package br.fakecompany.projectX;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ValdenioTest {

	private MyUtils myUtils = new MyUtils();
	
	 @Test
	    public void testIsPalindrome() {
	        String palindrome = "radar";
	        assertTrue(myUtils.isPalindrome(palindrome));
	        String palindrome2 = "arara";
	        assertTrue(myUtils.isPalindrome(palindrome2));
	        String palindrome3 = "omissíssimo";
	        assertTrue(myUtils.isPalindrome(palindrome3));
	        String palindrome4 = "ovo";
	        assertTrue(myUtils.isPalindrome(palindrome4));
	        String palindrome5 = "renner";
	        assertTrue(myUtils.isPalindrome(palindrome5));
	        String palindrome6 = "racecar";
	        assertTrue(myUtils.isPalindrome(palindrome6));
	        String palindrome7 = "osso";
	        assertTrue(myUtils.isPalindrome(palindrome7));
	        String palindrome8 = "ana";
	        assertTrue(myUtils.isPalindrome(palindrome8));
	    }
	 
	 @Test
	    public void testIsPalindromefrase() {
	        String palindromefrase1 = "roma é amor";
	        assertTrue(myUtils.isPalindrome(palindromefrase1));
	        String palindromefrase2 = "missa é assim";
	        assertTrue(myUtils.isPalindrome(palindromefrase2));
	        String palindromefrase3 = "orava o avaro";
	        assertTrue(myUtils.isPalindrome(palindromefrase3));
	    }
	 
/////////////////////////////////////////////////////////////////////////////////////////////
//Converter Numeros romanos	
	@Test
    public void testConverterNumerosRomanos(){
    int numberString = myUtils.converterNumerosRomanos("D");
   	 int expect = 500;
   	 assertEquals(expect, numberString);
   	 
   	int numberString2 = myUtils.converterNumerosRomanos("C");
   	int expect2 = 100;
   	assertEquals(expect2, numberString2);
   	
   	int numberString3 = myUtils.converterNumerosRomanos("L");
   	int expect3 = 50;
   	assertEquals(expect3, numberString3);
    
	int numberString4 = myUtils.converterNumerosRomanos("IV");
   	int expect4 = 4;
   	assertEquals(expect4, numberString4);
    
	int numberString5 = myUtils.converterNumerosRomanos("II");
   	int expect5 = 2;
   	assertEquals(expect5, numberString5);
    
	int numberString6 = myUtils.converterNumerosRomanos("X");
   	int expect6 = 10;
   	assertEquals(expect6, numberString6);
    }
/////////////////////////////////////////////////////////////////////////////////////////////
//Encontrar ultima Ocorrencia
	@Test
    public void testEncontrarUltimaOcorrencia() {
        List<Integer> lista = Arrays.asList(2, 4, 6, 8, 10, 2, 14, 16, 2, 20);
        Integer elemento = 2;
        int resultadoEsperado = 8;
        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }
	
	@Test
    public void testEncontrarUltimaOcorrenciaListaVazia() {
        List<Integer> lista = Arrays.asList();
        Integer elemento = 5;
        int resultadoEsperado = -1;
        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }
	
	@Test
    public void testEncontrarUltimaOcorrenciaElementoNaoEncontrado() {
        List<Integer> lista = Arrays.asList(1, 3, 5, 7, 9);
        Integer elemento = 2;
        int resultadoEsperado = -1;
        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }
	
	@Test
    public void testEncontrarUltimaOcorrenciaListaNula() {
        List<Integer> lista = null;
        Integer elemento = 5;
        int resultadoEsperado = -1;
        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }
/////////////////////////////////////////////////////////////////////////////////////////////
	//ACHAR MINIMO
	
	@Test
	public void FindMinimunVazio() {
	List<Integer> ListaVazia = new ArrayList<>();
	assertEquals(-1, myUtils.findMinimum(ListaVazia));
	}

	@Test
	public void FindMinimunElementoUnico() {
	List<Integer> elementoUnicoList = new ArrayList<>();
	elementoUnicoList.add(5);
	assertEquals(5, myUtils.findMinimum(elementoUnicoList));
	}
	
	@Test
	public void FindMinimunPositivoeNegativo() {
		List<Integer> multiItemList = new ArrayList<>();
		multiItemList.add(10);
		multiItemList.add(-5);
		multiItemList.add(0);
		multiItemList.add(20);
		multiItemList.add(-15);
		assertEquals(-15, myUtils.findMinimum(multiItemList));
	}
	
	@Test
	public void FindMinimunPositivo() {
		List<Integer> PositivoList = new ArrayList<>();
		PositivoList.add(5);
		PositivoList.add(10);
		PositivoList.add(15);
		PositivoList.add(20);
		PositivoList.add(25);
		assertEquals(5, myUtils.findMinimum(PositivoList));
	}
}
