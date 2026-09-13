// Viviane Gomes Felizardo
import java.util.Scanner;
public class Exercicio10Aula4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int maior;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero3 = entrada.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("os números são iguais");
        }
        else {
            if (numero1 >= numero2 && numero1 >= numero3) {
                maior = numero1;
            }
            else if (numero2 >= numero1 && numero2 >= numero3) {
                maior = numero2;
            }
            else {
                maior = numero3;
            }
            System.out.println("O maior número é: " + maior);
        }

        entrada.close();
    }

}