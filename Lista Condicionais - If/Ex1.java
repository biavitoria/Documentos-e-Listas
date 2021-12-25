/*
  Exercício (1)
*/

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int quantidade;
        
        System.out.println("Quantidade de Pacotes: ");
        quantidade = sc.nextInt();
        
        if (quantidade > 100) {
            System.out.println("Quantidade Suficiente!");
        }
        
        else if ((quantidade <= 100) && (quantidade >= 50)){
            System.out.println("Quantidade em Alerta!");
        }
        
        else {
            System.out.println("Quantidade Abaixo do Ideal!");
        }
    }    
}
