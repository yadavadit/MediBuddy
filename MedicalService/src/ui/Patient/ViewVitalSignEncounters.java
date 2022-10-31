package ui.Patient;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author Rishabh
 */
public class ViewVitalSignEncounters extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalSignEncounters
     */
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private ArrayList<Person> personList;
    private String doctor;

    public ViewVitalSignEncounters(JPanel userProcessContainer, ArrayList<Person> personList, String doctor, String User) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personList = personList;
        this.doctor = doctor;

        isLetter("");

//        ArrayList<Person> persons = personDirectory.searchPerson(User);
//        populatePatientsTable(personList, doctor);
        populateEncountersTable(personList.get(0));
//        populateAbnormalTable(new ArrayList<>(), null);
//        populateCommunities(persons);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLanding = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEncounterHistory = new javax.swing.JTable();
        lblLanding2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRefreshEncounter = new javax.swing.JButton();
        btnViewEncounterDetails = new javax.swing.JButton();
        btnDeleteEncounter = new javax.swing.JButton();
        btnEditEncounter = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        lblLanding.setFont(new java.awt.Font("Operator Mono", 1, 24)); // NOI18N
        lblLanding.setForeground(new java.awt.Color(255, 255, 255));
        lblLanding.setText("Encounters & Vitals");

        tblEncounterHistory.setFont(new java.awt.Font("Operator Mono", 0, 12)); // NOI18N
        tblEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblEncounterHistory);

        lblLanding2.setFont(new java.awt.Font("Operator Mono", 1, 24)); // NOI18N
        lblLanding2.setForeground(new java.awt.Color(255, 255, 255));
        lblLanding2.setText("Encounter History");

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

        btnRefreshEncounter.setBackground(new java.awt.Color(51, 102, 255));
        btnRefreshEncounter.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnRefreshEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshEncounter.setText("Refresh");
        btnRefreshEncounter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshEncounterActionPerformed(evt);
            }
        });

        btnViewEncounterDetails.setBackground(new java.awt.Color(51, 102, 255));
        btnViewEncounterDetails.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnViewEncounterDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEncounterDetails.setText("View");
        btnViewEncounterDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewEncounterDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterDetailsActionPerformed(evt);
            }
        });

        btnDeleteEncounter.setBackground(new java.awt.Color(51, 102, 255));
        btnDeleteEncounter.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnDeleteEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEncounter.setText("Delete");
        btnDeleteEncounter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEncounterActionPerformed(evt);
            }
        });

        btnEditEncounter.setBackground(new java.awt.Color(51, 102, 255));
        btnEditEncounter.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnEditEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnEditEncounter.setText("Edit");
        btnEditEncounter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnViewEncounterDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDeleteEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLanding2)
                                .addGap(62, 62, 62)
                                .addComponent(btnRefreshEncounter)
                                .addGap(2, 2, 2)))
                        .addContainerGap(694, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                        .addComponent(lblLanding)
                        .addGap(349, 349, 349))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanding)
                    .addComponent(btnBack))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRefreshEncounter)
                    .addComponent(lblLanding2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewEncounterDetails)
                    .addComponent(btnDeleteEncounter)
                    .addComponent(btnEditEncounter))
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnDeleteEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEncounterActionPerformed
        // TODO add your handling code here:
