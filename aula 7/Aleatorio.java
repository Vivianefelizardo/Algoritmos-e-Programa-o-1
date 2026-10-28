import java.util.Random; 
public class Aleatorio{
    public static void main (String[]args){

        Random random = new Random();
        int sorteado = 10 + random.nextInt(90+1);
        System.out.println ("O número sorteado é: " + sorteado);

    }

}
