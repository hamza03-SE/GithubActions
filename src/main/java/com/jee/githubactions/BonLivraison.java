package com.jee.githubactions;

import java.time.LocalDate;

public class BonLivraison {

    private Long id;
    private String reference;
    private LocalDate dateLivraison;
    private String client;

    // Constructeur
    public BonLivraison() {}

    public BonLivraison(Long id, String reference, LocalDate dateLivraison, String client) {
        this.id = id;
        this.reference = reference;
        this.dateLivraison = dateLivraison;
        this.client = client;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(LocalDate dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    // Méthode utilitaire
    public String afficherDetails() {
        return "Bon de livraison [ID=" + id + ", Référence=" + reference +
                ", Date=" + dateLivraison + ", Client=" + client + "]";
    }
}
