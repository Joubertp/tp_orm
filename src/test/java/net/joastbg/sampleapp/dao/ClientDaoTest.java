/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp.dao;

import junit.framework.Assert;
import java.util.List;
import net.joastbg.sampleapp.entities.Client;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joubert
 */
public class ClientDaoTest {
    
    public ClientDaoTest() {
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
     * Test of persist method, of class ClientDao.
     */
    @Test
    public void testPersist() {
        System.out.println("persist");
        Client client = null;
        ClientDao instance = new ClientDao();
        Long result = instance.persist(client);
        Assert.assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ClientDao.
     */
//    @Test
//    public void testFindAll() {
//        System.out.println("findAll");
//        ClientDao instance = new ClientDao();
//        List<Client> result = instance.findAll();
//        Assert.assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
