/*
  Exercício (6)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int c;
        double s, n;
        
        System.out.print("Código: ");
        c = sc.nextInt();
        
        if (c > 5) 
            System.out.println("Código Inválido!");
        
        else {
            System.out.print("Salário Atual: R$");
            s = sc.nextDouble();

            if (c == 1){
                n = s * 0.50;
                s+= n;
                System.out.printf("\nCargo: Escrituário \nNovo Salário: R$%.2f", (s));
            }

            else if (c == 2) {
                n = s * 0.35;
                s+= n;
                System.out.printf("\nCargo: Secretário \nNovo Salário: R$%.2f", (s));
            }

            else if (c == 3) {
                n = s * 0.20;
                s+= n;
                System.out.printf("\nCargo: Caixa \nNovo Salário: R$%.2f", (s));
            }

            else if (c == 4) {
                n = s * 0.10;
                s+= n;
                System.out.printf("\nCargo: Gerente \nNovo Salário: R$%.2f", (s));
            }

            else if (c == 5) {
                System.out.println("\nCargo: Diretor \nNão tem aumento.");
            }
        }                
    }
}
