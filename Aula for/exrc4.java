import java.util.Scanner;
public class exrc4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int idade; 
        double altura;
        double soma = 0;
        int maisde50 = 0;

        for (int cont = 0; cont <10; cont++){
             System.out.println(" Digite a idade" + (cont + 1) + ": "); 
             idade = entrada.nextInt();

             System.out.println("Digite a altura" + (cont + 1) + ": ");
             altura = entrada.nextDouble();
             
        if (idade > 50){
            soma += altura;
            maisde50++;
        }

        }
            if (maisde50 > 0){
                double media = soma / maisde50;
                System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + media);

            } else {
                System.out.println("Nenhuma pessoa com mais de 50 anos!");

            }

            entrada.close();
    }
}