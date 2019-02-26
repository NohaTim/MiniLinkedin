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
 * @author Lenovo
 */
public class InvitationServiceTest {

    public InvitationServiceTest() {
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
     * Test of creerInvitation method, of class InvitationService.
     */
    @Test
    public void testCreerInvitation() {
        System.out.println("creerInvitation");
        Date dateEnvoie = new Date() ;
        Date dateAcceptation =  new Date();
        Utilisateur emetteur = new Utilisateur("hajar");
        Utilisateur recepteur = new Utilisateur("nouha");
        InvitationService instance = new InvitationService();
        int expResult = 1;
        int result = instance.creerInvitation(dateEnvoie, dateAcceptation, emetteur, recepteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
