package com.haley.lista01;
import java.util.Scanner;

public class exec6 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("seu nome:");
        String nome = s.nextLine();
        
        System.out.println("primeira nota:");
        Double primeiraNota = s.nextDouble();
        
        System.out.println("segunda nota:");
        Double segundaNota = s.nextDouble();
        
        Double media = (primeiraNota + segundaNota)/2;
        
        System.out.println(String.format("Ola %s, sua media foi de %.1f", nome, media));
        
        
        s.close();
        
    }
    
}
