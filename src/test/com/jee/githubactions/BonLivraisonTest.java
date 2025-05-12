package com.jee.githubactions;


import com.jee.githubactions.BonLivraison;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class BonLivraisonTest {

    @Test
    public void testAjouterProduit() {
        BonLivraison bl = new BonLivraison("BL001", new Date(), "Client A", new ArrayList<>());
        bl.ajouterProduit("Produit 1");
        assertEquals(1, bl.getNombreProduits());
    }

    @Test
    public void testGetClient() {
        BonLivraison bl = new BonLivraison("BL002", new Date(), "Client B", new ArrayList<>());
        assertEquals("Client B", bl.getClient());
    }
}
