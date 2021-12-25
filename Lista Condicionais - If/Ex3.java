/*
  Exercício (3)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double n1, n2, n3, m;
        
        System.out.print("Nota -  Trabalho de laboratório: ");
        n1 = sc.nextDouble();
        n1*= 2;
        
        System.out.print("Nota - Avaliação Semestral: ");
        n2 = sc.nextDouble();
        n2*= 3;
        
        System.out.print("Nota - Exame Final: ");
        n3 = sc.nextDouble();
        n3*= 5;
        
        m = (n1 + n2 + n3) / 10;
        
        if ((m >= 8) && (m <= 10))
            System.out.println("Média Ponderada: " + m + "\nConceito: A");
        
        if ((m >= 7) && (m < 8))
            System.out.println("Média Ponderada: " + m + "\nConceito: B");
        
        if ((m >= 6) && (m < 7))
            System.out.println("Média Ponderada: " + m + "\nConceito: C");
        
        if ((m >= 5) && (m < 6))
            System.out.println("Média Ponderada: " + m + "\nConceito: D");
        
        if ((m >= 0) && (m < 5))
            System.out.println("Média Ponderada: " + m + "\nConceito: E");
    }
}
