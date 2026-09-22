//Viviane Gomes Felizardo

import java.util.Scanner;
public class exercicio5Aula5{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: "); 
        double numero2 = entrada.nextDouble();

        System.out.println("===Selecione a operação: ===");
        System.out.println("M - Média entre os números");
        System.out.println("S - Diferença do maior para o menor");
        System.out.println("P - Produto entre os números");
        System.out.println("D - Divisão do primeiro pelo segundo");

        String operaçao = entrada.next();

        switch(operaçao){
            case "M":
               double media = (numero1 + numero2)/2;
               System.out.println("A média é: " + media);
                break;
            case "S":
                if (numero1 > numero2){
                    double diferenca = numero1 - numero2;
                    System.out.println("A diferença é: " + diferenca);
                    } else {
                        double diferenca = numero2 - numero1;
                        System.out.println("A diferença é: " + diferenca);
                    }
                break;
            case "P":
                double produto = numero1 * numero2;
                System.out.println("Produto: " + produto);
                break;
            case "D":
                if (numero2==0) {
                    double divisao = numero1 / numero2;
                    System.out.println("Divisão do primeiro pelo segundo: " + divisao);
                } else {
                    System.out.println("Divisão inválida!");
    }
                break;
                default:
                    System.out.println("Opção inválida!");
                    break;
}
    entrada.close();
}
}
