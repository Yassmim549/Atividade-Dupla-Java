/* 1) Escreva um programa solicite ao usuário uma sequência de caracteres sem limite de máximo de tamanho e realize as seguintes operações usando uma pilha:
a) Imprimir o texto na ordem inversa;
b) Verificar se o texto é um palíndromo, ou seja, se a string é escrita da mesma maneira de frente para trás e de trás para frente. Ignore espaços e pontos. */

//Exemplos de frases e uma palavra Políndromas: O lobo ama o bolo. A sacada da casa. Anotaram a data da maratona. Omissíssimo

import java.util.Stack;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Solicita a entrada
        System.out.println("Sequencia de caracters: ");
        String sequencia = entrada.nextLine();

        //Cria uma pilha para caracters
        Stack<Character> pilha = new Stack<>();

        //Empilha cada caracter da string pilha
        for(int i = 0; i < sequencia.length(); i++){
            pilha.push(sequencia.charAt(i));
        }

        System.out.println("a) Imprimir o texto na ordem inversa");
        //Desempilha os caraters
        StringBuilder invertido = new StringBuilder();
        while (!pilha.isEmpty()){
            invertido.append(pilha.pop());
        }
        System.out.println("Sequencia invertida: "+invertido.toString());


        System.out.println("b) Identificar se eh um texto polindromo");
        // Remove espaços e pontos
        String textoTratado = sequencia.replace(" ", "").replace(".", "").toLowerCase();

        // Coloca os caracteres do texto tratado na pilha
        for (int i = 0; i < textoTratado.length(); i++){
            pilha.push(textoTratado.charAt(i));
        }

        // Monta novamente a palavra, mas invertida
        StringBuilder textoInvertido = new StringBuilder();

        while (!pilha.isEmpty()){
            textoInvertido.append(pilha.pop());
        }

        // Compara o texto original tratado com o invertido
        if (textoTratado.equals(textoInvertido.toString())){
            System.out.println("O texto eh um palindromo.");
        } else{
            System.out.println("O texto nao eh um palindromo.");
        }

        //forma 2
        boolean iguais = textoTratado.equals(textoInvertido.toString());
        System.out.println("O texto eh um polindromo? "+iguais);

        entrada.close();
    }
}
