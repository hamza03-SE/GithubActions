package com.jee.githubactions;


import java.time.LocalDate;
public class TestApp {
    public static void main(String[] args) {
        BonLivraison bon = new BonLivraison(1L, "REF001", LocalDate.now(), "Client Exemple");
        System.out.println(bon.afficherDetails());
    }
}

