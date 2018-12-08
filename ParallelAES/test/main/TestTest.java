/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AzielioTor
 */
public class TestTest {
    
    main.Test inst;
    
    public TestTest() {
        inst = new main.Test();
        System.out.println("Constructor");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("SetUpClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("TearDownClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("SetUp method");
    }
    
    @After
    public void tearDown() {
        System.out.println("TearDown method");
    }

    /**
     * Test of returnVal method, of class Test.
     */
    @Test
    public void testReturnVal1() {
        System.out.println("returnVal Test 1");
        int val = 2;
        main.Test instance = new main.Test();
        int expResult = 2;
        int result = instance.returnVal(val);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReturnVal2() {
        System.out.println("returnVal Test 2");
        int val = 2;
        main.Test instance = new main.Test();
        int expResult = 3;
        int result = instance.returnVal(val);
        assertNotEquals(result, expResult);
    }
    
}
