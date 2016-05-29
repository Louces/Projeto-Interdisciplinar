/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.view;

import br.com.remocamp.model.NotaFiscal;

/**
 *
 * @author fabiano
 */
public class NotaFiscalFrame extends javax.swing.JInternalFrame {
    NotaFiscal nota;
    /**
     * Creates new form NotaFiscalFrame
     */
    public NotaFiscalFrame(NotaFiscal nota) {
        initComponents();
        this.nota=nota;
        
        lbNumeroNota.setText(lbNumeroNota.getText()+nota.getNUM_NOTA());
        lbDataHoraEmissao.setText(lbDataHoraEmissao.getText()+nota.getDATA_HORA_EMISSAO());
        lbCodigoVerificacao.setText(lbCodigoVerificacao.getText()+nota.getCODIGO_VERIFICACAO().substring(nota.getCODIGO_VERIFICACAO().length()-8, nota.getCODIGO_VERIFICACAO().length()));
        
        lbPrestadorRazaoSocial.setText(lbPrestadorRazaoSocial.getText()+nota.getPRESTADOR_RAZAO_SOCIAL());
        lbPrestadorCPF_CNPJ.setText(lbPrestadorCPF_CNPJ.getText()+nota.getPRESTADOR_CPF_CNPJ());
        lbPrestadorInscricaoMunicipal.setText(lbPrestadorInscricaoMunicipal.getText()+nota.getPRESTADOR_INSCRICAO_MUNICIPAL());
        lbPrestadorEndereco.setText(lbPrestadorEndereco.getText()+"RUA PROENCA, Nº 329 ­ 337 ­ BAIRRO BOSQUE ­ CEP : 13026­121");
        lbPrestadorMunicipio.setText(lbPrestadorMunicipio.getText()+"CAMPINAS");
        lbPrestadorUF.setText(lbPrestadorUF.getText()+"SP");
        lbPrestadorTelefone.setText(lbPrestadorTelefone.getText()+"(19) 32366005");
        
        lbTomadorRazaoSocial.setText(lbTomadorRazaoSocial.getText()+nota.getTOMADOR_RAZAO_SOCIAL());
        lbTomadorCPF_CNPJ.setText(lbTomadorCPF_CNPJ.getText()+nota.getTOMADOR_CPF_CNPJ());
        lbTomadorInscricao.setText(lbTomadorInscricao.getText()+"N/D");
        String endereco = nota.getTOMADOR_TIPO_LOGRADOURO()+" "+nota.getTOMADOR_LOGRADOURO()
                          +" , nº "+nota.getTOMADOR_NUMERO()+" "+nota.getTOMADOR_TIPO_BAIRRO()+" "+nota.getTOMADOR_BAIRRO()
                          +" - CEP: "+nota.getTOMADOR_CEP();
        lbTomadorEndereco.setText(lbTomadorEndereco.getText()+endereco);
        lbTomadorMunicipio.setText(lbTomadorMunicipio.getText()+nota.getTOMADOR_CIDADE());
        lbTomadorUF.setText(lbTomadorUF.getText()+nota.getTOMADOR_UF());
        lbTomadorTelefone.setText(lbTomadorTelefone.getText()+"("+nota.getTOMADOR_DDD_TELEFONE()+") "+nota.getTOMADOR_TELEFONE());
        lbTomadorEmail.setText(lbTomadorEmail.getText()+nota.getTOMADOR_EMAIL());
        
        txtAreaDescricaoNota.setText(nota.getDESCRICAO_NOTA().replaceAll("<br />", "\n"));
        
        lbValorNota.setText(lbValorNota.getText()+nota.getVALOR_TOTAL());
        lbMesNotaFiscal.setText(lbMesNotaFiscal.getText()+nota.getMES_COMPETENCIA());
        lbLocalPrestacao.setText(lbLocalPrestacao.getText()+nota.getCIDADE_PRESTACAO());
        txtAreaDescricaoServico.setText(nota.getDESCRICAO_SERVICO());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbNumeroNota = new javax.swing.JLabel();
        lbDataHoraEmissao = new javax.swing.JLabel();
        lbCodigoVerificacao = new javax.swing.JLabel();
        lbValorNota = new javax.swing.JLabel();
        panelPrestador = new javax.swing.JPanel();
        lbRemocamp = new javax.swing.JLabel();
        lbPrestadorRazaoSocial = new javax.swing.JLabel();
        lbPrestadorCPF_CNPJ = new javax.swing.JLabel();
        lbPrestadorInscricaoMunicipal = new javax.swing.JLabel();
        lbPrestadorEndereco = new javax.swing.JLabel();
        lbPrestadorMunicipio = new javax.swing.JLabel();
        lbPrestadorUF = new javax.swing.JLabel();
        lbPrestadorTelefone = new javax.swing.JLabel();
        panelTomador = new javax.swing.JPanel();
        lbTomadorRazaoSocial = new javax.swing.JLabel();
        lbTomadorCPF_CNPJ = new javax.swing.JLabel();
        lbTomadorInscricao = new javax.swing.JLabel();
        lbTomadorEndereco = new javax.swing.JLabel();
        lbTomadorMunicipio = new javax.swing.JLabel();
        lbTomadorUF = new javax.swing.JLabel();
        lbTomadorTelefone = new javax.swing.JLabel();
        lbTomadorEmail = new javax.swing.JLabel();
        panelDescriminacaoServico = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        txtAreaDescricaoNota = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        lbMesNotaFiscal = new javax.swing.JLabel();
        lbLocalPrestacao = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoServico = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Nota Fiscal");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/remocamp/figuras/prefeitura-municipal-de-campinas-original.jpg"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("PREFEITURA MUNICIPAL DE CAMPINAS");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("SECRETARIA MUNICIPAL DE FINANÇAS DE CAMPINAS");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("NOTA FISCAL DE SERVIÇOS ELETRÔNICA ­ NFSe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16))
                            .addComponent(jLabel15))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbNumeroNota.setText("Número da Nota : ");

        lbDataHoraEmissao.setText("Data e Hora de Emissão : ");

        lbCodigoVerificacao.setText("Código de Verificação : ");

        lbValorNota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbValorNota.setText("VALOR TOTAL DA NOTA :  R$ ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNumeroNota, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbDataHoraEmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCodigoVerificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addComponent(lbValorNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNumeroNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDataHoraEmissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCodigoVerificacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbValorNota)
                .addContainerGap())
        );

