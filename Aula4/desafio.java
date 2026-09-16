// Viviane Gomes Felizardo

import java.util.Scanner;
public class desafio{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int idade;
        String resposta;

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não apta a votar.");
        }
        else if (idade >= 18 && idade <= 70) {
            System.out.println("Apta a votar. O voto é obigatório!");
        }
        else {
            System.out.println("Apta a votar. O voto é opcional!");
        }
        entrada.close();


    }
}
