/*
  Exercício (2)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double n1, n2, n3;
        
        System.out.print("Primerio valor: ");
        n1 = sc.nextDouble();
        
        System.out.print("Primerio valor: ");
        n2 = sc.nextDouble();
        
        System.out.print("Primerio valor: ");
        n3 = sc.nextDouble();
        
        if ((n1 != n2) && (n2 != n3) && (n1 != n3)){
            System.out.println("Triângulo Escaleno");
        }
        
        else if (((n1 == n2) && (n1 != n3)) || ((n2 == n3) && (n2 != n1)) || (n1 == n3) && (n1 != n2)){
            System.out.println("Triângulo Isósceles");
        }
        
        else {
            System.out.println("Triângulo Equilátero");
        }
    }        
}
