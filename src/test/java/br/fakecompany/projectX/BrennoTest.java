package br.fakecompany.projectX;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class BrennoTest {

    public MyUtils myUtils = new MyUtils();

    @Test
    public void numerosRomanos() {

        String numerosRomanos = "XV";
        assertEquals(15, myUtils.converterNumerosRomanos(numerosRomanos));

        // testa com a string miniscula
        numerosRomanos = "xv";
        assertEquals(-1, myUtils.converterNumerosRomanos(numerosRomanos));

        // testa uma string com espaços entre os caracteres
        numerosRomanos = "x V";
        assertEquals(-1, myUtils.converterNumerosRomanos(numerosRomanos));
    }

    @Test
    public void testaNullNumerosRomanos(){
        String str = null;
        assertEquals(-1,myUtils.converterNumerosRomanos(str));
    }

    @Test
    public void testaOpcoesNumerosRomanos(){
        String str = "MCDLI";
        assertEquals(1451,myUtils.converterNumerosRomanos(str));
    }

    @Test
    public void testaMedia() {

        double[] notas = { 3, 5, 8, 9 };
        int[] pesos = { 1, 2, 2, 1 };
        assertEquals(6.3, myUtils.calcularMediaPonderada(notas, pesos), 0.1);

        double[] notas2 = { 3, 5, 8, 9 };
        int[] pesos2 = {0,0,0,0};
        assertEquals(-1, myUtils.calcularMediaPonderada(notas2, pesos2), 0.1);
    }

    @Test
    public void testaQuantDifPessoNota(){
        // testa com quantidade de notas e pesos diferentes
        double[] notas1 = { 3, 5, 8, 9, 5 };
        int[] pesos1    = { 1, 2, 2, 1 };
        assertEquals(-1, myUtils.calcularMediaPonderada(notas1, pesos1), 0.1);
    }

    @Test
    public void testaSomaPessos(){

        double[] notas = {3,5,2,6,7};
        int[] pessos   = {0,0,0,0,0};

        assertEquals(-1,myUtils.calcularMediaPonderada(notas,pessos),0.1);
    }

   /* @Test
    public void testaFatorial() {
        int num = 5;
        assertEquals(120, myUtils.factorial(num));

    }*/

   /* @Test(expected = IllegalArgumentException.class)
    public void testanegativo() {
        int num = -3;
        myUtils.factorial(num);
    }*/

    @Test
    public void testaPalindrome() {
        String str = "  ";
        assertTrue(myUtils.isPalindrome(str));

        str = null;
        assertFalse(myUtils.isPalindrome(str));

        str = "ola";
        assertFalse(myUtils.isPalindrome(str));
    }

    @Test
    public void ultimaOcorencia(){
        // cria uma lista vazia
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        System.out.println(lista);

        int res = myUtils.encontrarUltimaOcorrencia(lista,5);
        System.out.println(res);
        assertEquals(5,res);

        res = myUtils.encontrarUltimaOcorrencia(null,10);
        assertEquals(-1,res);
    }
}

