// Viviane Gomes Felizardo

import java.util.Scanner;
public class desafio{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int idade;
        String resposta;
        boolean alfabetizado;

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Você é alfabetizado(a)? (S/N): ");
        resposta = entrada.next();

        alfabetizado = resposta.equalsIgnoreCase("S"); 

        if (idade < 16) {
            System.out.println("Não apta a votar.");
        }
        else if (idade >= 18 && idade <= 70 && alfabetizado) {
            System.out.println("Apta a votar. O voto é obigatório!");
        }
        else {
            System.out.println("Apta a votar. O voto é opcional!");
        }
        entrada.close();


    }
}