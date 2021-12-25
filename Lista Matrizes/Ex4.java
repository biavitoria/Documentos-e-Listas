// Exercício (4)

import java.util.Scanner;

public class Main {
    
    static void copiar(double [][]mat){
        double vetor[] = new double[12];
        int v=0;
        for (int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                vetor[v] = mat[i][j];               
                v++;
            }
        }
        System.out.print("\nVetor: ");
        for (v=0; v<12; v++){
            System.out.print(vetor[v]+ "  ");
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        double [][]mat = new double[3][4];
        for(int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print("Digite o elemento [" + i + "," + j + "] da matriz: ");
                mat[i][j] = sc.nextDouble();
            }
        }
        copiar(mat);
    }
}
