// Exercício (3)

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String lojas[] = new String[8];
        String prod[] = new String[4];
        double [][]precos = new double[8][4];
        System.out.print("---------- LOJAS ----------\n");
        for (int i=0; i<8; i++){
            System.out.print((i+1)+ "ª Loja: ");
            lojas[i] = sc.nextLine();
        }
        System.out.print("---------------------------\n");
        System.out.print("\n-------- PRODUTOS ---------\n");
        for (int j=0; j<4; j++){
            System.out.print((j+1)+ "º Produto: ");
            prod[j] = sc.nextLine();
        }
        System.out.print("---------------------------\n");
        System.out.print("\n--------- PREÇOS ----------");
        for (int i=0; i<8; i++){
            for (int j=0; j<4; j++){
                System.out.print("\n"+(i+1)+ "º Produto - \n   Loja "+lojas[j]+ " -\n   Preço: ");
                precos[i][j] = sc.nextDouble();
            }
        }
        for (int i=0; i<8; i++){
            System.out.println("\n------------------------------------------------");
            for (int j=0; j<4; j++){
                if(precos[i][j] <= 120){
                    System.out.print("\nLoja " +lojas[i]+ " - Produto " +prod[j]+ " - Preço - R$" +precos[i][j]);
                }
            }
        }
    }
}
