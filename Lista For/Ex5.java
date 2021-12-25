/*
  Exercício (5)
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int i, nNasc, meses, n24M=0, nF=0, nM=0;
        String sexo;
        
        System.out.print("Informe o número de nascimentos: ");
        nNasc = sc.nextInt();
        
        for(i=1; i<=nNasc; i++){        
            System.out.print("\n"+i+"ª crinaça - Informe o sexo (m/f): ");
            sexo = sc.next();            
            if(sexo.equals("m"))
                nM++;
            if(sexo.equals("f"))
                nF++;
            System.out.print(+i+"ª crinaça - Informe os meses de vida: ");
            meses = sc.nextInt();
            if(meses<=24)
                n24M++;
        }

        System.out.println("\n\n% de crianças do sexo feminino mortas: " +(nF*100/nNasc));
        System.out.println("% de crianças do sexo masculino mortas: " +(nM*100/nNasc));
        System.out.println("% de crianças que viveram 24 meses ou menos: " +(n24M*100/nNasc));
    }
}
