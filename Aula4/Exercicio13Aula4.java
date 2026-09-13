// Vivine Gomes Felizardo

import java.util.Scanner;
public class Exercicio13Aula4{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        double numero1;
        double numero2;
        double resultado;
        char operacao;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextDouble();

        System.out.println("Digite a operação (+, -,*, /): ");
        operacao = entrada.next().charAt(0);
        
        if (operacao == '+') {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);
    }
    else if (operacao == '-') {
        resultado = numero1 - numero2;
        System.out.println("Resultado: " + resultado);
}
else if (operacao == '*') {
        resultado = numero1 * numero2;
        System.out.println("Resultado: " + resultado);
}
else if (operacao == '/') {
        if (numero2 > 0) {
            resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Impossível dividir‼");
            }
}
else {
    System.out.println("Sinal Inválido");
}

entrada.close();

    }
}

            
            
