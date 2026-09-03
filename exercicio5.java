//Viviane Gomes Felizardo

import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o primeiro número");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número");
        int numero3 = scanner.nextInt();

        System.out.println("Digite o quarto número");
        int numero4 = scanner.nextInt();

        int resultado = numero1 + numero2 + numero3 + numero4;
        System.out.printf("A soma dos quatros número é %d", resultdo);

        scanner.close();

        
    }
}