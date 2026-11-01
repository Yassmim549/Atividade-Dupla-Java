/*9) Crie uma função recursiva que receba uma lista de números inteiros e retorne a soma de todos os elementos da lista. Por exemplo, para a lista [1, 2, 3, 4], a função deve retornar 10. */

import java.util.ArrayList;

public class Atividade9 {
    public static int somar(ArrayList<Integer> lista, int tamanho){
        //Quando não houver número
        if(tamanho == 0){
            return 0;
        }

        //Soma o último número com a soma dos anteriores
        return lista.get(tamanho - 1) + somar(lista, tamanho -1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        int resultado = somar(numeros, numeros.size());

        System.out.println("A soma dos numeros eh: "+resultado);
    }
}