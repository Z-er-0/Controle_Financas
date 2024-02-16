package model;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class ReceitaTest {
    
    Conta c;
    Operacao rec;
    
    public ReceitaTest() {
    }
    
    /**Teste 08
     * Testa o método setValor e getValor da classe Receita
     */
    @Test
    public void testValor() {
        rec = new Receita(null, 0, null);
        rec.setValor(100);
        assertEquals(100, rec.getValor(), 0.01);
    }
    
    /**Teste 09
     * Testa o método setNumero e getNumero da classe Receita
     */
    @Test
    public void testNumero() { 
        rec = new Receita(null, 0, null);
        rec.setNumero(10);
        assertEquals(10, rec.getNumero(), 0.01);
    }
    
    /**Teste 10
     * Testa o método setData e getData da classe Receita
     */
    @Test
    public void testData() { 
        rec = new Receita(null, 0, null);
        rec.setData(LocalDate.of(2023, 05, 30));
        assertEquals(LocalDate.of(2023,05,30) , rec.getData());
    }
    
    /**Teste 11
     * Testa o método setNatureza e getNatureza da classe Receita
     */
    @Test
    public void testNatureza() {
        rec = new Receita(null, 0, null);
        rec.setNatureza(Natureza.DESPESA);
        assertEquals(Natureza.DESPESA, rec.getNatureza());
    }
    
    /**Teste 12
     * Testa método setSaldo e getSaldo da classe Receita
     */
    @Test
    public void testSaldo() {
        rec = new Receita(null, 0, null);
        rec.setSaldo(100);
        assertEquals(100, rec.getSaldo(), 0.01);
    }
    
    /**Teste 13
     * Teste o método setTipoReceita e getTipoReceita
     */
    @Test
    public void testTipoReceita() {
        rec = new Receita(null, 0, null);
        Receita receita = (Receita) rec;
        receita.setTipoReceita(TipoReceita.SALARIO);
        assertEquals(TipoReceita.SALARIO, receita.getTipoReceita());
        
    }
    
    /**Teste 14
     * Testa o método Operar da classe Receita
     */
    public void testOperar(){
        c = new Conta();
        rec = new Receita(TipoReceita.SALARIO, 100, LocalDate.of(2023, 05, 30));
        rec.operar(c, rec.getValor());
        assertEquals(100, c.getSaldo(), 0.01);
    }
    
}
