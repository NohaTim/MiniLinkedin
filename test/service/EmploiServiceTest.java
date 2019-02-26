/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp pc
 */
public class EmploiServiceTest {
    
    public EmploiServiceTest() {
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
     * Test of creerEmploi method, of class EmploiService.
     */
    @Test
    public void testCreerEmploi() {
        System.out.println("creerEmploi");
        String poste = "";
        String secteur = "";
        int TypeContrat = 0;
        Date dateDebut = null;
        Date dateFin = null;
        Utilisateur utilisateur = null;
        EmploiService instance = new EmploiService();
        int expResult = 0;
        int result = instance.creerEmploi(poste, secteur, TypeContrat, dateDebut, dateFin, utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
