//Viviane Gomes Felizardo

import java.util.Scanner;
public class exer3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt(); 

        for (int cont = 1; cont <= numero; cont++){

            System.out.println("Sequência: " + cont);
        }

        entrada.close();
    
    }
}
