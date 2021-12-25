/*
  Exercício (2)
*/

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n, i, v, fatorial;
        System.out.print("Digite um número: ");
        n = sc.nextInt();
        
        for (i=1; i<=n; i++){
            System.out.print("\n" +i+ "º Valor: ");
            v = sc.nextInt();

            for (fatorial=v; v>1; v--){
                fatorial = fatorial * (v-1);
            }
            System.out.println("Fatorial: " +fatorial);
        }
    }   
}
