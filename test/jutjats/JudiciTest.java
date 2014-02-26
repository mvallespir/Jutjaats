/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jutjats;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MVC
 */
public class JudiciTest {
    
    public JudiciTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setDelicte method, of class Judici.
     * 
     * Li passam un delicte null i ens retorna false. (Ha anat malament).
     */
    @Test
    public void testSetDelicte() {
        System.out.println("setDelicte");
        Delicte delicte = null;
        Judici instance = new Judici();
        Boolean expResult = false;
        Boolean result = instance.setDelicte(delicte);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setJutge method, of class Judici.
     * 
     * Li passam un jutge null i ens retorna false. (Ha anat malament).
     */
    @Test
    public void testSetJutge() {
        System.out.println("setJutge");
        Jutge jutge = null;
        Judici instance = new Judici();
        Boolean expResult = false;
        Boolean result = instance.setJutge(jutge);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

   /**
     * Test of setAdvocatAcusacio method, of class Judici.
     * 
     * Li passam un advocat d'acusacio null i ens retorna false. (Ha anat malament).
     */
    @Test
    public void testSetAdvocatAcusacio() {
        System.out.println("setAdvocatAcusacio");
        Advocat advocatAcusacio = null;
        Judici instance = new Judici();
        Boolean expResult = false;
        Boolean result = instance.setAdvocatAcusacio(advocatAcusacio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

 /**
     * Test of setAdvocatDefensor method, of class Judici.
     * 
     * Li passam un advocat defensor null i ens retorna false. (Ha anat malament).
     */
    @Test
    public void testSetAdvocatDefensor() {
        System.out.println("setAdvocatDefensor");
        Advocat advocatDefensor = null;
        Judici instance = new Judici();
        Boolean expResult = false;
        Boolean result = instance.setAdvocatDefensor(advocatDefensor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSentencia method, of class Judici.
     * 
     * Li passam una sentencia null i ens retorna false. (Ha anat malament).
     */
    @Test
    public void testSetSentencia() {
        System.out.println("setSentencia");
        Sentencia sentencia = null;
        Judici instance = new Judici();
        Boolean expResult = false;
        Boolean result = instance.setSentencia(sentencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSala method, of class Judici.
     * 
     * Li passam una sala null i ens retorna false. (Ha anat malament).
     */
    @Test
    public void testSetSala() {
        System.out.println("setSala");
        Sala sala = null;
        Judici instance = new Judici();
        Boolean expResult = false;
        Boolean result = instance.setSala(sala);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of afegirDate method, of class Judici.
     * 
     * Insertam una data i comprovam que retorna true(s'ha insertat be)
     * 
     */
    @Test
    public void testAfegirDate() {
        System.out.println("afegirDate");
        String dateNove = "02-03-2013";
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.afegirDate(dateNove);

        if(!(instance.getLlistatDates().size() == 1 && result.equals(expResult))){
            fail("La data no s'ha insertat correctament");
        }
        
    }
}