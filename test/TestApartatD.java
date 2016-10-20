/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class TestApartatD {
    
    public TestApartatD() {
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
//
//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void hello() {}
    
    @Test
    public final void testInvertido() {

        assertEquals("odnuM aloh", MyUtils.inverteix("hola Mundo"));
    }
    @Test
    public final void testInvertidoFail() {

        assertEquals(null, MyUtils.inverteix(null));
    }

    @Test
    public final void testEdad(){

        assertEquals(20, MyUtils.edat(03, 04, 1996));
    }
    
    @Test
    public final void testEdadSuperior150(){

        assertEquals(-2, MyUtils.edat(03, 04, 3568));
    }
    
    @Test
    public final void testEdadInferior0(){

        assertEquals(-1, MyUtils.edat(03, 04, 0));
    }
    
    @Test
    public final void testEdadImpossible(){

        assertEquals(-2, MyUtils.edat(03, 14, 1996));
    }
    
    
    

    @Test
    public final void testFactorial() throws noEntero{

        assertEquals(2, MyUtils.factorial(2));

    }
    
    @Test
    public final void testFactorialFail() throws noEntero{

        assertEquals(-1, MyUtils.factorial(-2));

    }
    
    @Test
    public final void testFactorialNum0() throws noEntero{

        assertEquals(-1, MyUtils.factorial(0));

    }
    
    @Test
    public final void testFactorialLletra() throws noEntero{
        //Como te comenté en clase, sale como error pero es lo que tiene que salir, ya que es una letra y solo pueden entrar enteros.
        assertEquals(noEntero, MyUtils.factorial("a"));

    }

    }



