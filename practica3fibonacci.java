/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3fibonacci;

/**
 *
 * @author aguil
 */
import java.util.Scanner;

public class practica3fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los numeros de la serie Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("La serie Fibonacci de " + n + " números es: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b; 
            b = sum;
        }
    }
}
