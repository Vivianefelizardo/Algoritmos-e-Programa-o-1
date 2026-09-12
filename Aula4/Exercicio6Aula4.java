//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio6Aula4{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        double altura;
        double pesoIdeal;
        String sexo;

        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.print("Digite seu sexo: ");
        sexo = entrada.next();

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        
        }else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);

        }else {
            System.out.println("Sexo inválido. Use M ou F.");
        }
        entrada.close();
    

    }
}
