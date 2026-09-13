//Viviane Gomes Felizardo

import java.util.Scanner;
public class Exercicio8Aula4 {
public static void main (String[]args){

Scanner entrada = new Scanner (System.in);
String senha;

System.out.println("Digite a senha: ");
senha = entrada.next();

if(senha.equals("R10p5"))
{
    System.out.println("Acesso concedido!");
}else{
    System.out.println("Acesso negado!");
}
entrada.close();
}
}