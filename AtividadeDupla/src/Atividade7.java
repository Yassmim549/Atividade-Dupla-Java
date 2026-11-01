/*7) Escreva um método para inverter a ordem dos elementos de uma fila de 20 posições de inteiros, usando uma pilha como estrutura auxiliar. */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Atividade7 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        //Gera 20 elementos
        for (int i = 1; i <= 20; i++) {
            fila.add(i);
        }
        System.out.println("Elementos na fila: "+fila);

        //Inverte a ordem usando a pilha
        for(Integer numero : fila){
            pilhaAuxiliar.addFirst(numero);
        }
        System.out.println("Resultado da inversao: "+pilhaAuxiliar);
    }
}
