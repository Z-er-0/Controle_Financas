package model;

import java.time.LocalDate;

/**
 * A classe abstrata Operacao representa uma operação financeira.
 * Ela contém informações sobre o número da operação, valor, data, natureza e saldo.
 * Também possui um método abstrato para operar uma conta.
 * É uma classe base para as classes Despesa e Receita.
 */
public abstract class Operacao {

    private int numero; // O número da operação
    private double valor; // O valor da operação
    private LocalDate data; // A data da operação
    private Natureza natureza; // A natureza da operação (Despesa ou Receita)
    private double saldo; // O saldo após a operação

    /**
     * Cria uma nova instância de Operacao com o valor e a data especificados.
     *
     * @param valor o valor da operação
     * @param data  a data da operação
     */
    public Operacao(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    /**
     * Retorna o número da operação.
     *
     * @return o número da operação
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número da operação.
     *
     * @param numero o número da operação
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Retorna o valor da operação.
     *
     * @return o valor da operação
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da operação.
     *
     * @param valor o valor da operação
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna a data da operação.
     *
     * @return a data da operação
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da operação.
     *
     * @param data a data da operação
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna a natureza da operação (Despesa ou Receita).
     *
     * @return a natureza da operação
     */
    public Natureza getNatureza() {
        return natureza;
    }

    /**
     * Define a natureza da operação (Despesa ou Receita).
     *
     * @param natureza a natureza da operação
     */
    public void setNatureza(Natureza natureza) {
        this.natureza = natureza;
    }

    /**
     * Retorna o saldo após a operação.
     *
     * @return o saldo após a operação
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo após a operação.
     *
     * @param saldo o saldo após a operação
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método abstrato para operar uma conta.
     * Implementado nas classes filhas Despesa e Receita.
     *
     * @param c     a conta a ser operada
     * @param valor o valor da operação
     */
    public abstract void operar(Conta c, double valor);

}
