package com.haley.lista01;
import java.util.Scanner;


public class exec2 {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Digite seu nome:");
        str = texto.nextLine();
        System.out.println("Ola "+ str +" qual o ano do seu nascimenot?");;
        Integer numeroAno = texto.nextInt();
        System.out.println("Em 2030, voce tera "+ (2030 - numeroAno) + " anos");
        texto.close();
    }
    
}
