//2) Utilizando somente operações de empilhar e desempilhar, escreva um programa que remove um item com chave c fornecida pelo usuário da pilha. Ao final da execução da função, a pilha deve ser igual à original, exceto pela ausência do item removido.

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {
    public static void main(String[] args) {
        Stack<Integer> pilhaOriginal = new Stack<>();

        Scanner entrada = new Scanner(System.in);

        pilhaOriginal.push(10);
        pilhaOriginal.push(20);
        pilhaOriginal.push(30);
        pilhaOriginal.push(40);
        pilhaOriginal.push(50);

        //Chave c fornecida pelo usuario:
        System.out.println("Chave c: ");
        int c = entrada.nextInt();

        //Nova pilha
        Stack<Integer> pilhaDois = new Stack<>();
        while (!pilhaOriginal.isEmpty()){
            int elemento = pilhaOriginal.pop();

            //Se o elemento for diferente de c, é adicionado na segunda pilha
            if(elemento !=c){
                pilhaDois.push(elemento);
            }
        }

        while (!pilhaDois.isEmpty()){
            pilhaOriginal.push(pilhaDois.pop());
        }

        System.out.println("Pilha final: "+pilhaOriginal);
        entrada.close();
    }
}
