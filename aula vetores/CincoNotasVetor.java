 import java.util.Scanner;

 public class CincoNotasVetor {

public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    double [] notas = new double[5];

    for (int i = 0; i < 5; i++){
        System.out.println("Digite uma nota: ");
        notas [i] = entrada.nextDouble();

    }

    System.out.println("Imprimindo os elementos do vetor");
    for (int i = 0; i < 5; i++){
        System.out.println(notas[i]);

    }

    entrada.close();

}
}
