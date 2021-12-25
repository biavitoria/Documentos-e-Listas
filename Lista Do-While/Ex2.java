/*
  Exercício (2)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double b, a, r;
        
        do{
            System.out.print("Base: ");
            b = sc.nextDouble();
            System.out.print("Altura: ");
            a = sc.nextDouble();
            
            if ((a>=0)||(b>=0))
                break;
            
            r = (b * a)/2;
            System.out.println("Área do triângulo: " +r);
        }while((a>=0)||(b>=0));
    }
}
