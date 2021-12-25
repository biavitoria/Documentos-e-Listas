/*
  Exercício (4)
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        double divida, juros = 0, valorD, valorP, valorJuros;
        int qtde=1, i=1;
        
        System.out.print("Valor da dívida: R$");
        divida = sc.nextDouble();
        System.out.print("\nValor da dívida \t Valor do juros \t Quantidade de parcelas \t Valor da parcela \n"); 
        while(i<=5){
            if (qtde == 1){
                juros = 1;
                valorJuros = 0;
            }
            if (qtde == 4){
                qtde = 3;
                juros = 1.10;                
            }
            if ((qtde == 7) || (qtde == 6)){
                qtde = 6;
                juros = 1.15;                
            }
            if ((qtde == 10) || (qtde == 9)){
                qtde = 9;
                juros = 1.20;                
            }
            if ((qtde == 13) || (qtde == 12)){
                qtde = 12;
                juros = 1.25;                
            }
            valorJuros = (divida * (juros - 1));
            valorD = divida * juros;
            valorP = valorD/qtde;            
            System.out.println("   R$" +df.format(valorD)+ "\t\t\t" +(Math.round(valorJuros))+ "\t\t\t   " +qtde+ "\t\t\t     R$" +df.format(valorP));       
            qtde+=3;
            i++;
        }        
    }
}
