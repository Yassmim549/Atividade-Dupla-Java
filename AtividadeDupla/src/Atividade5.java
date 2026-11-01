/*5) Dado uma Fila de números distintos F e uma Pilha P. Sorteie 1000 números aleatórios e insira na fila F. Caso o número já esteja presente na Fila F, o número deve ser inserido na Pilha P. Após sortear os 1000 números, imprimir a Fila F e a Pilha P. */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class Atividade5 {
    public static void main(String[] args) {
        //Sorteio
        Random random = new Random();
        Set<Integer> auxSet = new HashSet<>();

        LinkedList<Integer> F = new LinkedList<>();
        Stack<Integer> P = new Stack<>();
        //Loop para repetir a randomização quantas vezes for necessario
        for(int i = 1; i <= 1000; i++){
            Integer numSorteado = random.nextInt(1000)+1;//gera um número de 0 a 99 +1, dando 1000

            //Se existe em F, coloca em P
            if(auxSet.contains(numSorteado)){
                P.push(numSorteado);
            }else{
                //Adiciona a fila F
                F.add(numSorteado);
                auxSet.add(numSorteado);
            }
        }

        System.out.println("Fila F: "+F+"\n\n");
        System.out.println("Pilha P: "+ P);

    }
}
