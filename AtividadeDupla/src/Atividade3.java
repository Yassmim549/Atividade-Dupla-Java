/*3) Escreva um programa que simule o controle de uma pista de decolagem de aviões em um aeroporto. Neste
programa, o usuário deve ser capaz de realizar as seguintes tarefas:
a) Listar o número de aviões aguardando na fila de decolagem;
b) Autorizar a decolagem do primeiro avião da fila;
c) Adicionar um avião à fila de espera;
d) Listar todos os aviões na fila de espera;
e) Listar as características do primeiro avião da fila. Considere que os aviões possuem um nome e um número
inteiro como identificador. */

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Atividade3 {
    //Classe para os aviões para guardar as caracteristicas separadas de um objeto
    static class Aviao {
        String nome;
        int identificador;

        //Construtor da classe: permite criar o avião informando as caracteristicas
        public Aviao(String nome, int identificador) {
            this.nome = nome;
            this.identificador = identificador;
        }

        //Vai formar como será mostrado a listagem
        public String toString() {
            return "Aviao: " + nome + " | Identificador: " + identificador;
        }
    }
    public static void main(String[] args) {
        Queue<Aviao> pistaDecolagem = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);

        pistaDecolagem.add(new Aviao("Aviao 1", 101));
        pistaDecolagem.add(new Aviao("Aviao 2", 102));
        pistaDecolagem.add(new Aviao("Aviao 3", 103));
        pistaDecolagem.add(new Aviao("Aviao 4", 104));
        pistaDecolagem.add(new Aviao("Aviao 5", 105));
        
        System.out.println("a) Numero de avioes aguardando na fila de decolagem");
        int quantAvioes = pistaDecolagem.size();
        System.out.println(quantAvioes);

        //Autorizar decolagem do primeiro avião
        System.out.println("b) Autorizar decolagem do primeiro aviao? ('s', 'n')");
        String autorizarDecolagem = entrada.nextLine().toLowerCase();
        if(autorizarDecolagem.equals("s")){
            if(!pistaDecolagem.isEmpty()){
                System.out.println("Autorizacao concedida!");
                Aviao primeiroElemento = pistaDecolagem.poll();
                System.out.println(primeiroElemento.nome + "decolou");
            }
        } else if(autorizarDecolagem.equals("n")){
            System.out.println("Todos os avioes continuam na pista");
        } else{ System.out.println("Conteudo invalido");}

        //Adicionar aviao a lista de espera
        System.out.println("c) Adicionar um aviao a lista de espera");
        System.out.println("Nome do aviao:");
        String nome = entrada.nextLine();
        System.out.println("Numero identificador");
        int identificador = entrada.nextInt();

        Aviao novoAviao = new Aviao(nome, identificador);
        pistaDecolagem.add(novoAviao);

        //Listar aviões na lista de espera
        System.out.println("d) Avioes na lista de espera:");
        for(Aviao avioesPista: pistaDecolagem){
            System.out.println(avioesPista);
            }

            System.out.println("e) Listar as caracteristicas do primeiro avião da fila");
            if(!pistaDecolagem.isEmpty()){
                Aviao primeiroAviao = pistaDecolagem.peek();
                System.out.println("Nome: "+primeiroAviao.nome);
                System.out.println("Identificador: "+primeiroAviao.identificador);
            }
        entrada.close();
    }
}
