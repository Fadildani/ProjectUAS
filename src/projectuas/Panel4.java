/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dwiaj
 */
public class Panel4 extends javax.swing.JFrame {
    public ArrayList menu = new ArrayList();
    public ArrayList total = new ArrayList();
    int i = 0;
    int sum = 0;

    /**
     * Creates new form Panel4
     */
    public Panel4() {
        initComponents();
    }
    
    public Panel4(String menu1, String menu2, String menu3, String menu4, String menu5, String menu6, int tkalori1,int tkalori2,int tkalori3,int tkalori4,int tkalori5,int tkalori6) {
        
    }
    public Panel4(int tkalori1, int tkalori2, int tkalori3, int tkalori4, int tkalori5, int tkalori6){
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCalori = new javax.swing.JTable();
        labelDeklarasi = new javax.swing.JLabel();
        button1table = new javax.swing.JButton();
        totaltextfieldpanel4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCalori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Kalori"
            }
        ));
        jScrollPane1.setViewportView(tableCalori);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 6, 266, 46));

        labelDeklarasi.setText("jLabel2");
        labelDeklarasi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelDeklarasiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(labelDeklarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 86, 280, 410));

        button1table.setText("jButton1");
        button1table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1tableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(button1table)
                .addGap(125, 125, 125)
                .addComponent(totaltextfieldpanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1table)
                    .addComponent(totaltextfieldpanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1tableActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)tableCalori.getModel();
         for(int i = 0; i < menu.size(); i++){
            model.addRow(new Object[]{
                menu.get(i),
                total.get(i)
            });
        }
       
         for (int i = 0; i<tableCalori.getRowCount(); i++){
            sum = sum + Integer.parseInt(tableCalori.getValueAt(i, 1).toString());
            totaltextfieldpanel4.setText("Total : Rp. " + Integer.toString(sum));
        }
    }//GEN-LAST:event_button1tableActionPerformed

    private void labelDeklarasiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelDeklarasiAncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_labelDeklarasiAncestorAdded

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
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDeklarasi;
    private javax.swing.JTable tableCalori;
    private javax.swing.JTextField totaltextfieldpanel4;
    // End of variables declaration//GEN-END:variables
}
