/*
  Exercício (4)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);        
        int i, idade, qtde = 0;
        double altura, peso, pPeso = 0, m1t = 0, m2t = 0, m3t = 0, m4t = 0, m5t = 0, mAltura = 0, percentagem;
        
        for (i=1; i<=55; i++){
            if(i==1)
                System.out.print("---------- 1º TIME ----------");
            if(i==12)
                System.out.print("\n\n---------- 2º TIME ----------");
            if(i==23)
                System.out.print("\n\n---------- 3º TIME ----------");
            if(i==34)
                System.out.print("\n\n---------- 4º TIME ----------");
            if(i==45)
                System.out.print("\n\n---------- 5º TIME ----------");
            System.out.print("\n"+i+ "º Jogador - Idade: ");
            idade = sc.nextInt();
            System.out.print(+i+ "º Jogador - Altura: ");
            altura = sc.nextInt();
            System.out.print(+i+ "º Jogador - Peso: ");
            peso = sc.nextInt();
            
            if(idade<18)
                qtde++;            
            if(i<=11)
                m1t+=idade;
            if((i>11) && (i<=22))
                m2t+=idade;
            if((i>22) && i<=33)
                m3t+=idade;
            if((i>33) && i<=44)
                m4t+=idade;
            if((i>44) && i<=55)
                m5t+=idade;            
            mAltura+=altura;
            if (peso>80)
                pPeso++;
        }
        System.out.println("\n\nQuantidade de jogadores menores de 18 anos: " +qtde);
        System.out.println("Média das idades dos jogadores do:\n1º Time: "+(m1t/11)+"\n2º Time: "+(m2t/11)+ "\n3º Time: "+(m3t/11)+"\n4º Time: "+(m4t/11)+"\n5º Time: "+(m5t/11));
        System.out.println("Média das alturas de todos os jogadores: " +(mAltura/55));
        System.out.println("Percentagem de jogadores com mais de 80 quilos: " +(pPeso/55*100));
    }
}
