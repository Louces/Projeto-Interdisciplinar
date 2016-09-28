/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.view;

import br.com.remocamp.controller.FileControllerPlantao;
import br.com.remocamp.controller.FileControllerRemocao;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author fabiano
 */
public class FileView extends javax.swing.JInternalFrame {

    int id;
    String tipo;

    public FileView(String obj, int id) {
        initComponents();
        this.id = id;
        tipo = obj;
        pack();
        setNameFile();
    }

    public void setNameFile() {
        String nomeClass = tipo;
        
        if (nomeClass.equals("Plantao")) {
            FileControllerPlantao ctl = new FileControllerPlantao(id);
            lbNome.setText(ctl.getNome());
        }else if(nomeClass.equals("Remocao")){
            FileControllerRemocao ctl = new FileControllerRemocao(id);
            lbNome.setText(ctl.getNome());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelPic = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuIncluirAnexo = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Visualizador de anexos");

        panelPic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPic.setMinimumSize(new java.awt.Dimension(1, 1));

        lbNome.setText(" Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPicLayout = new javax.swing.GroupLayout(panelPic);
        panelPic.setLayout(panelPicLayout);
        panelPicLayout.setHorizontalGroup(
            panelPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addGroup(panelPicLayout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        panelPicLayout.setVerticalGroup(
            panelPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnRemover))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuArquivo.setText("Arquivo");

        menuIncluirAnexo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuIncluirAnexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/remocamp/figuras/open_icon.png"))); // NOI18N
        menuIncluirAnexo.setText("Incluir anexos");
        menuIncluirAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIncluirAnexoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuIncluirAnexo);

        menuBar.add(menuArquivo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuIncluirAnexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIncluirAnexoActionPerformed
        final JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue != JFileChooser.APPROVE_OPTION) {
            return;
        }
        
        FileView.this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        new Thread(new Runnable() {
            @Override
            public void run() {
                File arquivosSelecionado = fileChooser.getSelectedFile();

                String nomeClass = tipo;

                if (nomeClass.equals("Plantao")) {
                    FileControllerPlantao ctl = new FileControllerPlantao(arquivosSelecionado, id);
                    ctl.insertFile();
                } else if (nomeClass.equals("Remocao")) {
                    FileControllerRemocao ctl = new FileControllerRemocao(arquivosSelecionado, id);
                    ctl.insertFile();
                }
                setNameFile();
            }
        }).start();
        FileView.this.setDefaultCloseOperation(2);
        
    }//GEN-LAST:event_menuIncluirAnexoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (lbNome.getText().equals("")) {
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue != JFileChooser.APPROVE_OPTION) {
            return;
        }

        String nomeClass = tipo;
        String diretorio = fileChooser.getSelectedFile() + "";

        if (nomeClass.equals("Plantao")) {
            FileControllerPlantao ctl = new FileControllerPlantao(id);
            File arquivo = ctl.getFile(diretorio);
        } else if (nomeClass.equals("Remocao")) {
            FileControllerRemocao ctl = new FileControllerRemocao(id);
            File arquivo = ctl.getFile(diretorio);
        }

        JOptionPane.showMessageDialog(null, "Salvo em : " + diretorio);

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        String nomeClass = tipo;
        if (nomeClass.equals("Plantao")) {
            FileControllerPlantao ctl = new FileControllerPlantao(id);
            ctl.removeFile();
        } else if (nomeClass.equals("Remocao")) {
            FileControllerRemocao ctl = new FileControllerRemocao(id);
            ctl.removeFile();
        }
        setNameFile();
    }//GEN-LAST:event_btnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbNome;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuIncluirAnexo;
    private javax.swing.JPanel panelPic;
    // End of variables declaration//GEN-END:variables
}
