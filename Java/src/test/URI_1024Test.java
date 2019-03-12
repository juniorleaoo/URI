package test;


import main.URI_1024.Encrypt;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class URI_1024Test {

    private Encrypt encrypt;

    @BeforeTest
    public void inicializaEncrypt(){
        encrypt = new Encrypt("Texto #3");
    }

    @Test
    public void executaPrimeiraPassada() {
        encrypt.executaPrimeiraPassada();
        assertEquals(encrypt.getEntrada(), "Wh{wr #3");
    }

    @Test
    public void executaSegundaPassada() {
        encrypt.executaSegundaPassada();
        assertEquals(encrypt.getEntrada(), "3# rw{hW");
    }

    @Test
    public void executaTerceiraPassada() {
        encrypt.executaTerceiraPassada();
        assertEquals(encrypt.getEntrada(), "3# rvzgV");
    }

    @Test
    public void testaRestante(){
        Encrypt encrypt = new Encrypt("abcABC1");
        encrypt.executaTodasEtapas();
        assertEquals("1FECedc", encrypt.getEntrada());

        encrypt = new Encrypt("vxpdylY .ph");
        encrypt.executaTodasEtapas();
        assertEquals("ks. \\n{frzx", encrypt.getEntrada());

        encrypt = new Encrypt("vv.xwfxo.fd");
        encrypt.executaTodasEtapas();
        assertEquals("gi.r{hyz-xx", encrypt.getEntrada());
    }

}