//        int selectedRow = tblPatients.getSelectedRow();
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(this, "Please select a row from table.");
//            return;
//        }
//        Person person = (Person) tblPatients.getValueAt(selectedRow, 0);
//        Patient patient = person.getPatient();
//        if (patient == null) {
//            JOptionPane.showMessageDialog(this, "Patient not created, Please create"
//                    + " Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        selectedRow = tblEncounterHistory.getSelectedRow();
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(this, "Please select a row from table.",
//                    "Error", JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//        VitalSigns vitalSign = (VitalSigns) tblEncounterHistory.getValueAt(selectedRow, 0);
//
//        int flag = JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
//                "Warning", JOptionPane.YES_NO_OPTION);
//        if (flag == 0) {
//            patient.getVitalSignsHistory().deleteVitalSigns(vitalSign);
//            refreshEncounters();
//        }
  }//GEN-LAST:event_btnDeleteEncounterActionPerformed

  private void btnEditEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEncounterActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEncounterHistory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSigns vs = (VitalSigns) tblEncounterHistory.getValueAt(selectedRow, 0);

        ViewVitalSign vvs = new ViewVitalSign(userProcessContainer, vs, Boolean.TRUE);
        userProcessContainer.add("EditVitalSign", vvs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnEditEncounterActionPerformed

  private void btnViewEncounterDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEncounterHistory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSigns vs = (VitalSigns) tblEncounterHistory.getValueAt(selectedRow, 0);
        ViewVitalSign vvs = new ViewVitalSign(userProcessContainer, vs, Boolean.FALSE);
        userProcessContainer.add("ViewVitalSign", vvs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnViewEncounterDetailsActionPerformed

  private void btnRefreshEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshEncounterActionPerformed
        // TODO add your handling code here:
//        refreshEncounters();
  }//GEN-LAST:event_btnRefreshEncounterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteEncounter;
    private javax.swing.JButton btnEditEncounter;
    private javax.swing.JButton btnRefreshEncounter;
    private javax.swing.JButton btnViewEncounterDetails;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLanding;
    private javax.swing.JLabel lblLanding2;
    private javax.swing.JTable tblEncounterHistory;
    // End of variables declaration//GEN-END:variables

//    private void populatePatientsTable(ArrayList<Person> persons, String doctor) {
//        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
//        model.setRowCount(0);
//        if (persons.isEmpty()) {
//            JOptionPane.
//                    showMessageDialog(this, "No persons found! Please add a person to begin!",
//                            "Error", JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//        for (Person p : persons) {
//            if (doctor.equals(p.getPatient().getDoctor().getFirstName())) {
//                Object[] row = new Object[4];
//                row[0] = p;
//                row[1] = p.getAge();
//                row[3] = p.getCommunity().getCommunityName();
//                if (p.getPatient() != null) {
//                    row[2] = p.getPatient().getPatientID();
//                } else {
//                    row[2] = "Patient not created!";
//                }
//                model.addRow(row);
//            }
//        }
//    }
    private void populateEncountersTable(Person person) {
        DefaultTableModel model = (DefaultTableModel) tblEncounterHistory.getModel();
        model.setRowCount(0);
        if (person != null) {
            int age = person.getAge();

            ArrayList<VitalSigns> vitalSigns = person.getPatient().getVitalSignsHistory().getVitalsHistory();

            if (vitalSigns.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No vital signs found! Please"
                        + " add vital signs for the patient!", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            for (VitalSigns vs : vitalSigns) {
                Object[] row = new Object[2];
                row[0] = vs;
                row[1] = vitalsStatus(age, vs);
                model.addRow(row);
            }
        }
    }

//    private void populateCommunities(ArrayList<Person> persons) {
//        ArrayList<String> communityList = new ArrayList<>();
//        for (Person p : persons) {
//
//            System.out.println(p.getCommunity().getCommunityName());
//            communityList.add(p.getCommunity().getCommunityName());
//        }
//        Set<String> uComm = new HashSet<String>(communityList);
//        for (String s : uComm) {
//            cbAbnormal.addItem(s);
//        }
//    }
//    private void populateAbnormalTable(ArrayList<Person> persons, String community) {
//        DefaultTableModel model = (DefaultTableModel) tblAbnormal.getModel();
//        model.setRowCount(0);
//
//        for (Person p : persons) {
//            if (p != null) {
//                if (!p.getCommunity().
//                        getCommunityName().
//                        equalsIgnoreCase(community)) {
//                    continue;
//                }
//                int age = p.getAge();
//                ArrayList<VitalSigns> vitalSigns = p.getPatient().
//                        getVitalSignsHistory().
//                        getVitalsHistory();
//                if (vitalSigns.isEmpty()) {
//                    continue;
//                }
//
//                String vStatus = vitalsStatus(age, vitalSigns.get(vitalSigns.size() - 1));
//                if (vStatus.equalsIgnoreCase("Abnormal")) {
//                    Object[] row = new Object[2];
//                    row[0] = community;
//                    row[1] = vStatus;
//                    model.addRow(row);
//                }
//            }
//        }
//        if (model.getRowCount() == 0) {
//            JOptionPane.showMessageDialog(this, "No abnormal persons found!", "Info",
//                    JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//    }
    private String vitalsStatus(int age, VitalSigns vs) {
        String status = "Normal";

        double spo2 = vs.getOxygenSaturation();
        double heartRate = vs.getHeartRate();
        double bloodPressure = vs.getBloodPressure();
        double weight = vs.getWeight();

        if (age >= 1 && age <= 3) {
            if ((spo2 < 98)
                    || (heartRate < 80 || heartRate > 130)
                    || (bloodPressure < 80 || bloodPressure > 110)
                    || (weight < 22 || weight > 31)) {
                status = "Abnormal";
            }
        }

        if (age >= 4 && age <= 5) {
            if ((spo2 < 90)
                    || (heartRate < 80 || heartRate > 120)
                    || (bloodPressure < 80 || bloodPressure > 110)
                    || (weight < 31 || weight > 40)) {
                status = "Abnormal";
            }
        }

        if (age >= 6 && age <= 12) {
            if ((spo2 < 95)
                    || (heartRate < 70 || heartRate > 110)
                    || (bloodPressure < 80 || bloodPressure > 120)
                    || (weight < 41 || weight > 92)) {
                status = "Abnormal";
            }
        }

        if (age >= 13) {
            if ((spo2 < 90)
                    || (heartRate < 55 || heartRate > 105)
                    || (bloodPressure < 110 || bloodPressure > 120)
                    || (weight < 110)) {
                status = "Abnormal";
            }
        }
        return status;
    }

//    private void refreshEncounters() {
//        int selectedRow = tblPatients.getSelectedRow();
//        if (selectedRow < 0) {
//            populateEncountersTable(null);
//        } else {
//            Person person = (Person) tblPatients.getValueAt(selectedRow, 0);
//            Patient patient = person.getPatient();
//            if (patient != null) {
//                populateEncountersTable(person);
//            } else {
//                populateEncountersTable(null);
//            }
//        }
//    }
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
