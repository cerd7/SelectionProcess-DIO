package com.cerd7.selectionProcess.desafioContador;

import com.cerd7.selectionProcess.desafioContador.exception.ParametrosInvalidosExceptionContador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        do {
            System.out.println("Enter the first number:");
            int firstNumber = term.nextInt();
            System.out.println("Enter the second number:");
            int secondNumber = term.nextInt();

            try {
                System.out.println("Starting the count...");
                contar(firstNumber, secondNumber);
                break;
            } catch (ParametrosInvalidosExceptionContador e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        term.close();
    }

    static void contar(int firstNumber, int secondNumber) throws ParametrosInvalidosExceptionContador {
        if (firstNumber > secondNumber) {
            throw new ParametrosInvalidosExceptionContador("The number two must not be greater than the number one;");
        }
        int contagem = secondNumber - firstNumber;
        for (int i = 1; i < contagem; i++) {
            System.out.println("Counting =>[" + i + "]");
        }
    }
}