        panelPrestador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Prestador de Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbRemocamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/remocamp/figuras/LOGOMARCA.jpg"))); // NOI18N

        lbPrestadorRazaoSocial.setText("Nome/Razão Social : ");

        lbPrestadorCPF_CNPJ.setText("CPF/CNPJ : ");

        lbPrestadorInscricaoMunicipal.setText("Inscrição Municipal : ");

        lbPrestadorEndereco.setText("Endereço : ");

        lbPrestadorMunicipio.setText("Município : ");

        lbPrestadorUF.setText("UF : ");

        lbPrestadorTelefone.setText("Telefone : ");

        javax.swing.GroupLayout panelPrestadorLayout = new javax.swing.GroupLayout(panelPrestador);
        panelPrestador.setLayout(panelPrestadorLayout);
        panelPrestadorLayout.setHorizontalGroup(
            panelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestadorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbRemocamp)
                .addGap(31, 31, 31)
                .addGroup(panelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrestadorTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPrestadorRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPrestadorCPF_CNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPrestadorInscricaoMunicipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPrestadorEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPrestadorMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPrestadorUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        panelPrestadorLayout.setVerticalGroup(
            panelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRemocamp)
            .addGroup(panelPrestadorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbPrestadorRazaoSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrestadorCPF_CNPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrestadorInscricaoMunicipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrestadorEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrestadorMunicipio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrestadorUF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrestadorTelefone))
        );

        panelTomador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tomador de Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbTomadorRazaoSocial.setText("Nome/Razão Social : ");

        lbTomadorCPF_CNPJ.setText("CPF/CNPJ : ");

        lbTomadorInscricao.setText("Inscrição Municipal : ");

        lbTomadorEndereco.setText("Endereço : ");

        lbTomadorMunicipio.setText("Município : ");

        lbTomadorUF.setText("UF: ");

        lbTomadorTelefone.setText("Telefone : ");

        lbTomadorEmail.setText("E-mail : ");

        javax.swing.GroupLayout panelTomadorLayout = new javax.swing.GroupLayout(panelTomador);
        panelTomador.setLayout(panelTomadorLayout);
        panelTomadorLayout.setHorizontalGroup(
            panelTomadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTomadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTomadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTomadorInscricao)
                    .addComponent(lbTomadorRazaoSocial)
                    .addComponent(lbTomadorCPF_CNPJ)
                    .addComponent(lbTomadorMunicipio)
                    .addComponent(lbTomadorEndereco)
                    .addComponent(lbTomadorUF)
                    .addComponent(lbTomadorTelefone)
                    .addComponent(lbTomadorEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTomadorLayout.setVerticalGroup(
            panelTomadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTomadorLayout.createSequentialGroup()
                .addComponent(lbTomadorRazaoSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTomadorCPF_CNPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTomadorInscricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTomadorEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTomadorMunicipio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTomadorUF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTomadorTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTomadorEmail))
        );

        panelDescriminacaoServico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Discriminação dos Serviços", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtAreaDescricaoNota.setColumns(20);
        txtAreaDescricaoNota.setRows(5);
        scrollPane.setViewportView(txtAreaDescricaoNota);

        javax.swing.GroupLayout panelDescriminacaoServicoLayout = new javax.swing.GroupLayout(panelDescriminacaoServico);
        panelDescriminacaoServico.setLayout(panelDescriminacaoServicoLayout);
        panelDescriminacaoServicoLayout.setHorizontalGroup(
            panelDescriminacaoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescriminacaoServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane)
                .addContainerGap())
        );
        panelDescriminacaoServicoLayout.setVerticalGroup(
            panelDescriminacaoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescriminacaoServicoLayout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Outras Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbMesNotaFiscal.setText("Mês de Competencia da Nota Fiscal : ");

        lbLocalPrestacao.setText("Local da Prestação de Serviço : ");

        jLabel26.setText("Descrição do Serviço : ");

        txtAreaDescricaoServico.setColumns(20);
        txtAreaDescricaoServico.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoServico);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLocalPrestacao)
                            .addComponent(lbMesNotaFiscal)
                            .addComponent(jLabel26))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lbMesNotaFiscal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLocalPrestacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelPrestador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTomador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDescriminacaoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(panelPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTomador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelDescriminacaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigoVerificacao;
    private javax.swing.JLabel lbDataHoraEmissao;
    private javax.swing.JLabel lbLocalPrestacao;
    private javax.swing.JLabel lbMesNotaFiscal;
    private javax.swing.JLabel lbNumeroNota;
    private javax.swing.JLabel lbPrestadorCPF_CNPJ;
    private javax.swing.JLabel lbPrestadorEndereco;
    private javax.swing.JLabel lbPrestadorInscricaoMunicipal;
    private javax.swing.JLabel lbPrestadorMunicipio;
    private javax.swing.JLabel lbPrestadorRazaoSocial;
    private javax.swing.JLabel lbPrestadorTelefone;
    private javax.swing.JLabel lbPrestadorUF;
    private javax.swing.JLabel lbRemocamp;
    private javax.swing.JLabel lbTomadorCPF_CNPJ;
    private javax.swing.JLabel lbTomadorEmail;
    private javax.swing.JLabel lbTomadorEndereco;
    private javax.swing.JLabel lbTomadorInscricao;
    private javax.swing.JLabel lbTomadorMunicipio;
    private javax.swing.JLabel lbTomadorRazaoSocial;
    private javax.swing.JLabel lbTomadorTelefone;
    private javax.swing.JLabel lbTomadorUF;
    private javax.swing.JLabel lbValorNota;
    private javax.swing.JPanel panelDescriminacaoServico;
    private javax.swing.JPanel panelPrestador;
    private javax.swing.JPanel panelTomador;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtAreaDescricaoNota;
    private javax.swing.JTextArea txtAreaDescricaoServico;
    // End of variables declaration//GEN-END:variables
}