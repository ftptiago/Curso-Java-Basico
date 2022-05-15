/**
 * Programa que imprime resultados das operações matemáticas básicas,
 * com entrada de dados pelo teclado. 
 * @author Fabrício Paixão
 * @version 1.0.0
 */

import java.util.Scanner;

public class Inputs {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        
        /* === Entrada de Dados === */
        System.out.print("Digite o primeiro valor inteiro!");
        a = input.nextInt();

        System.out.print("Digite o segundo valor inteiro!");
        b = input.nextInt(); 
                     
        int sum;
        sum = a + b; 
        System.out.printf("O resultado da Soma é %d%n", sum); // Soma

        int sub;
        sub = a - b;
        System.out.printf("O resultado da Subtração é %d%n", sub);// Subtração

        int mult;
        mult = a * b;
        System.out.printf("O resultado da Multiplicação é %d%n", mult);// Multiplicação

        int div;
        div = a / b;
        if(a >= b) {
            System.out.printf("O resultado da Divisão em Inteiro é %d%n", div); // Divisão
        }else{
          
            /* === Converterndo para float === */               
            float afloat = a;        
            float bfloat = b; 
            float divfloat;
            divfloat = afloat / bfloat;
            System.out.printf("O resultado da Divisão em float é %.2f%n", divfloat);
        }
    }
}