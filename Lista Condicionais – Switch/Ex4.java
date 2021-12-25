/*
  Exercício (4)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int op;
        double salario;
        
        System.out.print("---------- MENU DE OPÇÕES ---------- \n1. Imposto\n2. Novo Salário\n3. Classificação\n\nDigite a opção desejada: ");
        op = sc.nextInt();
        
        switch(op){
            case 1:
                System.out.print("\nSalário: R$");
                salario = sc.nextDouble();
                if (salario < 500)
                    System.out.printf("Imposto: R$%.2f", (salario * 0.5));                
                if ((salario >= 500) && (salario <= 850))
                        System.out.printf("Imposto: R$%.2f", (salario * 0.10));                
                if (salario > 850)
                    System.out.printf("Imposto: R$%.2f", (salario * 0.15));
                break;
            case 2:
                System.out.print("\nSalário: R$");
                salario = sc.nextDouble();
                if (salario > 1500)
                    System.out.printf("Novo Salário: R$%.2f", (salario + 25));                
                if ((salario >= 750) && (salario <= 1500))
                        System.out.printf("Novo Salário: R$%.2f", (salario + 50));
                if ((salario >= 450) && (salario <= 750))
                        System.out.printf("Novo SalárioS: R$%.2f", (salario + 75));
                if (salario < 450)
                    System.out.printf("Novo Salário: R$%.2f", (salario + 100)); 
                break;
            case 3:
                System.out.print("\nSalário: R$");
                salario = sc.nextDouble();
                if (salario <= 700)
                    System.out.println("Mal remunerado.");
                if (salario > 700)
                    System.out.println("Bem remunerado.");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}
