/*
  Exercício (5)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n, r;
        
        System.out.print("Digite um número inteiro: ");
        n = sc.nextInt();
        
        r = n % 2;
        
        if (r == 0)
            System.out.println("Número é par.");
        
        else
            System.out.println("Número é ímpar.");
    }
}
