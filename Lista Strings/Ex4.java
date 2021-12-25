// Exercício (4)

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Frase: ");
        frase = sc.nextLine();
        String duplicado[] = frase.split("\\s");
        for(String s : duplicado){
            System.out.print(s+ " " +s+ " ");
        }
    }
}
