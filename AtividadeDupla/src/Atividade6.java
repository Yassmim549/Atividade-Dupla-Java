/*6) Sorteie 2000 números, sendo 1000 positivos e 1000 negativos e coloque numa fila. Cada vez que o número positivo estiver no início da fila, este deve ser retirado da fila e empilhado numa pilha. Cada vez que um número negativo estiver no início da fila, o número que estiver no topo da pilha deve ser impresso e retirado. */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.Collections;

public class Atividade6 {
    public static void main(String[] args) {
        Random random = new Random();

        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        List<Integer> listaNumeros = new ArrayList<>();

        // Gerar 1000 números positivos e 1000 negativos
        for(int i = 0; i < 1000; i++){
            // Números positivos
            listaNumeros.add(random.nextInt(10) + 1);

            // Números negativos
            listaNumeros.add((random.nextInt(10) + 1) * -1);
        }

        // Mistura os números aleatoriamente
        Collections.shuffle(listaNumeros);

        // Insere os números na fila
        fila.addAll(listaNumeros);

        while (!fila.isEmpty()){
            int primeiroNum = fila.poll();

            // Se o primeiro número for positivo
            if(primeiroNum > 0){
                // Empilha o número positivo
                pilha.push(primeiroNum);
            } else{
                // Se negativo, desempilha e imprime
                if(!pilha.isEmpty()){
                    int desempilha = pilha.pop();

                    System.out.println(
                        "Numero negativo: " + primeiroNum +
                        " ---> Desempilhando: " + desempilha
                    );
                } else{
                    System.out.println("Nenhum numero para desempilhar");
                }
            }
        }
    }
}
