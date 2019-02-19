/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facema.view;

import facema.controller.AlunoController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author savio
 */
public class TelaTabelaAlunoPesquisa extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaTabelaAlunoPesquisa
     */
    public TelaTabelaAlunoPesquisa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        txtPesquisaPessoa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "numero", "cpf", "endereço", "idade", "matricula", "serie", "pai", "mãe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(47, 47, 47)
                        .addComponent(btnLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        DefaultTableModel tabela = (DefaultTableModel) tblAlunos.getModel();
        AlunoController aluno = new AlunoController();
        aluno.pesquisarAlunos(this.txtPesquisaPessoa.getText(), tabela);
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) tblAlunos.getModel();
        tabela.setNumRows(0);
        
        /*if(tabela.getRowCount()>-1){
            //tabela.removeRow(0);
            int i=0;
            while(i<=tabela.getRowCount()){
                i++;
                tabela.removeRow(i);
            }
        }*/

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtPesquisaPessoa;
    // End of variables declaration//GEN-END:variables
}
