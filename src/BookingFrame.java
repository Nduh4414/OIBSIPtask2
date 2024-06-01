import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BookingFrame extends javax.swing.JFrame {
    private TrainManager TrainManager;
    private ReservationSystem reservationSystem;
    private TrainManager[] randomTrains;
    private int referenceNumber;
    private int selectedTrainIndex;
    private int selectedTrainIndex2;
    private String selectedTrainETA2;
    private String selectedTrainETA1;
    private String randomDate;
     
    public BookingFrame(ReservationSystem reservationSystem) {
    this.TrainManager = new TrainManager("Express Train", 12345, "High-Speed");
    this.reservationSystem = reservationSystem;
    reservationSystem.addPopularTrains();
    
    initComponents();
    jTextArea1.setEditable(false);
         
    }


   

                              
 
public String generateRandomDate() {
    Random random = new Random();
    Calendar calendar = Calendar.getInstance();

    
    calendar.set(2024, Calendar.MAY, 27);
    long startMillis = calendar.getTimeInMillis();
    calendar.set(2024, Calendar.JUNE, 6);
    long endMillis = calendar.getTimeInMillis();


    long randomMillis = ThreadLocalRandom.current().nextLong(startMillis, endMillis);
    calendar.setTimeInMillis(randomMillis);

    // Format the random date
    Date randomDate = calendar.getTime();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    return formatter.format(randomDate);
  }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBname = new javax.swing.JLabel();
        LBsurname = new javax.swing.JLabel();
        LBboardSt = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TFsurname = new javax.swing.JTextField();
        TFbdstation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFdestination = new javax.swing.JTextField();
        LBtraintype = new javax.swing.JLabel();
        BTNconfirm = new javax.swing.JButton();
        BTNscan = new javax.swing.JButton();
        LBpreference = new javax.swing.JLabel();
        TFslotNumber = new javax.swing.JTextField();
        BTNexit = new javax.swing.JButton();
        LBtraintype2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(11, 73, 73));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        LBname.setBackground(new java.awt.Color(51, 51, 51));
        LBname.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LBname.setForeground(new java.awt.Color(204, 204, 204));
        LBname.setText("Firstname");

        LBsurname.setBackground(new java.awt.Color(204, 204, 255));
        LBsurname.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LBsurname.setForeground(new java.awt.Color(204, 204, 204));
        LBsurname.setText("Surname");

        LBboardSt.setBackground(new java.awt.Color(204, 204, 255));
        LBboardSt.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LBboardSt.setForeground(new java.awt.Color(204, 204, 204));
        LBboardSt.setText("Boarding Station");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Destination");

        TFdestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdestinationActionPerformed(evt);
            }
        });

        LBtraintype.setBackground(new java.awt.Color(102, 0, 0));
        LBtraintype.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LBtraintype.setForeground(new java.awt.Color(255, 11, 11));
        LBtraintype.setText("Slot numbers will appear after scan");

        BTNconfirm.setBackground(new java.awt.Color(142, 131, 110));
        BTNconfirm.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BTNconfirm.setText("CONFIRM");
        BTNconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNconfirmActionPerformed(evt);
            }
        });

        BTNscan.setBackground(new java.awt.Color(142, 131, 110));
        BTNscan.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BTNscan.setText("SCAN");
        BTNscan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNscanActionPerformed(evt);
            }
        });

        LBpreference.setBackground(new java.awt.Color(204, 204, 255));
        LBpreference.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LBpreference.setForeground(new java.awt.Color(255, 204, 102));
        LBpreference.setText("TRAIN SLOT NUMBER ");

        BTNexit.setBackground(new java.awt.Color(142, 131, 110));
        BTNexit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BTNexit.setText("EXIT");
        BTNexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNexitActionPerformed(evt);
            }
        });

        LBtraintype2.setBackground(new java.awt.Color(102, 0, 0));
        LBtraintype2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LBtraintype2.setForeground(new java.awt.Color(255, 11, 11));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("KEEP REFERENCE NUMBER SAFE IT WILL BE USED IN A CASE OF CANCELATION!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LBsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LBboardSt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFbdstation, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTNscan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(LBpreference, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFslotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LBtraintype2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBtraintype, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LBtraintype, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBtraintype2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(LBpreference, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFslotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LBname, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LBsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFbdstation, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBboardSt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNscan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNexitActionPerformed
        new Dashboard(reservationSystem).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNexitActionPerformed

    private void BTNscanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNscanActionPerformed
         if (TFname.getText().isEmpty() || TFsurname.getText().isEmpty() || TFbdstation.getText().isEmpty() || TFdestination.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    randomTrains = reservationSystem.getRandomTrains(2);

    
    selectedTrainETA1 = generateRandomTime(); 
    selectedTrainETA2 = generateRandomTime(); 


    randomDate = generateRandomDate();


    String destination = TFdestination.getText();

    LBtraintype.setText("SLOT NUMBER - 853: " + randomTrains[0].name + ", Destination: " + destination + ", Train departure time: " + selectedTrainETA1 + "," + "Date: " + randomDate );
    LBtraintype2.setText("SLOT NUMBER - 628: " + randomTrains[1].name + ", Destination: " + destination + ", Train departure time: " + selectedTrainETA2 + ", Date: " + randomDate );
    

    selectedTrainIndex = 853; 
    selectedTrainIndex2 = 628;
}


    private String generateRandomTime() {
        int hour = (int) (Math.random() * 24);
        int minute = (int) (Math.random() * 60);
        return String.format("%02d:%02d", hour, minute);
    }//GEN-LAST:event_BTNscanActionPerformed

    private void BTNconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNconfirmActionPerformed
       String slotNumberStr = TFslotNumber.getText().trim();
    if (slotNumberStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a slot number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int slotNumber;
    try {
        slotNumber = Integer.parseInt(slotNumberStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid slot number. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (slotNumber != 853 && slotNumber != 628) {
        JOptionPane.showMessageDialog(this, "Invalid slot number. Please select either 853 or 628.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    selectedTrainIndex = slotNumber;

    String username = TFname.getText();
    TrainManager preferredTrain;
    String selectedTrainETA;

    if (selectedTrainIndex == 853) {
        preferredTrain = randomTrains[0];
        selectedTrainETA = selectedTrainETA1; 
    } else {
        preferredTrain = randomTrains[1];
        selectedTrainETA = selectedTrainETA2; 
    }

    int referenceNumber = reservationSystem.makeBooking(username, preferredTrain);

    // Include the date in the user details
    String userDetails = "----Train booking successful----\n" +
            
                         "Name: " + TFname.getText() + "\n" +
                         "Surname: " + TFsurname.getText() + "\n" +
                         "Boarding Station: " + TFbdstation.getText() + "\n" +
                         "Destination: " + TFdestination.getText() + "\n" +
                         "Preferred Train: " + preferredTrain.name + "\n" +
                         "Train departure time: " + selectedTrainETA + "\n" +
                         "Date: " + randomDate + "\n" +
            
                         "REFERENCE NUMBER: " + referenceNumber + "\n" +
            
                         "----THANK YOU FOR USING RAIL-SIDE TRAIN STATION----";

    jTextArea1.setText(userDetails);
    }//GEN-LAST:event_BTNconfirmActionPerformed

    private void TFdestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdestinationActionPerformed
        // TODO add your handling code there:
    }//GEN-LAST:event_TFdestinationActionPerformed

    
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
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             ReservationSystem reservationSystem = new ReservationSystem();
            reservationSystem.addPopularTrains();
            new BookingFrame(reservationSystem).setVisible(true);
        }
    });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNconfirm;
    private javax.swing.JButton BTNexit;
    private javax.swing.JButton BTNscan;
    private javax.swing.JLabel LBboardSt;
    private javax.swing.JLabel LBname;
    private javax.swing.JLabel LBpreference;
    private javax.swing.JLabel LBsurname;
    private javax.swing.JLabel LBtraintype;
    private javax.swing.JLabel LBtraintype2;
    private javax.swing.JTextField TFbdstation;
    private javax.swing.JTextField TFdestination;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFslotNumber;
    private javax.swing.JTextField TFsurname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
