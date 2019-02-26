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
public class MessageServiceTest {

    public MessageServiceTest() {
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
     * Test of creerMessage method, of class MessageService.
     */
    @Test
    public void testCreerMessage() {
        System.out.println("creerMessage");
        String text = "";
        String objet = "";
        Utilisateur emeteur = null;
        MessageService instance = new MessageService();
        int expResult = 1;
        int result = instance.creerMessage(text, objet, emeteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
