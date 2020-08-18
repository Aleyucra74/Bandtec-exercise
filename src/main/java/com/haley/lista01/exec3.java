package com.haley.lista01;
import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        
        System.out.println("Qual o limite de peso do elevador?");
        Integer pesoLimite = txt.nextInt();
        System.out.println("numero maximo de pessoas no elevador:");
        Integer pessoalTotal = txt.nextInt();
        
        System.out.println("peso da 1ª pessoa:");
        Integer pesoUm = txt.nextInt();
        
        System.out.println("peso da 2ª pessoa:");
        Integer pesoDois = txt.nextInt();
        
        System.out.println("peso da 3ª pessoa:");
        Integer pesoTres = txt.nextInt();
        
        Integer pesoTotal = pesoUm + pesoDois + pesoTres;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "+ pessoalTotal+"\n");
        System.out.println("O peso total no elevador é de "+ pesoTotal
                            +",\n sendo que ele suporta "+ pesoLimite);
        
        txt.close();
    }
}
