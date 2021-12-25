/*
  Exercício (1)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=0, i = 0;
        
        System.out.print("----- Se quiser sair digite 0 -----");
        
        do{
            System.out.print("\n\nDigite um número: ");
            n = sc.nextInt();
            
            if (((n%2==0) && (n!=2)) || ((n%3==0) && (n!=3)) || ((n%5==0) && (n!=5))|| ((n%7==0)&& (n!=7))){
                System.out.println("Não Primo");
            }
            else{
                System.out.println("Primo");
            }
            
            if(n==0)
                break;
            
        }while (i<1);
    }    
}
