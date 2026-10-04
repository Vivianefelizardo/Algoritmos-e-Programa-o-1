//Viviane Gomes Felizardo

import java.util.Scanner;
public class exer7{
    public static void main(String[]args){
       Scanner entrada = new Scanner(System.in);

        int maioresDe50 = 0;
        int qtda10a20 = 0;
        double somaAlturas10a20 = 0.0;
        int qtdaPesoMenor40 = 0;               
                
       for (int cont = 1; cont <= 10; cont++){

            System.out.println("Digite a idade");
            int idade = entrada.nextInt();

            System.out.println("Digite o peso");
            double peso = entrada.nextDouble();

            System.out.println("Digite a altura");
            double altura = entrada.nextDouble();

            if (idade > 50){
                maioresDe50++;
            
            }

            if (idade >= 10 && idade <= 20){

                somaAlturas10a20 += altura;
                qtda10a20++;

            }

            if (peso < 40.0){
                qtdaPesoMenor40++;
            }

            System.out.println();
        }
            double mediaAltura = (qtda10a20 > 0) ? (somaAlturas10a20 / qtda10a20): 0.0;
            double pesoMenor40 = (qtdaPesoMenor40 / 10.0) * 100.0;

            System.out.println("RESULTADO");
            System.out.println("Quantidade de pessoas maiores de 50 anos: " + maioresDe50);

            if (qtda10a20 > 0) {
                System.out.printf("Média das alturas: %.2f m%n", mediaAltura);

            }else {
                System.out.println("Média das alturas: Nenhuma pessoa registrada nessa faixa etária.");

            }

                System.out.printf("Porcentagem de pessoas com peso inferior a 40kg: %.2f%%%n", pesoMenor40);

                entrada.close();


    }
}
