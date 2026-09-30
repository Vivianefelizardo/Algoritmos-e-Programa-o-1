//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio3{
    public static void main (String[]args){

        int numero;
        int sequencia;
        sequencia = 1;

        Scanner entrada = new Scanner (System.in);

        System.out.println ("Digite um número inteiro: ");
        numero = entrada.nextInt();

        while (sequencia <= numero) {
            System.out.print(sequencia + " ");
            sequencia = sequencia * 2;
    }

    System.out.println("Fim da sequência.");
    entrada.close();
}
}
