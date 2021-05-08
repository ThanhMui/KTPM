/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminGUI;

import java.util.Date;
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
public class HoaDonGUITest {
    
    public HoaDonGUITest() {
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
     * Test of Chuyenint method, of class HoaDonGUI.
     */
    @Test
    public void testChuyenint() throws Exception {
        System.out.println("Chuyenint");
        String fm = "";
        HoaDonGUI instance = new HoaDonGUI();
        int expResult = 0;
        int result = instance.Chuyenint(fm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Chuyentien method, of class HoaDonGUI.
     */
    @Test
    public void testChuyentien() {
        System.out.println("Chuyentien");
        String fm = "";
        HoaDonGUI instance = new HoaDonGUI();
        String expResult = "";
        String result = instance.Chuyentien(fm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ChuyenString method, of class HoaDonGUI.
     */
    @Test
    public void testChuyenString() {
        System.out.println("ChuyenString");
        Date date = null;
        HoaDonGUI instance = new HoaDonGUI();
        String expResult = "";
        String result = instance.ChuyenString(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ChuyenDate method, of class HoaDonGUI.
     */
    @Test
    public void testChuyenDate() throws Exception {
        System.out.println("ChuyenDate");
        String fmd = "";
        HoaDonGUI instance = new HoaDonGUI();
        Date expResult = null;
        Date result = instance.ChuyenDate(fmd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HoaDonGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HoaDonGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
