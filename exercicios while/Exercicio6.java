//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int contador = 1;
        int numero;
        int menor = 0;

        while (contador <= 10) {
            System.out.println("Digite o " + contador + " número: ");
            numero = entrada.nextInt();

            if (contador == 1) {
                menor = numero;
             } else {
              if (numero < menor) {
                  menor = numero;
              }
            }
            contador++;
        }
        System.out.println("O menor número digitado foi: " + menor);
        entrada.close();

    }
}


