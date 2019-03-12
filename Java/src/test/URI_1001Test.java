package test;

import main.URI_1001.URI_1001;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class URI_1001Test {

    @Test
    public void testaSoma(){
        assertEquals(URI_1001.getResultadoFinal(10, 9), URI_1001.TEMPLATE_SAIDA + 19);
    }

}
