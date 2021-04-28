// Vinicius Starck Malghosian cantafaro
// O número 3025 possui a seguinte característica: 30 + 25 = 55 e 55^2 = 3025. Criar um algoritmo que apresente na tela todos
//os números positivos de quatro algarismos que possuem a característica citada.

package algoritmos;

public class Exercicio2 {
    
    public static void main(String args []) {
        
        System.out.println("===PROPRIEDADE 4 ALGARISMOS===");
        
        int numero = 1000;
        int pd; // primeira dezena
        int sd; // segunda dezena
        
        while(numero <= 9999) {
            pd = numero / 100;
            sd = numero % 100;
            
            if((pd+sd)*(pd+sd) == numero) {
                System.out.println("O número " + numero + " possui esta propriedade.");
            }
            
            numero = numero + 1;
        }
    }
}
