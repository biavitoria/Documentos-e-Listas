// Exercício (1)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        String palavras[] = frase.split("\\s+");
        System.out.println("Número de palavras dessa frase: " +palavras.length);       
    }    
}
