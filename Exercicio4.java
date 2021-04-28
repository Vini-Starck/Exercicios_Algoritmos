// Vinicius Starck Malghosian Cantafaro
// Criar um algoritmo que leia o sexo (M ou F), a idade e o tempo de carteira de habilitação de várias pessoas. Ao final, apresentar
// na tela a quantidade de mulheres (F) com idade entre 24 e 30 anos com tempo de carteira de habilitação superior a 3 anos.
//Para encerrar a entrada de dados o usuário deve digitar uma idade menor ou igual a zero.

package algoritmos;

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("===TEMPO DE HABILITAÇÃO===");
        System.out.println("PARA ENCERRAR O PROGRAMA DIGITE UMA IDADE MENOR OU IGUAL A 0");
        
        System.out.println("Digite sua IDADE:");
        int idade = leitor.nextInt();
        
        System.out.println("Digite o TEMPO (em anos) de carteira de habilitação:");
        int tempo = leitor.nextInt();
        
        System.out.println("Digite o seu SEXO(M ou F):");
        char sexo = leitor.next().charAt(0);
        
        
        int qtd = 0;
        int pessoa = 2;
        
        
        while(idade > 0) {
            if(idade >= 24 && idade <=30 && tempo > 3 && sexo == 'F') {
            
                qtd = qtd + 1;
                
            }
            
          
            
            System.out.println("Digite a IDADE da " + pessoa + "º pessoa:");
            idade = leitor.nextInt();
            
            System.out.println("Digite o TEMPO (em anos) da carteira de habilitação da " + pessoa + "º pessoa:");
            tempo = leitor.nextInt();
            
            System.out.println("Digite o SEXO (M ou F) da " + pessoa + "º pessoa:");
            sexo = leitor.next().charAt(0);
            
            pessoa = pessoa + 1;
                 
        }
        System.out.println("O número de mulheres entre 24 e 30 anos com mais de 3 anos de carta é: " + qtd);
    }
}
