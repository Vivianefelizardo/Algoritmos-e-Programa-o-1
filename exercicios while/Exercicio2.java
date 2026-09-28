import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args){
        
        int contador;
        contador = 1;
        int totalPares;
        totalPares = 0;
        int totalImpares;
        totalImpares = 0;
        int numero;
        
        Scanner entrada = new Scanner (System.in);

        while (contador <= 10){
            System.out.println("Digite o " + contador + " número");
            numero = entrada.nextInt(); 

        if (numero % 2 == 0){
            totalPares++;
        }else {
            totalImpares++;
        }
        contador++;
        }

        System.out.println("O total de pares é: " + totalPares);
        System.out.println("O total de ímpares é: " + totalImpares);

        entrada.close();

    }
}