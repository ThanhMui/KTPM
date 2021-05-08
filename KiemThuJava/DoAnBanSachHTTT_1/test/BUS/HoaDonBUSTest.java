/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.CTHDDTO;
import DTO.HoaDonDTO;
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
public class HoaDonBUSTest {
    
    public HoaDonBUSTest() {
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
     * Test of docDSHD method, of class HoaDonBUS.
     */
    @Test
    public void testDocDSHD() {
        System.out.println("docDSHD");
        HoaDonBUS instance = new HoaDonBUS();
        instance.docDSHD();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of TimHDtheoCTHD method, of class HoaDonBUS.
     */
//    @Test
//    public void testTimHDtheoCTHD() {
//        System.out.println("TimHDtheoCTHD");
//        CTHDDTO cthd = new CTHDDTO("1", "2", 5, 2000, 200);
//        HoaDonBUS instance = new HoaDonBUS();
//        HoaDonDTO expResult = new HoaDonDTO("1", 200000,
//                "1","2", "1", 300000, 500000, "2020/10/10");
//       
//        HoaDonDTO result = instance.TimHDtheoCTHD(cthd);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }

    /**
     * Test of TimHDtheoMa method, of class HoaDonBUS.
     */
//    @Test
//    public void testTimHDtheoMa() {
//        System.out.println("TimHDtheoMa");
//        String mahd = "1";
//        HoaDonBUS instance = new HoaDonBUS();
//     HoaDonDTO hd = new HoaDonDTO("1", 200000,
//                "1","2", "1", 300000, 500000, "2020/10/10");
//        HoaDonDTO result = instance.TimHDtheoMa(mahd);
//        assertEquals(hd, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }
    /**
     * Test of ThemHD method, of class HoaDonBUS.
     */
    @Test
    public void testThemHD() {
        System.out.println("ThemHD");
       HoaDonDTO hd = new HoaDonDTO("9", 200000,
                "1","2", "1", 300000, 500000, "2020/10/10");
        HoaDonBUS instance = new HoaDonBUS();
        boolean expResult = false;
        boolean result = instance.ThemHD(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of XoaHD method, of class HoaDonBUS.
     */
    @Test
    public void testXoaHD() {
        System.out.println("XoaHD");
      HoaDonDTO hd = new HoaDonDTO("9", 200000,
                "1","2", "1", 300000, 500000, "2020/10/10");
       
        HoaDonBUS instance = new HoaDonBUS();
        instance.XoaHD(hd);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of SuaHD method, of class HoaDonBUS.
     */
    @Test
    public void testSuaHD() {
        System.out.println("SuaHD");
     HoaDonDTO hd = new HoaDonDTO("1", 200000,
                "1","2", "1", 300000, 500000, "2020/10/10");
    
      
        HoaDonBUS instance = new HoaDonBUS();
        instance.SuaHD(hd);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of Tonghoadon method, of class HoaDonBUS.
     */
    @Test
    public void testTonghoadon() {
        System.out.println("Tonghoadon");
        HoaDonBUS instance = new HoaDonBUS();
        int expResult = 2230000;
        int result = instance.Tonghoadon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of Hdtieptheo method, of class HoaDonBUS.
     */
//    @Test
//    public void testHdtieptheo() {
//        System.out.println("Hdtieptheo");
//        HoaDonBUS instance = new HoaDonBUS();
//        String expResult = "";
//        String result = instance.Hdtieptheo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }
    
}
