/*
  Exercício (3)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int codigo, cCarga;
        double peso, pesoKg, pesoG, imposto;
        
        System.out.print("Código do Estado: ");
        codigo = sc.nextInt();
        
        System.out.print("Peso da Carga: ");
        peso = sc.nextDouble();
        
        System.out.print("Código da carga: ");
        cCarga = sc.nextInt();
        
        pesoKg = peso * 1000;
        pesoG = pesoKg * 1000;
        System.out.println("\nPeso da Carga em Kg: " + pesoKg);    
        
        if ((cCarga >= 10) && (cCarga <= 20)){
            System.out.printf("\nPreço da Carga: R$%.2f", (pesoG * 100));            
            switch(codigo){                
                case 1:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 100) * 0.35));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 100) * 0.35) + (pesoG * 100)));
                    break;                    
                case 2:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 100) * 0.25));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 100) * 0.25) + (pesoG * 100)));
                    break;                  
                case 3:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 100) * 0.15));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 100) * 0.15) + (pesoG * 100)));
                    break;                   
                case 4:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 100) * 0.5));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 100) * 0.5) + (pesoG * 100)));
                    break;                    
                case 5:
                    System.out.printf("\nValor do Imposto: ISENTO");
                    System.out.printf("\nValor Total: R$%.2f", (pesoG * 100));
                    break;                
                default:
                    System.out.println("Código Inválido!");
                    break;
            }                    
        }        
        else if ((cCarga >= 21) && (cCarga <= 30)){
            System.out.printf("\nPreço da Carga: R$%.2f", (pesoG * 250));
            System.out.printf("\nValor Total: R$%.2f", (((pesoG * 250) * 0.35) + (pesoG * 250)));
            switch(codigo){                
                case 1:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 250) * 0.35));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 250) * 0.35) + (pesoG * 250)));
                    break;                    
                case 2:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 250) * 0.25));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 250) * 0.25) + (pesoG * 250)));
                    break;                                    
                case 3:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 250) * 0.15));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 250) * 0.15) + (pesoG * 250)));
                    break;                    
                case 4:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 250) * 0.5));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 250) * 0.5) + (pesoG * 250)));
                    break;                    
                case 5:
                    System.out.printf("\nValor do Imposto: ISENTO");
                    System.out.printf("\nValor Total: R$%.2f", (pesoG * 250));
                    break;                
                default:
                    System.out.println("Código Inválido!");
                    break;
            }                    
        }        
        else if ((cCarga >= 31) && (cCarga <= 40)){
            System.out.printf("\nPreço da Carga: R$", (pesoG * 340));
            switch(codigo){                
                case 1:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 340) * 0.35));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 340) * 0.35) + (pesoG * 340)));
                    break;                    
                case 2:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 340) * 0.25));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 340) * 0.25) + (pesoG * 340)));
                    break;                                      
                case 3:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 340) * 0.15));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 340) * 0.15) + (pesoG * 340)));
                    break;                    
                case 4:
                    System.out.printf("\nValor do Imposto: R$%.2f", ((pesoG * 340) * 0.5));
                    System.out.printf("\nValor Total: R$%.2f", (((pesoG * 340) * 0.5) + (pesoG * 340)));
                    break;                    
                case 5:
                    System.out.printf("\nValor do Imposto: ISENTO");
                    System.out.printf("\nValor Total: R$%.2f", (pesoG * 340));
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
