package br.fakecompany.projectX;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GabrielLimaTest {
    private MyUtils myUtils = new MyUtils();

    @Test //VERIFICO SE O NUMERO É PRIMO OU NÃO
    public void testIsPrime() {
        int num;

        num = 3; // 3 é um valor primo
        assertTrue(myUtils.isPrime(num));

        num = 9; // 9 NÃO é um valor primo
        assertFalse(myUtils.isPrime(num));

        num = 0; // 3 é um valor primo
        assertFalse(myUtils.isPrime(num));

        num = -3; // -3 NÂO é um valor primo (negativo)
        assertFalse(myUtils.isPrime(num));

        num = -9; // -9 NÃO é um valor primo (negativo)
        assertFalse(myUtils.isPrime(num));
    }

    @Test // ENCONTRAR O NUMERO MINIMO DE UMA LISTA
    public void testFindMinimum() {
        List<Integer> numbers = new ArrayList<>();

        //testa se esta vazia
        assertEquals(-1, myUtils.findMinimum(numbers));

        numbers.add(5);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        //testa o valor menor
        assertEquals(4 ,myUtils.findMinimum(numbers));
    }

    @Test //VERIFICAR MÉDIA PONDERADA
    public void testCalcularMediaPonderada() {
        double[] notas=null;
        int[] pesos=null;

        int result = -1;
        //testa se
        assertEquals(result, myUtils.calcularMediaPonderada(null, null), 0);

        notas= new double[]{-10};
        pesos=new int[]{-2};

        assertEquals(result, myUtils.calcularMediaPonderada(notas, pesos), 0);

        notas= new double[]{10,10,10};
        pesos=new int[]{2,3,1};

        //testa se esta validando a media ponderada
        assertEquals(10.0 , myUtils.calcularMediaPonderada(notas, pesos),0);

        //testa se esta validando se estiver errado
        assertNotEquals(90.0 , myUtils.calcularMediaPonderada(notas, pesos));

        //testa se NÂO esta vazia
        assertNotNull(myUtils.calcularMediaPonderada(notas, pesos));

    }

    @Test //VERIFICAR ORDEM DA LISTA
    public void testIsListInAscendingOrder() {
        List<Integer> lista=null;

        //testa se a lista e null
        assertNotNull(myUtils.isListInAscendingOrder(lista));

        //adiciono valores na lista
        lista = new ArrayList<>();
        lista.add(2);
        lista.add(3);
        lista.add(4);

        //testa se lista esta ordenada
        assertTrue(myUtils.isListInAscendingOrder(lista));

        //adiciono um valor para a lista fcara desosdenada
        lista.add(1);

        //testa se lista desordenada
        assertFalse(myUtils.isListInAscendingOrder(lista));
    }
}


