/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_magasin;

/**
 *
 * @author ahmed
 */
public class Categorie {
    
    int id;
    String nom;

    public Categorie() {
    }

    public Categorie(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.nom;
    }
    
}
