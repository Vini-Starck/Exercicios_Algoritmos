// Vinicius Starck Malghosian Cantafaro
// Criar um algoritmo que leia a idade e o peso de 15 pessoas e apresente na tela a média dos pesos das pessoas da mesma faixa
// etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de 30 anos.

package algoritmos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        
        int ghost = 2; // variável loop
        int pessoas = 15; // pessoas
        int pessoa = 2; // ordem de pessoas
        
        double soma1 = 0; // somas
        double soma2 = 0;
        double soma3 = 0;
        double soma4 = 0;
        
        int qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0; // quantidade
                
        
        System.out.println("Digite seu PESO:");
        double peso = leitor.nextDouble();
        
        System.out.println("Digite sua IDADE:");
        int idade = leitor.nextInt();
        
        while(ghost <= pessoas) {
            if(idade <= 0 && peso <= 0) {
                System.out.println("==Valores inválidos==");
            } if(idade <= 10) {
                soma1 = soma1 + peso;
                qtd1 = qtd1 + 1;
            } if(idade > 10 && idade <= 20) {
                soma2 = soma2 + peso;
                qtd2 = qtd2 + 1;
            } if(idade > 20 && idade <= 30) {
                soma3 = soma3 + peso;
                qtd3 = qtd3 +1;
            } else {
                soma4 = soma4 + peso;
                qtd4 = qtd4 + 1;
            }
            
            System.out.println("Digite o PESO da " + pessoa + "º pessoa:");
            peso = leitor.nextDouble();
            
            System.out.println("Digite a IDADE da " + pessoa + "º pessoa:");
            idade = leitor.nextInt();
            
            ghost = ghost + 1;
            pessoa = pessoa + 1;
        }
        System.out.println("A média de peso de pessoas com 1 até 10 anos é: " + soma1/qtd1);
        System.out.println("A média de peso de pessoas com 11 até 20 anos é: " + soma2/qtd2);
        System.out.println("A média de peso de pessoas com 21 até 30 anos é: " + soma3/qtd3);
        System.out.println("A média de peso de pessoas com mais de 30 anos é: " + soma4/qtd4);
    }
}
