package Vizualizacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controle.Conexao;

public class Cliente extends javax.swing.JFrame {
 
    public Cliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadac = new javax.swing.JDesktopPane();
        cpf = new javax.swing.JLabel();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldnome = new javax.swing.JTextField();
        jTextFieldtelefone = new javax.swing.JTextField();
        jTextFieldendereco = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jTextFieldemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cpf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cpf.setForeground(new java.awt.Color(255, 255, 255));
        cpf.setText("CPF");

        jTextFieldcpf.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcpfActionPerformed(evt);
            }
        });

        jTextFieldnome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnomeActionPerformed(evt);
            }
        });

        jTextFieldtelefone.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldtelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtelefoneActionPerformed(evt);
            }
        });

        jTextFieldendereco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldenderecoActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome");

        telefone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        telefone.setForeground(new java.awt.Color(255, 255, 255));
        telefone.setText("Telefone");

        endereco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        endereco.setForeground(new java.awt.Color(255, 255, 255));
        endereco.setText("Endereço");

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("E-mail");

        jTextFieldemail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cadastrar Cliente");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Cadac.setLayer(cpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jTextFieldcpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jTextFieldnome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jTextFieldtelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jTextFieldendereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(endereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jTextFieldemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Cadac.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout CadacLayout = new javax.swing.GroupLayout(Cadac);
        Cadac.setLayout(CadacLayout);
        CadacLayout.setHorizontalGroup(
            CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadacLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadacLayout.createSequentialGroup()
                        .addComponent(telefone)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadacLayout.createSequentialGroup()
                        .addComponent(cpf)
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endereco)
                    .addComponent(nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadacLayout.createSequentialGroup()
                        .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadacLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(email))
                            .addGroup(CadacLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(17, 17, 17)
                        .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadacLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadacLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))))
                    .addComponent(jLabel9))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        CadacLayout.setVerticalGroup(
            CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome)
                    .addComponent(email)
                    .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(CadacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endereco)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cadac)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cadac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldemailActionPerformed

    private void jTextFieldenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldenderecoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.sql.Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root","");
        }
        catch (ClassNotFoundException | SQLException e) {
            throw new java.lang.RuntimeException("erro ao conectar");
        }
        String cpf = this.jTextFieldcpf.getText();
        String nome = this.jTextFieldnome.getText();
        String telefone = this.jTextFieldtelefone.getText();
        String endereco = this.jTextFieldendereco.getText();
        String email = this.jTextFieldemail.getText();
       

        String comando = "insert into cliente (cpf, nome, telefone, endereco, email)" +
        "values " + "('"+cpf+"','" +nome+"','"+telefone+"','"+endereco+"','" +email+"')";

        try(    java.sql.Statement stmt = con.createStatement()) {
            stmt.executeUpdate(comando);
        }
        catch(java.sql.SQLException e){
            throw new java.lang.RuntimeException(e.getMessage());
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(jTextFieldcpf.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        }
        catch (Exception e) {
            throw new java.lang.RuntimeException("erro fechar");
        }
                                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root", "");
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE cliente SET cpf='"
                + this.jTextFieldcpf.getText() + "',nome='"
                + this.jTextFieldnome.getText()
                + "' ,telefone='" + this.jTextFieldtelefone.getText()
                + "' ,endereco='" + this.jTextFieldendereco.getText()
                + "' ,email='" + this.jTextFieldemail.getText() + "'");
            JOptionPane.showMessageDialog(rootPane, "Cliente atualizado");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root", "");

            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM cliente WHERE cpf='" + this.jTextFieldcpf.getText() + "'");
            JOptionPane.showMessageDialog(rootPane, "Cliente excluído");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcpfActionPerformed

    private void jTextFieldnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnomeActionPerformed

    private void jTextFieldtelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtelefoneActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.dispose();
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Cadac;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldcpf;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldendereco;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldtelefone;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}
