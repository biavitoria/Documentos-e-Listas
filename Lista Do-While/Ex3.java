/*
  Exercício (3)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int i=1;
        double v;
        
        do{
            System.out.print(+i+"º Valor: ");
            v = sc.nextDouble();

            if(i%20==0){
                System.out.println("\n\n-------------------------");
                System.out.println("Valor: " +v);
                System.out.println("Quadrado de " +v+ " = " +(v*v));
                System.out.println("Cubo de " +v+ " = " +(v*v*v));
                System.out.println("Raiz quadrada de " +v+ " = " +Math.sqrt(v));
                System.out.println("-------------------------\n\n");
                i++;
            }
            else
                i++;
            
            if(v<=0)
                break;
        }while (i>0);
    }
}
