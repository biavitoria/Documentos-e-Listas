/*
  Exercício (3)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int i, n1=1, n2=1, soma=0;
        
        for (i=0; i<8; i++){            
            if (i==0)
                System.out.printf("0, ");
            else if ((i==1) || (i==2))
                System.out.printf("1, ");
            else {
                soma = n1+n2;
                n1=n2;
                n2=soma;
                System.out.print(+soma+ ", ");
            }
        }
    }
}
