package br.fakecompany.projectX;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {

    /**
     * Calcula o fatorial de um número.
     *
     * @param num o número a ser calculado o fatorial
     * @return o fatorial do número de entrada
     * @throws IllegalArgumentException se o número de entrada for negativo
     */

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Número deve ser maior ou igual a zero");
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    /**
     * Verifica se uma string é um palíndromo.
     *
     * @param str a string a ser verificada
     * @return true se a string for um palíndromo,
     * @return false caso contrário ou a string for nula
     * 
     */
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Retorna uma lista contendo apenas os números pares da lista de entrada.
     *
     * @param numbers a lista de números a ser filtrada
     * @return uma lista contendo apenas os números pares da lista de entrada
     */
    public List<Integer> findEvenNumbers(List<Integer> numbers) {
        if (numbers == null) {
            return new ArrayList<>();
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    /**
     * Método para encontrar o índice da última ocorrência de um elemento em uma
     * lista.
     *
     * @param lista    a lista na qual procurar o elemento
     * @param elemento o elemento a ser procurado na lista
     * @return o índice da última ocorrência do elemento na lista, ou -1 se o
     *         elemento não estiver presente na lista
     */
    public int encontrarUltimaOcorrencia(List<Integer> lista, Integer elemento) {
        if (lista == null || elemento == null) {
            return -1;
        }
        int lastIndex = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    /**
     * Método para calcular a média ponderada de um conjunto de notas.
     *
     * @param notas um array de notas, onde cada nota é um número entre 0 e 10
     * @param pesos um array de pesos correspondentes às notas, onde cada peso é um
     *              número inteiro positivo
     * @return a média ponderada das notas, ou -1 se os arrays de notas e pesos
     *         tiverem tamanhos diferentes, ou se houver uma nota ou peso inválido
     */
    public double calcularMediaPonderada(double[] notas, int[] pesos) {
        if (notas == null || pesos == null || notas.length != pesos.length) {
            return -1;
        }
        double somaNotas = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10 || pesos[i] < 1) {
                return -1;
            }
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        if (somaPesos == 0) {
            return -1;
        }
        return somaNotas / somaPesos;
    }

    /**
     * Método para converter uma string de números romanos em um inteiro.
     *
     * @param s a string de números romanos a ser convertida
     * @return o valor inteiro equivalente aos números romanos na string, ou -1 se a
     *         string não for válida
     */
    public int converterNumerosRomanos(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == 'M') {
                result += 1000;
                i++;
            } else if (c == 'D') {
                result += 500;
                i++;
            } else if (c == 'C') {
                if (i < s.length() - 1 && (s.charAt(i + 1) == 'M' || s.charAt(i + 1) == 'D')) {
                    result -= 100;
                } else {
                    result += 100;
                }
                i++;
            } else if (c == 'L') {
                result += 50;
                i++;
            } else if (c == 'X') {
                if (i < s.length() - 1 && (s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'L')) {
                    result -= 10;
                } else {
                    result += 10;
                }
                i++;
            } else if (c == 'V') {
                result += 5;
                i++;
            } else if (c == 'I') {
                if (i < s.length() - 1 && (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V')) {
                    result -= 1;
                } else {
                    result += 1;
                }
                i++;
            } else {
                return -1;
            }
        }
        return result;
    }

    /**
     * Encontra o número mínimo em uma lista.
     *
     * @param numbers a lista de números a ser verificada
     * @return o número mínimo da lista de entrada, ou -1 se a lista for nula ou
     *         vazia
     */
    public int findMinimum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Verifica se um número é primo.
     *
     * @param num o número a ser verificado
     * @return true se o número for primo, false caso contrário
     */
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica se uma lista é uma sequência crescente de números inteiros.
     *
     * @param lista a lista de números a ser verificada
     * @return true se a lista for uma sequência crescente de números inteiros,
     *         false caso contrário ou a lista for nula
     */
    public boolean isListInAscendingOrder(List<Integer> lista) {
        if (lista == null) {
            return false;
        }
        int prev = Integer.MIN_VALUE;
        for (int num : lista) {
            if (num < prev) {
                return false;
            }
            prev = num;
        }
        return true;
    }

}
