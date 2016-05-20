/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_magasin;

import java.util.Date;

/**
 *
 * @author ahmed
 */
public class Produit {
    
    String code, nom;
    double prix_achat, prix_vente;
    Date date_achat;
    int qte_stock;
    Categorie categorie;

    public Produit() {
    }

    public Produit(String code, String nom, double prix_achat, double prix_vente, Date date_achat, int qte_stock, Categorie categorie) {
        this.code = code;
        this.nom = nom;
        this.prix_achat = prix_achat;
        this.prix_vente = prix_vente;
        this.date_achat = date_achat;
        this.qte_stock = qte_stock;
        this.categorie = categorie;
    }
    
}
