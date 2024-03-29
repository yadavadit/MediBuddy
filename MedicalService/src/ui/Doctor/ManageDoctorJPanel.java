package ui.Doctor;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Aditi Yadav
 */
public class ManageDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorDirectory
     */
    private JPanel userProcessContainer;
    private DoctorDirectory doctorDirectory;
    private PersonDirectory personDirectory;

    public ManageDoctorJPanel(JPanel userProcessContainer,
            DoctorDirectory doctorDirectory, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctorDirectory = doctorDirectory;
        this.personDirectory = personDirectory;

        isDigit("");
        isLetter("");
        ArrayList<Doctor> doctors = doctorDirectory.getDoctorDirectory();
        populateDoctorsTable(doctors);
        setSize(1000, 610);
    }

    private void populateDoctorsTable(ArrayList<Doctor> doctorList) {
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);

        if (doctorList.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No doctors found! Please add a doctor!", "Warning",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (Doctor p : doctorList) {
            Object[] row = new Object[4];
            row[0] = p;
            row[1] = p.getAge();
            row[2] = p.getDepartment();
            row[3] = p.getHospital().getName();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDoctorMgmt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDeleteDoctor = new javax.swing.JButton();
        btnViewDoctor = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        btnUpdateDoctor = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtSearchDoctor = new javax.swing.JTextField();
        btnSearchDoctor = new javax.swing.JButton();
        btnPatientVitals = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 0));

        lblDoctorMgmt.setFont(new java.awt.Font("Operator Mono", 1, 24)); // NOI18N
        lblDoctorMgmt.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorMgmt.setText("Doctor Management");

        tblDoctor.setFont(new java.awt.Font("Operator Mono", 0, 12)); // NOI18N
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Department", "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        btnRefresh.setBackground(new java.awt.Color(204, 204, 0));
        btnRefresh.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh Table");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 153, 0));
        btnBack.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteDoctor.setBackground(new java.awt.Color(51, 153, 0));
        btnDeleteDoctor.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnDeleteDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDoctor.setText("Delete Doctor");
        btnDeleteDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDoctorActionPerformed(evt);
            }
        });

        btnViewDoctor.setBackground(new java.awt.Color(51, 153, 0));
        btnViewDoctor.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnViewDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDoctor.setText("View Doctor");
        btnViewDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnCreateDoctor.setBackground(new java.awt.Color(51, 153, 0));
        btnCreateDoctor.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnCreateDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnUpdateDoctor.setBackground(new java.awt.Color(51, 153, 0));
        btnUpdateDoctor.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnUpdateDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDoctor.setText("Update Doctor");
        btnUpdateDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoctorActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtSearchDoctor.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        btnSearchDoctor.setBackground(new java.awt.Color(51, 153, 0));
        btnSearchDoctor.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnSearchDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchDoctor.setText("Search Doctor by Name");
        btnSearchDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        btnPatientVitals.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnPatientVitals.setText("Manage Patients");
        btnPatientVitals.setToolTipText("");
        btnPatientVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientVitalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(209, 209, 209)
                        .addComponent(lblDoctorMgmt))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnPatientVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addComponent(btnSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(46, 46, 46))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorMgmt)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2)))
                        .addGap(18, 18, 18)
                        .addComponent(btnPatientVitals)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchDoctor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtSearchDoctor.setText("");
        populateDoctorsTable(doctorDirectory.getDoctorDirectory());
  }//GEN-LAST:event_btnRefreshActionPerformed

  private void btnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoctorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table above!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Doctor p = (Doctor) tblDoctor.getValueAt(selectedRow, 0);
        int confirmation = JOptionPane.showConfirmDialog(this,
                "Are you sure want to remove this entry?",
                "Warning", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            doctorDirectory.deleteDoctor(p);
            populateDoctorsTable(doctorDirectory.getDoctorDirectory());
        }
  }//GEN-LAST:event_btnDeleteDoctorActionPerformed

  private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel cp = new CreateDoctorJPanel(userProcessContainer,
                doctorDirectory);
        userProcessContainer.add("CreateDoctorJPanel", cp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnCreateDoctorActionPerformed

  private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this,
                    "Please select a row from table above!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Doctor doctor = (Doctor) tblDoctor.getValueAt(selectedRow, 0);

        ViewDoctorJPanel vp = new ViewDoctorJPanel(userProcessContainer, doctor,
                Boolean.FALSE);
        userProcessContainer.add("ViewDoctorJPanel", vp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnViewDoctorActionPerformed

  private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table above!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Doctor doctor = (Doctor) tblDoctor.getValueAt(selectedRow, 0);

        ViewDoctorJPanel up = new ViewDoctorJPanel(userProcessContainer, doctor, Boolean.TRUE);
        userProcessContainer.add("UpdateDoctorJPanel", up);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnUpdateDoctorActionPerformed

  private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        // TODO add your handling code here:
        String searchStr = txtSearchDoctor.getText();
        if (searchStr.length() == 0 || (!isLetter(searchStr))) {
            JOptionPane.showMessageDialog(this, "Please enter a valid name to search!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ArrayList<Doctor> searchDoctors;
        searchDoctors = doctorDirectory.searchDoctor(searchStr);
        populateDoctorsTable(searchDoctors);
  }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private void btnPatientVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this,
                    "Please select a row from table above!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Doctor doctor = (Doctor) tblDoctor.getValueAt(selectedRow, 0);
        System.out.println("docname");
        System.out.println(doctor.getFirstName());
        String docName = doctor.getFirstName();
        ArrayList<Person> per = personDirectory.getPersonDirectory();
        for (Person pe : per) {
            System.out.println(pe.getFirstName());
        }
        ManageVitalSign mvs = new ManageVitalSign(userProcessContainer, per, docName, personDirectory);
        userProcessContainer.add("ManageVitalSign", mvs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//        ViewDoctorJPanel vp = new ViewDoctorJPanel(userProcessContainer, doctor,
//                Boolean.FALSE);
//        userProcessContainer.add("ViewDoctorJPanel", vp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPatientVitalsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnDeleteDoctor;
    private javax.swing.JButton btnPatientVitals;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JButton btnUpdateDoctor;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDoctorMgmt;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtSearchDoctor;
    // End of variables declaration//GEN-END:variables

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
