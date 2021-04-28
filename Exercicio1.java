// Vinicius Starck Malghosian Cantafaro
// Criar um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número. Fatorial de N é
// representado por N! 

package algoritmos;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("====FATORIAL===");
        
        System.out.println("Digite um número inteiro MAIOR que zero:");
        int numero = leitor.nextInt();
        long fatorial = 1;
        int numeroFantasma;
        
        numeroFantasma = numero;
        
        if(numero <= 0) {
                System.out.println("Número inválido");
        }
                else {
                        while(numeroFantasma > 1) {
            
                        fatorial = fatorial * numeroFantasma;
                        numeroFantasma = numeroFantasma - 1;
            
                        }
                       System.out.println("O fatorial de " + numero + " é: " + fatorial); 
                }
    }       
}