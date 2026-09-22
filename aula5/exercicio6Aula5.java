import java.util.Scanner;
public class exercicio6Aula5{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        System.out.println("100");
        System.out.println("101");
        System.out.println("102");
        System.out.println("103");
        System.out.println("104");
        System.out.println("105");
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