import java.util.Scanner;
public class exercicio3Aula5{
    public static void main(String[]args){

        System.out.println("Digite seu período de estudo:");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");

        Scanner entrada = new Scanner(System.in);

        String periodo = entrada.nextLine();

        switch(periodo){
            case "M":
                System.out.println("Você selecionou M - Matutino");
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Você selecionou V - Vespertino");
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Você selecionou N - Noturno");
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
        }
        
            entrada.close();

    }
}