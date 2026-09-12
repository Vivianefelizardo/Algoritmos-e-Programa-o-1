//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio1Aula4{
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    int numero;

    System.out.println("Digite um número inteiro: ");
    numero = entrada.nextInt();

    if (numero>20) {
        double metade = numero / 2.0;
        
        System.out.println("A metade é: " + metade);

    }
entrada.close();
}
}
