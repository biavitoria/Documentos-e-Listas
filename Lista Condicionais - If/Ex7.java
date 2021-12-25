/*
  Exercício (7) 
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double sMin, salarioM, salarioB, vH, hTrab, vExtra, extra, nDepen, qHrs, imposto = 0, salarioL, g, receber;
        
        System.out.print("Valor do salário mínimo: R$");
        sMin = sc.nextDouble();
        
        System.out.print("Número de horas trabalhadas: ");
        hTrab = sc.nextDouble();
        
        System.out.print("Número de dependentes do funcionário: ");
        nDepen = sc.nextDouble();
        
        System.out.print("Quantidade de horas extras trabalhadas: ");
        qHrs = sc.nextDouble();
        
        vH = sMin / 5;
        salarioM = hTrab * vH;
        vExtra = (vH * qHrs) * 0.50;
        extra = vH + vExtra;        
        salarioB = salarioM + (32 * nDepen) + extra;
        
        
        if (salarioB < 200)
            imposto = 0;
        
        if ((salarioB >= 200) && (salarioB <= 500))
            imposto = salarioB * 0.10;
        
        if (salarioB > 500)
            imposto = salarioB * 0.20;
        
        salarioL = salarioB - imposto;
        
        if (salarioL <= 350)
            g = 100;
        
        else
            g = 50;
        
        receber = salarioL + g;
        
        System.out.printf("Salário a receber: R$%.2f", (receber));
    }
}
