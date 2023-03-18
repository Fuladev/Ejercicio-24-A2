package com.diegofula.ejercicio24;

import java.util.Scanner;

public class ejercicio24 {

    public static void main(String[] args) {
        //  Declaramos el Scanner con la variable scan
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite el peso de A");
        double a = scan.nextDouble();
        
        System.out.println("Digite el peso de B");
        double b = scan.nextDouble();
        
        System.out.println("Digite el peso de C");
        double c = scan.nextDouble();
        
        
        double may = a;
        
        if (may < b) {
            if (may < c) {
                may = c;
                System.out.println("El peso mayor es de C = " + may);
            }else{
                may = b;
                System.out.println("El peso mayor es de B = " + may);
            }
           
        }else if (may < c) {
            may = c;
            System.out.println("El peso mayor es de C = " + may);
        }else{
            System.out.println("El peso mayor es de A = " + may);
        }
        
    }
    
}
