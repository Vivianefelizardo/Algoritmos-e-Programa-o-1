import java.util.Scanner;
public class Exercicio4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

    double numero1;
    double numero2;

    System.out.println("Digite um número: ");
    numero1 = entrada.nextDouble();

    System.out.println("Digite outro número: ");
    numero2 = entrada.nextDouble();

    if (numero1>numero2){
        System.out.println("Ordem decrescente: " + numero1 + " e " + numero2);

    }else{
        System.out.println("Ordem decrescente: " + numero2 + " e " + numero1);

    }
    entrada.close();
    }

}