package InsertRemoveArraylist;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FruitArrayList extends javax.swing.JFrame {

    ArrayList<String> f = new ArrayList();
    DefaultListModel list = new DefaultListModel();

    public FruitArrayList() {
        initComponents();
        fruitList.setModel(list);
        //add fruits to list
        f.add("Apple");
        f.add("Banana");
        f.add("Mango");
        f.add("Pineapple");
        f.add("Raspberry");
        //add fruits to list model
        for (String fruit : f) {
            list.addElement(fruit);
        }

    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }
///////////////////////////////////////////////////////////////

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        fruitList = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuadd = new javax.swing.JMenuItem();
        mnuremove = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuhelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(fruitList);

        jMenu1.setText("File");

        mnuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArraylist/exit.png"))); // NOI18N
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArraylist/insert.png"))); // NOI18N
        mnuadd.setText("Add Fruit");
        mnuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuadd);

        mnuremove.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArraylist/delete.png"))); // NOI18N
        mnuremove.setText("Remove Fruit");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        mnuhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArraylist/all.png"))); // NOI18N
        mnuhelp.setText("About");
        mnuhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuhelpActionPerformed(evt);
            }
        });
        jMenu3.add(mnuhelp);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuhelpActionPerformed
        JOptionPane.showMessageDialog(this, "Fruit ArrayList program, Copyright 2018.");
    }//GEN-LAST:event_mnuhelpActionPerformed

    private void mnuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddActionPerformed
        String newfruit = JOptionPane.showInputDialog(this, "Enter name of new fruit: ");
        int loc = findInsertPoint(f, newfruit);
        //add to BOTH the ArrayList and the List Model
        f.add(loc, newfruit);
        list.add(loc, newfruit);
    }//GEN-LAST:event_mnuaddActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
        //get fruit selected from List Model
        String delfruit;
        delfruit = fruitList.getSelectedValue();
        if (delfruit == null) {
            JOptionPane.showMessageDialog(this, "Please select a fruit to delete.");
            return;
        }
        //find it in ArrayList
        int loc = search(f, delfruit);
        //remove from both f and list
        f.remove(loc);
        list.removeElementAt(loc);
    }//GEN-LAST:event_mnuremoveActionPerformed

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
            java.util.logging.Logger.getLogger(FruitArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitArrayList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> fruitList;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuadd;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuhelp;
    private javax.swing.JMenuItem mnuremove;
    // End of variables declaration//GEN-END:variables
}
