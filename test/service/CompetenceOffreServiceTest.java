/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.OffreEmploi;
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
public class CompetenceOffreServiceTest {

    public CompetenceOffreServiceTest() {
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
     * Test of creerCompetenceOffre method, of class CompetenceOffreService.
     */
    @Test
    public void testCreerCompetenceOffre() {
        System.out.println("creerCompetenceOffre");
        double miniporcentage = 0.0;
        OffreEmploi offreEmploi = null;
        CompetenceOffreService instance = new CompetenceOffreService();
        int expResult = 1;
        int result = instance.creerCompetenceOffre(miniporcentage, offreEmploi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
