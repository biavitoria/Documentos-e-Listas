/*
  Exercício (5)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double salario, sJoao, rendaC, rendaJ;
        int m = 1;
        
        System.out.print("Salário de Carlos: R$");
        salario = sc.nextDouble();        
        sJoao = salario/3;
        System.out.printf("Salário de João: R$%.2f", (sJoao));
        
        while (sJoao <= salario){
            System.out.println("\n\n"+m+"º mês");
            rendaC = salario * 0.02;
            salario+= rendaC;
            System.out.printf("Valor de Carlos: R$%.2f", (salario));
            rendaJ = sJoao * 0.05;
            sJoao+= rendaJ;
            System.out.printf("\nValor de João: R$%.2f", (sJoao));
            m++;
        }        
        System.out.println("\n\nQuantidade de meses necessários: " +(m-1));                      
    }
}
