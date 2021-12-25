/*
  Exercício (4)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double n, soma=0, qtde=0, m, maior=0, menor=1000, impar=0, porcentagem;
        int i=1;
        
        do{
            System.out.print(+i+ "º número: ");
            n = sc.nextDouble();
            
            if(n==30000)
                break;
            
            soma+= n;
            qtde++;
            
            if(n>maior)
                maior=n;
            
            if(n<menor)
                menor=n;
            
            if(n%2!=0)
                impar++;    
            
            i++;
            
        }while(i>0);
        
        System.out.println("\n\nSoma dos números digitados: " +soma);
        System.out.println("Quantidade de números digitados: " +qtde);
        m = soma/qtde;
        System.out.printf("Média dos números digitados: %.2f", (m));
        System.out.println("\nO maior número digitado: " +maior);
        System.out.println("O menor número digitado: " +menor);
        porcentagem = (impar/qtde*100);
        System.out.printf("Porcentagem do números ímpares: %.2f", (porcentagem));
    }
}
