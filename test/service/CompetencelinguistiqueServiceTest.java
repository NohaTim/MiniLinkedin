/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CompetenceLinguistique;
import bean.Langue;
import bean.Utilisateur;
import java.util.List;
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
public class CompetencelinguistiqueServiceTest {
    
    public CompetencelinguistiqueServiceTest() {
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
     * Test of creerCompetenceLinguistique method, of class CompetencelinguistiqueService.
     */
    @Test
    public void testCreerCompetenceLinguistique() {
        System.out.println("creerCompetenceLinguistique");
        String niveau = "2ékvé";
        Utilisateur utilisateur = null;
        Langue langue = null;
        CompetencelinguistiqueService instance = new CompetencelinguistiqueService();
        int expResult = 1;
        int result = instance.creerCompetenceLinguistique(niveau, utilisateur, langue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findByRib method, of class CompetencelinguistiqueService.
     */
//    @Test
//    public void testFindByRib() {
//        System.out.println("findByRib");
//        int id = 0;
//        CompetencelinguistiqueService instance = new CompetencelinguistiqueService();
//        List<CompetenceLinguistique> expResult = null;
//        List<CompetenceLinguistique> result = instance.findByRib(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
    
}
