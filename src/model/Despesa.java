package model;

import java.time.LocalDate;

/**
 * A classe Despesa representa uma operação de despesa. Ela herda da classe
 * Operacao e possui um tipo de despesa.
 */
public class Despesa extends Operacao {

    private TipoDespesa tipoDespesa; // O tipo de despesa

    /**
     * Cria uma nova instância de Despesa com o tipo de despesa, valor e data
     * especificados.
     *
     * @param tipoDespesa o tipo de despesa
     * @param valor o valor da despesa
     * @param data a data da despesa
     */
    public Despesa(TipoDespesa tipoDespesa, double valor, LocalDate data) {
        super(valor, data);
        this.tipoDespesa = tipoDespesa;
    }

    /**
     * Retorna o tipo de despesa.
     *
     * @return o tipo de despesa
     */
    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Define o tipo de despesa.
     *
     * @param tipoDespesa o tipo de despesa
     */
    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    /**
     * Realiza a operação de despesa na conta. Decrementa o saldo da conta pelo
     * valor da despesa.
     *
     * @param c a conta a ser operada
     * @param valor o valor da despesa
     */
    @Override
    public void operar(Conta c, double valor) {
        if (valor > c.getSaldo()) {
            c.setSaldo(c.getSaldo() - valor);
        }
    }
}
