//Viviane Gomes Felizardo

import java.util.Scanner;

public class exercicio13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);
        double potencia10 = Math.pow(numero, 10);

        System.out.println("O número ao quadrado: " + quadrado);
        System.out.println("O número ao cubo: " + cubo);
        System.out.printf("A Raiz Quadrada é: %.2f %n", raizQuadrada); 
        System.out.println("O número elevado a potência 10: " + potencia10);

        scanner.close();
    }
}