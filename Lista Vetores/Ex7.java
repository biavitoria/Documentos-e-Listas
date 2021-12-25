// Exercício (7)

import java.util.Scanner;

public class Main {
    
    static void metodo1(int a[], int n){
        System.out.print("\n   Elementos acrescidos de 2 unidades: ");
        for (int i=0; i<n; i++){
            a[i]+= 2;
            System.out.print(a[i] + " ");
        }
    }
    
    static void metodo2(int a[], int n){
        System.out.print("\n   Elementos reduzidos de 1 unidades: ");
        for (int i=0; i<n; i++){
            a[i]-= 3;
            System.out.print(a[i] + " ");
        }
    }
    
    static void metodo3(int n){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("   " +(i+1) + "º número: ");
            vet[i] = sc.nextInt();       
        }
        System.out.print("\n   Vetor Original: ");
        for (int i=0; i<n; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.print("\n   Vetor multiplicado por 2: ");
        for (int i=0; i<n; i++){
            vet[i]*=2;
            System.out.print(vet[i] + " ");
        }
    }
    
    static void metodo4(int a[], int n){
        System.out.print("\n   Elementos elevados ao quadrado: ");
        for (int i=0; i<n; i++){
            a[i]+= 1;
            a[i]*= a[i];
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Escolha o tamanho do vetor: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "º número: ");
            a[i] = sc.nextInt();       
        }
        System.out.print("\n---------- Primeiro método ----------"); metodo1(a,n);
        System.out.print("\n\n---------- Segundo método ----------"); metodo2(a,n);
        System.out.print("\n\n---------- Terceiro método ----------\n"); metodo3(n);
        System.out.print("\n\n---------- Quarto método ----------"); metodo4(a,n);
    }
}
