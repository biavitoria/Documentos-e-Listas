/*
  Exercício (1)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n[] = new int[8];
        int positivos[] = new int[8];
        int negativos[] = new int[8];
        
        System.out.println("Digite 8 números inteiros: ");
        int iPos = 0, iNeg = 0;
        for (int i = 0; i < n.length; i++) { 
            System.out.print("nº: ");
            n[i] = sc.nextInt();
            if (n[i] >= 0) {
                positivos[iPos] = n[i];
                iPos++;
            } else {
                negativos[iNeg] = n[i];
                iNeg++;
            }
        }
        System.out.println("\nNúmeros positivos:");
        for (int i = 0; i < iPos; i++) {
            System.out.println(positivos[i]);
        }
        System.out.println("\nNúmeros negativos:");
        for (int i = 0; i < iNeg; i++) {
            System.out.println(negativos[i]);
        }
    }
}
