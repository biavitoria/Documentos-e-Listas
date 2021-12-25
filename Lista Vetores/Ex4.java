/*
  Exercício (4)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, indiceMaior = 0, indiceMenor = 0;
        float menor = 99, maior = 0, temp[] = new float[12];

        for(i = 0; i < temp.length; i++) {
            System.out.print((i+1)+ "º mês - Temperatura: ");
            temp[i] = sc.nextFloat();
        }

        for(i = 0; i < 12; i++) {
            if(menor > temp[i]) {
                menor = temp[i];
                indiceMenor = i;
            }
            if(maior < temp[i]) {
                maior = temp[i];
                indiceMaior = i;
            }
        }

        System.out.printf("\nMenor temperatura do ano: %.1fºC no mês ", menor);
        switch(indiceMenor) {
        case 0:
            System.out.println("1 - Janeiro\n");
            break;
        case 1:
            System.out.println("2 - Fevereiro\n");
            break;
        case 2:
            System.out.println("3 - Março\n");
            break;
        case 3:
            System.out.println("4 - Abril\n");
            break;
        case 4:
            System.out.println("5 - Maio\n");
            break;
        case 5:
            System.out.println("6 - Junho\n");
            break;
        case 6:
            System.out.println("7 - Julho\n");
            break;
        case 7:
            System.out.println("8 - Agosto\n");
            break;
        case 8:
            System.out.println("9 - Setembro\n");
            break;
        case 9:
            System.out.println("10 - Outubro\n");
            break;
        case 10:
            System.out.println("11 - Novembro\n");
            break;
        case 11:
            System.out.println("12 - Dezembro\n");
            break;
        }

        System.out.printf("Maior temperatura do ano: %.1fºC no mês ", maior);
        switch(indiceMaior) {
        case 0:
            System.out.println("1 - Janeiro\n");
            break;
        case 1:
            System.out.println("2 - Fevereiro\n");
            break;
        case 2:
            System.out.println("3 - Março\n");
            break;
        case 3:
            System.out.println("4 - Abril\n");
            break;
        case 4:
            System.out.println("5 - Maio\n");
            break;
        case 5:
            System.out.println("6 - Junho\n");
            break;
        case 6:
            System.out.println("7 - Julho\n");
            break;
        case 7:
            System.out.println("8 - Agosto\n");
            break;
        case 8:
            System.out.println("9 - Setembro\n");
            break;
        case 9:
            System.out.println("10 - Outubro\n");
            break;
        case 10:
            System.out.println("11 - Novembro\n");
            break;
        case 11:
            System.out.println("12 - Dezembro\n");
            break;
        }
    }
}
