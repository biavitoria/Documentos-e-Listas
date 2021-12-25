/*
  Exercício (1)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salario=1015, aumento=0, porcentagem=0.015;
        int ano;
        
        for (ano=2017; ano<=2021; ano++){
            System.out.println("\n\nAno: " +ano);
            System.out.printf("Salário: R$%.2f", (salario));
            porcentagem*=2;
            System.out.println("\nPorcentagem: " +porcentagem);
            aumento = salario * porcentagem;
            System.out.printf("Aumento: R$%.2f", (aumento));
            salario+= aumento;
            System.out.printf("\nSalário final: R$%.2f", (salario));
        }
    }   
}
