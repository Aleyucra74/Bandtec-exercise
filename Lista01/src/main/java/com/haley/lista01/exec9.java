package com.haley.lista01;
import java.util.Scanner;

public class exec9 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Seu salario bruto, por favor:"); 
        Double salario = s.nextDouble();
        
        Double inss = (10/100)*salario;
        Double ir = (20/100)*salario;
        
        System.out.println("quanto vc gasta de conducao de ida:");
        Double conducao = s.nextDouble();
        
        Double vt = conducao*2*22;
        Double desconto = inss+ ir + vt;
        Double salario_liquido = salario - desconto;
        
        System.out.println(String.format("Seu bruto é R$%.2f, tem um total de R$%.2f em descontos "
                + "e recebera um liquido de R$%.2f", salario, desconto, salario_liquido ));
        
        s.close();
    }
    
}
