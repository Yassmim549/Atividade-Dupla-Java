/*10) Crie uma função recursiva que receba dois números inteiros positivos, a e b, e calcule o valor de a elevado à potência b (ou seja, a^b), sem utilizar o operador de exponenciação */

import java.util.Scanner;

public class Atividade10 {
    public static int potencia(int a, int b){
        //Elementos elevados  zero = 1
        if(b == 0){
            return 1;
        }

        return a * potencia(a, b-1);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor de A:");
        int a = entrada.nextInt();

        System.out.println("Valor de B:");
        int b = entrada.nextInt();

        int resultado = potencia(a, b);

        System.out.println(a+" elevado a "+b+" eh: "+resultado);

        entrada.close();
    }
}
