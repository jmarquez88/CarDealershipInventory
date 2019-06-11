/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataAccess.InventoryFileReader;
import Model.Car;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author msalehan
 */
public class ViewCarForm extends javax.swing.JFrame {
private Car car;
private ArrayList<Car> cars;
    
    /**
     * Creates new form AddCarForm
     */
    public ViewCarForm() {
        initComponents();
    }
    
    public ViewCarForm (ArrayList<Car> cars, Car car){
        initComponents();
        this.car = car;
        this.cars = cars;
        populatecars();
        
        
    }
    public void populatecars(){
        jLabelMake.setText(car.getMake());
        jLabelModel.setText(car.getModel());
        jLabelYear.setText(car.getYear()+"");
        jLabelPrice.setText(car.getPrice()+"");
        jLabelColor.setText(car.getColor());
        jLabelType.setText(car.getType()+"");
        jLabelMiles.setText("23,000");
        jLabelEngineCapacity.setText(car.getEngine().getCapacity() + "");
        jLabelFuelType.setText(car.getEngine().getFuelType()+"");
        jLabelNoOfCylinders.setText(car.getEngine().getNoOfCylinders()+"");
        jLabelHorsePower.setText(car.getEngine().getHorsePower()+"");
        jLabelMPG.setText(car.getEngine().getMpg()+"");
        jLabelInterrorColor1.setText(car.getInterior().getColor1()+"");
        jLabelInteriorColor2.setText(car.getInterior().getColor2()+"");
        if (car.getInterior().getSunRoof()==true)
            jCheckBoxSunRoof.setSelected(true);
        if (car.getInterior().getMoonRoof()==true)
            jCheckBoxMoonRoof.setSelected(true);
        if (car.getInterior().getPanoramicView()==true)
            jCheckBoxPanoramicRoof.setSelected(true);
       if (car.getTrunk().getSpareTire()==true)
           jCheckBoxSpareTire.setSelected(true);
        if (car.getTrunk().getCarpet()==true)
           jCheckBoxTrunkCarpet.setSelected(true);
        if (car.getTrunk().getJack()==true)
            jCheckBoxJack.setSelected(true);
       if (car.getTrunk().getFirstAidKit()==true)
            jCheckBoxFirstAidKit.setSelected(true);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCheckBoxSunRoof = new javax.swing.JCheckBox();
        jCheckBoxMoonRoof = new javax.swing.JCheckBox();
        jCheckBoxPanoramicRoof = new javax.swing.JCheckBox();
        jCheckBoxSpareTire = new javax.swing.JCheckBox();
        jCheckBoxTrunkCarpet = new javax.swing.JCheckBox();
        jCheckBoxJack = new javax.swing.JCheckBox();
        jCheckBoxFirstAidKit = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelMake = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelYear = new javax.swing.JLabel();
        jLabelModel = new javax.swing.JLabel();
        jLabelInterrorColor1 = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jLabelMiles = new javax.swing.JLabel();
        jLabelFuelType = new javax.swing.JLabel();
        jLabelNoOfCylinders = new javax.swing.JLabel();
        jLabelEngineCapacity = new javax.swing.JLabel();
        jLabelHorsePower = new javax.swing.JLabel();
        jLabelMPG = new javax.swing.JLabel();
        jLabelInteriorColor2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Car Information");

        jLabel1.setText("Make:");
        jLabel1.setFocusable(false);
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Interior color 2:");
        jLabel2.setFocusable(false);
        jLabel2.setName("jLabel27"); // NOI18N

        jLabel3.setText("Model:");
        jLabel3.setFocusable(false);
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("Interior color 1:");
        jLabel4.setFocusable(false);
        jLabel4.setName("jLabel25"); // NOI18N

        jLabel5.setText("Miles per gallon:");
        jLabel5.setFocusable(false);
        jLabel5.setName("jLabel23"); // NOI18N

        jLabel6.setText("Year:");
        jLabel6.setFocusable(false);
        jLabel6.setName("jLabel5"); // NOI18N

        jLabel7.setText("Color:");
        jLabel7.setToolTipText("");
        jLabel7.setFocusable(false);
        jLabel7.setName("jLabel9"); // NOI18N

        jLabel8.setText("Price:");
        jLabel8.setFocusable(false);
        jLabel8.setName("jLabel7"); // NOI18N

        jLabel9.setText("Miles:");
        jLabel9.setFocusable(false);
        jLabel9.setName("jLabel13"); // NOI18N

        jLabel10.setText("Type:");
        jLabel10.setFocusable(false);
        jLabel10.setName("jLabel11"); // NOI18N

        jLabel11.setText("Fuel Type:");
        jLabel11.setFocusable(false);
        jLabel11.setName("jLabel15"); // NOI18N

        jLabel12.setText("No of cylinders:");
        jLabel12.setFocusable(false);
        jLabel12.setName("jLabel17"); // NOI18N

        jLabel13.setText("Engine capacity:");
        jLabel13.setFocusable(false);
        jLabel13.setName("jLabel19"); // NOI18N

        jLabel14.setText("Horse power:");
        jLabel14.setFocusable(false);
        jLabel14.setName("jLabel21"); // NOI18N

        jCheckBoxSunRoof.setText("Sun roof");
        jCheckBoxSunRoof.setFocusable(false);

        jCheckBoxMoonRoof.setText("Moon roof");
        jCheckBoxMoonRoof.setFocusable(false);

        jCheckBoxPanoramicRoof.setText("Panoramic roof");
        jCheckBoxPanoramicRoof.setFocusable(false);

        jCheckBoxSpareTire.setText("Spare tire");
        jCheckBoxSpareTire.setFocusable(false);

        jCheckBoxTrunkCarpet.setText("Trunk carpet");
        jCheckBoxTrunkCarpet.setFocusable(false);

        jCheckBoxJack.setText("Jack");
        jCheckBoxJack.setFocusable(false);

        jCheckBoxFirstAidKit.setText("First aid kit");
        jCheckBoxFirstAidKit.setFocusable(false);

        jButton1.setText("Close");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove From Inventory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelMake.setText("jLabel15");
        jLabelMake.setName("jLabel2"); // NOI18N
        jLabelMake.setVerifyInputWhenFocusTarget(false);

        jLabelPrice.setText("jLabel15");
        jLabelPrice.setName("jLabel8"); // NOI18N
        jLabelPrice.setOpaque(true);

        jLabelYear.setText("jLabel15");
        jLabelYear.setName("jLabel6"); // NOI18N

        jLabelModel.setText("jLabel15");
        jLabelModel.setName(""); // NOI18N

        jLabelInterrorColor1.setText("jLabel15");
        jLabelInterrorColor1.setName("jLabel26"); // NOI18N

        jLabelColor.setText("jLabel15");
        jLabelColor.setName("jLabel10"); // NOI18N

        jLabelType.setText("jLabel15");
        jLabelType.setName("jLabel12"); // NOI18N

        jLabelMiles.setText("jLabel15");
        jLabelMiles.setName("jLabel14"); // NOI18N

        jLabelFuelType.setText("jLabel15");
        jLabelFuelType.setName("jLabel16"); // NOI18N

        jLabelNoOfCylinders.setText("jLabel15");
        jLabelNoOfCylinders.setName("jLabel18"); // NOI18N

        jLabelEngineCapacity.setText("jLabel15");
        jLabelEngineCapacity.setName("jLabel20"); // NOI18N

        jLabelHorsePower.setText("jLabel15");
        jLabelHorsePower.setName("jLabel22"); // NOI18N

        jLabelMPG.setText("jLabel15");
        jLabelMPG.setName("jLabel24"); // NOI18N

        jLabelInteriorColor2.setText("jLabel15");
        jLabelInteriorColor2.setName("jLabelInteriorColor2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMiles)
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelInteriorColor2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelModel)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabelColor))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabelFuelType))))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(210, 210, 210)
                                        .addComponent(jLabelHorsePower)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelPrice)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelMake)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelYear))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelType)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNoOfCylinders))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInterrorColor1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxSunRoof)
                                    .addComponent(jCheckBoxJack))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxFirstAidKit)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxMoonRoof)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxPanoramicRoof)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxSpareTire)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxTrunkCarpet))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEngineCapacity)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(337, 337, 337)
                                .addComponent(jLabelMPG)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabelMake))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jLabelModel)
                        .addComponent(jLabelYear)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabelPrice))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)
                        .addComponent(jLabelType))
                    .addComponent(jLabelColor))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabelMiles)
                    .addComponent(jLabelFuelType)
                    .addComponent(jLabelNoOfCylinders))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5)
                    .addComponent(jLabelEngineCapacity)
                    .addComponent(jLabelMPG)
                    .addComponent(jLabelHorsePower))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabelInteriorColor2)
                    .addComponent(jLabelInterrorColor1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSunRoof)
                    .addComponent(jCheckBoxMoonRoof)
                    .addComponent(jCheckBoxPanoramicRoof)
                    .addComponent(jCheckBoxSpareTire)
                    .addComponent(jCheckBoxTrunkCarpet))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxJack)
                    .addComponent(jCheckBoxFirstAidKit))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabelMake.getAccessibleContext().setAccessibleName("");
        jLabelPrice.getAccessibleContext().setAccessibleName("");
        jLabelYear.getAccessibleContext().setAccessibleName("");
        jLabelModel.getAccessibleContext().setAccessibleName("");
        jLabelInterrorColor1.getAccessibleContext().setAccessibleName("");
        jLabelColor.getAccessibleContext().setAccessibleName("");
        jLabelType.getAccessibleContext().setAccessibleName("");
        jLabelMiles.getAccessibleContext().setAccessibleName("");
        jLabelFuelType.getAccessibleContext().setAccessibleName("");
        jLabelNoOfCylinders.getAccessibleContext().setAccessibleName("");
        jLabelEngineCapacity.getAccessibleContext().setAccessibleName("");
        jLabelHorsePower.getAccessibleContext().setAccessibleName("");
        jLabelMPG.getAccessibleContext().setAccessibleName("");
        jLabelInteriorColor2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        try {
            MainForm Mform = new MainForm();
            Mform.setVisible(false);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(ViewCarForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        InventoryFileReader iReader = new InventoryFileReader();
        
        iReader.removeCar(cars, car);
        
        JOptionPane.showMessageDialog(this, "Removed Vehicle!");
        this.setVisible(false);
        MainForm mForm;
    try {
        mForm = new MainForm();
        mForm.setVisible(false);
    } catch (IOException ex) {
        Logger.getLogger(ViewCarForm.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxFirstAidKit;
    private javax.swing.JCheckBox jCheckBoxJack;
    private javax.swing.JCheckBox jCheckBoxMoonRoof;
    private javax.swing.JCheckBox jCheckBoxPanoramicRoof;
    private javax.swing.JCheckBox jCheckBoxSpareTire;
    private javax.swing.JCheckBox jCheckBoxSunRoof;
    private javax.swing.JCheckBox jCheckBoxTrunkCarpet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelEngineCapacity;
    private javax.swing.JLabel jLabelFuelType;
    private javax.swing.JLabel jLabelHorsePower;
    private javax.swing.JLabel jLabelInteriorColor2;
    private javax.swing.JLabel jLabelInterrorColor1;
    private javax.swing.JLabel jLabelMPG;
    private javax.swing.JLabel jLabelMake;
    private javax.swing.JLabel jLabelMiles;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelNoOfCylinders;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelYear;
    // End of variables declaration//GEN-END:variables
}
