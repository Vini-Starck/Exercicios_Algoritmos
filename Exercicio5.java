// Vinicius Starck Malghosian Cantafaro
// Uma loja está levantando o valor total de todas as mercadorias em estoque. Criar um algoritmo que leia o valor da mercadoria
// e pergunte “Mais Mercadorias (S/N)?”. Ao final, apresentar na tela o total em estoque e a média de valores das mercadorias
//em estoque.


package algoritmos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
        System.out.println("===MERCADORIAS EM ESTOQUE===");
        Scanner leitor = new Scanner(System.in);
        
        double soma = 0;
        int qtd = 1;
        
        System.out.println("Digite o valor da mercadoria:");
        double preço = leitor.nextDouble();
        
        soma = preço;
        
        System.out.println("mais mercadorias? (S ou N)");
        char resposta = leitor.next().charAt(0);
        
        while(resposta == 'S') {
            System.out.println("Digite o valor da mercadoria:");
            preço = leitor.nextDouble();
            
            soma = soma + preço;
            qtd = qtd + 1;
            
            System.out.println("mais mercadorias senhor? (S ou N)");
            resposta = leitor.next().charAt(0);
            
        }
        System.out.println("O total de mercadorias em estoque é: " + qtd);
        System.out.println("A média dos valores das mercadorias em estoque é: " + soma/qtd);
    }
}
