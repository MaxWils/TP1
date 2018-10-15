/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maxim
 */
public class Etudiant {                             //Classe
        
    private String ID;                              //Attribut
    private float[] tNotes;
    private int taille; 
    public String nom;
    public String prénom;
           
    public Etudiant(){                              //Constructeur (paramètres)
        
        ID = "0";                                   //Initialisation
        /*for (int i = 0; i<tNotes.length;i++){     //Initialisation d'un tableau
            tNotes[i] = 0;                          //tNotes[0] = 0; <- ligne d'initialisation de la ligne 0    
        }*/
        taille = 0; 
        nom = "0";
        prénom = "0";
                                                        
    }
    
    public Etudiant(float[] Tableau){
        
        taille = Tableau.length;
        setTab(Tableau);
        //for (int i = 0; i<Tableau.length;i++){       //Initialisation d'un tableau
        //    tNotes[i] = Tableau[i];         
       /* Peut-être remplacer par la ligne suivante 
        * System.arraycopy(Tableau, 0, tNotes, 0, Tableau.length);
        */
        }
        
    
    
    public void modifier(String ID,float[] tNotes,int taille,String nom,String prénom){ 
        
        this.ID = ID;
        this.tNotes = tNotes;
        this.nom = nom;
        this.prénom = prénom;
        
    }  
    
    public float[] getTab(){
        return tNotes;
    }
    
    public void setTab(float[] Tab1){
        this.tNotes = Tab1;
    }
   
    public String getIdentifiant(){
        return ID;
    }
    
    public void setIdentifiant(String Identifiant){
        this.ID = Identifiant;
    }
    
    public void Afficher(){
        for (int k = 0 ; k < getTab().length ; k++){
            System.out.println("Notes : " + k + " ième " + getTab()[k]);
        }
    }
    
    public void Aleatoire(){
        Random A = new Random();
        for (int B = 0 ; B < getTab().length ; B++){
            float NbrAleatoire = A.nextInt(20);
            tNotes[B] = NbrAleatoire;
        }
    }
    
    public void Trier(float[] Croissant){
        Arrays.sort(Croissant);
    }

}

