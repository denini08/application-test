package br.fakecompany.projectX;


import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    // Método para calcular o fatorial de um número
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Número deve ser maior ou igual a zero");
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Método para verificar se uma string é um palíndromo
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

    // Método para encontrar os números pares em uma lista
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
}
