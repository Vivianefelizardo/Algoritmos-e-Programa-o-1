//Viviane Gomes Felizardo

import java.util.Scanner;

public class exercicio12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite seu ano de nascimento: ");
        int anodenascimento = scanner.nextInt();
        
        int anoatual = 2026; 
        int idade = anoatual - anodenascimento;
        int idade2030 = 2030 - anodenascimento;


        System.out.println("Sua idade é: " + idade + ". Em 2030 você terá: " + idade2030 + " anos de idade.");

        scanner.close(); 
    }
}