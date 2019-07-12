package Vizualizacao;

import Controle.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.Produtos;

public class Produto extends javax.swing.JFrame {

  
    public Produto() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel2Prod = new javax.swing.JLabel();
        JTextFieldCod = new javax.swing.JTextField();
        jLabel1Cod = new javax.swing.JLabel();
        jLabel3Quant = new javax.swing.JLabel();
        jTextField3Quant = new javax.swing.JTextField();
        jLabel5Preven = new javax.swing.JLabel();
        jTextField5Preven = new javax.swing.JTextField();
        jTextField2Prod = new javax.swing.JTextField();
        jTextField1Fornen = new javax.swing.JTextField();
        Fornen = new javax.swing.JLabel();
        jTextField4Precom = new javax.swing.JTextField();
        Precom = new javax.swing.JLabel();
        jButton4Excluir = new javax.swing.JButton();
        jButton3Atual = new javax.swing.JButton();
        jButton2List = new javax.swing.JButton();
        jButton1Inser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cadastro de Produtos");

        jLabel2Prod.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2Prod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2Prod.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2Prod.setText("Produto");

        JTextFieldCod.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1Cod.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1Cod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1Cod.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Cod.setText("Cod:");

        jLabel3Quant.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3Quant.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3Quant.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3Quant.setText("Quantidade");

        jTextField3Quant.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5Preven.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5Preven.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5Preven.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5Preven.setText("Preço de Venda");

        jTextField5Preven.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2Prod.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ProdActionPerformed(evt);
            }
        });

        jTextField1Fornen.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1Fornen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1FornenActionPerformed(evt);
            }
        });

        Fornen.setBackground(new java.awt.Color(255, 255, 255));
        Fornen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Fornen.setForeground(new java.awt.Color(255, 255, 255));
        Fornen.setText("Fornecedor");

        jTextField4Precom.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4Precom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4PrecomActionPerformed(evt);
            }
        });

        Precom.setBackground(new java.awt.Color(255, 255, 255));
        Precom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Precom.setForeground(new java.awt.Color(255, 255, 255));
        Precom.setText("Preço de Compra");

        jButton4Excluir.setBackground(new java.awt.Color(51, 51, 51));
        jButton4Excluir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4Excluir.setForeground(new java.awt.Color(255, 255, 255));
        jButton4Excluir.setText("Excluir");
        jButton4Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ExcluirActionPerformed(evt);
            }
        });

        jButton3Atual.setBackground(new java.awt.Color(51, 51, 51));
        jButton3Atual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3Atual.setForeground(new java.awt.Color(255, 255, 255));
        jButton3Atual.setText("Atualizar");
        jButton3Atual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3AtualActionPerformed(evt);
            }
        });

        jButton2List.setBackground(new java.awt.Color(51, 51, 51));
        jButton2List.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2List.setForeground(new java.awt.Color(255, 255, 255));
        jButton2List.setText("Listagem");
        jButton2List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ListActionPerformed(evt);
            }
        });

        jButton1Inser.setBackground(new java.awt.Color(51, 51, 51));
        jButton1Inser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1Inser.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Inser.setText("Inserir");
        jButton1Inser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InserActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2Prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JTextFieldCod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1Cod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3Quant, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField3Quant, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5Preven, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField5Preven, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField2Prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1Fornen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Fornen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField4Precom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Precom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4Excluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3Atual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2List, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1Inser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3Quant, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel1Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2Prod)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField2Prod))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2List)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel3Quant)
                                        .addGap(132, 132, 132)
                                        .addComponent(jLabel5Preven)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5Preven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jButton3Atual)
                                        .addGap(26, 26, 26)))))
                        .addGap(48, 48, 48)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(Fornen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1Fornen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(Precom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4Precom, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(281, 281, 281))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1Inser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4Excluir)
                        .addGap(76, 76, 76)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Cod)
                    .addComponent(JTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Prod)
                    .addComponent(jTextField2Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fornen)
                    .addComponent(jTextField1Fornen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Quant)
                    .addComponent(jTextField3Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5Preven)
                    .addComponent(jTextField5Preven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precom)
                    .addComponent(jTextField4Precom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Inser)
                    .addComponent(jButton2List)
                    .addComponent(jButton3Atual)
                    .addComponent(jButton4Excluir)
                    .addComponent(jButton1))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ProdActionPerformed

    }//GEN-LAST:event_jTextField2ProdActionPerformed

    private void jTextField1FornenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1FornenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FornenActionPerformed

    private void jButton4ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ExcluirActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root", "");

            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM produto WHERE cod='" + this.JTextFieldCod.getText() + "'");
            JOptionPane.showMessageDialog(rootPane, "produto excluído");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton4ExcluirActionPerformed

    private void jButton3AtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3AtualActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root", "");
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE produto SET cod='"
                + this.JTextFieldCod.getText() + "',precocompra='"
                + this.jTextField4Precom.getText()
                + "' ,produto='" + this.jTextField2Prod.getText()
                + "' ,quantidade='" + this.jTextField3Quant.getText()
                + "' ,precovenda='" + this.jTextField5Preven.getText()
                + "' ,fornecedor='" + this.jTextField1Fornen.getText()  + "'");
            JOptionPane.showMessageDialog(rootPane, "Produto atualizado");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton3AtualActionPerformed

    private void jButton2ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ListActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root", "");
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select * from produto");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                System.out.print(rs.getString("cod") + ", ");
                System.out.print(rs.getString("quantidade") + ", ");
                System.out.println(rs.getString("precovenda"));
                System.out.println(rs.getString("produto"));
                System.out.println(rs.getString("fornecedor"));
                System.out.println(rs.getString("precocompra"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton2ListActionPerformed

    private void jButton1InserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InserActionPerformed
        java.sql.Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root","");
        }
        catch (ClassNotFoundException | SQLException e) {
            throw new java.lang.RuntimeException("erro ao conectar");
        }
        String Cod = this.JTextFieldCod.getText();
        String Precom = this.jTextField4Precom.getText();
        String Prod = this.jTextField2Prod.getText();
        String Preven = this.jTextField5Preven.getText();
        String Quant = this.jTextField3Quant.getText();
        String Fornen = this.jTextField1Fornen.getText();

        String comando = "insert into produto (cod, precocompra, produto, precovenda, quantidade, fornecedor)" +
        "values " + "('"+Cod+"','" +Precom+"','"+Prod+"','"+Preven+"','" +Quant+"','"+Fornen+"')";

        try(    java.sql.Statement stmt = con.createStatement()) {
            stmt.executeUpdate(comando);
        }
        catch(java.sql.SQLException e){
            throw new java.lang.RuntimeException(e.getMessage());
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(jLabel1Cod.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        }
        catch (Exception e) {
            throw new java.lang.RuntimeException("erro fechar");
        }
    }//GEN-LAST:event_jButton1InserActionPerformed

    private void jTextField4PrecomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4PrecomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4PrecomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fornen;
    private javax.swing.JTextField JTextFieldCod;
    private javax.swing.JLabel Precom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Inser;
    private javax.swing.JButton jButton2List;
    private javax.swing.JButton jButton3Atual;
    private javax.swing.JButton jButton4Excluir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1Cod;
    private javax.swing.JLabel jLabel2Prod;
    private javax.swing.JLabel jLabel3Quant;
    private javax.swing.JLabel jLabel5Preven;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1Fornen;
    private javax.swing.JTextField jTextField2Prod;
    private javax.swing.JTextField jTextField3Quant;
    private javax.swing.JTextField jTextField4Precom;
    private javax.swing.JTextField jTextField5Preven;
    // End of variables declaration//GEN-END:variables

 
    }

