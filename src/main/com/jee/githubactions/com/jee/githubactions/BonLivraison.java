package com.jee.githubactions;

import java.util.Date;
import java.util.List;

public class BonLivraison {
    private String numero;
    private Date dateLivraison;
    private String client;
    private List<String> produits;

    public BonLivraison(String numero, Date dateLivraison, String client, List<String> produits) {
        this.numero = numero;
        this.dateLivraison = dateLivraison;
        this.client = client;
        this.produits = produits;
    }

    public String getNumero() {
        return numero;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public String getClient() {
        return client;
    }

    public List<String> getProduits() {
        return produits;
    }

    public void ajouterProduit(String produit) {
        this.produits.add(produit);
    }

    public int getNombreProduits() {
        return produits.size();
    }
}
