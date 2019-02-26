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
public class CompetenceUtilisateurServiceTest {

    public CompetenceUtilisateurServiceTest() {
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
     * Test of creerCompetenceUtilisateur method, of class
     * CompetenceUtilisateurService.
     */
    @Test
    public void testCreerCompetenceUtilisateur() {
        System.out.println("creerCompetenceUtilisateur");
        double pourcentage = 0.0;
        Utilisateur utilisateur = null;
        CompetenceUtilisateurService instance = new CompetenceUtilisateurService();
        int expResult = 1;
        int result = instance.creerCompetenceUtilisateur(pourcentage, utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
