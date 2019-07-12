package Vizualizacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Controle.Conexao;

public class Pedido extends javax.swing.JFrame {

    
    public Pedido() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pedido = new javax.swing.JDesktopPane();
        jLabelProd = new javax.swing.JLabel();
        jTextFieldProd = new javax.swing.JTextField();
        jLabelQuant = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldQuant = new javax.swing.JTextField();
        jLabelid = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jButtonPedir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pedido.setForeground(new java.awt.Color(255, 255, 255));

        jLabelProd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelProd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProd.setText("Produto");

        jTextFieldProd.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdActionPerformed(evt);
            }
        });

        jLabelQuant.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQuant.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuant.setText("Quantidade");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pedido");

        jTextFieldQuant.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantActionPerformed(evt);
            }
        });

        jLabelid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelid.setForeground(new java.awt.Color(255, 255, 255));
        jLabelid.setText("Cod");

        jTextFieldCod.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jButtonPedir.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPedir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonPedir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedir.setText("Pedir");
        jButtonPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedirActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Excluir");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelMarca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setText("Marca");

        jTextFieldMarca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Preço");

        jTextFieldPreco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
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

        Pedido.setLayer(jLabelProd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jTextFieldProd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jLabelQuant, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jTextFieldQuant, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jLabelid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jTextFieldCod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jButtonPedir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jButtonCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jLabelMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jTextFieldMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jTextFieldPreco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pedido.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PedidoLayout = new javax.swing.GroupLayout(Pedido);
        Pedido.setLayout(PedidoLayout);
        PedidoLayout.setHorizontalGroup(
            PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PedidoLayout.createSequentialGroup()
                        .addComponent(jLabelid)
                        .addGap(88, 88, 88)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PedidoLayout.createSequentialGroup()
                        .addComponent(jLabelQuant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelProd))
                .addGap(35, 35, 35)
                .addGroup(PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PedidoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldPreco)
                        .addGap(40, 40, 40))
                    .addGroup(PedidoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButtonPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(332, 332, 332))
        );
        PedidoLayout.setVerticalGroup(
            PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelid)
                    .addComponent(jLabelProd)
                    .addComponent(jTextFieldProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuant)
                    .addComponent(jTextFieldQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonPedir)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pedido, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pedido)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProdActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedirActionPerformed
        java.sql.Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root","");
        }
        catch (ClassNotFoundException | SQLException e) {
            throw new java.lang.RuntimeException("erro ao conectar");
        }
        String cod = this.jTextFieldCod.getText();
        String produto = this.jTextFieldProd.getText();
        String quantidade = this.jTextFieldQuant.getText();
        String marca = this.jTextFieldMarca.getText();
        String preco = this.jTextFieldPreco.getText();
       
       

        String comando = "insert into pedido (cod, produto, quantidade, marca, preco)" +
        "values " + "('"+cod+"','" +produto+"','"+quantidade+"','"+marca+"','"+preco+"')";

        try(    java.sql.Statement stmt = con.createStatement()) {
            stmt.executeUpdate(comando);
        }
        catch(java.sql.SQLException e){
            throw new java.lang.RuntimeException(e.getMessage());
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(jTextFieldCod.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        }
        catch (Exception e) {
            throw new java.lang.RuntimeException("erro fechar");
        }
    }//GEN-LAST:event_jButtonPedirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja?useTimezone=true&serverTimezone=UTC", "root", "");

            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM pedido WHERE cod='" + this.jTextFieldCod.getText() + "'");
            JOptionPane.showMessageDialog(rootPane, "Pedido excluído");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantActionPerformed

    private void jTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Pedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPedir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelProd;
    private javax.swing.JLabel jLabelQuant;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldProd;
    private javax.swing.JTextField jTextFieldQuant;
    // End of variables declaration//GEN-END:variables
}
