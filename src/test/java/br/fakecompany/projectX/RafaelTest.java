package br.fakecompany.projectX;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RafaelTest {

    private MyUtils myUtils = new MyUtils();

    @Test
    public void testfindEvenNumbers(){
        List<Integer> listaVazia = new ArrayList<>();
        List<Integer> resultadoListaVazia = myUtils.findEvenNumbers(listaVazia);
        assertEquals(listaVazia, resultadoListaVazia);

        List<Integer> addLista = Arrays.asList(1, 3, 5, 7);
        List<Integer> addResultado = myUtils.findEvenNumbers(addLista);
        assertEquals(listaVazia, addResultado);

        List<Integer> evenList = Arrays.asList(2, 4, 6, 8);
        List<Integer> evenResult = myUtils.findEvenNumbers(evenList);
        assertEquals(evenList, evenResult);

        List<Integer> mixedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> mixedResult = myUtils.findEvenNumbers(mixedList);
        assertEquals(Arrays.asList(2, 4, 6, 8), mixedResult);
    }

//=================================== Encontrar Ultima Ocorrencia ==================================================

    @Test
    public void testEncontrarUltimaOcorrencia() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 3, 5, 3);
        Integer elemento = 3;
        int resultadoEsperado = 6;

        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testEncontrarUltimaOcorrenciaListaNulaOuElementoNulo() {
        List<Integer> lista = null;
        Integer elemento = null;
        int resultadoEsperado = -1;

        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testEncontrarUltimaOcorrenciaElementoNaoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        Integer elemento = 6;
        int resultadoEsperado = -1;

        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testEncontrarUltimaOcorrenciaElementoPresenteApenasUmaVez() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        Integer elemento = 3;
        int resultadoEsperado = 2;
    
        int resultadoAtual = myUtils.encontrarUltimaOcorrencia(lista, elemento);
    
        assertEquals(resultadoEsperado, resultadoAtual);
    }
    
//====================================== Converter Numeros Romanos =================================================

    @Test
    public void testConverterNumerosRomanosEntradaNula() {
        String s = null;
        int resultadoEsperado = -1;

        int resultadoAtual = myUtils.converterNumerosRomanos(s);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testConverterNumerosRomanosEntradaVazia() {
        String s = "";
        int resultadoEsperado = -1;
    
        int resultadoAtual = myUtils.converterNumerosRomanos(s);
    
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testConverterNumerosRomanosNumeroSimples() {
        String s = "VIII";
        int resultadoEsperado = 8;
    
        int resultadoAtual = myUtils.converterNumerosRomanos(s);
    
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testConverterNumerosRomanosNumeroComplexo() {
        String s = "MCMXCIV";
        int resultadoEsperado = 1994;
    
        int resultadoAtual = myUtils.converterNumerosRomanos(s);
    
        assertEquals(resultadoEsperado, resultadoAtual);
    }
    
//==================================================================================================================

    @Test
    public void testIsPrimeComNumerosMenoresOuIguaisA1() {
        int num = -10;
        assertFalse(myUtils.isPrime(num));
        num = 0;
        assertFalse(myUtils.isPrime(num));
        num = 1;
        assertFalse(myUtils.isPrime(num));
    }

    @Test
    public void testIsPrimeComNumeroPrimo() {
        int num = 17;
        assertTrue(myUtils.isPrime(num));
    }

    @Test
    public void testIsPrimeComNumeroComposto() {
        int num = 20;
        assertFalse(myUtils.isPrime(num));
    }

    @Test
    public void testIsPrimeComVariosNumeros() {
        int num1 = 2;
        assertTrue(myUtils.isPrime(num1));
        int num2 = 3;
        assertTrue(myUtils.isPrime(num2));
        int num3 = 5;
        assertTrue(myUtils.isPrime(num3));
        int num4 = 19;
        assertTrue(myUtils.isPrime(num4));
        int num5 = 11;
        assertTrue(myUtils.isPrime(num5));
        int num6 = 13;
        assertTrue(myUtils.isPrime(num6));
        int num7 = 17;
        assertTrue(myUtils.isPrime(num7));
    }
    

}
