import java.util.Scanner;
public class Exercicio8{
    public static void main(String[]args){

        Scanner entrada = new Scanner (System.in);

        int aluno = 1;

        while (aluno <= 5) {
            double nota1, nota2;

            System.out.println(" Aluno " + aluno + "  ");

            do {

                System.out.print("Digite a primeira nota: ");
                nota1 = entrada.nextDouble();

                if (nota1 < 0 || nota1 > 10) {

                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");

    }
}

            while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a segunda nota: ");
                nota2 = entrada.nextDouble();
                
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");

                }
                } while (nota2 < 0 || nota2 > 10);

                double media = (nota1 + nota2) / 2;
                System.out.println("Média do Aluno " + aluno + ": " + media + "\n");

                aluno++; 

            }
                    entrada.close();

        }
}

