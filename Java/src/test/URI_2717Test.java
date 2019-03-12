package test;

import main.URI_2717.URI_2717;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class URI_2717Test {

    @Test
    public void testaSeFaraHoje(){
        assertEquals(URI_2717.getResultadoFinal(20, 10, 10), URI_2717.FAREI_HOJE);
    }

    @Test
    public void testaSeDeixaParaAmanha() {
        assertEquals(URI_2717.getResultadoFinal(20, 15, 6), URI_2717.DEIXA_PARA_AMANHA);
    }

}
