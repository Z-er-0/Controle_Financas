
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class ContaTest {
    
    Conta c;
    
    public ContaTest() {
    }

    /**Teste 15
     * Testa o método setSaldo e getSaldo da classe Conta
     */
    @Test
    public void testSaldo() {
        c = new Conta();
        c.setSaldo(100);
        assertEquals(100, c.getSaldo(), 0.01);
    }
    
    
}
