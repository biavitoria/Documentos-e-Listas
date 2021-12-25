/*
  Exercício (3)
*/

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int i=1, nO=0, nP = 0, peca = 0, h = 0, m = 0;
        double salario=0, salarioT, porcentagem=0, soma, maior=0, mS = 0, folhaP = 0;
        String sexo;
        
        while (nO < 15){
            System.out.print("\n\nNúmero do " +i+ "º operario: ");
            nO = sc.nextInt();
            
            System.out.print("Número de peças fabricadas: ");
            nP = sc.nextInt();
            
            System.out.print("Sexo (f/m): ");
            sexo = sc.next();
            
            if (nP <= 30)
                salarioT = 1000;
            if ((nP >= 31) && (nP <=35)){
                salario = 1000;
                if (nP == 31)                
                    porcentagem = salario * 0.03;
                if (nP == 32)
                    porcentagem = salario * 0.06;
                if (nP == 33 )
                    porcentagem = salario * 0.09;
                if (nP == 34)
                    porcentagem = salario * 0.12;
                if (nP == 35)
                    porcentagem = salario * 0.15;                   
            }
            if (nP > 35)
                porcentagem = (salario * 0.5) * (nP - 30);
            if (sexo.equals("m"))
                h++;
            if (sexo.equals("m"))
                m++;
            peca+=nP;
            salarioT = salario + porcentagem;
            if (salarioT > maior){
                maior = salarioT;
                mS = nO;
            }
            folhaP+=salarioT;
            System.out.println("\nOperário " +nO);
            System.out.printf("Salário: R$%.2f", (salarioT));
            
        }
        System.out.printf("\n\nFolha de pagamento: R$%.2f", (folhaP));
        System.out.println("\nO número total de paças fabricadas no mês: " +peca);
        System.out.println("Média de peças fabricadas pelos homens: " +(nP/h));
        System.out.println("Média de peças fabricadas pelas mulheres: " +(nP/m));
        System.out.println("Número do operário de maior salário: " +mS);
    }
}
