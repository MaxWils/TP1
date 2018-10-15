/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author maxim
 */
public class Essais {
    public static void main(String args[]) {
        
        /*
        Identifiez l’erreur 2 et corrigez
        i est déclaré 2 fois
        */
        
        int i = 0;
        for (i = 0; i < 5; i++)
            System.out.print(i + ", ");
        System.out.print("\n");
        
        /*
        Identifiez l’erreur 2 et corrigez
        Opération entre 2 types de variables impossible
        */
        
        double a = 3.0;
        double b = 4;
        double c;
        c = Math.sqrt(a * a + b * b);
        System.out.println("c = " + c);
        
        /*
        Identifiez l’erreur 3 et corrigez
        Opération binaire avec (byte) ou changer le type de variable dans les
        déclarations
        */
        
        byte b1 = 42;
        char c1 = 'a';
        short s = 1024;
        int i1 = 50000;
        float f = 5.67f;
        double d = .1234;
        double resultat = (f * b1) + (i1 / c1) - (d * s);
        System.out.print((f * b1) + " + " + (i1 / c1) + " - " + (d * s));
        System.out.println(" = " + resultat);
        byte b2 = 10;
        byte b3 = (byte) (b2 * b1);
        System.out.println("b3 = " + b3);
    }   
    
}
