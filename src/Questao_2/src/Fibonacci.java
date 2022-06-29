package Questao_2.src;

import java.util.Scanner;

public class Fibonacci {
    static long fibo(long n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner input = new Scanner(System.in);
        long in = input.nextLong();
        boolean fibonnacci = false;
        for (long i = 0; i < 30; i++) {
            System.out.print(Fibonacci.fibo(i) + "\t");
            if (fibo(i) == in) {
                System.out.print("\nE Fibonacci: " + Fibonacci.fibo(i));
                fibonnacci = true;
                break;
            }
        }
        if (!fibonnacci) {
            System.out.println("\nNão é Fibonacci: " + in);
        }
    }
}
