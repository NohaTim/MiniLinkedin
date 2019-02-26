/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Entreprise;
import java.util.Date;
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
public class OffreEmploiServiceTest {

    public OffreEmploiServiceTest() {
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
     * Test of creerOffreEmploi method, of class OffreEmploiService.
     */
    @Test
    public void testCreerOffreEmploi() {
        System.out.println("creerOffreEmploi");
        String poste = "";
        String domaine = "";
        Date datePublication = null;
        Date dateEmbauche = null;
        Entreprise entreprise = null;
        OffreEmploiService instance = new OffreEmploiService();
        int expResult = 1;
        int result = instance.creerOffreEmploi(poste, domaine, datePublication, dateEmbauche, entreprise);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
