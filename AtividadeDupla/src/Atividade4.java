/*4) Considere que existe uma fila F1 com 100 números aleatórios. Faça uma função que inverta uma fila F1, criando-se uma nova fila F2. */

import java.util.LinkedList;

public class Atividade4 {
    public static void main(String[] args) {
        //Fila 1
        LinkedList<Integer> F1 = new LinkedList<>();

        //Adiciona os 100 números a lista F1
        for(int i = 1; i<=100; i++){
            F1.add(i);
        }
        System.out.println("Fila 1: "+F1);

        //Fila 2 para inverter a Fila 1
        LinkedList<Integer> F2 = new LinkedList<>();

        //Percorre a F1 e adiciona no inicio da F2
        for(Integer numero : F1){
            F2.addFirst(numero);
        }

        System.out.println("Fila 2: "+F2);
        
    }
}
