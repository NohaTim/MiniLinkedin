/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Message;
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
public class DetailMessageServiceTest {

    public DetailMessageServiceTest() {
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
     * Test of creerDetailMessage method, of class DetailMessageService.
     */
    @Test
    public void testCreerDetailMessage() {
        System.out.println("creerDetailMessage");
        Date dateLecture = null;
        Message message = null;
        Utilisateur recepteur = null;
        DetailMessageService instance = new DetailMessageService();
        int expResult = 1;
        int result = instance.creerDetailMessage(dateLecture, message, recepteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
