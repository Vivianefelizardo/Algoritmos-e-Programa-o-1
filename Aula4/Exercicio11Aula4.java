//Viviane Gomes Felizardo
import java.util.Scanner;
public class Exercicio11Aula4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println("Sua categoria é: infantilA.");
        } else if (idade >= 8 && idade <= 10){
            System.out.println("Sua categoria é: infantilB.");
        } else if (idade >= 11 && idade <= 13){
            System.out.println("Sua categoria é: juvenilA.");
        } else if (idade >= 14 && idade <= 17){
            System.out.println("Sua categoria é: juvenilB.");
        } 
        else if (idade >= 18){
            System.out.println("Sua categoria é: Sênior. ");
        }

        entrada.close();
    }
}