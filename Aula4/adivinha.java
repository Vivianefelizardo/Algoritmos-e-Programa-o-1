import java.util.Scanner;

public class adivinha {
    public static void main (String[]args) {
        
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o seu palpite");
        int palpite = entrada.nextInt();

        if (palpite == 15){
            System.out.println("Parabéns, voçê acertou! O número secreto é 15. ");
        }else if (palpite <15){
            System.out.println("Seu palpite está abaixo. ");

        }else{
            System.out.println("Seu palpite está acima");
        }
        entrada.close();
    
        } 

    }

