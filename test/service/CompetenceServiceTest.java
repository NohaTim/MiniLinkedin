/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CompetenceOffre;
import bean.CompetenceUtilisateur;
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
public class CompetenceServiceTest {

    public CompetenceServiceTest() {
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
     * Test of creerCompetenceCompetence method, of class CompetenceService.
     */
    @Test
    public void testCreerCompetenceCompetence() {
        System.out.println("creerCompetenceCompetence");
        String libelle = "JAVA";
        String discription = "xxx";
        String domaine = "";
        CompetenceUtilisateur competenceUtilisateur = null;
        CompetenceOffre competenceOffre = null;
        CompetenceService instance = new CompetenceService();
        int expResult = 1;
        int result = instance.creerCompetence(libelle, discription, domaine, competenceUtilisateur, competenceOffre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
