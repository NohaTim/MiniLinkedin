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
public class FormationServiceTest {

    public FormationServiceTest() {
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
     * Test of creerFormation method, of class FormationService.
     */
    @Test
    public void testCreerFormation() {
        System.out.println("creerFormation");
        String domaine = "";
        String libelle = "";
        int anneeObtention = 1997;
        String discription = "";
        String universite = "";
        Utilisateur utilisateur = null;
        FormationService instance = new FormationService();
        int expResult = 1;
        int result = instance.creerFormation(domaine, universite, anneeObtention, discription, utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
