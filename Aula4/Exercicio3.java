//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio3 {
public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    int numero1;
    int numero2;
    int resultado;

    System.out.println("Digite o primeiro numero: ");
    numero1 = entrada.nextInt();
    System.out.println("Digite o segundo numero: ");
    numero2 = entrada.nextInt();

    if (numero1==numero2){
        System.out.println("O números são iguais.");

    }
    else if (numero1>numero2) {
        resultado = numero1-numero2;
        System.out.println("A diferença do maior para o menor é: " + resultado);
    }
    else {
        resultado = numero2-numero1;
        System.out.println("A diferença do maior para o menor é: " + resultado);

    }
    entrada.close();
}
}
