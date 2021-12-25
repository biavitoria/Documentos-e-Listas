// Exercício (3)

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palavra;
        String palindromo = "";
        System.out.print("Digite uma palavra: ");
        palavra = sc.next();
        
        for(int i = palavra.length() -1; i>=0; i--){
            palindromo += palavra.charAt(i);
        }
        System.out.println("\n" +palavra+ " de trás pra frente: " +palindromo);
        
        if(palindromo.equals(palavra)){
            System.out.println(palavra + " é um palíndromo!");
        }
        else{
            System.out.println(palavra + " não é um palíndromo!");
        }
        
    }
}
