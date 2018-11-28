package Sorting;

import javax.swing.DefaultListModel;

public class RandomNumberSorterAssignment extends javax.swing.JFrame {

    DefaultListModel numbers;
    int nums[] = new int[50000];
    boolean clickable = false;

    public RandomNumberSorterAssignment() {
        initComponents();
        numbers = new DefaultListModel();
        //connect to list
        txtoutput.setModel(numbers);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngenerate = new javax.swing.JButton();
        btnbubble = new javax.swing.JButton();
        btnselectionsort = new javax.swing.JButton();
        btninsertion = new javax.swing.JButton();
        btnquick = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JList<>();
        lbloutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btngenerate.setText("Generate Numbers");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        btnbubble.setText("Bubble Sort");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnselectionsort.setText("Selection Sort");
        btnselectionsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectionsortActionPerformed(evt);
            }
        });

        btninsertion.setText("Insertion Sort");
        btninsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertionActionPerformed(evt);
            }
        });

        btnquick.setText("Quick Sort");
        btnquick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquickActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtoutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbloutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btngenerate)
                            .addComponent(btnbubble)
                            .addComponent(btnquick)
                            .addComponent(btninsertion)
                            .addComponent(btnselectionsort))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btngenerate)
                        .addGap(27, 27, 27)
                        .addComponent(btnbubble)
                        .addGap(35, 35, 35)
                        .addComponent(btnselectionsort)
                        .addGap(28, 28, 28)
                        .addComponent(btninsertion)
                        .addGap(30, 30, 30)
                        .addComponent(btnquick)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbloutput, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        numbers.clear();
        clickable = true;
        for (int i = 0; i < 50000; i++) {
            nums[i] = RNG();
            numbers.addElement(nums[i]);
        }

    }//GEN-LAST:event_btngenerateActionPerformed

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
        if (clickable) {
            numbers.clear();
            long totalRuntime = 0;
            long startTime = System.currentTimeMillis();
            bubbleSort(nums);
            long endTime = System.currentTimeMillis();
            totalRuntime = (endTime - startTime);
            for (int s : nums) {
                numbers.addElement(s);
            }
            clickable = false;
            lbloutput.setText("BubbleSort on average took " + totalRuntime + " milliseconds");
        } else {
            lbloutput.setText("Please generate new numbers.");
        }
    }//GEN-LAST:event_btnbubbleActionPerformed

    private void btnselectionsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectionsortActionPerformed
        if (clickable) {
            numbers.clear();
            long totalRuntime = 0;
            long startTime = System.currentTimeMillis();
            selectionSort(nums);
            long endTime = System.currentTimeMillis();
            totalRuntime = (endTime - startTime);
            for (int s : nums) {
                numbers.addElement(s);
            }
            clickable = false;
            lbloutput.setText("SelectionSort on average took " + totalRuntime + " milliseconds");
        } else {
            lbloutput.setText("Please generate new numbers.");
        }
    }//GEN-LAST:event_btnselectionsortActionPerformed

    private void btninsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertionActionPerformed
        if (clickable) {
            numbers.clear();
            long totalRuntime = 0;
            long startTime = System.currentTimeMillis();
            insertionSort(nums);
            long endTime = System.currentTimeMillis();
            totalRuntime = (endTime - startTime);
            for (int s : nums) {
                numbers.addElement(s);
            }
            clickable = false;
            lbloutput.setText("InsertionSort on average took " + totalRuntime + " milliseconds");
        } else {
            lbloutput.setText("Please generate new numbers.");
        }
    }//GEN-LAST:event_btninsertionActionPerformed

    private void btnquickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquickActionPerformed
        if (clickable) {
            numbers.clear();
            long totalRuntime = 0;
            long startTime = System.currentTimeMillis();
            quickSort(nums, 0, nums.length -1);
            long endTime = System.currentTimeMillis();
            totalRuntime = (endTime - startTime);
            for (int s : nums) {
                numbers.addElement(s);
            }
            clickable = false;
            lbloutput.setText("InsertionSort on average took " + totalRuntime + " milliseconds");
        } else {
            lbloutput.setText("Please generate new numbers.");
        }
    }//GEN-LAST:event_btnquickActionPerformed

    public static int RNG() {

        int rng = (int) (Math.random() * 50000 + 1);

        return rng;
    }
/////////////////////////////////////////////////////////////////
    void quickSort (int [] a, int left, int right){
        if (left >= right) return;
        
        int i = left;
        int j = right;
        int pivotValue = a[(left+right) / 2];
        while ( i < j){
            while (a[i] < pivotValue) i++;
            while (pivotValue < a[j]) j--;
            if (i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        quickSort (a, left, j);
        quickSort (a, i, right);
        
    }

////////////////////////////////////////////////////////////////
    public static void bubbleSort(int[] a) {
        int k = 0;
        boolean exchangeMade = true;
        // Make up to n - 1 passes through array, exit 
        //early if no exchanges are made on previous pass

        while ((k < a.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    exchangeMade = true;
                }//end if
            }//end for
        }//end while
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

//supporting swap method (same as bubble sort swap)
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

/////////////////////////////////////////////////////////////
    public static void insertionSort(int a[]) {
        int itemToInsert, j;
        boolean stillLooking;

        //on the kth pass, pass item k upwards in list
        //and insert it in its proper place amoung the
        //first k entries in an array
        for (int k = 1; k < a.length; k++) {
            //move backwards through list, looking for
            //the right place to insert a[k];
            itemToInsert = a[k];
            j = k - 1;
            stillLooking = true;
            while (j >= 0 && stillLooking) {
                if (itemToInsert < a[j]) {
                    //move item higher
                    a[j + 1] = a[j];
                    j--;
                } else {
                    //we have found new home for a[k];
                    stillLooking = false;
                }//end else// j+1 is where the item goes
                a[j + 1] = itemToInsert;
            }//end while
        }//end for
    }//end method

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
            java.util.logging.Logger.getLogger(RandomNumberSorterAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomNumberSorterAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomNumberSorterAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomNumberSorterAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandomNumberSorterAssignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btninsertion;
    private javax.swing.JButton btnquick;
    private javax.swing.JButton btnselectionsort;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbloutput;
    private javax.swing.JList<String> txtoutput;
    // End of variables declaration//GEN-END:variables
}
