// Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio12Aula4{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        double salario;
        double desconto;

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600.00){
            System.out.println("Desconto INSS: Isento");
        } else if (salario > 600.00 && salario <= 1200.00){
            desconto = salario * 0.20;
            System.out.println("Desconto INSS (20%): R$ " + desconto);
        } else if (salario > 1200.00 && salario <= 2000.00 ){
            desconto = salario * 0.25;
            System.out.println("Desconto INSS (25%): R$ " + desconto);
        } else {
            desconto = salario * 0.30;
            System.out.println("Desconto INSS (30%): R$ " + desconto);
        }

        entrada.close();
        }


    }

