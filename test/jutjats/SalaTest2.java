/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jutjats;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MVC
 */
public class SalaTest2 {

    public SalaTest2() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirJudici method, of class Sala.
     *
     * Que ficant un judici ens retorni true de que ha anat be insertarlo.
     */
    @Test
    public void testAfegirJudici() {
        System.out.println("afegirJudici");
        Judici nouJudici = new Judici();
        Sala instance = new Sala(5, 34);
        Boolean expResult = true;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudici method, of class Sala.
     *
     * Es vol provar que ficant un nombre superior als objectes que te el
     * llistat no falla.
     *
     */
    @Test
    public void testTreureJudici() {
        System.out.println("treureJudici");
        int index = 2;
        Sala instance = new Sala(2, 23);
        Judici expResult = null;
        Judici result = instance.treureJudici(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of datesOcupades method, of class Sala.
     *
     * Test per comprovar el funcionament correcte de treure un llistat de dates
     * ocupades. Desde web
     */
    @Test
    public void testDatesOcupades() {
        System.out.println("\ntreureDatesSalaOcupade");
        Sala instance = new Sala(1, 20);
        Judici casNos = new Judici();
        Judici casColacao = new Judici();

        casNos.afegirDate("01-03-2014");
        casNos.afegirDate("02-03-2014");
        casNos.afegirDate("04-03-2014");
        casColacao.afegirDate("27-02-2014");
        casColacao.afegirDate("03-03-2014");
        casColacao.afegirDate("05-03-2014");
        
        
        instance.afegirJudici(casNos);
        instance.afegirJudici(casColacao);

        ArrayList<Date> datesLlista = instance.datesOcupade();

        for (Date d : datesLlista) {
            String format = "dd-MM-yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            System.out.println(sdf.format(d));
        }

    }
}
