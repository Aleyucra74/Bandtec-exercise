package com.haley.lista01;
import java.util.Scanner;

public class exec10 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Quanto tempo de exercicio(em minutos):");
        Integer aquecimento = s.nextInt();
        
        System.out.println("Quanto tempo de exercicio artobicos(em minutos):");
        Integer aerobico = s.nextInt();
        
        System.out.println("Quanto tempo de musculacao(em minutos):");
        Integer musculacao = s.nextInt();
        
        Integer tempo_total = aquecimento+aerobico+musculacao;
        
        Integer calorias_aquecimento = aquecimento * 12;
        Integer calorias_aerobico = aerobico * 20;
        Integer calorias_musculacao = musculacao * 12;
        
        Integer total_calorias = calorias_aerobico+ calorias_aquecimento + calorias_musculacao;
        
        System.out.println(String.format("OLA JORGE, voce fez um total de"
                + "%s minutos de exercicios e perdeu cerca de %s calorias", tempo_total, total_calorias));
        
        s.close();
        
    }
    
}
