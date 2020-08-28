package com.haley.lista01;
import java.util.Scanner;

public class exec8 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 à 3 anos vc tem:");
        Integer filhos_bebe = s.nextInt();

        System.out.println("Quantos filhos de 4 à 16 anos vc tem:");
        Integer filhos_medios = s.nextInt();
        
        System.out.println("Quantos filhos de 17 à 18 anos vc tem:");
        Integer filhos_grandes = s.nextInt();
        
        Integer filhos_totais = filhos_bebe+ filhos_grandes+ filhos_medios;
        
        Double filho_quatro = 25.12;
        Double filho_16 = 15.88;
        Double filho_18 = 12.44;
        
        Double bolsa_total = (filhos_bebe*filho_quatro)+(filhos_medios*filho_16)+(filhos_grandes*filho_18);
        
        System.out.println(String.format("Voce tem um total de %s e vai receber R$ %.2f de bolsa", filhos_totais, bolsa_total));
        
        s.close();
    }
}
