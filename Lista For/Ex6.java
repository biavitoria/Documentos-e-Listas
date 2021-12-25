/*
  Exercício (6)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int i, m, n, soma=0;
        
        for (i=1; i>0; i++){
            System.out.println("\n\n" +i+"º Par: ");
            m = sc.nextInt();
            n=sc.nextInt();
            System.out.print("Soma de: ");
            if (m>=n)
                break; 
            
            for (;m<=n;m++){
                soma+=m;
                System.out.print(m+ " + ");
            }
            System.out.print(" =  " +soma);          
        }
    }
}
