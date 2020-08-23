package com.haley.lista01;
import java.util.Scanner;

public class exec7 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    System.out.println("Seu login:");
    String login_usuario = s.nextLine();
    
    System.out.println("Sua senha:");
    String senha_usuario = s.nextLine();
    
    System.out.println("quantidade de vez que pode errar:");
    Integer tentativas = s.nextInt();
    
    System.out.println(String.format("Seu login é %s e sua senha è %s ,"
            + "Voce tem %s tentativas antes de ser bloqueado", login_usuario, senha_usuario, tentativas));
    
    s.close();
        
    }
}
