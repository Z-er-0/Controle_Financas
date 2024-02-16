package model;

import java.time.LocalDate;

/**
 * A classe Receita representa uma operação de receita.
 * Ela herda da classe Operacao e possui um tipo de receita.
 */
public class Receita extends Operacao {

    private TipoReceita tipoReceita; // O tipo de receita

    /**
     * Cria uma nova instância de Receita com o tipo de receita, valor e data especificados.
     *
     * @param tipoReceita o tipo de receita
     * @param valor       o valor da receita
     * @param data        a data da receita
     */
    public Receita(TipoReceita tipoReceita, double valor, LocalDate data) {
        super(valor, data);
        this.tipoReceita = tipoReceita;
    }

    /**
     * Retorna o tipo de receita.
     *
     * @return o tipo de receita
     */
    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }

    /**
     * Define o tipo de receita.
     *
     * @param tipoReceita o tipo de receita
     */
    public void setTipoReceita(TipoReceita tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    /**
     * Realiza a operação de receita na conta.
     * Incrementa o saldo da conta pelo valor da receita.
     *
     * @param c     a conta a ser operada
     * @param valor o valor da receita
     */
    @Override
    public void operar(Conta c, double valor) {
        c.setSaldo(c.getSaldo() + valor);
    }

}
