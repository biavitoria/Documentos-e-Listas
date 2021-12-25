/*
  Exercício (1)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i;
        double salario, aumento;
        
        System.out.print("Código: ");
        i = sc.nextInt();
        
        System.out.print("Salário Atual: R$");
        salario = sc.nextDouble();
        
        switch(i){
            
            case 1:
                System.out.println("\nCargo: Escrituário");
                aumento = salario * 0.50;
                salario+= aumento;
                System.out.printf("Valor do Aumento: R$%.2f", (aumento));
                System.out.printf("\nNovo Salário: R$%.2f", (salario));
                break;
                
            case 2:
                System.out.println("\nCargo: Secretário");
                aumento = salario * 0.35;
                salario+= aumento;
                System.out.printf("Valor do Aumento: R$%.2f", (aumento));
                System.out.printf("\nNovo Salário: R$%.2f", (salario));
                break;
            
            case 3:
                System.out.println("\nCargo: Caixa");
                aumento = salario * 0.20;
                salario+= aumento;
                System.out.printf("Valor do Aumento: R$%.2f", (aumento));
                System.out.printf("\nNovo Salário: R$%.2f", (salario));
                break;
                
            case 4:
                System.out.println("\nCargo: Gerente");
                aumento = salario * 0.10;
                salario+= aumento;
                System.out.printf("Valor do Aumento: R$%.2f", (aumento));
                System.out.printf("\nNovo Salário: R$%.2f", (salario));
                break;
                
            case 5:
                System.out.println("\nCargo: Diretor");
                System.out.println("Não tem aumento.");
                break;
                
            default:
                System.out.println("Código Inválido!");
                break;
        }
    }    
}
