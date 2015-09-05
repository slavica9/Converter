package converter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Valute extends javax.swing.JPanel {
    
    public Valute() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstValuteLabel = new javax.swing.JLabel();
        firstAmountLabel = new javax.swing.JLabel();
        secondValuteLabel = new javax.swing.JLabel();
        secondAmountLabel = new javax.swing.JLabel();
        secondAmountField = new javax.swing.JTextField();
        firstAmountField = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        firstValuteBox = new javax.swing.JComboBox();
        secondValuteBox = new javax.swing.JComboBox();

        setName("Valute"); // NOI18N

        firstValuteLabel.setText("First Valute");

        firstAmountLabel.setText("amount");

        secondValuteLabel.setText("Second Valute");

        secondAmountLabel.setText("amount");

        secondAmountField.setEnabled(false);

        button.setText("Convert");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        firstValuteBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KM", "Euro", "Kuna", "Dolar", "Funta", "Dinar" }));

        secondValuteBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KM", "Euro", "Kuna", "Dolar", "Funta", "Dinar" }));

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
                    .addComponent(secondValuteBox, 0, 83, Short.MAX_VALUE)))
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
                .addComponent(button)
                .addGap(0, 5, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public static boolean parsable(String number) {
        float numb;
        try {
            if (number.charAt(0) == '+') {
                numb = Float.parseFloat(number.substring(1));
            } else {
                
                numb = Float.parseFloat(number);
            }
        } catch (NumberFormatException ee) {
            return false;
        }
        return true;
    }
    
    private double getConvertFactor(String value){
        if(value.equals("KM"))
            return 1;
        else if(value.equals("Euro"))
            return 0.5112918811962185;
        else if(value.equals("Kuna"))
            return 3.86486;
        else if(value.equals("Dolar"))
            return 0.56948;
        else if(value.equals("Funta"))
            return 0.37401;
        else if(value.equals("Dinar"))
            return 61.51756;
        return -1;
    } 
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
        else if(!parsable(firstAmountField.getText()))
        {
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Unesite ispravno vrijednost");
            frame.setVisible(false);
            firstAmountField.setText("");
            firstAmountField.grabFocus();
        }else{
            Float vrijednost = Float.parseFloat(firstAmountField.getText());
            double value1 = getConvertFactor(firstValuteBox.getSelectedItem().toString());
            double value2 = getConvertFactor(secondValuteBox.getSelectedItem().toString());
            Double temp = vrijednost*(value2/value1);
            
            String tempString = temp.toString();
            int index = tempString.indexOf('.');
            int rest = tempString.substring(index+1).length()-1;
            String insert = tempString.substring(0, index + ((rest < 4)?(rest):(4)));
            
            secondAmountField.setText(""+insert);
        }
    }//GEN-LAST:event_buttonActionPerformed


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
