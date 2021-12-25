/*
  Exercício (3)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n[] = new int[10];
        
        System.out.println("Digite 10 números inteiros: ");
        
        for (int i = 0; i < n.length; i++) {
            System.out.print("nº: ");
            n[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (n[i] > n[j]) {
                    int decres = n[i];
                    n[i] = n[j];
                    n[j] = decres;                    
                }
            }
        }        
        System.out.println("\nOrdem Descrescente:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + "");
        }
    }
}
