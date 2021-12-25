/*
  Exercício (7)
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int idade=1, nF=0, soma=0, qtdeM=0, menor = 1000, idadeM, hExp=0, porCento=0, i=1;
        float porcentagem, qtdeH=0, nM=0;
        String sexo, experiencia;        

        while (i != 0){      
            System.out.print("\n\nIdade: ");
            idade = sc.nextInt();
            if (idade == 0)
                break;
            System.out.print("Sexo (f/m): ");
            sexo = sc.next();
            System.out.print("Experiência no Serviço (s/n): ");
            experiencia = sc.next();
            if (sexo.equals("f")) // a)
                nF++;
            if (sexo.equals("m")) // b)
                nM++;
            if ((experiencia.equals("s")) && (sexo.equals("m"))){ // c)
                soma+= idade;
                hExp++;
            }
            if ((idade>45) && (sexo.equals("m"))) // d)
                qtdeH++;
            if ((idade<21) && (sexo.equals("f")) && (experiencia.equals("s"))) // e)
                qtdeM++;
            if ((sexo.equals("f")) && (experiencia.equals("s"))){ // f)
                if(idade < menor)
                    menor = idade;  
            }                       
        }        
        System.out.println("\n\nNúmero de candidatos do sexo feminino: " +nF);
        System.out.println("Número de candidatos do sexo masculino: " +nM);
        System.out.println("Idade média dos homenos com experiência: " +(soma/hExp)); 
        System.out.println("Porcentagem dos homens com mais de 45 anos: " +((qtdeH/nM)*100)+"%");
        System.out.println("Número de mulheres com idade inferior a 21 e com experiência: "+qtdeM);
        System.out.println("Menor idade entre as mulheres com experiência: "+menor);
    }   
}
