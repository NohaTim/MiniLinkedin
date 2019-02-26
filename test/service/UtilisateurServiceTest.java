/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class UtilisateurServiceTest {

    public UtilisateurServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of creerUtilisateur method, of class UtilisateurService.
     */
    @Test
    public void testCreerUtilisateur() {
        System.out.println("creerUtilisateur");
        String id = "nouha";
        String motDePasse = "nouzha";
        String nom = "timakssat";
        String prenom = "nouzha";
        String adresse = "mhamid4 Marrakech";
        String telephone = "0600000001";
        String loisir = "lecture";
        UtilisateurService instance = new UtilisateurService();
        int expResult = 1;
        int result = instance.creerUtilisateur(id, motDePasse, nom, prenom, adresse, telephone, loisir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of seConnecte method, of class UtilisateurService.
     */
//    @Test
//    public void testSeConnecte() {
//        System.out.println("seConnecte");
//        Utilisateur utilisateur = null;
//        UtilisateurService instance = new UtilisateurService();
//        int expResult = 0;
//        int result = instance.seConnecte(utilisateur);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

}
