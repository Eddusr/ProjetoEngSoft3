/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlConvenio;
import control.ControlPaciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Paciente;

/**
 *
 * @author Luiz Oliveira
 */
public class TelaCadPaciente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadPaciente
     */
    public TelaCadPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cfSexo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        tfIdade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfCobertura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tfConvenio = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cfSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "M", "F" }));

        jLabel2.setText("Nome");

        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Idade", "Sexo", "Convenio", "Cobertura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePacientesMouseClicked(evt);
            }
        });
        tablePacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablePacientesKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tablePacientes);

        jLabel3.setText("Idade");

        jLabel4.setText("Sexo");

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Convenio");

        jButton4.setText("Alterar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Deletar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF");

        jLabel1.setText("Cobertura");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(489, 489, 489))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(221, 221, 221)))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(tfCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(104, 104, 104)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePacientesMouseClicked

        if (tablePacientes.getSelectedRow() != -1){
            tfCPF.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 0).toString());
            tfNome.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 1).toString());
            tfIdade.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 2).toString());
            cfSexo.setSelectedItem(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 3).toString());
            tfConvenio.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 4).toString());
            tfCobertura.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tablePacientesMouseClicked

    private void tablePacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablePacientesKeyReleased

        if (tablePacientes.getSelectedRow() != -1){
            tfCPF.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 0).toString());
            tfNome.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 1).toString());
            tfIdade.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 2).toString());
            cfSexo.setSelectedItem(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 3).toString());
            tfConvenio.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 4).toString());
            tfCobertura.setText(tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 5).toString());
        }

    }//GEN-LAST:event_tablePacientesKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ControlPaciente control = new ControlPaciente();
        Paciente pac = control.getPaciente(tfCPF.getText());
        DefaultTableModel dtmPacientes = (DefaultTableModel) tablePacientes.getModel();
        Object[] dados = {pac.getCpf(), pac.getNome(), pac.getIdade(), pac.getSexo(), pac.getConvenio().getNome(), pac.getConvenio().getCobertura()};
        dtmPacientes.addRow(dados);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (tablePacientes.getSelectedRow() != -1){
            DefaultTableModel dtmPacientes = (DefaultTableModel) tablePacientes.getModel();
            ControlPaciente control = new ControlPaciente();
            control.deletar(tfCPF.getText());
            dtmPacientes.removeRow(tablePacientes.getSelectedRow());
        }
        else
        JOptionPane.showMessageDialog(null, "Nenhum registo selecionado.");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ControlConvenio control = new ControlConvenio();
        if (!(control.save(tfConvenio.getText(), tfCobertura.getText()))){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar convenio.");
        }
        else {
            ControlPaciente control2 = new ControlPaciente();
            if (!(control2.save(tfCPF.getText(), tfNome.getText(), cfSexo.getSelectedItem().toString(), Integer.parseInt(tfIdade.getText()), tfConvenio.getText(), tfCobertura.getText()))){
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente.");
            }
            else {
                DefaultTableModel dtmPacientes = (DefaultTableModel) tablePacientes.getModel();
                Object[] dados = {tfCPF.getText(), tfNome.getText(), tfIdade.getText(), cfSexo.getSelectedItem(), tfConvenio.getText(), tfCobertura.getText()};
                dtmPacientes.addRow(dados);
            }
            
        }
            
        //ControlPaciente control = new ControlPaciente();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ControlConvenio control = new ControlConvenio();
        if (!(control.save(tfConvenio.getText(), tfCobertura.getText()))){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar convenio.");
        }
        else {
            ControlPaciente control2 = new ControlPaciente();
            String oldra = tablePacientes.getValueAt(tablePacientes.getSelectedRow(), 0).toString();
            if (!(control2.update(tfCPF.getText(), tfNome.getText(), cfSexo.getSelectedItem().toString(), Integer.parseInt(tfIdade.getText()), tfConvenio.getText(), tfCobertura.getText(), oldra))){
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente.");
            }
            else {
                DefaultTableModel dtmPacientes = (DefaultTableModel) tablePacientes.getModel();
                Object[] dados = {tfCPF.getText(), tfNome.getText(), tfIdade.getText(), cfSexo.getSelectedItem(), tfConvenio.getText(), tfCobertura.getText()};
                dtmPacientes.addRow(dados);
            }
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cfSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablePacientes;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCobertura;
    private javax.swing.JTextField tfConvenio;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
