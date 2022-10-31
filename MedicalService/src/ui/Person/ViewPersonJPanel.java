package ui.Person;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Person;

/**
 *
 * @author Rishabh
 */
public class ViewPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonJPanel
     */
    private JPanel userProcessContainer;
    private Person person;
    private Boolean editable = Boolean.FALSE;

    public ViewPersonJPanel(JPanel userProcessContainer, Person person, Boolean editable) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        this.editable = editable;

        isDigit("");
        isLetter("");
        populatePersonDetails();
        updatePersonDetails(this.editable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lblPersonMgmt = new javax.swing.JLabel();
    lblFName = new javax.swing.JLabel();
    lblAge = new javax.swing.JLabel();
    txtFName = new javax.swing.JTextField();
    txtAge = new javax.swing.JTextField();
    btnSave = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    btnBack = new javax.swing.JButton();
    lblLName = new javax.swing.JLabel();
    txtLName = new javax.swing.JTextField();

    setBackground(new java.awt.Color(102, 153, 255));

    lblPersonMgmt.setFont(new java.awt.Font("Operator Mono", 1, 24)); // NOI18N
    lblPersonMgmt.setForeground(new java.awt.Color(255, 255, 255));
    lblPersonMgmt.setText("Person Details");

    lblFName.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
    lblFName.setForeground(new java.awt.Color(255, 255, 255));
    lblFName.setText("First Name");

    lblAge.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
    lblAge.setForeground(new java.awt.Color(255, 255, 255));
    lblAge.setText("Age");

    txtFName.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

    txtAge.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

    btnSave.setBackground(new java.awt.Color(51, 102, 255));
    btnSave.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
    btnSave.setForeground(new java.awt.Color(255, 255, 255));
    btnSave.setText("Save");
    btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaveActionPerformed(evt);
      }
    });

    btnUpdate.setBackground(new java.awt.Color(51, 102, 255));
    btnUpdate.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
    btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
    btnUpdate.setText("Update");
    btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    btnBack.setBackground(new java.awt.Color(51, 102, 255));
    btnBack.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
    btnBack.setForeground(new java.awt.Color(255, 255, 255));
    btnBack.setText("<- Back");
    btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt);
      }
    });

    lblLName.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
    lblLName.setForeground(new java.awt.Color(255, 255, 255));
    lblLName.setText("Last Name");

    txtLName.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(68, 68, 68)
            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(243, 243, 243)
            .addComponent(lblPersonMgmt))
          .addGroup(layout.createSequentialGroup()
            .addGap(250, 250, 250)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addContainerGap(297, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblPersonMgmt)
          .addComponent(btnBack))
        .addGap(53, 53, 53)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblFName))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblLName))
        .addGap(11, 11, 11)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblAge))
        .addGap(45, 45, 45)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSave)
          .addComponent(btnUpdate))
        .addContainerGap(295, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // validations
        if (txtFName.getText().
                trim().
                equals("") || txtLName.getText().
                trim().
                equals("") || txtAge.getText().
                trim().
                equals("") || !isLetter(txtFName.getText()) || !isLetter(txtLName.
                getText()) || !isDigit(txtAge.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter appropriate values!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        person.setFirstName(txtFName.getText());
        person.setLastName(txtLName.getText());
        person.setAge(Integer.parseInt(txtAge.getText()));
        JOptionPane.showMessageDialog(this, "Successfully updated person details!",
                "Update", JOptionPane.INFORMATION_MESSAGE);
        updatePersonDetails(false);
  }//GEN-LAST:event_btnSaveActionPerformed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updatePersonDetails(true);
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnSave;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JLabel lblAge;
  private javax.swing.JLabel lblFName;
  private javax.swing.JLabel lblLName;
  private javax.swing.JLabel lblPersonMgmt;
  private javax.swing.JTextField txtAge;
  private javax.swing.JTextField txtFName;
  private javax.swing.JTextField txtLName;
  // End of variables declaration//GEN-END:variables

    private void populatePersonDetails() {
        txtFName.setText(person.getFirstName());
        txtLName.setText(person.getLastName());
        txtAge.setText(String.valueOf(person.getAge()));
    }

    private void updatePersonDetails(Boolean editable) {
        if (editable) {
            txtFName.setEnabled(true);
            txtLName.setEnabled(true);
            txtAge.setEnabled(true);
        } else {
            txtFName.setEnabled(false);
            txtLName.setEnabled(false);
            txtAge.setEnabled(false);
        }
    }

    private boolean isDigit(String s) {
        char[] chArr = s.toCharArray();
        for (char c : chArr) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isLetter(String s) {
        char[] chArr = s.toCharArray();
        for (char c : chArr) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
