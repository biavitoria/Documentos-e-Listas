/*
  Exercício (5)
*/

import java.util.Scanner;

public class Main {
    
    public static void fatorial(int A[], int B[]) {
        int factorial=1;
        System.out.println("\nFatorial");
        for(int i=0;i<=9;i++){
            for(int j=A[i];j>=2;j--){
		factorial*=j;
            }
            B[i]=factorial;
            System.out.print(A[i] + "!=" + B[i] + "\n");
            factorial = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10], B[] = new int[10];

    	System.out.println("Elementos de A:");
            for(int i=0;i<10;i++){
                System.out.print((i+1)+ "º Elemento: ");
                A[i] = sc.nextInt();
            }
        fatorial(A, B);        
    }
        
}
