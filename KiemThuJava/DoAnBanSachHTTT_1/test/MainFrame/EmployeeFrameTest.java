/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Do Thi Thanh Mui
 */
public class EmployeeFrameTest {
    
    public EmployeeFrameTest() {
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
     * Test of ShowBang method, of class EmployeeFrame.
     */
    @Test
    public void testShowBang() {
        System.out.println("ShowBang");
        String id = "";
        EmployeeFrame instance = new EmployeeFrame();
        instance.ShowBang(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dangxuat method, of class EmployeeFrame.
     */
    @Test
    public void testDangxuat() {
        System.out.println("Dangxuat");
        EmployeeFrame instance = new EmployeeFrame();
        instance.Dangxuat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EmployeeFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EmployeeFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
