//Viviane Gomes Felizardo

import java.util.Scanner;

public class exercicio4 {
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número inteiro");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número inteiro");
            int numero2 = scanner.nextInt();

            int resultado = numero1 * numero2;

            System.out.println("O produto entre os dois números é:" + resultado);

            scanner.close();
        }

}