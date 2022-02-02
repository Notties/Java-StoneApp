/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectStone;

import com.sun.istack.internal.logging.Logger;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cHaRgE
 */
public class Home extends javax.swing.JFrame {

    static dataStone ds = new dataStone();
    
    /**
     * Creates new form Home
     */
    public Home() {
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

        JPmenu = new javax.swing.JPanel();
        stpg = new javax.swing.JLabel();
        bthome = new javax.swing.JButton();
        btstone = new javax.swing.JButton();
        btmodify = new javax.swing.JButton();
        btsearch = new javax.swing.JButton();
        JPbg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stone");

        JPmenu.setBackground(new java.awt.Color(62, 54, 63));

        stpg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stpg.setForeground(new java.awt.Color(255, 255, 255));
        stpg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/icons8_rock_24px_2.png"))); // NOI18N
        stpg.setText(" STONE PROGRAM");

        bthome.setBackground(new java.awt.Color(125, 145, 38));
        bthome.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        bthome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/icons8_home_24px.png"))); // NOI18N
        bthome.setText("Home");
        bthome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthomeActionPerformed(evt);
            }
        });

        btstone.setBackground(new java.awt.Color(125, 145, 38));
        btstone.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        btstone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/icons8_coal_24px_1.png"))); // NOI18N
        btstone.setText("Stone");
        btstone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstoneActionPerformed(evt);
            }
        });

        btmodify.setBackground(new java.awt.Color(125, 145, 38));
        btmodify.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        btmodify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/icons8_edit_24px.png"))); // NOI18N
        btmodify.setText("Modify");
        btmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodifyActionPerformed(evt);
            }
        });

        btsearch.setBackground(new java.awt.Color(125, 145, 38));
        btsearch.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        btsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/icons8_search_24px_1.png"))); // NOI18N
        btsearch.setText("Search");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPmenuLayout = new javax.swing.GroupLayout(JPmenu);
        JPmenu.setLayout(JPmenuLayout);
        JPmenuLayout.setHorizontalGroup(
            JPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stpg, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(bthome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btstone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btmodify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPmenuLayout.setVerticalGroup(
            JPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPmenuLayout.createSequentialGroup()
                .addComponent(stpg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(bthome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btstone, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmodify, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPbg.setBackground(new java.awt.Color(255, 252, 232));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Capture.JPG"))); // NOI18N

        javax.swing.GroupLayout JPbgLayout = new javax.swing.GroupLayout(JPbg);
        JPbg.setLayout(JPbgLayout);
        JPbgLayout.setHorizontalGroup(
            JPbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbgLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(183, 183, 183))
        );
        JPbgLayout.setVerticalGroup(
            JPbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbgLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1296, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void bthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthomeActionPerformed
        
    }//GEN-LAST:event_bthomeActionPerformed

    private void btstoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstoneActionPerformed
        stone[] st = ds.getStones();
        int index = ds.getIndex();
        new showstone(st,index).setVisible(true);
    }//GEN-LAST:event_btstoneActionPerformed

    private void btmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodifyActionPerformed
        new modifystone().setVisible(true);
    }//GEN-LAST:event_btmodifyActionPerformed

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        stone sout = ds.search(JOptionPane.showInputDialog("Enter Student ID"));
        if(sout!=null){
            String output = "Show Information Stone\n";
            output += "Stone ID : "+sout.getid()+"\nStone Name : "+sout.getname()+"\nStone Type : "+sout.gettype()+"\nStone Picture Path : "+sout.getpic()+"\nStone Detail : "+sout.getdetail();
            
            //JOptionPane.showMessageDialog(null,output);
            new searchstone(output,sout.getpic()).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"No Stone ID");
        }
    }//GEN-LAST:event_btsearchActionPerformed

    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPbg;
    private javax.swing.JPanel JPmenu;
    private javax.swing.JButton bthome;
    private javax.swing.JButton btmodify;
    private javax.swing.JButton btsearch;
    private javax.swing.JButton btstone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel stpg;
    // End of variables declaration//GEN-END:variables
}
