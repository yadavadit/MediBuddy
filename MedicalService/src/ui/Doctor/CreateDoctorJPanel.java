package ui.Doctor;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author Rishabh
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorJPanel
     */
    private JPanel userProcessContainer;
    private DoctorDirectory doctorDirectory;
    private HospitalDirectory hospitalDirectory;

    public CreateDoctorJPanel(JPanel userProcessContainer, DoctorDirectory doctorDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctorDirectory = doctorDirectory;
        isDigit("");
        isLetter("");
        setSize(1000, 610);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreatePerson = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFName = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        txtHospital = new javax.swing.JTextField();
        btnCreateDoctor = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        lblCreatePerson.setFont(new java.awt.Font("Operator Mono", 1, 24)); // NOI18N
        lblCreatePerson.setForeground(new java.awt.Color(255, 255, 255));
        lblCreatePerson.setText("Create Doctor Profile");

        btnBack.setBackground(new java.awt.Color(51, 102, 255));
        btnBack.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFName.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblFName.setForeground(new java.awt.Color(255, 255, 255));
        lblFName.setText("First Name");

        lblLName.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblLName.setForeground(new java.awt.Color(255, 255, 255));
        lblLName.setText("Last Name");

        lblAge.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("Age");

        lblDepartment.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(255, 255, 255));
        lblDepartment.setText("Department");

        lblHospital.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblHospital.setForeground(new java.awt.Color(255, 255, 255));
        lblHospital.setText("Hospital");

        txtFName.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        txtAge.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        txtLName.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        txtDepartment.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        txtHospital.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        btnCreateDoctor.setBackground(new java.awt.Color(51, 102, 255));
        btnCreateDoctor.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnCreateDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHospital, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDepartment, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLName, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txtFName)
                    .addComponent(txtAge)
                    .addComponent(txtDepartment)
                    .addComponent(txtHospital))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnBack)
                        .addGap(180, 180, 180)
                        .addComponent(lblCreatePerson))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(btnCreateDoctor)))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePerson)
                    .addComponent(btnBack))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLName)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepartment)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospital)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnCreateDoctor)
                .addGap(117, 117, 117))
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        if (checkIsEmpty() == true) {
            Doctor doctor = doctorDirectory.AddDoctor();
            Hospital hospital = new Hospital();
            doctor.setFirstName(txtFName.getText());
            doctor.setLastName(txtLName.getText());
            doctor.setAge(Integer.parseInt(txtAge.getText()));
            doctor.setDepartment(txtDepartment.getText());
            hospital.setName(txtHospital.getText());
            hospital.setDoctorDirectory(doctorDirectory);
            doctor.setHospital(hospital);

//            hospital.getDoctorDirectory().printDoctors();
//            System.out.println(d.);
//            doctor.setHospital(hospital);
            JOptionPane.showMessageDialog(this, "Successfully added a new doctor!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearInput();
        } else {
            JOptionPane.showMessageDialog(this, "Please enter valid values in respective fields!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
  }//GEN-LAST:event_btnCreateDoctorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCreatePerson;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblLName;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtLName;
    // End of variables declaration//GEN-END:variables

    private Boolean checkIsEmpty() {
        if (txtFName.getText().
                length() == 0 || txtLName.getText().
                        length() == 0 || txtAge.getText().
                        length() == 0 || txtDepartment.getText().
                        length() == 0 || txtHospital.getText().
                        length() == 0) {
            return false;
        } else if ((!isLetter(txtFName.getText()))
                || (!isLetter(txtLName.getText())) || (!isLetter(txtDepartment.getText()))
                || (!isLetter(txtHospital.getText()))
                || (!isDigit(txtAge.getText()))) {
            return false;
        }
        return true;
    }

    private void clearInput() {
        txtFName.setText("");
        txtLName.setText("");
        txtAge.setText("");
        txtDepartment.setText("");
        txtHospital.setText("");

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
