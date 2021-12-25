// Exercício (2)

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int prova1=0, prova2=0, prova3=0;
        double menor, menorP;
        double [][]notas = new double[10][3];
        System.out.println("---------- NOTAS ----------");
        for (int i=0; i<10; i++){
            System.out.println("\n"+(i+1)+ "º Aluno -");
            for (int j=0; j<3; j++){
                System.out.print("  "+(j+1)+"ª Nota: ");
                notas[i][j] = sc.nextDouble();                
            }
        }
        System.out.print("\n-------- RELATÓRIO -----------");
        for (int i=0; i<10; i++){            
            menor = notas[i][0];
            menorP = 0;
            for (int j=0; j<3; j++){
                if (notas[i][j] < menor){
                    menor = notas[i][j];
                    menorP = j;
                }
            }
            System.out.print("\n" +(i+1)+ "º Aluno - menor nota: " +menor);
            if (menorP == 0)
                prova1++;
            if (menorP == 1)
                prova2++;
            if (menorP == 2)
                prova3++;
        }
        System.out.println("\n------------------------------");
        System.out.println("\nQuantidade de alunos que tiraram a menor nota na 1ª prova: "+prova1);
        System.out.println("Quantidade de alunos que tiraram a menor nota na 2ª prova: "+prova2);
        System.out.println("Quantidade de alunos que tiraram a menor nota na 3ª prova: "+prova3);
    }
}
