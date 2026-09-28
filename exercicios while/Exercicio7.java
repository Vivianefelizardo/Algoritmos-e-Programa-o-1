import java.util.Scanner;
public class Exercicio7{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int pessoasSemObesidade = 0;
        double peso, altura, imc;

        while (contador <= 10) {
            System.out.println("Dados" + contador + ":");
           
            System.out.println("Digite seu peso: ");
            peso = entrada.nextDouble();

            System.out.print("Digite sua altura: ");
            altura = entrada.nextDouble();

            imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {

                pessoasSemObesidade++;
            }

                contador++;

        }

            System.out.println("Quantidade de pessoas sem obesidade: " + pessoasSemObesidade);

            entrada.close();



    }
}