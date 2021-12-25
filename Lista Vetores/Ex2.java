/*
  Exercício (2)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x[] = new int[5];
        int y[] = new int[5];
        int somaX=0;
        int somaY=0;
        
        System.out.println("Digite 10 números inteiros para X e Y: ");
        
        for (int i = 0; i < x.length; i++) {
            System.out.print("X: ");
            x[i] = sc.nextInt();
            System.out.print("Y: ");
            y[i] = sc.nextInt();
            
            somaX+= x[i];
            somaY+= y[i];
            
        }
        System.out.println("\nTotal X: " +somaX + "\nTotal Y:" + somaY);
        System.out.println("\nSoma: " +somaX + "+" + somaY +"="+ ((somaX)+(somaY)));
        System.out.println("Produto: " +somaX + "*" + somaY +"="+ ((somaX)*(somaY)));        
    }
}
