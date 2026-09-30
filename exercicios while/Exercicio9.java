//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio9{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        double totalCompra = 0;
        int continuar = 1;

        while (continuar == 1) {
            System.out.println("Código     Produto        Preço");
            System.out.println("100     Cachorro Quente   R$ 1,20");
            System.out.println("101     Bauru Simples     R$ 1,30");
            System.out.println("102     Bauru com Ovo     R$ 1,50");
            System.out.println("103     Hambúrguer        R$ 1,20");
            System.out.println("104     Cheeseburguer     R$ 1,30");
            System.out.println("105     Refrigerante      R$ 1,00");
            System.out.print("Digite o código do produto: ");
            int codigo = entrada.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = entrada.nextInt();

            double precoItem = 0;
            String nomeProduto = "";
            boolean codigoValido = true;

            switch (codigo) {
                case 100:
                    nomeProduto = "Cachorro quente";
                    precoItem = 1.20;
                    break;
                case 101:
                    nomeProduto = "Bauru Simples";
                    precoItem = 1.30;
                    break;
                case 102:
                    nomeProduto = "Bauru com ovo";
                    precoItem = 1.50;
                    break;
                case 103:
                    nomeProduto = "Hambúrguer";
                    precoItem = 1.20;
                    break;
                case 104:
                    nomeProduto = "Cheeseburguer";
                    precoItem = 1.30;
                    break;
                case 105:
                    nomeProduto = "Refrigerante";
                    precoItem = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    codigoValido = false;
                    break;

            }

            if (codigoValido) {
                double totalItem = precoItem * quantidade;
                totalCompra += totalItem;

                System.out.println("Item selecionado: " + nomeProduto);
                System.out.println("Valor deste produto: R$ " + totalItem);

            }

            System.out.print("Deseja continuar comprando? (1 - Sim / 0 - Não): ");
            continuar = entrada.nextInt();

        }

        System.out.println("Valor TOTAL da compra: R$ " + totalCompra);

        entrada.close();


    
    }
}
