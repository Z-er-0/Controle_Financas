package model;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class DespesaTest {
    
    Conta c;
    Operacao desp;
    
    public DespesaTest() {
    }
    
    /**Teste 01
     * Testa o método setValor e getValor da classe Despesa
     */
    @Test
    public void testValor() {
        desp = new Despesa(null, 0, null);
        desp.setValor(100);
        assertEquals(100, desp.getValor(), 0.01);
    }
    
    /**Teste 02
     * Testa o método setNumero e getNumero da classe Despesa
     */
    @Test
    public void testNumero() { 
        desp = new Despesa(null, 0, null);
        desp.setNumero(10);
        assertEquals(10, desp.getNumero(), 0.01);
    }
    
    /**Teste 03
     * Testa o método setData e getData da classe Despesa
     */
    @Test
    public void testData() { 
        desp = new Despesa(null, 0, null);
        desp.setData(LocalDate.of(2023, 05, 30));
        assertEquals(LocalDate.of(2023,05,30) , desp.getData());
    }
    
    /**Teste 04
     * Testa o método setNatureza e getNatureza da classe Despesa
     */
    @Test
    public void testNatureza() {
        desp = new Despesa(null, 0, null);
        desp.setNatureza(Natureza.DESPESA);
        assertEquals(Natureza.DESPESA, desp.getNatureza());
    }
    
    /**Teste 05
     * Testa o método setSaldo e getSaldo da classe Despesa
     */
    @Test
    public void testSaldo() {
        desp = new Despesa(null, 0, null);
        desp.setSaldo(100);
        assertEquals(100, desp.getSaldo(), 0.01);
    }
    
    /**Teste 06
     * Teste o método setTipoDespesa e getTipoDespesa
     */
    @Test
    public void testTipoDespesa() {
        desp = new Despesa(null, 0, null);
        Despesa despesa = (Despesa) desp;
        despesa.setTipoDespesa(TipoDespesa.RESIDENCIA);
        assertEquals(TipoDespesa.RESIDENCIA, despesa.getTipoDespesa());
        
    }
    
    /**Teste 07
     * Testa o método Operar da classe Despesa
     */
    @Test
    public void testOperar(){
        c = new Conta();
        c.setSaldo(100);
        desp = new Despesa(TipoDespesa.ALIMENTACAO, 100, LocalDate.of(2023, 05, 30));
        desp.operar(c, desp.getValor());
        assertEquals(0, c.getSaldo(), 0.01);
    }
    
}
