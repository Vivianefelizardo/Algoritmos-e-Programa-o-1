//Viviane Gomes Felizardo

import java.util.Scanner;
public class exercicio6Aula5{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Código     Produto        Preço");
        System.out.println("100     Cachorro Quente   R$ 1,20");
        System.out.println("101     Bauru Simples     R$ 1,30");
        System.out.println("102     Bauru com Ovo     R$ 1,50");
        System.out.println("103     Hambúrguer        R$ 1,20");
        System.out.println("104     Cheeseburguer     R$ 1,30");
        System.out.println("105     Refrigerante      R$ 1,00");
        System.out.print("Insira o código do produto: ");
        int codigo = entrada.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        double valorTotal;

        switch (codigo) {
            case 100:
                valorTotal = 1.20 * quantidade;
                System.out.println("Produto: Cachorro Quente");
                System.out.println("Total a pagar: R$ " + valorTotal);
                break;
            case 101:
                valorTotal = 1.30 * quantidade;
                System.out.println("Produto: Bauru Simples");
                System.out.println("Total a pagar: R$ " + valorTotal);
                break;
            case 102:
                valorTotal = 1.50 * quantidade;
                System.out.println("Produto: Bauru com ovo");
                System.out.println("Total a pagar: R$ " + valorTotal);
                break;
            case 103:
                valorTotal = 1.20 * quantidade;
                System.out.println("Produto: Hambúrguer");
                System.out.println("Total a pagar: R$ " + valorTotal);
                break;
            case 104:
                valorTotal = 1.30 * quantidade;
                System.out.println("Produto: Cheeseburguer");
                System.out.println("Total a pagar: R$ " + valorTotal);
                break;
            case 105:
                valorTotal = 1.00 * quantidade;
                System.out.println("Produto: Refrigerante");
                System.out.println("Total a pagar: R$ " + valorTotal);
                break;
            default:
                System.out.println("Código inválido!");
                break;
    }
    entrada.close();
    }
}
