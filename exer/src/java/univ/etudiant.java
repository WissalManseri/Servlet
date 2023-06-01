/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univ;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class etudiant implements Serializable {
    
    private String nom;
    private String prenom;
private  float [] note=new float [3];

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNote(int i, float note) {
        this.note [i] = note;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public float getNote(int i) {
        return note [i];
    }
    
    
    
   
    
    public etudiant() {
       
    }
    
    
    
   
   
    
}
