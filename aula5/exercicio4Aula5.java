import java.util.Scanner;
public class exercicio4Aula5{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        double salario = entrada.nextDouble();

        System.out.println("Digite seu plano de trabalho: ");
        System.out.println("Plano A Plano B Plano C");
         String plano = entrada.next();
        
         double salarioNovo;

         switch(plano){

            case "A":
                salarioNovo = salario * 1.10;
                System.out.println("Você digitou Plano A");
                System.out.println("Novo salário: R$" + salarioNovo);
                break;
            case "B":
               salarioNovo = salario * 1.15;
                System.out.println("Você digitou Plano B");
                System.out.println("Novo salário: R$" + salarioNovo);
                break;
            case "C":
                salarioNovo = salario * 1.20;
                System.out.println("Você digitou plano C");
                System.out.println("Novo salário: R$ " + salarioNovo);
                break;
             default:
                System.out.println("Plano Inválido!");
                break;

         }
         entrada.close();

    }
}