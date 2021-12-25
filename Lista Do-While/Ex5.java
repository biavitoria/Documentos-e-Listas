/*
  Exercício (5)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double salario, qtde, valor_kw, gasto, acresc = 0, total, total_geral=0;
        int tipo, qtde_cons=0;
        
        System.out.print("Salário: R$");
        salario = sc.nextDouble();
        
        System.out.print("Quantidade de quilowatts gasta: ");
        qtde = sc.nextDouble();
        
        valor_kw = salario/8;
        
        do{
            gasto = qtde * valor_kw;
            
            System.out.print("Tipo de consumidor: ");
            tipo = sc.nextInt();
            
            if (tipo==1)
                acresc = gasto * 0.5;
            if (tipo==2)
                acresc = gasto * 0.10;
            if (tipo==3)
                acresc = gasto * 0.15;
            
            total = gasto + acresc;
            total_geral+= total;
            
            if ((total >= 500) && (total <= 1000))
                qtde_cons++;
            
            System.out.printf("\nGasto: R$%.2f", (gasto));
            System.out.printf("\nAcrescimo: R$%.2f", (acresc));
            System.out.printf("\nTotal: R$%.2f", (total));
            System.out.printf("\nGasto: R$%.2f", (gasto));
            
            System.out.print("\n\nQuantidade de quilowatts gasta: ");
            qtde = sc.nextDouble();
        }while(qtde!=0);
        
        System.out.printf("\nFaturamento total da empresa: R$%.2f", (total_geral));
        System.out.printf("\nQuantidade de consumidores que pagam entre R$500,00 e R$1000,00: " +qtde_cons);
    }
}
