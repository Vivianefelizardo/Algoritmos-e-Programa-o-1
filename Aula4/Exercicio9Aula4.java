// Viviane Gomes Felizardo
import java.util.Scanner;
public class Exercicio9Aula4{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        double salario;
        double prestacao;
        double limite;

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        prestacao = entrada.nextDouble();

        limite=salario*0.30;

        if (prestacao<=limite) {
            System.out.println("Emprestimo pode ser concedido! ");
        }else {
            System.out.println("Emprestimo não pode ser concedido! ");
        }

        entrada.close();

    }
}