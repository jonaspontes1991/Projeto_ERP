/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO IDEAPAD I3
 */
public class TelaCadastroFornecedor extends javax.swing.JFrame {

    ImageIcon iconSalvar = new ImageIcon("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\apresentacao\\images\\Salvar.png");
    ImageIcon iconAterar = new ImageIcon("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\apresentacao\\images\\Alterar.PNG");
    ImageIcon iconDeletar = new ImageIcon("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\apresentacao\\images\\Deletar.PNG");

    /**
     * Creates new form NewJFrame
     */
    public TelaCadastroFornecedor() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblMenssagem = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        lblSalvar = new javax.swing.JLabel();
        lblAlterar = new javax.swing.JLabel();
        lblDeletar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 38, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CPF/CNPJ:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 50, 63, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Endere??o:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 110, 60, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 140, 56, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 170, 35, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Segmento/Area:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 200, 102, 15);

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 20, 295, 20);

        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 50, 295, 20);

        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 110, 363, 20);

        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(130, 140, 153, 20);

        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(130, 170, 363, 20);

        jTextField6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(130, 200, 220, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nacionalidade:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 80, 87, 15);

        jTextField7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(200, 80, 161, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Telefone:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 140, 56, 15);

        jTextField8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField8);
        jTextField8.setBounds(360, 140, 133, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Tipo de Servi??os:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 230, 110, 15);

        jTextField9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(130, 230, 220, 20);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        jPanel2.add(btnSalvar);
        btnSalvar.setBounds(20, 10, 50, 50);

        btnAlterar.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlterarMouseExited(evt);
            }
        });
        jPanel2.add(btnAlterar);
        btnAlterar.setBounds(80, 10, 50, 50);

        btnDeletar.setBackground(new java.awt.Color(204, 204, 204));
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletarMouseExited(evt);
            }
        });
        jPanel2.add(btnDeletar);
        btnDeletar.setBounds(140, 10, 50, 50);

        lblMenssagem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMenssagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMenssagem.setText("Digite o ID para Alterar ou Excluir");
        jPanel2.add(lblMenssagem);
        lblMenssagem.setBounds(230, 10, 210, 15);
        jPanel2.add(jTextField10);
        jTextField10.setBounds(230, 30, 160, 20);

        lblSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSalvar.setForeground(new java.awt.Color(0, 255, 0));
        lblSalvar.setText("Salvar");
        jPanel2.add(lblSalvar);
        lblSalvar.setBounds(30, 70, 40, 14);

        lblAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlterar.setForeground(new java.awt.Color(255, 204, 0));
        lblAlterar.setText("Alterar");
        jPanel2.add(lblAlterar);
        lblAlterar.setBounds(80, 70, 40, 14);

        lblDeletar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDeletar.setForeground(new java.awt.Color(255, 0, 0));
        lblDeletar.setText("Deletar");
        jPanel2.add(lblDeletar);
        lblDeletar.setBounds(140, 70, 50, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(370, 200, 450, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 1330, 300);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Fornecedor", "Nome", "CPF/CNPJ", "TELEFONE", "Segmento/Area"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 330, 970, 330);

        setBounds(0, 0, 1393, 798);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        lblSalvar.setVisible(true);

    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        lblSalvar.setVisible(false);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered
        lblAlterar.setVisible(true);
        lblMenssagem.setVisible(true);
    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseExited
        lblAlterar.setVisible(false);
        lblMenssagem.setVisible(false);
    }//GEN-LAST:event_btnAlterarMouseExited

    private void btnDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseEntered
        lblDeletar.setVisible(true);
        lblMenssagem.setVisible(true);
    }//GEN-LAST:event_btnDeletarMouseEntered

    private void btnDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseExited
        lblDeletar.setVisible(false);
        lblMenssagem.setVisible(false);
    }//GEN-LAST:event_btnDeletarMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnSalvar.setIcon(iconSalvar);
        btnAlterar.setIcon(iconAterar);
        btnDeletar.setIcon(iconDeletar);

        lblSalvar.setVisible(false);
        lblAlterar.setVisible(false);
        lblDeletar.setVisible(false);
        lblMenssagem.setVisible(false);
        lblMenssagem.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblDeletar;
    private javax.swing.JLabel lblMenssagem;
    private javax.swing.JLabel lblSalvar;
    // End of variables declaration//GEN-END:variables
}
