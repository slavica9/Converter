/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Slavica
 */
public class Brzina extends javax.swing.JPanel {

    /**
     * Creates new form Brzina
     */
    public Brzina() {
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
        secondValuteLabel = new javax.swing.JLabel();
        secondValuteBox = new javax.swing.JComboBox();
        firstAmountLabel = new javax.swing.JLabel();
        firstValuteBox = new javax.swing.JComboBox();
        secondAmountLabel = new javax.swing.JLabel();
        secondAmountField = new javax.swing.JTextField();
        firstAmountField = new javax.swing.JTextField();
        firstValuteLabel = new javax.swing.JLabel();
        button = new javax.swing.JButton();

        setName("Brzina"); // NOI18N

        jPanel1.setName("Tezina"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        secondValuteLabel.setText("Second Valute");

        secondValuteBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metar/sekund", "Kilometar/sat", "Milja/sat", "Cvorova", "Maha" }));

        firstAmountLabel.setText("amount");

        firstValuteBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metar/sekund", "Kilometar/sat", "Milja/sat", "Cvorova", "Maha" }));

        secondAmountLabel.setText("amount");

        firstValuteLabel.setText("First Valute");

        button.setText("Convert");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secondAmountLabel)
                    .addComponent(secondValuteLabel)
                    .addComponent(firstAmountLabel)
                    .addComponent(firstValuteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstAmountField)
                    .addComponent(secondAmountField)
                    .addComponent(firstValuteBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondValuteBox, 0, 390, Short.MAX_VALUE)))
            .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstValuteLabel)
                    .addComponent(firstValuteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstAmountLabel)
                    .addComponent(firstAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondValuteLabel)
                    .addComponent(secondValuteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondAmountLabel)
                    .addComponent(secondAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(128, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(this);

        if(firstAmountField.getText().isEmpty())
        {
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Unesite vrijednosti");
            frame.setVisible(false);
        }
        else if(firstAmountField.getText().charAt(0) == '-'){
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Unesite pozitivnu vrijednost");
            frame.setVisible(false);
            firstAmountField.setText("");
            firstAmountField.grabFocus();
        }
        else if(!Valute.parsable(firstAmountField.getText()))
        {
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Unesite ispravno vrijednost");
            frame.setVisible(false);
            firstAmountField.setText("");
            firstAmountField.grabFocus();
        }else{
            Double vrijednost = Double.parseDouble(firstAmountField.getText());
            double value1 = getConvertFactor(firstValuteBox.getSelectedItem().toString());
            double value2 = getConvertFactor(secondValuteBox.getSelectedItem().toString());
            Double temp = vrijednost*(value2/value1);

            String tempString = temp.toString();
            int index = tempString.indexOf('.');
            int rest = tempString.substring(index+1).length();
            String insert = tempString.substring(0, index+1 + ((rest <= 4)?(rest):(4)));

            secondAmountField.setText(""+insert);
        }
    }//GEN-LAST:event_buttonActionPerformed
    private double getConvertFactor(String value) {
        if(value.equals("Metar/sekund"))
            return 0.27777;
        else if(value.equals("Kilometar/sat"))
            return 1;
        else if(value.equals("Milja/sat"))
            return 0.621427;
        else if(value.equals("Cvorova"))
            return 0.540003;
        else if(value.equals("Maha"))
            return 0.000816;
        
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField firstAmountField;
    private javax.swing.JLabel firstAmountLabel;
    private javax.swing.JComboBox firstValuteBox;
    private javax.swing.JLabel firstValuteLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField secondAmountField;
    private javax.swing.JLabel secondAmountLabel;
    private javax.swing.JComboBox secondValuteBox;
    private javax.swing.JLabel secondValuteLabel;
    // End of variables declaration//GEN-END:variables
}