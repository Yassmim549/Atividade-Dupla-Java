/*8) sorteie 1000 números variando entre -100 a 100. Crie uma classe chamada TestaPilha que vai conter duas pilhas (objetos N e P) respectivamente, Realizar as seguintes operações:
− se positivo, inserir na pilha P;
− se negativo, inserir na pilha N;
− se zero, retirar um elemento de cada pilha e imprimir esses números. */


import java.util.Random;
import java.util.Stack;

public class Atividade8 {

    public static void main(String[] args) {

        // Criação das duas pilhas
        Stack<Integer> N = new Stack<>();
        Stack<Integer> P = new Stack<>();

        Random sorteio = new Random();

        // Sorteio de 1000 números entre -100 e 100
        for (int i = 0; i < 1000; i++) {
            int numero = sorteio.nextInt(201) - 100;
            System.out.println("Número sorteado: " + numero);

            if (numero > 0){
                // Se positivo, insere na pilha P
                P.push(numero);
            } else if (numero < 0){
                // Se negativo, insere na pilha N
                N.push(numero);
            } else{
                // Se zero, retira um elemento de cada pilha
                if (!P.isEmpty() && !N.isEmpty()) {
                    int positivo = P.pop();
                    int negativo = N.pop();

                    System.out.println("Retirado da pilha P: " + positivo);
                    System.out.println("Retirado da pilha N: " + negativo);
                } else{
                    System.out.println("Não existem elementos nas duas pilhas para retirar.");
                }
            }
        }

        // Exibição dos elementos restantes
        System.out.println("\nElementos restantes na pilha P: " + P);
        System.out.println("Elementos restantes na pilha N: " + N);
    }
}
