//Viviane Gomes Felizardo

import java.util.Scanner;
public class exrc5{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somamedia = 0.0;

        for (int i = 1; i <= 6; i++){
            System.out.println("Aluno" + i);

            System.out.println("Digite a primeira nota: ");
            double nota1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2.0;

            System.out.printf("Média do aluno %d: %.2f%n", i, media);

            if (media <= 3.0){
                System.out.println("REPROVADO");
                reprovados++;

            }else if (media < 7.0){
                System.out.println("EXAME");
                exame++;

            }else{
                System.out.println("APROVADO");
                aprovados++;
            }

            somamedia += media;
            System.out.println();

        }

            double mediaClasse = somamedia / 6.0;

            System.out.println(" RESULTADO ");
            System.out.println("Total de alunos APROVADOS: " + aprovados);
            System.out.println("Total de alunos em EXAME: " + exame);
            System.out.println("Total de alunos REPROVADOS: " + reprovados);
            System.out.printf("Média da classe: %.2f%n", mediaClasse);
            entrada.close();
        }
    }
