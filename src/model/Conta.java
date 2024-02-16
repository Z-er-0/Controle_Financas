package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A classe Conta representa uma conta financeira. Ela possui um saldo e uma
 * lista de operações. Também possui métodos para obter o saldo, obter o saldo
 * em uma determinada data, definir o saldo, obter a lista de operações e
 * inserir uma nova operação.
 */
public class Conta {

    private double saldo = 0; // O saldo da conta
    private ArrayList<Operacao> operacoes = new ArrayList<>(); // A lista de operações

    /**
     * Retorna o saldo atual da conta.
     *
     * @return o saldo atual da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Retorna o saldo da conta em uma determinada data. O saldo é calculado
     * somando-se as receitas e subtraindo-se as despesas até a data
     * especificada.
     *
     * @param dataDePesquisa a data de pesquisa
     * @return o saldo da conta na data de pesquisa
     */
    public double getSaldoData(LocalDate dataDePesquisa) {
        double saldoPesquisa = 0;

        for (Operacao operacao : operacoes) {
            if (!operacao.getData().isAfter(dataDePesquisa)) {
                if (operacao.getNatureza().equals(Natureza.RECEITA)) {
                    saldoPesquisa += operacao.getValor();
                } else {
                    saldoPesquisa -= operacao.getValor();
                }
            }
        }

        return saldoPesquisa;
    }

    /**
     * Define o saldo da conta.
     *
     * @param saldo o saldo a ser definido
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Retorna a lista de operações da conta.
     *
     * @return a lista de operações da conta
     */
    public ArrayList<Operacao> getOperacoes() {
        return operacoes;
    }

    /**
     * Insere uma nova operação na conta. Atualiza o número da operação, realiza
     * a operação na conta, atualiza o saldo da operação e ordena as operações
     * por data.
     *
     * @param operacao a operação a ser inserida
     */
    public void inserirOperacao(Conta conta, Operacao operacao) {
        operacao.setNumero(conta.getOperacoes().size() + 1);
        operacao.operar(conta, operacao.getValor());
        operacoes.add(operacao);

        if (operacao.getNumero() > 1) {

            ArrayList<Operacao> operacoesPorData = new ArrayList<>();
            for (Operacao op : conta.getOperacoes()) {
                operacoesPorData.add(op);
            }

            Collections.sort(operacoesPorData, (op1, op2) -> op1.getData().compareTo(op2.getData()));

            for (Operacao opExistente : operacoesPorData) {
                double saldoAtualizado = 0;

                for (Operacao opCheck : operacoesPorData) {

                    if (!opCheck.getData().isAfter(opExistente.getData())) {
                        if (opCheck.getData().equals(opExistente.getData())) {

                            if (opCheck.getNumero() < opExistente.getNumero()) {

                                if (opCheck.getNatureza().equals(Natureza.RECEITA)) {
                                    saldoAtualizado += opCheck.getValor();
                                } else {
                                    saldoAtualizado -= opCheck.getValor();
                                }
                            } else if (opExistente.getNumero() == opCheck.getNumero()) {

                                if (opCheck.getNatureza().equals(Natureza.RECEITA)) {
                                    saldoAtualizado += opCheck.getValor();
                                } else {
                                    saldoAtualizado -= opCheck.getValor();
                                }

                                opExistente.setSaldo(saldoAtualizado);

                                if (opExistente.getNumero() == operacao.getNumero()) {

                                    operacao.setSaldo(saldoAtualizado);

                                }
                                break;
                            }
                        } else {

                            if (opCheck.getNatureza().equals(Natureza.RECEITA)) {
                                saldoAtualizado += opCheck.getValor();
                            } else {
                                saldoAtualizado -= opCheck.getValor();
                            }
                        }
                    }
                }
            }
        } else {

            operacao.setSaldo(conta.getSaldo());
        }
    }

    /*
    public void listarOp(ArrayList<Operacao> operacoes) {

        int nOp = 1;
        for (Operacao operacao : getOperacoes()) {
            System.out.println(nOp + " | " + operacao.getNatureza() + " | " + operacao.getData());
            System.out.println("R$" + operacao.getValor());
            System.out.println();
            nOp++;
        }
    }*/
}
