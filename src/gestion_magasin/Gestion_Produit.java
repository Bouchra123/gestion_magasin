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
public class Gestion_Produit {

    public static void ajouterProduit(Produit p) {
        int r = BD.mise_a_jour("INSERT INTO produit ('" + p.code + "', '" + p.nom + "', " + p.prix_achat + ", " + p.prix_vente + ", '" + p.date_achat + "', "+ p.qte_stock +", "+ p.categorie.id +")");
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Produit ajouté !");
        } else {
            JOptionPane.showMessageDialog(null, "Produit non ajouté !");
        }
    }
    
    public static void modifierProduit(Produit p, String code) {
        int r = BD.mise_a_jour("UPDATE produit SET nom = '"+ p.nom +"', prix_achat = '"+ p.prix_achat +"', prix_vente = '"+ p.prix_vente +"', date_achat = '"+ p.date_achat +"', qte_stock = '"+ p.qte_stock +"', '"+ p.categorie.id +"' WHERE code = '"+ code +"'");
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Produit modifié !");
        } else {
            JOptionPane.showMessageDialog(null, "Produit non modifié !");
        }
    }
    
    public static void supprimerProduit(String code) {
        int r = BD.mise_a_jour("DELETE FROM produit WHERE code = '"+ code +"'");
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Produit supprimé !");
        } else {
            JOptionPane.showMessageDialog(null, "Produit non supprimé !");
        }
    }

}
