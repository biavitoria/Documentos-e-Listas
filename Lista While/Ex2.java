import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        double n1, n2, media, soma=0, m;
        int i=1, a=0, e=0, r=0;
        
        while(i<=6){
            System.out.print("Primeira nota do " +i+ "º aluno: ");
            n1 = sc.nextDouble();            
            System.out.print("Segunda nota do " +i+ "º aluno: ");
            n2 = sc.nextDouble();            
            media = (n1+n2)/2;            
            System.out.println("Média aritmética do "+i+ "º aluno: " +media+ "\n\n");          
            if (media <= 3)
                r++;
            if ((media > 3) && (media < 7))
                e++;
            if (media >= 7)
                a++;            
            soma+= media;
            i++;
        }
        m = soma/6;     
        System.out.println(" Média Atirmética\t Mensagem \n------------------------------------\n     Até 3\t\tReprovado \n  > 3 e < 7\t\t  Exame \n     >=7\t\t Aprovado");       
        System.out.println("\n\nTotal de alunos aprovados: " +a);
        System.out.println("Total de alunos de exame: " +e);
        System.out.println("Total de alunos reprovados: " +r);
        System.out.printf("Média aritmética da classe: %.1f", (m));        
    }
}
