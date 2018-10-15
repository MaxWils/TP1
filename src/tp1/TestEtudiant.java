/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class TestEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Etudiant etudiant1 = new Etudiant();          //Constructeur nom_de_l'étudiant = coordonnées de l'élève
        //Etudiant etudiant2 = new Etudiant();        //Déclaration du deuxième objet rentre en conflits avec ligne 47 donc commentaire
        Scanner keyboard = new Scanner(System.in);
        //System.out.println(ID.getEtudiant());       //Problème car private, solution : get, set 
        
        int a = 0;
        System.out.println("Entrer un entier : ");
        a = keyboard.nextInt();
        float[] tab;
        while (a < 0) {
            System.out.println("Veuillez renseigner un entier positif :");
            a = keyboard.nextInt();
        }
    
                //etudiant1.nom = "SCHAFF";
                //System.out.println(etudiant1.nom);
        
        tab = new float[a];
        //tab = etudiant1.getTab();
      
        for (int i = 0 ; i < a ; i++){
            System.out.println("Veuillez saisir les notes : ");
            int clavier = keyboard.nextInt();
            tab[i] = clavier;             
        }
        
        Etudiant etudiant2 = new Etudiant(tab);
        
        System.out.println("Veuillez renseigner votre identifiant, nom et prénom : ");
        String clavier1 = keyboard.next();
        String clavier2 = keyboard.next();
        String clavier3 = keyboard.next();
        
        etudiant2.setIdentifiant(clavier1);
        etudiant2.nom = clavier2;
        etudiant2.prénom = clavier3;
        
        System.out.println(etudiant2.getIdentifiant()+ " " + etudiant2.nom + " " + etudiant2.prénom);
              
        etudiant1.modifier(clavier1, tab, a, clavier2, clavier3);
        
        etudiant1.setTab(tab);
        
        
        //for (int k = 0 ; k < tab.length ; k++){
        //    System.out.println("Notes : " + k + "eme " + tab[k]);
        //}
        etudiant1.Afficher();
        
        
        
}
}
