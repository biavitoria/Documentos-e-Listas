// Exerício (6)

import java.util.Scanner;

public class Main {
     static void crescente(int a[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 10 números inteiros: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "º número: ");
            a[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int cresc = a[i];
                    a[i] = a[j];
                    a[j] = cresc;                    
                }
            }
        }
        System.out.println("\nOrdem Crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + "");
        }
    }
    
    public static void main(String[] args) {
        int a[] = new int[5];
        crescente(a);
    } 
}
