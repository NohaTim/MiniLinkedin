/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Emploi;
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
public class EntrepriseServiceTest {

    public EntrepriseServiceTest() {
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
     * Test of creerEntreprise method, of class EntrepriseService.
     */
    @Test
    public void testCreerEntreprise() {
        System.out.println("creerEntreprise");
        String nomEntreprise = "";
        String lieu = "";
        Emploi emploi = null;
        EntrepriseService instance = new EntrepriseService();
        int expResult = 1;
        int result = instance.creerEntreprise(nomEntreprise, lieu, emploi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
