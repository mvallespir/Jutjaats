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
public class JutgeTest {

    public JutgeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirJudici method, of class Jutge.
     *
     * Es pasa un judici null i ens ha de retorna false (que no es correcte)
     *
     */
    @Test
    public void testAfegirJudiciNull() {
        System.out.println("afegirJudici");
        Judici nouJudici = null;
        Jutge instance = new Jutge("Miquel", "Vallespir", "04-10-1992");
        Boolean expResult = false;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudici method, of class Jutge.
     *
     * Sercar un judici fora de rang, retorna null perque no existeix.
     */
    @Test
    public void testTreureJudici() {
        System.out.println("treureJudici");
        int index = -1;
        Jutge instance = new Jutge("Miquel", "Vallespir", "04-10-1992");
        Judici expResult = null;
        Judici result = instance.treureJudici(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of afegirJudici method, of class Jutge.
     *
     * Es pasa un judici correcte i ens ha de retorna true (que es correcte)
     *
     */
    @Test
    public void testAfegirJudiciCorrecte() {
        System.out.println("afegirJudici");
        Judici nouJudici = new Judici();
        Jutge instance = new Jutge("Miquel", "Vallespir", "04-10-1992");
        Boolean expResult = true;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of casosJudici method, of class Jutge.
     *
     * Es comprova que et treu el llistat de judicis, i que quan a un judici li
     * asignes un jutge auomaticament al jutge se li afegeix el cas
     *
     */
    @Test
    public void testCasosJutge() {
        System.out.println("\ncasosQuePortaUnJutge");
        Judici casNos = new Judici();
        Jutge instance = new Jutge("Miquel", "Vallespir", "04-10-1992");

        casNos.setAdvocatAcusacio(new Advocat("Pere", "Reus Figa", "20-02-1987", "Sa Roca,2", "Petra"));
        casNos.setAdvocatDefensor(new Advocat("Juan", "Lliteres", "04-09-1978", "Creu,90", "Llubi"));
        Delicte roboGros = new Delicte("20-04-2013", "Robo, 500.000€ a La CAIXA");
        roboGros.afegirAcusat(new Acusat("Undangarin", "HIjo", "20-04-1965", "Palecete,2", "Ladrones"));
        casNos.setDelicte(roboGros);
        casNos.setJutge(instance);
        casNos.setSala(new Sala(2, 32));

        ArrayList<Judici> llistaJudici = instance.getLlistaJudicis();

        assertEquals(llistaJudici.size(), 1);

        for (Judici judici : llistaJudici) {
            System.out.println(judici.toString());
        }

    }
}