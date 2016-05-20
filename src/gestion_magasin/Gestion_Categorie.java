/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_magasin;

import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class Gestion_Categorie {
    
    public static void ajouterCategorie(String nom) {
        int r = BD.mise_a_jour("INSERT INTO categorie (nom) VALUES ('"+ nom +"')");
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Categorie ajouté !");
        } else {
            JOptionPane.showMessageDialog(null, "Categorie non ajouté !");
        }
    }
    
    public static void modifierCategorie(String nom, int id) {
        int r = BD.mise_a_jour("UPDATE categorie SET nom = '"+ nom +"' WHERE id = '"+ id +"'");
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Categorie modifié !");
        } else {
            JOptionPane.showMessageDialog(null, "Categorie non modifié !");
        }
    }
    
    public static void supprimerCategorie(int id) {
        int r = BD.mise_a_jour("DELETE FROM categorie WHERE id = '"+ id +"'");
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Categorie supprimé !");
        } else {
            JOptionPane.showMessageDialog(null, "Categorie non supprimé !");
        }
    }
    
}
