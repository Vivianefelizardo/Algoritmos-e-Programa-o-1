//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio7Aula4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double salario;
        int ano;
        double bonus;

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();

        System.out.println("Digite os anos trabalhados: ");
        ano = entrada.nextInt();

        if (ano>=5) {
            bonus = salario * 0.20;
        
        }else{
            bonus = salario * 0.10;

        }

        System.out.print("O valor do bônus é: " + bonus);

        entrada.close();
    

    }
}