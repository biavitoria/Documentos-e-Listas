/*
  Exercício (8)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int op = 0;
        double salario;
        
        while(op != 4){        
            System.out.print("\n\n---------- MENU DE OPÇÕES ---------- \n1. Imposto\n2. Novo Salário\n3. Classificação\n4. Finalizar o programa\n\nDigite a opção desejada: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.print("\nSalário: R$");
                    salario = sc.nextDouble();
                    if (salario < 1000)
                        System.out.printf("Imposto: R$%.2f", (salario * 0.5));                
                    if ((salario >= 1000) && (salario < 2000))
                            System.out.printf("Imposto: R$%.2f", (salario * 0.10));                
                    if (salario >= 2000)
                        System.out.printf("Imposto: R$%.2f", (salario * 0.15));
                    break;
                case 2:
                    System.out.print("\nSalário: R$");
                    salario = sc.nextDouble();
                    if (salario > 2000)
                        System.out.printf("Novo Salário: R$%.2f", (salario + 25));                
                    if ((salario >= 1500) && (salario <= 2000))
                            System.out.printf("Novo Salário: R$%.2f", (salario + 50));
                    if ((salario >= 1000) && (salario <= 1500))
                            System.out.printf("Novo SalárioS: R$%.2f", (salario + 75));
                    if (salario < 100)
                        System.out.printf("Novo Salário: R$%.2f", (salario + 100)); 
                    break;
                case 3:
                    System.out.print("\nSalário: R$");
                    salario = sc.nextDouble();
                    if (salario <= 1000)
                        System.out.println("Mal remunerado.");
                    if (salario >= 1000)
                        System.out.println("Bem remunerado.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}
