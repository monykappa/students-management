/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HomePage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import DB.DBconnection;
import Login.LoginApplication;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import Class.*;

/**
 *
 * @author vit12
 */
public class IndexPage extends javax.swing.JFrame {

    /**
     * Creates new form IndexPage
     */
    public IndexPage() {
        initComponents();
        fetchDataAndUpdateTable();
        TotalStudent();
        TotalGraduated();
        TotalUnpaid();
        TotalInactive();
        RecentEnrollment();
    }

    private void fetchDataAndUpdateTable() {
        // Use DataRetriever to fetch data and update the table model
        DataRetriever.fetchDataFromDatabase((DefaultTableModel) jTable1.getModel());
    }

//    private void fetchDataButtonActionPerformed(java.awt.event.ActionEvent evt) {
//        // Assuming you have a JTable named jTable1
//        StudentData.fetchDataAndDisplay(jTable1);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftBar = new javax.swing.JPanel();
        ButtonHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ServiceButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ContactButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AboutButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        RightBar = new javax.swing.JPanel();
        Homepage = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabelTotalStudentNumber = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabelTotalGraduatedNumber = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabelTotalUnpaidNumber = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTotalInactiveNumber = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        ServicePage = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Searchinput = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        IDevent = new javax.swing.JTextField();
        FirstNameevent = new javax.swing.JTextField();
        Addressevent = new javax.swing.JTextField();
        Phoneevent = new javax.swing.JTextField();
        Graduateevent = new javax.swing.JTextField();
        LastNameevent = new javax.swing.JTextField();
        DOBevent = new javax.swing.JTextField();
        Paymentevent = new javax.swing.JTextField();
        Inactiveevent = new javax.swing.JTextField();
        Genderevent = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        DelectBtnevent = new javax.swing.JButton();
        UpdateButtonevent = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        Addpage = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        DOBField = new javax.swing.JTextField();
        AddressField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        GradueField = new javax.swing.JComboBox<>();
        PaymentField = new javax.swing.JComboBox<>();
        InactivetField = new javax.swing.JComboBox<>();
        GenderField = new javax.swing.JComboBox<>();
        Aboutpage = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftBar.setBackground(new java.awt.Color(27, 52, 82));

        ButtonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonHomeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("Home");

