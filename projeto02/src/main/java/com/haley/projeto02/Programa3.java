package com.haley.projeto02;

public class Programa3 {
    public static void main(String[] args) {
        
        String cidadao = "maria bonita";
        Integer filhos = 4;
        Double bolsaFamilia = filhos * 35.9;
        
        String mensagem =
            String.format("o cidadao %s tem %d filhos e recebe R$ %.2f do governo", cidadao, filhos, bolsaFamilia);
        
        System.out.println(mensagem);
        
        
    }
    
}
