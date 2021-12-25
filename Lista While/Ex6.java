/*
  Exercício (6)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String sexo;
        int h, codigo=0, m=0, f=0;
        double salarioB, salarioL=0, desconto=0, mediaF=0, mediaM=0, somaF=0, somaM=0;
        
        while (codigo < 9999){
            System.out.print("Código: ");
            codigo = sc.nextInt();
            System.out.print("Sexo (f/m): ");
            sexo = sc.next();
            System.out.print("Número de horas/aula: ");
            h = sc.nextInt();
            salarioB = h * 30;
            System.out.printf("\n---------- LISTAGEM ----------\nCódigo - " +codigo+ "\nSalário Bruto: R$%.2f", (salarioB));
            
            if (sexo.equals("f")){
                f++;
                desconto = salarioB * 0.05;
                salarioL = salarioB - desconto;
                System.out.printf("\nSalário Líquido: R$%.2f", (salarioL));
                somaF+= salarioL;                
            }
            else if (sexo.equals("m")){
                m++;
                desconto = salarioB * 0.10;
                salarioL = salarioB - desconto;                
                System.out.printf("\nSalário Líquido: R$%.2f", (salarioL));
                somaM+= salarioL;
            }
            System.out.printf("\n------------------------------\n\n");
        }
        mediaF = (double)somaF/f;
        mediaM = (double)somaM/m;
        System.out.printf("\n\nMédia dos salários dos professores do sexo feminino: R$%.2f", (mediaF));
        System.out.printf("\nMédia dos salários dos professores do sexo masculino: R$%.2f", (mediaM));
    }
}