        javax.swing.GroupLayout ButtonHomeLayout = new javax.swing.GroupLayout(ButtonHome);
        ButtonHome.setLayout(ButtonHomeLayout);
        ButtonHomeLayout.setHorizontalGroup(
            ButtonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonHomeLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonHomeLayout.setVerticalGroup(
            ButtonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jLabel1.getAccessibleContext().setAccessibleName("\nHome");

        ServiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiceButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setText("Service");

        javax.swing.GroupLayout ServiceButtonLayout = new javax.swing.GroupLayout(ServiceButton);
        ServiceButton.setLayout(ServiceButtonLayout);
        ServiceButtonLayout.setHorizontalGroup(
            ServiceButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceButtonLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ServiceButtonLayout.setVerticalGroup(
            ServiceButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Enrollment");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContactButtonLayout = new javax.swing.GroupLayout(ContactButton);
        ContactButton.setLayout(ContactButtonLayout);
        ContactButtonLayout.setHorizontalGroup(
            ContactButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactButtonLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContactButtonLayout.setVerticalGroup(
            ContactButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactButtonLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("About");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AboutButtonLayout = new javax.swing.GroupLayout(AboutButton);
        AboutButton.setLayout(AboutButtonLayout);
        AboutButtonLayout.setHorizontalGroup(
            AboutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutButtonLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AboutButtonLayout.setVerticalGroup(
            AboutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/OIP.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftBarLayout = new javax.swing.GroupLayout(LeftBar);
        LeftBar.setLayout(LeftBarLayout);
        LeftBarLayout.setHorizontalGroup(
            LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ServiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContactButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftBarLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftBarLayout.setVerticalGroup(
            LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addComponent(ButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ServiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContactButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        RightBar.setBackground(new java.awt.Color(255, 255, 255));

        Homepage.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(53, 69, 103));

        jLabel8.setFont(new java.awt.Font("Roboto", 2, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ACLEDA INSTITUE OF BUSINESS");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KOK Samrong");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(52, 69, 103));

        jLabel12.setFont(new java.awt.Font("HelveticaNeueLT Std", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Students ");

        jLabelTotalStudentNumber.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelTotalStudentNumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotalStudentNumber.setText("1024");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelTotalStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotalStudentNumber)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(52, 69, 103));

        jLabel10.setFont(new java.awt.Font("HelveticaNeueLT Std", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Graduated");

        jLabelTotalGraduatedNumber.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelTotalGraduatedNumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotalGraduatedNumber.setText("1024");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelTotalGraduatedNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotalGraduatedNumber)
                .addGap(18, 18, 18))
        );

        jPanel5.setBackground(new java.awt.Color(52, 69, 103));

        jLabel13.setFont(new java.awt.Font("HelveticaNeueLT Std", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Unpaid");

        jLabelTotalUnpaidNumber.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelTotalUnpaidNumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotalUnpaidNumber.setText("1024");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTotalUnpaidNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalUnpaidNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(52, 69, 103));

        jLabel11.setFont(new java.awt.Font("HelveticaNeueLT Std", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Inactive");

        jLabelTotalInactiveNumber.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelTotalInactiveNumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotalInactiveNumber.setText("1024");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTotalInactiveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(60, 60, 60))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalInactiveNumber)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTable2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstNAME", "LastName", "DOB", "Gender", "Address", "PhoneNumber", "Graduated", "Payment", "Inactive"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel39.setText("Recent Enrollment");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setText("DASHBOARD");

        javax.swing.GroupLayout HomepageLayout = new javax.swing.GroupLayout(Homepage);
        Homepage.setLayout(HomepageLayout);
        HomepageLayout.setHorizontalGroup(
            HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomepageLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(HomepageLayout.createSequentialGroup()
                .addGroup(HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomepageLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addGroup(HomepageLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HomepageLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomepageLayout.setVerticalGroup(
            HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepageLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel39)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ServicePage.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(53, 69, 103));

        jLabel17.setFont(new java.awt.Font("Roboto", 2, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ACLEDA INSTITUE OF BUSINESS");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("KOK Samrong");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstNAME", "LastName", "DOB", "Gender", "Address", "PhoneNumber", "Graduated", "Payment", "Inactive"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Searchinput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Searchinput.setText("Please enter the ID for search ");
        Searchinput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchinputMouseClicked(evt);
            }
        });
        Searchinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchinputActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        IDevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        FirstNameevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Addressevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Phoneevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Graduateevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        LastNameevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        DOBevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Paymentevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Inactiveevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Genderevent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel28.setText("ID");

        jLabel30.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel30.setText("First Name");

        jLabel31.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel31.setText("Payment");

        jLabel32.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel32.setText("Last Name");

        jLabel33.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel33.setText("Phone");

        jLabel34.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel34.setText("Gender");

        jLabel35.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel35.setText("DOB");

        jLabel36.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel36.setText("Address");

        jLabel37.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel37.setText("Graduate");

        jLabel38.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel38.setText("Inactive");

        DelectBtnevent.setBackground(new java.awt.Color(255, 0, 0));
        DelectBtnevent.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        DelectBtnevent.setForeground(new java.awt.Color(255, 255, 255));
        DelectBtnevent.setText("DELETE");
        DelectBtnevent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelectBtneventMouseClicked(evt);
            }
        });
        DelectBtnevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelectBtneventActionPerformed(evt);
            }
        });

        UpdateButtonevent.setBackground(new java.awt.Color(255, 153, 0));
        UpdateButtonevent.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        UpdateButtonevent.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButtonevent.setText("UPDATE");
        UpdateButtonevent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtoneventMouseClicked(evt);
            }
        });

        RefreshButton.setBackground(new java.awt.Color(0, 204, 0));
        RefreshButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RefreshButton.setForeground(new java.awt.Color(255, 255, 255));
        RefreshButton.setText("Refresh");
        RefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ServicePageLayout = new javax.swing.GroupLayout(ServicePage);
        ServicePage.setLayout(ServicePageLayout);
        ServicePageLayout.setHorizontalGroup(
            ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePageLayout.createSequentialGroup()
                        .addComponent(Searchinput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RefreshButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ServicePageLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(ServicePageLayout.createSequentialGroup()
                                    .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DOBevent, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(ServicePageLayout.createSequentialGroup()
                                            .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(FirstNameevent, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                .addComponent(IDevent)
                                                .addComponent(LastNameevent))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(Genderevent)))
                                .addGroup(ServicePageLayout.createSequentialGroup()
                                    .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ServicePageLayout.createSequentialGroup()
                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(15, 15, 15)
                                    .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Paymentevent, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Graduateevent, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(ServicePageLayout.createSequentialGroup()
                                            .addComponent(Phoneevent, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(Addressevent)
                                        .addComponent(Inactiveevent)))
                                .addGroup(ServicePageLayout.createSequentialGroup()
                                    .addComponent(DelectBtnevent, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(UpdateButtonevent, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ServicePageLayout.setVerticalGroup(
            ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePageLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Searchinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ServicePageLayout.createSequentialGroup()
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastNameevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DOBevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Genderevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Addressevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(9, 9, 9)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(Phoneevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Graduateevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(Paymentevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(Inactiveevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ServicePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateButtonevent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelectBtnevent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        Addpage.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(53, 69, 103));

        jLabel19.setFont(new java.awt.Font("Roboto", 2, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ACLEDA INSTITUE OF BUSINESS");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("KOK Samrong");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(578, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel7.setText("Add Student ");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setText("First Name");

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel21.setText("Date Of Birth");

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel22.setText("Last Name");

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel23.setText("Gender");

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel24.setText("Address");

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel25.setText("Phone Number");

        jLabel26.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel26.setText("In active");

        jLabel27.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel27.setText("Payment");

        jLabel29.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel29.setText("Graduate");

        FirstNameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        LastNameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        DOBField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        AddressField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        PhoneField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GradueField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GradueField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        GradueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradueFieldActionPerformed(evt);
            }
        });

        PaymentField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PaymentField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        InactivetField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        InactivetField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        GenderField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout AddpageLayout = new javax.swing.GroupLayout(Addpage);
        Addpage.setLayout(AddpageLayout);
        AddpageLayout.setHorizontalGroup(
            AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddpageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddpageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddpageLayout.createSequentialGroup()
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddpageLayout.createSequentialGroup()
                                .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddpageLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOBField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddpageLayout.createSequentialGroup()
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InactivetField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GradueField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddpageLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AddpageLayout.setVerticalGroup(
            AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddpageLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddpageLayout.createSequentialGroup()
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel23)
                            .addComponent(GenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel29)
                            .addComponent(GradueField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel27)
                            .addComponent(PaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(InactivetField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(AddpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 345, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(53, 69, 103));

        jLabel15.setFont(new java.awt.Font("Roboto", 2, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ACLEDA INSTITUE OF BUSINESS");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("KOK Samrong");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("About Us\n\nWelcome to [Your Company/Organization Name]! We are dedicated to [brief description of your mission or purpose]. Established with a passion for [what your company/organization focuses on], we strive to [mention your goals, values, or unique aspects].\n\nOur Mission\n\nAt [Your Company/Organization Name], our mission is to [state your mission in a concise manner]. We are committed to [highlight key aspects of your commitment or dedication].\n\nWhat Sets Us Apart\n\nPassionate Team: Our team comprises dedicated professionals who are passionate about [your industry/niche].\n\nInnovation: We believe in embracing innovation and staying ahead of the curve to provide you with [products/services] that exceed expectations.\n\nCustomer-Centric Approach: Your satisfaction is our top priority. We are here to [solve problems, provide solutions, etc.] and ensure you have a positive experience with us.\n\nGet In Touch\n\nHave questions or want to learn more about [Your Company/Organization Name]? We would love to hear from you! Reach out to us via [contact information].\n\nThank you for choosing [Your Company/Organization Name]. We look forward to serving you and being a part of your [industry/niche] journey!");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout AboutpageLayout = new javax.swing.GroupLayout(Aboutpage);
        Aboutpage.setLayout(AboutpageLayout);
        AboutpageLayout.setHorizontalGroup(
            AboutpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutpageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AboutpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        AboutpageLayout.setVerticalGroup(
            AboutpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutpageLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RightBarLayout = new javax.swing.GroupLayout(RightBar);
        RightBar.setLayout(RightBarLayout);
        RightBarLayout.setHorizontalGroup(
            RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ServicePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RightBarLayout.createSequentialGroup()
                    .addComponent(Homepage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 69, Short.MAX_VALUE)))
            .addGroup(RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Aboutpage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RightBarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Addpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        RightBarLayout.setVerticalGroup(
            RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ServicePage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RightBarLayout.createSequentialGroup()
                    .addComponent(Aboutpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(RightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Addpage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RightBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RightBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHomeMouseClicked
        Homepage.setVisible(true);
        ServicePage.setVisible(false);
        Addpage.setVisible(false);
        Aboutpage.setVisible(false);
    }//GEN-LAST:event_ButtonHomeMouseClicked

    private void ServiceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiceButtonMouseClicked
        Homepage.setVisible(false);
        ServicePage.setVisible(true);
        Addpage.setVisible(false);
        Aboutpage.setVisible(false);
    }//GEN-LAST:event_ServiceButtonMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Homepage.setVisible(false);
        ServicePage.setVisible(false);
        Addpage.setVisible(true);
        Aboutpage.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Homepage.setVisible(false);
        ServicePage.setVisible(false);
        Addpage.setVisible(false);
        Aboutpage.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void SearchinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchinputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        // Open a new instance of the login frame (LoginApplication)
        LoginApplication loginFrame = new LoginApplication();
        loginFrame.displayLoginFrame();
    }//GEN-LAST:event_jButton2ActionPerformed

    //Btn Add Student
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String firstName = FirstNameField.getText();
        String lastName = LastNameField.getText();
        String dobText = DOBField.getText();
        String gender = GenderField.getSelectedItem().toString();
        String address = AddressField.getText();
        String phone = PhoneField.getText();
        String graduated = GradueField.getSelectedItem().toString();
        String payment = PaymentField.getSelectedItem().toString();
        String inactive = InactivetField.getSelectedItem().toString();

        // Create an instance of StudentAdder and call its method to add the student
        StudentAdder adder = new StudentAdder();
        boolean additionSuccessful = adder.addStudent(firstName, lastName, dobText, gender, address, phone, graduated, payment, inactive);

        if (additionSuccessful) {
            // Clear input fields after successful insertion
            FirstNameField.setText("");
            LastNameField.setText("");
            DOBField.setText("");
            AddressField.setText("");
            PhoneField.setText("");

            // Refresh the table or update as needed
            fetchDataAndUpdateTable();

            // Show success message
            JOptionPane.showMessageDialog(null, "Student added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    //Search 
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String searchInput = Searchinput.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        StudentSearch searcher = new StudentSearch(searchInput, model);
        searcher.search();
    }//GEN-LAST:event_jButton1MouseClicked

    private void SearchinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchinputMouseClicked

        Searchinput.setText("");
    }//GEN-LAST:event_SearchinputMouseClicked

    private void DelectBtneventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelectBtneventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelectBtneventActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            Object IDValue = jTable1.getValueAt(selectedRow, 0);
            Object FirstNameValue = jTable1.getValueAt(selectedRow, 1);
            Object LastNameValue = jTable1.getValueAt(selectedRow, 2);
            Object DOBValue = jTable1.getValueAt(selectedRow, 3);
            Object GenderValue = jTable1.getValueAt(selectedRow, 5);  // Assuming index 4 is skipped
            Object AddressValue = jTable1.getValueAt(selectedRow, 4);
            Object PhoneNumberValue = jTable1.getValueAt(selectedRow, 6);
            Object GraduatedValue = jTable1.getValueAt(selectedRow, 7);
            Object PaymentValue = jTable1.getValueAt(selectedRow, 8);
            Object InActiveValue = jTable1.getValueAt(selectedRow, 9);

            // Set the values in the text fields
            IDevent.setText(String.valueOf(IDValue));
            FirstNameevent.setText(String.valueOf(FirstNameValue));
            LastNameevent.setText(String.valueOf(LastNameValue));
            DOBevent.setText(String.valueOf(DOBValue));
            Genderevent.setText(String.valueOf(GenderValue));
            Addressevent.setText(String.valueOf(AddressValue));
            Phoneevent.setText(String.valueOf(PhoneNumberValue));
            Graduateevent.setText(String.valueOf(GraduatedValue));
            Paymentevent.setText(String.valueOf(PaymentValue));
            Inactiveevent.setText(String.valueOf(InActiveValue));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    //Update
    private void UpdateButtoneventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtoneventMouseClicked
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            Object IDValue = jTable1.getValueAt(selectedRow, 0);

            // Construct a Map with field names and their corresponding new values
            Map<String, Object> updatedFields = new HashMap<>();
            updatedFields.put("first_name", FirstNameevent.getText());
            updatedFields.put("last_name", LastNameevent.getText());
            updatedFields.put("DOB", DOBevent.getText());
            updatedFields.put("address", Addressevent.getText());
            updatedFields.put("gender", Genderevent.getText());
            updatedFields.put("phone_number", Phoneevent.getText());
            updatedFields.put("graduated", Graduateevent.getText());
            updatedFields.put("payment", Paymentevent.getText());
            updatedFields.put("in_active", Inactiveevent.getText());

            // Update the database with the new values
            StudentUpdater updater = new StudentUpdater();
            if (updater.updateStudentData((int) IDValue, updatedFields)) {
                // Display a success message
                JOptionPane.showMessageDialog(this, "Update successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Clear text fields or perform any other necessary actions
                IDevent.setText("");
                FirstNameevent.setText("");
                LastNameevent.setText("");
                DOBevent.setText("");
                Addressevent.setText("");
                Genderevent.setText("");
                Phoneevent.setText("");
                Graduateevent.setText("");
                Paymentevent.setText("");
                Inactiveevent.setText("");
                refreshTableData();
            } else {
                // Display an error message
                JOptionPane.showMessageDialog(this, "Update failed.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_UpdateButtoneventMouseClicked

    private void DelectBtneventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelectBtneventMouseClicked
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                int studentID = (int) jTable1.getValueAt(selectedRow, 0);

                // Create an instance of StudentDeleter and call its method to handle the delete event
                StudentDeleter deleter = new StudentDeleter();
                boolean deletionSuccessful = deleter.deleteStudent(studentID);

                if (deletionSuccessful) {
                    // Update UI or perform any necessary actions
                    refreshTableData(); // Assuming you have a method to refresh the table data
                    JOptionPane.showMessageDialog(null, "Student record deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete student record.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DelectBtneventMouseClicked

    private void GradueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradueFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshButtonMouseClicked
        refreshTableData();
        Searchinput.setText("");
    }//GEN-LAST:event_RefreshButtonMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private boolean deleteStudentData(int studentID) {
        String deleteQuery = "DELETE FROM students WHERE id=?";

        try (Connection connection = DBconnection.getConnection(); PreparedStatement statement = connection.prepareStatement(deleteQuery)) {

            statement.setInt(1, studentID);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully!");
                return true;
            } else {
                System.out.println("No record was deleted.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    private void RecentEnrollment() {
        try {
            // Get a connection from your DBconnection class
            Connection connection = DBconnection.getConnection();

            // Prepare and execute the query
            String query = "SELECT * FROM students ORDER BY id DESC LIMIT 5";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Get column names and set them as table headers
            int columnCount = resultSet.getMetaData().getColumnCount();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setColumnCount(0); // Clear existing columns
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }

            // Add rows to the table
            model.setRowCount(0); // Clear existing rows
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void refreshTableData() {
        try {
            // Get a connection from your DBconnection class
            Connection connection = DBconnection.getConnection();

            // Prepare and execute the query
            String query = "SELECT * FROM students";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Get column names and set them as table headers
            int columnCount = resultSet.getMetaData().getColumnCount();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setColumnCount(0); // Clear existing columns
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }

            // Add rows to the table
            model.setRowCount(0); // Clear existing rows
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean updateStudentData(int studentID, String newFirstName, String newLastName /*, other parameters */) {
        String updateQuery = "UPDATE students SET first_name=?, last_name=? WHERE id=?";
        try (Connection connection = DBconnection.getConnection(); PreparedStatement statement = connection.prepareStatement(updateQuery)) {

            statement.setString(1, newFirstName);
            statement.setString(2, newLastName);
            // Set other parameters if needed
            statement.setInt(3, studentID);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Row updated successfully!");
                return true;
            } else {
                System.out.println("No rows were updated.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean updateStudentData(int studentID, Map<String, Object> updatedFields) {
        if (updatedFields.isEmpty()) {
            // Nothing to update
            return false;
        }

        // Construct the dynamic part of the update query
        StringBuilder updateQuery = new StringBuilder("UPDATE students SET ");
        Set<Map.Entry<String, Object>> entrySet = updatedFields.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            updateQuery.append(entry.getKey()).append("=?, ");
        }
        updateQuery.delete(updateQuery.length() - 2, updateQuery.length()); // Remove the last comma and space
        updateQuery.append(" WHERE id=?");

        try (Connection connection = DBconnection.getConnection(); PreparedStatement statement = connection.prepareStatement(updateQuery.toString())) {

            // Set parameter values for the update query
            int parameterIndex = 1;
            for (Object value : updatedFields.values()) {
                statement.setObject(parameterIndex++, value);
            }
            statement.setInt(parameterIndex, studentID);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Row updated successfully!");
                return true;
            } else {
                System.out.println("No rows were updated.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static class Constants {

        private static final String SELECT_COUNT_QUERY = "SELECT COUNT(*) FROM students";
    }

    private void TotalStudent() {
        try (Connection connection = DBconnection.getConnection(); PreparedStatement statement = connection.prepareStatement(Constants.SELECT_COUNT_QUERY); ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                int rowCount = resultSet.getInt(1);
                System.out.println(rowCount);

                // Make sure jLabelTotalStudentNumber is not null before calling setText
                if (jLabelTotalStudentNumber != null) {
                    jLabelTotalStudentNumber.setText(String.valueOf(rowCount));
                } else {
                    System.err.println("jLabelTotalStudentNumber is null. Make sure it's properly initialized.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void TotalGraduated() {
        try (Connection connection = DBconnection.getConnection(); PreparedStatement statement = connection.prepareStatement(QueryConstants.SELECT_GRADUATED_COUNT_QUERY); ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                int graduatedCount = resultSet.getInt(1);
                System.out.println("Total Graduated Students from Database: " + graduatedCount);

                // Make sure jLabelTotalGraduatedNumber is not null before calling setText
                if (jLabelTotalGraduatedNumber != null) {
                    jLabelTotalGraduatedNumber.setText(String.valueOf(graduatedCount));

                } else {
                    System.err.println("jLabelTotalGraduatedNumber is null. Make sure it's properly initialized.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Constants for SQL queries
    private static class QueryConstants {

        private static final String SELECT_GRADUATED_COUNT_QUERY = "SELECT COUNT(*) FROM students WHERE graduated = 'yes'";
    }

    private void TotalUnpaid() {
        try (Connection connection = DBconnection.getConnection(); PreparedStatement statement = connection.prepareStatement(UpdatedQueryConstants.SELECT_UNPAID_COUNT_QUERY); ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                int unpaidCount = resultSet.getInt(1);
                System.out.println("Total Unpaid Students from Database: " + unpaidCount);

                // Make sure jLabelTotalUnpaidNumber is not null before calling setText
                if (jLabelTotalUnpaidNumber != null) {
                    jLabelTotalUnpaidNumber.setText(String.valueOf(unpaidCount));
                } else {
                    System.err.println("jLabelTotalUnpaidNumber is null. Make sure it's properly initialized.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Constants for SQL queries
    private static class UpdatedQueryConstants {

        private static final String SELECT_UNPAID_COUNT_QUERY = "SELECT COUNT(*) FROM students WHERE payment = 'no'";
    }

    private void TotalInactive() {
        try (Connection connection = DBconnection.getConnection(); PreparedStatement statement = connection.prepareStatement(AlternativeQueryConstants.SELECT_INACTIVE_COUNT_QUERY); ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                int inactiveCount = resultSet.getInt(1);
                System.out.println("Total Inactive Students from Database: " + inactiveCount);

                // Make sure jLabelTotalInactiveNumber is not null before calling setText
                if (jLabelTotalInactiveNumber != null) {
                    jLabelTotalInactiveNumber.setText(String.valueOf(inactiveCount));
                } else {
                    System.err.println("jLabelTotalInactiveNumber is null. Make sure it's properly initialized.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Constants for SQL queries
    private static class AlternativeQueryConstants {

        private static final String SELECT_INACTIVE_COUNT_QUERY = "SELECT COUNT(*) FROM students WHERE in_active = 'yes'";
    }

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
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IndexPage().setVisible(true);
//
//            }
//        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutButton;
    private javax.swing.JPanel Aboutpage;
    private javax.swing.JPanel Addpage;
    private javax.swing.JTextField AddressField;
    private javax.swing.JTextField Addressevent;
    private javax.swing.JPanel ButtonHome;
    private javax.swing.JPanel ContactButton;
    private javax.swing.JTextField DOBField;
    private javax.swing.JTextField DOBevent;
    private javax.swing.JButton DelectBtnevent;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField FirstNameevent;
    private javax.swing.JComboBox<String> GenderField;
    private javax.swing.JTextField Genderevent;
    private javax.swing.JTextField Graduateevent;
    private javax.swing.JComboBox<String> GradueField;
    private javax.swing.JPanel Homepage;
    private javax.swing.JTextField IDevent;
    private javax.swing.JTextField Inactiveevent;
    private javax.swing.JComboBox<String> InactivetField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField LastNameevent;
    private javax.swing.JPanel LeftBar;
    private javax.swing.JComboBox<String> PaymentField;
    private javax.swing.JTextField Paymentevent;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JTextField Phoneevent;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JPanel RightBar;
    private java.awt.TextField Searchinput;
    private javax.swing.JPanel ServiceButton;
    private javax.swing.JPanel ServicePage;
    private javax.swing.JButton UpdateButtonevent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTotalGraduatedNumber;
    private javax.swing.JLabel jLabelTotalInactiveNumber;
    private javax.swing.JLabel jLabelTotalStudentNumber;
    private javax.swing.JLabel jLabelTotalUnpaidNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
