package pack;



import org.junit.Test;
import static org.junit.Assert.*;
import pack.Bank;


public class BanckTest {
    private Bank banca;
    public BanckTest() {
        banca = new Bank(10);
    }

    @Test
    public void addTest() {
        assertEquals(20.0, banca.add(10),0.0);
    }
    @Test
    public void subTest() {
        assertEquals(5.0,banca.sub(5),0.0);
    }
}
