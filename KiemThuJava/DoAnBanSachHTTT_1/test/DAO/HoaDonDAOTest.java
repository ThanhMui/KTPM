/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HoaDonDTO;
import java.util.ArrayList;
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
public class HoaDonDAOTest {
    
    public HoaDonDAOTest() {
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
     * Test of docdshoadon method, of class HoaDonDAO.
     */
//    @Test
//    public void testDocdshoadon() {
//        System.out.println("docdshoadon");
//        HoaDonDAO instance = new HoaDonDAO();
//        ArrayList expResult = null;
//        ArrayList result = instance.docdshoadon();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//      //  fail("The test case is a prototype.");
//    }

    /**
     * Test of Them method, of class HoaDonDAO.
     */
    @Test
    public void testThem() 
    {
        System.out.println("Them");
       HoaDonDTO hd = new HoaDonDTO("7", 200000,
                "1","2", "1", 300000, 500000, "2020/10/10");
        HoaDonDAO instance = new HoaDonDAO();
        instance.Them(hd);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Xoa method, of class HoaDonDAO.
     */
    @Test
    public void testXoa() {
        System.out.println("Xoa");
        String ma = "1";
        HoaDonDAO instance = new HoaDonDAO();
        instance.Xoa(ma);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Sua method, of class HoaDonDAO.
     */
    @Test
    public void testSua() {
        System.out.println("Sua");
     HoaDonDTO hd = new HoaDonDTO("1", 200000,
                "1","2", "1", 300000, 500000, "2020/10/10");
        HoaDonDAO instance = new HoaDonDAO();
        instance.Sua(hd);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of demhd method, of class HoaDonDAO.
     */
    @Test
    public void testDemhd() {
        System.out.println("demhd");
        HoaDonDAO instance = new HoaDonDAO();
        int expResult = 7;
        int result = instance.demhd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
