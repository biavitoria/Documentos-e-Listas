// Exercício (2)

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        System.out.print("\nSubstituindo vogais por * na frase: \n" +frase.replaceAll("[aeiou]","*"));
        System.out.println();
    }
}
