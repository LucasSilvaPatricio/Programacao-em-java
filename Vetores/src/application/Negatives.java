package application;

import java.util.Scanner;

public class Negatives {
    // Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    // e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
    void main(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        IO.println("Quantos valores você vai digitar? ");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for(int i = 0; i < numeros.length; i++){
            IO.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        IO.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                IO.println(numeros[i]+"\n");
            }
        }
        sc.close();
    }
}
