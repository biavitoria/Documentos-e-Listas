/*
  Exercício (4)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double n1, n2, n3;
        
        System.out.print("Primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Segundo número: ");
        n2 = sc.nextDouble();

        System.out.print("Terceiro número: ");
        n3 = sc.nextDouble();

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3){
                System.out.println("\n - Ordem Crescente - \n" + n1 + "\n" + n2 + "\n" + n3);
            } else {
                System.out.println("\n - Ordem Crescente - \n" + n1 + "\n" + n3 + "\n" + n2);
            }
        }
 
        else if ((n2 < n1) && (n2 < n3)) {
            if (n1 < n3) {
                System.out.println("\n - Ordem Crescente - \n" + n2 + "\n" + n1 + "\n" + n3);
            } else {
                System.out.println("\n - Ordem Crescente - \n" + n2 + "\n" + n3 + "\n" + n1);
            }
        } 
        
        else if (n2 < n1){
            System.out.println("\n - Ordem Crescente - \n" + n3 + "\n" + n2 + "\n" + n1);
        } else {
            System.out.println("\n - Ordem Crescente - \n" + n3 + "\n" + n1 + "\n" + n2);
        }
    }
}
