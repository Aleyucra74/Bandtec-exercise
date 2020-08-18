/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haley.lista01;

/**
 *
 * @author haley
 */
public class exec01 {

    public static void main(String[] args) {
        
        Double num1 = 5.0;
        Double num2 = 10.0;
        
        Double soma = num1 + num2;
        Double sub = num1 - num2;
        Double mult = num1 * num2;
        Double div = num1 / num2;
        
        System.out.println(String.format("resultado de soma: \n %.1f \n", soma));
        System.out.println(String.format("resultado de sub: \n %.1f \n", sub));
        System.out.println(String.format("resultado de mult: \n %.1f \n", mult));
        System.out.println(String.format("resultado de div: \n %.1f \n", div));
    }
    
}
