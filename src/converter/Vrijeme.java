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
public class Vrijeme extends javax.swing.JPanel {

    /**
     * Creates new form Vrijeme
     */
    public Vrijeme() {
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

        firstValuteBox = new javax.swing.JComboBox();
        firstAmountLabel = new javax.swing.JLabel();
        secondValuteBox = new javax.swing.JComboBox();
        secondValuteLabel = new javax.swing.JLabel();
        secondAmountField = new javax.swing.JTextField();
        firstAmountField = new javax.swing.JTextField();
        firstValuteLabel = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        secondAmountLabel = new javax.swing.JLabel();

        setName("Vrijeme"); // NOI18N

        firstValuteBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Milisekund", "Sekund", "Minut", "Sat", "Dan", "Sedmica", "Godina" }));

        firstAmountLabel.setText("amount");

        secondValuteBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Milisekund", "Sekund", "Minut", "Sat", "Dan", "Sedmica", "Godina" }));
        secondValuteBox.setName("Vrijeme"); // NOI18N

        secondValuteLabel.setText("Second Valute");

        firstValuteLabel.setText("First Valute");

        button.setText("Convert");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        secondAmountLabel.setText("amount");

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
                    .addComponent(secondValuteBox, 0, 382, Short.MAX_VALUE)))
            .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if(value.equals("Milisekund"))
            return  3600000;
        else if(value.equals("Sekund"))
            return 3600;
        else if(value.equals("Minut"))
            return 60;
        else if(value.equals("Sat"))
            return 1;
        else if(value.equals("Dan"))
            return 0.041667;
        else if(value.equals("Sedmica"))
            return 0.005952;
        else if(value.equals("Godina"))
            return 0.000114;
        
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField firstAmountField;
    private javax.swing.JLabel firstAmountLabel;
    private javax.swing.JComboBox firstValuteBox;
    private javax.swing.JLabel firstValuteLabel;
    private javax.swing.JTextField secondAmountField;
    private javax.swing.JLabel secondAmountLabel;
    private javax.swing.JComboBox secondValuteBox;
    private javax.swing.JLabel secondValuteLabel;
    // End of variables declaration//GEN-END:variables
}
