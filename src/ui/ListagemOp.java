package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import model.Conta;
import model.Despesa;
import model.Natureza;
import model.Operacao;
import model.Receita;
import model.TipoDespesa;

/**
 *
 * @author 
 */
public class ListagemOp extends javax.swing.JDialog {

    private ArrayList<Operacao> operacoesOriginais;

    /**
     * Creates new form ListagemOp
     */
    public ListagemOp(java.awt.Frame parent, boolean modal, Conta conta) {
        super(parent, modal);
        initComponents();
        preencherTipoDespesa();
        addFiltroActionListeners(conta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupFiltro = new javax.swing.ButtonGroup();
        groupClass = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListaOp = new javax.swing.JTextArea();
        btnFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSem = new javax.swing.JRadioButton();
        btnRec = new javax.swing.JRadioButton();
        btnDes = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        txtDiaP = new javax.swing.JTextField();
        txtMesP = new javax.swing.JTextField();
        txtAnoP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnPesquisarLiberar = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnClassNum = new javax.swing.JRadioButton();
        btnClassData = new javax.swing.JRadioButton();
        comboTipoDespesa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taListaOp.setEditable(false);
        taListaOp.setColumns(20);
        taListaOp.setRows(5);
        jScrollPane1.setViewportView(taListaOp);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        groupFiltro.add(btnSem);
        btnSem.setSelected(true);
        btnSem.setText("Sem filtro");
        btnSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemActionPerformed(evt);
            }
        });

        groupFiltro.add(btnRec);
        btnRec.setText("Receitas");
        btnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecActionPerformed(evt);
            }
        });

        groupFiltro.add(btnDes);
        btnDes.setText("Despesas");
        btnDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSem)
                    .addComponent(btnRec)
                    .addComponent(btnDes))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDes)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        txtDiaP.setEnabled(false);

        txtMesP.setEnabled(false);
        txtMesP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesPActionPerformed(evt);
            }
        });

        txtAnoP.setEnabled(false);

        jLabel1.setText("Dia:");

        jLabel2.setText("Mês:");

        jLabel3.setText("Ano:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setEnabled(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnPesquisarLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLiberarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnoP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMesP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaP))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisarLiberar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPesquisarLiberar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(txtMesP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Classificação"));

        groupClass.add(btnClassNum);
        btnClassNum.setSelected(true);
        btnClassNum.setText("Nº");
        btnClassNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassNumActionPerformed(evt);
            }
        });

        groupClass.add(btnClassData);
        btnClassData.setText("Data");
        btnClassData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClassNum)
                    .addComponent(btnClassData))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnClassNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClassData))
        );

        comboTipoDespesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Despesa" }));
        comboTipoDespesa.setEnabled(false);
        comboTipoDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboTipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtMesPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesPActionPerformed

    private void btnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecActionPerformed

    private void btnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDesActionPerformed

    private void btnSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSemActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisarLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLiberarActionPerformed
        // TODO add your handling code here:
        if (btnPesquisarLiberar.isSelected()) {

            comboTipoDespesa.setSelectedItem("Tipo Despesa");
            comboTipoDespesa.setEnabled(false);
            btnSem.setSelected(true);
            btnSem.setEnabled(false);
            btnRec.setSelected(false);
            btnRec.setEnabled(false);
            btnDes.setSelected(false);
            btnDes.setEnabled(false);

            btnClassNum.setSelected(false);
            btnClassNum.setEnabled(false);
            btnClassData.setSelected(true);
            btnClassData.setEnabled(false);

            btnPesquisar.setEnabled(true);
            txtDiaP.setEnabled(true);
            txtMesP.setEnabled(true);
            txtAnoP.setEnabled(true);
        } else {

            btnSem.setSelected(true);
            btnSem.setEnabled(true);
            btnRec.setSelected(false);
            btnRec.setEnabled(true);
            btnDes.setSelected(false);
            btnDes.setEnabled(true);

            btnClassNum.setSelected(true);
            btnClassNum.setEnabled(true);
            btnClassData.setSelected(false);
            btnClassData.setEnabled(true);

            btnPesquisar.setEnabled(false);
            txtDiaP.setEnabled(false);
            txtMesP.setEnabled(false);
            txtAnoP.setEnabled(false);

            taListaOp.setText("");
            exibirOperacoesOriginais();

        }
    }//GEN-LAST:event_btnPesquisarLiberarActionPerformed

    private void btnClassNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassNumActionPerformed
        // TODO add your handling code here:
        comboTipoDespesa.setSelectedItem("Tipo Despesa");
        comboTipoDespesa.setEnabled(false);
    }//GEN-LAST:event_btnClassNumActionPerformed

    private void btnClassDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassDataActionPerformed
        // TODO add your handling code here:
        comboTipoDespesa.setSelectedItem("Tipo Despesa");
        comboTipoDespesa.setEnabled(false);
    }//GEN-LAST:event_btnClassDataActionPerformed

    private void comboTipoDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoDespesaActionPerformed

    private void addFiltroActionListeners(Conta conta) {
        btnSem.addActionListener(new ActionListener() { //Botão "Sem Filtro"
            public void actionPerformed(ActionEvent e) {
                atualizarLista(conta);
                comboTipoDespesa.setSelectedItem("Tipo Despesa");
                comboTipoDespesa.setEnabled(false);
            }
        });

        btnRec.addActionListener(new ActionListener() { //Botão "Receitas"
            public void actionPerformed(ActionEvent e) {
                atualizarLista(conta);
                comboTipoDespesa.setSelectedItem("Tipo Despesa");
                comboTipoDespesa.setEnabled(false);
            }
        });

        btnDes.addActionListener(new ActionListener() { //Botão "Despesas"
            public void actionPerformed(ActionEvent e) {
                atualizarLista(conta);
                comboTipoDespesa.setEnabled(true);
            }
        });

        comboTipoDespesa.addActionListener(new ActionListener() { //Botão "Despesas"
            public void actionPerformed(ActionEvent e) {
                atualizarLista(conta);
            }
        });

        btnPesquisar.addActionListener(new ActionListener() { //Botão "Pesquisar"
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnPesquisarLiberar.isSelected()) {

                    int ano, mes, dia;
                    try {
                        ano = Integer.parseInt(txtAnoP.getText());
                        mes = Integer.parseInt(txtMesP.getText());
                        dia = Integer.parseInt(txtDiaP.getText());

                        if (dia <= 0 || dia > 31) {
                            throw new IllegalArgumentException("Dia inválido.");
                        }
                        if (mes <= 0 || mes > 12) {
                            throw new IllegalArgumentException("Mês inválido.");
                        }
                        if (ano <= 0) {
                            throw new IllegalArgumentException("Ano inválido.");
                        }

                        // Tratamento de exceções para meses com 30 dias
                        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                            throw new IllegalArgumentException("Dia e/ou mês inválido.");
                        }

                        // Tratamento de exceção para o mês de fevereiro (considerando anos bissextos)
                        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                        if (mes == 2) {
                            if (anoBissexto && dia > 29) {
                                throw new IllegalArgumentException("Dia e/ou mês inválido.");
                            } else if (!anoBissexto && dia > 28) {
                                throw new IllegalArgumentException("Dia e/ou mês inválido.");
                            }
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(ListagemOp.this, "Os campos de data devem ser preenchidos com valores numéricos.", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(ListagemOp.this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    atualizarLista(conta);

                    taListaOp.append("Pesquisa " + txtDiaP.getText() + "/" + txtMesP.getText() + "/" + txtAnoP.getText());

                    LocalDate dataDePesquisa = LocalDate.of(ano, mes, dia);

                    ArrayList<Operacao> operacoesData = new ArrayList<>();

                    for (Operacao operacao : conta.getOperacoes()) {
                        operacoesData.add(operacao);
                    }
                    Collections.sort(operacoesData, (op1, op2) -> op1.getData().compareTo(op2.getData()));

                    for (Operacao operacao : operacoesData) {
                        if (!operacao.getData().isAfter(dataDePesquisa)) {
                            taListaOp.append("\n------------------------------------");
                            taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                            taListaOp.append("\n" + operacao.getNatureza().name());
                            if (operacao.getNatureza().equals(Natureza.RECEITA)) {

                                Receita receita = (Receita) operacao;
                                taListaOp.append(" | " + receita.getTipoReceita().name() + "\n+");

                            } else {

                                Despesa despesa = (Despesa) operacao;
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                            }

                            taListaOp.append("R$" + operacao.getValor());
                            if (!operacao.getData().isAfter(dataDePesquisa)) {
                                taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                            } else {
                                taListaOp.append("\nOPERAÇÃO FUTURA");
                            }
                        }
                    }
                    taListaOp.append("\n");
                    taListaOp.append("\nSALDO NO DIA DA PESQUISA: R$" + conta.getSaldoData(dataDePesquisa));

                } else {
                    atualizarLista(conta);
                }
            }
        });

        btnClassNum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirOperacoes(conta.getOperacoes());
                btnSem.setSelected(true);
            }
        });

        btnClassData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirOperacoesPorData(conta.getOperacoes());
                btnSem.setSelected(true);
            }
        });
    }

    public void definirConta(Conta conta) {

        operacoesOriginais = new ArrayList<>();

        taListaOp.append("Histórico de Operações\n");
        taListaOp.append("Classificação: Número\n");

        for (Operacao operacao : conta.getOperacoes()) {

            operacoesOriginais.add(operacao);

            taListaOp.append("\n------------------------------------");
            taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

            taListaOp.append("\n" + operacao.getNatureza().name());
            if (operacao.getNatureza().equals(Natureza.RECEITA)) {

                Receita receita = (Receita) operacao;
                taListaOp.append(" | " + receita.getTipoReceita().name() + "\n+");

            } else {

                Despesa despesa = (Despesa) operacao;
                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

            }

            taListaOp.append("R$" + operacao.getValor());
            if (!operacao.getData().isAfter(LocalDate.now())) {
                taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
            } else {
                taListaOp.append("\nOPERAÇÃO FUTURA");
            }
        }

    }

    public void atualizarLista(Conta conta) {
        taListaOp.setText("");

        if (btnSem.isSelected() && !btnPesquisarLiberar.isSelected() && btnClassNum.isSelected()) { //Sem filtro, botão pesquisa off e classificar por numero de op on
            exibirOperacoes(conta.getOperacoes());

        } else if (btnSem.isSelected() && !btnPesquisarLiberar.isSelected() && btnClassData.isSelected()) { //Sem filtro, liberar pesquisa off e classificar por data de op on
            exibirOperacoesPorData(conta.getOperacoes());

        } else if (btnRec.isSelected() && !btnPesquisarLiberar.isSelected() && btnClassNum.isSelected()) {//Filtro Receita,  liberar pesquisa off e classificar por numero de op on
            taListaOp.append("Histórico de Operações\n");
            taListaOp.append("Classificação: Número\n");
            taListaOp.append("Filtro: Receitas\n");

            for (Operacao operacao : conta.getOperacoes()) {
                if (operacao.getNatureza().equals(Natureza.RECEITA)) {
                    taListaOp.append("\n------------------------------------");
                    taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                    taListaOp.append("\n" + operacao.getNatureza().name());

                    Receita receita = (Receita) operacao;
                    taListaOp.append(" | " + receita.getTipoReceita().name() + "\n+");

                    taListaOp.append("R$" + operacao.getValor());
                    if (!operacao.getData().isAfter(LocalDate.now())) {
                        taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                    } else {
                        taListaOp.append("\nOPERAÇÃO FUTURA");
                    }
                }
            }

        } else if (btnDes.isSelected() && !btnPesquisarLiberar.isSelected() && btnClassNum.isSelected()) {//Filtro Despesa,  liberar pesquisa off e classificar por numero de op on
            taListaOp.append("Histórico de Operações");
            taListaOp.append("\nClassificação: Número");
            taListaOp.append("\nFiltro: Despesas");

            if (comboTipoDespesa.getSelectedItem().equals("Tipo Despesa")) {

                for (Operacao operacao : conta.getOperacoes()) {
                    if (operacao.getNatureza().equals(Natureza.DESPESA)) {
                        taListaOp.append("\n------------------------------------");
                        taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                        taListaOp.append("\n" + operacao.getNatureza().name());
                        Despesa despesa = (Despesa) operacao;
                        taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                        taListaOp.append("R$" + operacao.getValor());
                        if (!operacao.getData().isAfter(LocalDate.now())) {
                            taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                        } else {
                            taListaOp.append("\nOPERAÇÃO FUTURA");
                        }
                    }

                }
            } else {

                if (comboTipoDespesa.getSelectedItem().equals("Alimentação")) {
                    taListaOp.append("\nFiltro: Alimentação\n");

                    for (Operacao operacao : conta.getOperacoes()) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.ALIMENTACAO)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Transporte")) {
                    taListaOp.append("\nFiltro: Transporte\n");

                    for (Operacao operacao : conta.getOperacoes()) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.TRANSPORTE)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Residência")) {
                    taListaOp.append("\nFiltro: Residência\n");

                    for (Operacao operacao : conta.getOperacoes()) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.RESIDENCIA)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Saúde")) {
                    taListaOp.append("\nFiltro: Saúde\n");

                    for (Operacao operacao : conta.getOperacoes()) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.SAUDE)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Educação")) {
                    taListaOp.append("\nFiltro: Educação\n");

                    for (Operacao operacao : conta.getOperacoes()) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.EDUCACAO)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Entretenimento")) {
                    taListaOp.append("\nFiltro: Entretenimento\n");

                    for (Operacao operacao : conta.getOperacoes()) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.ENTRETENIMENTO)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else {
                    taListaOp.append("\nFiltro: Outra\n");

                    for (Operacao operacao : conta.getOperacoes()) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.OUTRA)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                }

            }

        } else if (btnRec.isSelected() && !btnPesquisarLiberar.isSelected() && btnClassData.isSelected()) {//Filtro Receita,  liberar pesquisa off e classificar por data de op on
            taListaOp.append("Histórico de Operações\n");
            taListaOp.append("Classificação: Data\n");
            taListaOp.append("Filtro: Receitas\n");
            ArrayList<Operacao> operacoesData = new ArrayList<>();

            for (Operacao operacao : conta.getOperacoes()) {
                operacoesData.add(operacao);
            }
            Collections.sort(operacoesData, (op1, op2) -> op1.getData().compareTo(op2.getData()));

            for (Operacao operacao : operacoesData) {
                if (operacao.getNatureza().equals(Natureza.RECEITA)) {
                    taListaOp.append("\n------------------------------------");
                    taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                    taListaOp.append("\n" + operacao.getNatureza().name());

                    Receita receita = (Receita) operacao;
                    taListaOp.append(" | " + receita.getTipoReceita().name());

                    taListaOp.append("\nR$" + operacao.getValor());
                    if (!operacao.getData().isAfter(LocalDate.now())) {
                        taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                    } else {
                        taListaOp.append("\nOPERAÇÃO FUTURA");
                    }
                }

            }

        } else if (btnDes.isSelected() && !btnPesquisarLiberar.isSelected() && btnClassData.isSelected()) {//Filtro Despesa,  liberar pesquisa off e classificar por data de op on
            taListaOp.append("Histórico de Operações");
            taListaOp.append("\nClassificação: Data");
            taListaOp.append("\nFiltro: Despesas");
            ArrayList<Operacao> operacoesData = new ArrayList<>();

            for (Operacao operacao : conta.getOperacoes()) {
                operacoesData.add(operacao);
            }
            Collections.sort(operacoesData, (op1, op2) -> op1.getData().compareTo(op2.getData()));

            if (comboTipoDespesa.getSelectedItem().equals("Tipo Despesa")) {

                for (Operacao operacao : operacoesData) {
                    if (operacao.getNatureza().equals(Natureza.DESPESA)) {
                        taListaOp.append("\n------------------------------------");
                        taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                        taListaOp.append("\n" + operacao.getNatureza().name());
                        Despesa despesa = (Despesa) operacao;
                        taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                        taListaOp.append("R$" + operacao.getValor());
                        if (!operacao.getData().isAfter(LocalDate.now())) {
                            taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                        } else {
                            taListaOp.append("\nOPERAÇÃO FUTURA");
                        }
                    }

                }
            } else {

                if (comboTipoDespesa.getSelectedItem().equals("Alimentação")) {
                    taListaOp.append("\nFiltro: Alimentação\n");

                    for (Operacao operacao : operacoesData) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.ALIMENTACAO)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Transporte")) {
                    taListaOp.append("\nFiltro: Transporte\n");

                    for (Operacao operacao : operacoesData) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.TRANSPORTE)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Residência")) {
                    taListaOp.append("\nFiltro: Residência\n");

                    for (Operacao operacao : operacoesData) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.RESIDENCIA)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Saúde")) {
                    taListaOp.append("\nFiltro: Saúde\n");

                    for (Operacao operacao : operacoesData) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.SAUDE)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Educação")) {
                    taListaOp.append("\nFiltro: Educação\n");

                    for (Operacao operacao : operacoesData) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.EDUCACAO)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else if (comboTipoDespesa.getSelectedItem().equals("Entretenimento")) {
                    taListaOp.append("\nFiltro: Entretenimento\n");

                    for (Operacao operacao : operacoesData) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.ENTRETENIMENTO)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                } else {
                    taListaOp.append("\nFiltro: Outra\n");

                    for (Operacao operacao : operacoesData) {

                        if (operacao.getNatureza().equals(Natureza.DESPESA)) {

                            Despesa despesa = (Despesa) operacao;
                            if (despesa.getTipoDespesa().equals(TipoDespesa.OUTRA)) {
                                taListaOp.append("\n------------------------------------");
                                taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

                                taListaOp.append("\n" + operacao.getNatureza().name());
                                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

                                taListaOp.append("R$" + operacao.getValor());
                                if (!operacao.getData().isAfter(LocalDate.now())) {
                                    taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
                                } else {
                                    taListaOp.append("\nOPERAÇÃO FUTURA");
                                }
                            }

                        }

                    }

                }

            }
        }
    }

    private void exibirOperacoes(ArrayList<Operacao> operacoes) {
        taListaOp.setText("");

        taListaOp.append("Histórico de Operações\n");
        taListaOp.append("Classificação: Número\n");

        for (Operacao operacao : operacoes) {
            taListaOp.append("\n------------------------------------");
            taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

            taListaOp.append("\n" + operacao.getNatureza().name());
            if (operacao.getNatureza().equals(Natureza.RECEITA)) {

                Receita receita = (Receita) operacao;
                taListaOp.append(" | " + receita.getTipoReceita().name() + "\n+");

            } else {

                Despesa despesa = (Despesa) operacao;
                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

            }

            taListaOp.append("R$" + operacao.getValor());
            if (!operacao.getData().isAfter(LocalDate.now())) {
                taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
            } else {
                taListaOp.append("\nOPERAÇÃO FUTURA");
            }
        }
    }

    private void exibirOperacoesPorData(ArrayList<Operacao> operacoes) {
        taListaOp.setText("");

        taListaOp.append("Histórico de Operações\n");
        taListaOp.append("Classificação: Data\n");

        ArrayList<Operacao> operacoesData = new ArrayList<>();

        for (Operacao operacao : operacoes) {
            operacoesData.add(operacao);
        }
        Collections.sort(operacoesData, (op1, op2) -> op1.getData().compareTo(op2.getData()));

        for (Operacao operacao : operacoesData) {
            taListaOp.append("\n------------------------------------");
            taListaOp.append("\n" + operacao.getData() + " | Nº: " + operacao.getNumero());

            taListaOp.append("\n" + operacao.getNatureza().name());
            if (operacao.getNatureza().equals(Natureza.RECEITA)) {

                Receita receita = (Receita) operacao;
                taListaOp.append(" | " + receita.getTipoReceita().name() + "\n+");

            } else {

                Despesa despesa = (Despesa) operacao;
                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

            }

            taListaOp.append("R$" + operacao.getValor());
            if (!operacao.getData().isAfter(LocalDate.now())) {
                taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
            } else {
                taListaOp.append("\nOPERAÇÃO FUTURA");
            }
        }
    }

    private void exibirOperacoesOriginais() {
        taListaOp.append("Histórico de Operações\n");

        for (Operacao operacao : operacoesOriginais) {
            taListaOp.append("\n------------------------------------");
            taListaOp.append("\nNº: " + operacao.getNumero() + " | " + operacao.getData());

            taListaOp.append("\n" + operacao.getNatureza().name());
            if (operacao.getNatureza().equals(Natureza.RECEITA)) {

                Receita receita = (Receita) operacao;
                taListaOp.append(" | " + receita.getTipoReceita().name() + "\n+");

            } else {

                Despesa despesa = (Despesa) operacao;
                taListaOp.append(" | " + despesa.getTipoDespesa().name() + "\n-");

            }

            taListaOp.append("R$" + operacao.getValor());
            if (!operacao.getData().isAfter(LocalDate.now())) {
                taListaOp.append("\nSALDO: R$" + operacao.getSaldo());
            } else {
                taListaOp.append("\nOPERAÇÃO FUTURA");
            }
        }

    }

    private void preencherTipoDespesa() {
        comboTipoDespesa.addItem("Alimentação");
        comboTipoDespesa.addItem("Transporte");
        comboTipoDespesa.addItem("Residência");
        comboTipoDespesa.addItem("Saúde");
        comboTipoDespesa.addItem("Educação");
        comboTipoDespesa.addItem("Entretenimento");
        comboTipoDespesa.addItem("Outra");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnClassData;
    private javax.swing.JRadioButton btnClassNum;
    private javax.swing.JRadioButton btnDes;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JRadioButton btnPesquisarLiberar;
    private javax.swing.JRadioButton btnRec;
    private javax.swing.JRadioButton btnSem;
    private javax.swing.JComboBox<String> comboTipoDespesa;
    private javax.swing.ButtonGroup groupClass;
    private javax.swing.ButtonGroup groupFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taListaOp;
    private javax.swing.JTextField txtAnoP;
    private javax.swing.JTextField txtDiaP;
    private javax.swing.JTextField txtMesP;
    // End of variables declaration//GEN-END:variables
}
