package com.haley.lista01;
import java.util.Scanner;

public class exec5 {
    
    public static void main(String[] args) {
        
        Scanner txt = new Scanner(System.in);
        
        System.out.println("digite o seu salario:");
        Double salario = txt.nextDouble();
        
        System.out.println("digite a porcentagem do imposto pago:");
        Double imposto = txt.nextDouble();
        
        Double salarioLiquido = imposto/100*salario;
        System.out.println(String.format("O seu salario liquido sera de %.2f", (salario - salarioLiquido) ));
        
        txt.close();
    }
    
}
