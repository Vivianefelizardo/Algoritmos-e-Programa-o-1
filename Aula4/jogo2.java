import java.util.Scanner;

public class jogo2 {
public static void main (String [] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o número de pontos do Jogador 1 na fase 1.");
    Double pontos = entrada.nextDouble();
   
     if (pontos >= 1000) {
        System.out.println("Parabéns! Voçê passou para a fase 2.");
     }else{
        System.out.println("Voçê não atingiu a pontuação necessaria. Tente novamnete. ");
     }
     System.out.println("Siga para a proxima etapa. ");
     
     entrada.close();
    

}
}