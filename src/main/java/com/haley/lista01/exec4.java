package com.haley.lista01;
import java.util.Scanner;

public class exec4 {
    
    public static void main(String[] args) {
        
        Scanner txt = new Scanner(System.in);
        
        System.out.println("coloque um valor unitario de um produto:");
        Double valorUni = txt.nextDouble();
        
        System.out.println("quantidade vendida:");
        Integer qntdVendida = txt.nextInt();
        
        Double precoTotal = valorUni * qntdVendida;
        
        System.out.println("valor pago pelo cliente:");
        Double valorPago = txt.nextDouble();
        
        System.out.println(String.format("Seu troco sera de R$%.2f", (valorPago-precoTotal)));
        
        
        
        txt.close();
    }
    
}
