/*
  Exercício (2)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int codigo, cPais;
        double peso, pesoG;
        
        System.out.print("Código do Produto: ");
        codigo = sc.nextInt();
        
        if ((codigo < 0) && (codigo > 10))
            System.out.println("Código Inválido!");
        
        System.out.print("Peso do Produto (kg): ");
        peso = sc.nextInt();
        
        System.out.print("Código do País: ");
        cPais = sc.nextInt();  

        pesoG = peso * 1000;
        System.out.println("\nPeso do produto em gramas: " + pesoG);    
        
        if ((codigo >= 1) && (codigo <= 4)){
            System.out.printf("Preço total do produto: R$%.2f", (pesoG * 10));            
            switch(cPais){                
                case 1:
                    System.out.println("\nValor do Imposto: R$0,00");
                    System.out.printf("\nValor Total: R$%.2f", (pesoG * 10));
                    break;                    
                case 2:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 10) * 0.15));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 10) * 0.15) + (pesoG * 10)));
                    break;                  
                case 3:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 10) * 0.25));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 10) * 0.25) + (pesoG * 10)));
                    break;                                 
                default:
                    System.out.println("Código Inválido!");
                    break;
            }                    
        }        
        else if ((codigo >= 5) && (codigo <= 7)){
            System.out.printf("\nPreço da Carga: R$%.2f", (pesoG * 25));
            switch(cPais){                
                case 1:
                    System.out.println("\nValor do Imposto: R$0,00");
                    System.out.printf("\nValor Total: R$%.2f", (pesoG * 25));
                    break;                    
                case 2:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 25) * 0.15));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 25) * 0.25) + (pesoG * 25)));
                    break;                  
                case 3:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 25) * 0.25));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 25) * 0.25) + (pesoG * 25)));
                    break;                                 
                default:
                    System.out.println("Código Inválido!");
                    break;
            }                   
        }        
        else if ((codigo >= 8) && (codigo <= 10)){
            System.out.printf("\nPreço da Carga: R$", (pesoG * 35));
            switch(cPais){                
                case 1:
                    System.out.println("\nValor do Imposto: R$0,00");
                    System.out.printf("\nValor Total: R$%.2f", (pesoG * 35));
                    break;                    
                case 2:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 35) * 0.15));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 35) * 0.15) + (pesoG * 35)));
                    break;                  
                case 3:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 35) * 0.25));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 35) * 0.25) + (pesoG * 35)));
                    break;                                 
                default:
                    System.out.println("Código Inválido!");
                    break;
            }                   
        }
        else
            System.out.println("Código Inválido!");
    }    
}
