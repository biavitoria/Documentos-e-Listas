// Exercício (1)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior=-1;
        
        double[][] M = new double[2][2];
        for (int i=0; i<2;i ++){
            for (int j=0; j<2; j++){
                System.out.print("Digite o elemento [" + i + "," + j + "] da matriz: ");
                M[i][j] = sc.nextDouble();
                
                if(M[i][j]>maior)
                    maior = M[i][j];
            }               
        }
        System.out.println("\nMaior elemento: " +maior + "\nElementos multiplicados por " +maior+ ": \n");
        for (int i=0; i<2;i ++){
            for (int j=0; j<2; j++){
                M[i][j]*= maior;
                System.out.println ("Matriz R[" + i + "][" + j + "]: " + M[i][j] );

            }
        }
    }
}
