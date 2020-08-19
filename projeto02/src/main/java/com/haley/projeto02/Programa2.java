package com.haley.projeto02;

public class Programa2 {
    public static void main(String[] args) {
        String passageiro = "Zé buduia";
        Integer viagensDia = 4;
        Double creditoBu = 119.5;
        
        //passagem por 4.40
        Double viagensPossiveis = creditoBu / 4.4;
        
        Integer viagensPossiveisInteiro = viagensPossiveis.intValue();
        
        System.out.println(passageiro + "pode fazer" + viagensPossiveisInteiro + "viagens");
        
        Integer viagensPossiveisTotal = viagensPossiveisInteiro / viagensDia;
        
        System.out.println("a quantidade de credito da para "+ viagensPossiveisTotal+ " dias de trabalho");
    }
}
