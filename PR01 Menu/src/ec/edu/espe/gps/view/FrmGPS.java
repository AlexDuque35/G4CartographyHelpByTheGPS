package ec.edu.espe.gps.view;

import ec.edu.espe.gps.controller.GPSController;
import ec.edu.espe.gps.model.GPS;
import javax.swing.JOptionPane;
import utils.FileManager;

public class FrmGPS extends javax.swing.JFrame {

    public FrmGPS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPrincipal1 = new javax.swing.JTabbedPane();
        panCC1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtLatDegrees1 = new javax.swing.JTextField();
        txtLatMinutes1 = new javax.swing.JTextField();
        txtLatSeconds1 = new javax.swing.JTextField();
        txtLenDegrees1 = new javax.swing.JTextField();
        txtLenMinutes1 = new javax.swing.JTextField();
        txtLenSeconds1 = new javax.swing.JTextField();
        btnSaveCoordinates = new javax.swing.JButton();
        btnShowCoordinates = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowData = new javax.swing.JTextArea();
        btnConvertCoordinate = new javax.swing.JButton();
        panPerimeterC = new javax.swing.JPanel();
        panPerimerterC = new javax.swing.JTabbedPane();
        panPer3Points = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtPer3Lat1 = new javax.swing.JTextField();
        txtPer3Len1 = new javax.swing.JTextField();
        txtPer3Len2 = new javax.swing.JTextField();
        txtPer3Lat3 = new javax.swing.JTextField();
        txtPer3Lat2 = new javax.swing.JTextField();
        txtPer3Len3 = new javax.swing.JTextField();
        btnCalPer3 = new javax.swing.JButton();
        panPer4Points = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPer4Lat1 = new javax.swing.JTextField();
        txtPer4Len1 = new javax.swing.JTextField();
        txtPer4Len2 = new javax.swing.JTextField();
        txtPer4Lat3 = new javax.swing.JTextField();
        txtPer4Lat2 = new javax.swing.JTextField();
        txtPer4Len3 = new javax.swing.JTextField();
        btnCalPer4 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtPer4Lat4 = new javax.swing.JTextField();
        txtPer4Len4 = new javax.swing.JTextField();
        panPer5Points = new javax.swing.JPanel();
        panPer4Points1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtPer5Lat1 = new javax.swing.JTextField();
        txtPer5Len1 = new javax.swing.JTextField();
        txtPer5Len2 = new javax.swing.JTextField();
        txtPer5Lat3 = new javax.swing.JTextField();
        txtPer5Lat2 = new javax.swing.JTextField();
        txtPer5Len3 = new javax.swing.JTextField();
        btnCalPer5 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtPer5Lat4 = new javax.swing.JTextField();
        txtPer5Len4 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtPer5Lat5 = new javax.swing.JTextField();
        txtPer5Len5 = new javax.swing.JTextField();
        panSurfaceC = new javax.swing.JPanel();
        panSurC = new javax.swing.JTabbedPane();
        panSur3Points = new javax.swing.JPanel();
        panPer4Points3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtSur3Lat1 = new javax.swing.JTextField();
        txtSur3Len1 = new javax.swing.JTextField();
        txtSur3Len2 = new javax.swing.JTextField();
        txtSur3Lat3 = new javax.swing.JTextField();
        txtSur3Lat2 = new javax.swing.JTextField();
        txtSur3Len3 = new javax.swing.JTextField();
        btnCalSur3 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        panSur4Points = new javax.swing.JPanel();
        panPer4Points2 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtSur4Lat1 = new javax.swing.JTextField();
        txtSur4Len1 = new javax.swing.JTextField();
        txtSur4Len2 = new javax.swing.JTextField();
        txtSur4Lat3 = new javax.swing.JTextField();
        txtSur4Lat2 = new javax.swing.JTextField();
        txtSur4Len3 = new javax.swing.JTextField();
        btnCalSur4 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtSur4Lat4 = new javax.swing.JTextField();
        txtSur4Len4 = new javax.swing.JTextField();
        panSur5Points = new javax.swing.JPanel();
        panPer4Points4 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtSur5Lat1 = new javax.swing.JTextField();
        txtSur5Len1 = new javax.swing.JTextField();
        txtSur5Len2 = new javax.swing.JTextField();
        txtSur5Lat3 = new javax.swing.JTextField();
        txtSur5Lat2 = new javax.swing.JTextField();
        txtSur5Len3 = new javax.swing.JTextField();
        btnCalSur5 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtSur5Lat4 = new javax.swing.JTextField();
        txtSur5Len4 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtSur5Lat5 = new javax.swing.JTextField();
        txtSur5Len5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(695, 400));

        jLabel9.setText("Latitude Coordinates");

        jLabel10.setText("Degrees:");

        jLabel11.setText("Minutes:");

        jLabel12.setText("Seconds:");

        jLabel13.setText("Length Coordinates");

        jLabel14.setText("Degrees:");

        jLabel15.setText("Minutes:");

        jLabel16.setText("Seconds:");

        txtLenDegrees1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLenDegrees1ActionPerformed(evt);
            }
        });

        txtLenSeconds1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLenSeconds1ActionPerformed(evt);
            }
        });

        btnSaveCoordinates.setText("Save Coordinates");
        btnSaveCoordinates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCoordinatesActionPerformed(evt);
            }
        });

        btnShowCoordinates.setText("Show Save Coordinates");
        btnShowCoordinates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCoordinatesActionPerformed(evt);
            }
        });

        txtShowData.setColumns(20);
        txtShowData.setRows(5);
        jScrollPane1.setViewportView(txtShowData);

        btnConvertCoordinate.setText("Convert Coordinate");
        btnConvertCoordinate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertCoordinateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCC1Layout = new javax.swing.GroupLayout(panCC1);
        panCC1.setLayout(panCC1Layout);
        panCC1Layout.setHorizontalGroup(
            panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCC1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCC1Layout.createSequentialGroup()
                        .addGroup(panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panCC1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLatDegrees1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLatMinutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLatSeconds1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panCC1Layout.createSequentialGroup()
                        .addGroup(panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panCC1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLenDegrees1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLenMinutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLenSeconds1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panCC1Layout.createSequentialGroup()
                                .addComponent(btnConvertCoordinate)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveCoordinates))
                            .addComponent(btnShowCoordinates)
                            .addComponent(jScrollPane1))
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        panCC1Layout.setVerticalGroup(
            panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCC1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtLatDegrees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtLatMinutes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtLatSeconds1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtLenDegrees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtLenMinutes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtLenSeconds1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertCoordinate)
                    .addComponent(btnSaveCoordinates))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShowCoordinates)
                .addGap(126, 126, 126))
        );

        tabPrincipal1.addTab("Coordinate Conversion", panCC1);

        jLabel17.setText("Calculate the 3-point perimeter");

        jLabel18.setText("Latitude (X)");

        jLabel19.setText("Length (Y)");

        jLabel20.setText("# Point");

        jLabel21.setText("1");

        jLabel22.setText("2");

        jLabel23.setText("3");

        btnCalPer3.setText("Calculate Perimeter ");
        btnCalPer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalPer3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPer3PointsLayout = new javax.swing.GroupLayout(panPer3Points);
        panPer3Points.setLayout(panPer3PointsLayout);
        panPer3PointsLayout.setHorizontalGroup(
            panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer3PointsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPer3PointsLayout.createSequentialGroup()
                        .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPer3Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panPer3PointsLayout.createSequentialGroup()
                                .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPer3Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPer3Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPer3Len3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPer3Len2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPer3Len1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panPer3PointsLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel19))
                            .addGroup(panPer3PointsLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel17)))
                        .addGap(108, 108, 108))
                    .addGroup(panPer3PointsLayout.createSequentialGroup()
                        .addComponent(btnCalPer3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panPer3PointsLayout.setVerticalGroup(
            panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer3PointsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtPer3Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer3Len1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtPer3Len2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer3Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPer3Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer3Len3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalPer3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panPerimerterC.addTab("3 Points", panPer3Points);

        jLabel24.setText("Calculate the 4-point perimeter");

        jLabel25.setText("1");

        jLabel26.setText("2");

        btnCalPer4.setText("Calculate Perimeter ");
        btnCalPer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalPer4ActionPerformed(evt);
            }
        });

        jLabel29.setText("Latitude (X)");

        jLabel30.setText("Length (Y)");

        jLabel31.setText("# Point");

        jLabel28.setText("3");

        jLabel32.setText("4");

        javax.swing.GroupLayout panPer4PointsLayout = new javax.swing.GroupLayout(panPer4Points);
        panPer4Points.setLayout(panPer4PointsLayout);
        panPer4PointsLayout.setHorizontalGroup(
            panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4PointsLayout.createSequentialGroup()
                .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPer4PointsLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel24))
                    .addGroup(panPer4PointsLayout.createSequentialGroup()
                        .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(52, 52, 52)
                        .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPer4PointsLayout.createSequentialGroup()
                                .addComponent(txtPer4Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPer4Len1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4PointsLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel30))
                            .addGroup(panPer4PointsLayout.createSequentialGroup()
                                .addComponent(txtPer4Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPer4Len2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4PointsLayout.createSequentialGroup()
                                .addComponent(txtPer4Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPer4Len3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCalPer4)
                    .addGroup(panPer4PointsLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(52, 52, 52)
                        .addComponent(txtPer4Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPer4Len4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4PointsLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel31)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        panPer4PointsLayout.setVerticalGroup(
            panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4PointsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer4Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer4Len1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer4Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer4Len2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(10, 10, 10)
                .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer4Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer4Len3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer4Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer4Len4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addComponent(btnCalPer4)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(panPer4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4PointsLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel31)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        panPerimerterC.addTab("4 Points", panPer4Points);

        jLabel27.setText("Calculate the 5-point perimeter");

        jLabel33.setText("1");

        jLabel34.setText("2");

        btnCalPer5.setText("Calculate Perimeter ");
        btnCalPer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalPer5ActionPerformed(evt);
            }
        });

        jLabel35.setText("Latitude (X)");

        jLabel36.setText("Length (Y)");

        jLabel37.setText("# Point");

        jLabel38.setText("3");

        jLabel39.setText("4");

        jLabel40.setText("5");

        javax.swing.GroupLayout panPer4Points1Layout = new javax.swing.GroupLayout(panPer4Points1);
        panPer4Points1.setLayout(panPer4Points1Layout);
        panPer4Points1Layout.setHorizontalGroup(
            panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points1Layout.createSequentialGroup()
                .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPer4Points1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel27))
                    .addGroup(panPer4Points1Layout.createSequentialGroup()
                        .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33))
                        .addGap(52, 52, 52)
                        .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPer4Points1Layout.createSequentialGroup()
                                .addComponent(txtPer5Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPer5Len1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points1Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel36))
                            .addGroup(panPer4Points1Layout.createSequentialGroup()
                                .addComponent(txtPer5Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPer5Len2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points1Layout.createSequentialGroup()
                                .addComponent(txtPer5Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPer5Len3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCalPer5)
                    .addGroup(panPer4Points1Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(52, 52, 52)
                        .addComponent(txtPer5Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPer5Len4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPer4Points1Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(52, 52, 52)
                        .addComponent(txtPer5Lat5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPer5Len5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points1Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel37)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        panPer4Points1Layout.setVerticalGroup(
            panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer5Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer5Len1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer5Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer5Len2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(10, 10, 10)
                .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer5Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer5Len3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer5Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer5Len4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPer5Lat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer5Len5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addComponent(btnCalPer5)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(panPer4Points1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel37)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panPer5PointsLayout = new javax.swing.GroupLayout(panPer5Points);
        panPer5Points.setLayout(panPer5PointsLayout);
        panPer5PointsLayout.setHorizontalGroup(
            panPer5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panPer5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer5PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panPer5PointsLayout.setVerticalGroup(
            panPer5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panPer5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer5PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panPerimerterC.addTab("5 Points", panPer5Points);

        javax.swing.GroupLayout panPerimeterCLayout = new javax.swing.GroupLayout(panPerimeterC);
        panPerimeterC.setLayout(panPerimeterCLayout);
        panPerimeterCLayout.setHorizontalGroup(
            panPerimeterCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPerimerterC)
        );
        panPerimeterCLayout.setVerticalGroup(
            panPerimeterCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPerimerterC)
        );

        tabPrincipal1.addTab("Perimeter Calculator", panPerimeterC);

        jLabel48.setText("Calculate the 3-point surface");

        jLabel49.setText("1");

        jLabel50.setText("2");

        txtSur3Lat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSur3Lat3ActionPerformed(evt);
            }
        });

        btnCalSur3.setText("Calculate Surface");
        btnCalSur3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalSur3ActionPerformed(evt);
            }
        });

        jLabel51.setText("Latitude (X)");

        jLabel52.setText("Length (Y)");

        jLabel53.setText("# Point");

        jLabel54.setText("3");

        javax.swing.GroupLayout panPer4Points3Layout = new javax.swing.GroupLayout(panPer4Points3);
        panPer4Points3.setLayout(panPer4Points3Layout);
        panPer4Points3Layout.setHorizontalGroup(
            panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points3Layout.createSequentialGroup()
                .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPer4Points3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel48))
                    .addGroup(panPer4Points3Layout.createSequentialGroup()
                        .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel50)
                            .addComponent(jLabel49))
                        .addGap(52, 52, 52)
                        .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPer4Points3Layout.createSequentialGroup()
                                .addComponent(txtSur3Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur3Len1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points3Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel52))
                            .addGroup(panPer4Points3Layout.createSequentialGroup()
                                .addComponent(txtSur3Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur3Len2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points3Layout.createSequentialGroup()
                                .addComponent(txtSur3Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur3Len3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCalSur3))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points3Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel53)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        panPer4Points3Layout.setVerticalGroup(
            panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur3Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur3Len1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur3Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur3Len2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(10, 10, 10)
                .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur3Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur3Len3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGap(18, 18, 18)
                .addComponent(btnCalSur3)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(panPer4Points3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points3Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel53)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panSur3PointsLayout = new javax.swing.GroupLayout(panSur3Points);
        panSur3Points.setLayout(panSur3PointsLayout);
        panSur3PointsLayout.setHorizontalGroup(
            panSur3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(panSur3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panSur3PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panSur3PointsLayout.setVerticalGroup(
            panSur3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(panSur3PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panSur3PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panSurC.addTab("3 Points", panSur3Points);

        jLabel41.setText("Calculate the 4-point surface");

        jLabel42.setText("1");

        jLabel43.setText("2");

        btnCalSur4.setText("Calculate Surface ");
        btnCalSur4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalSur4ActionPerformed(evt);
            }
        });

        jLabel44.setText("Latitude (X)");

        jLabel45.setText("Length (Y)");

        jLabel46.setText("# Point");

        jLabel47.setText("3");

        jLabel55.setText("4");

        javax.swing.GroupLayout panPer4Points2Layout = new javax.swing.GroupLayout(panPer4Points2);
        panPer4Points2.setLayout(panPer4Points2Layout);
        panPer4Points2Layout.setHorizontalGroup(
            panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points2Layout.createSequentialGroup()
                .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPer4Points2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel41))
                    .addGroup(panPer4Points2Layout.createSequentialGroup()
                        .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42))
                        .addGap(52, 52, 52)
                        .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPer4Points2Layout.createSequentialGroup()
                                .addComponent(txtSur4Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur4Len1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points2Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel45))
                            .addGroup(panPer4Points2Layout.createSequentialGroup()
                                .addComponent(txtSur4Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur4Len2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points2Layout.createSequentialGroup()
                                .addComponent(txtSur4Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur4Len3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCalSur4)
                    .addGroup(panPer4Points2Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(52, 52, 52)
                        .addComponent(txtSur4Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSur4Len4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points2Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel46)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        panPer4Points2Layout.setVerticalGroup(
            panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur4Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur4Len1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur4Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur4Len2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(10, 10, 10)
                .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur4Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur4Len3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSur4Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSur4Len4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55)))
                .addGap(18, 18, 18)
                .addComponent(btnCalSur4)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(panPer4Points2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points2Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel46)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panSur4PointsLayout = new javax.swing.GroupLayout(panSur4Points);
        panSur4Points.setLayout(panSur4PointsLayout);
        panSur4PointsLayout.setHorizontalGroup(
            panSur4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(panSur4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panSur4PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panSur4PointsLayout.setVerticalGroup(
            panSur4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(panSur4PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panSur4PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panSurC.addTab("4 Points", panSur4Points);

        jLabel56.setText("Calculate the 5-point surface");

        jLabel57.setText("1");

        jLabel58.setText("2");

        btnCalSur5.setText("Calculate Surface ");
        btnCalSur5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalSur5ActionPerformed(evt);
            }
        });

        jLabel59.setText("Latitude (X)");

        jLabel60.setText("Length (Y)");

        jLabel61.setText("# Point");

        jLabel62.setText("3");

        jLabel63.setText("4");

        jLabel64.setText("5");

        javax.swing.GroupLayout panPer4Points4Layout = new javax.swing.GroupLayout(panPer4Points4);
        panPer4Points4.setLayout(panPer4Points4Layout);
        panPer4Points4Layout.setHorizontalGroup(
            panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points4Layout.createSequentialGroup()
                .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPer4Points4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel56))
                    .addGroup(panPer4Points4Layout.createSequentialGroup()
                        .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57))
                        .addGap(52, 52, 52)
                        .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPer4Points4Layout.createSequentialGroup()
                                .addComponent(txtSur5Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur5Len1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points4Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel60))
                            .addGroup(panPer4Points4Layout.createSequentialGroup()
                                .addComponent(txtSur5Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur5Len2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPer4Points4Layout.createSequentialGroup()
                                .addComponent(txtSur5Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSur5Len3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCalSur5)
                    .addGroup(panPer4Points4Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(52, 52, 52)
                        .addComponent(txtSur5Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSur5Len4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPer4Points4Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(52, 52, 52)
                        .addComponent(txtSur5Lat5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSur5Len5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points4Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel61)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        panPer4Points4Layout.setVerticalGroup(
            panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPer4Points4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60))
                .addGap(18, 18, 18)
                .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur5Lat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur5Len1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur5Lat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur5Len2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addGap(10, 10, 10)
                .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur5Lat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur5Len3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur5Lat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur5Len4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSur5Lat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSur5Len5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addComponent(btnCalSur5)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(panPer4Points4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPer4Points4Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel61)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panSur5PointsLayout = new javax.swing.GroupLayout(panSur5Points);
        panSur5Points.setLayout(panSur5PointsLayout);
        panSur5PointsLayout.setHorizontalGroup(
            panSur5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panSur5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panSur5PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panSur5PointsLayout.setVerticalGroup(
            panSur5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panSur5PointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panSur5PointsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panPer4Points4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panSurC.addTab("5 Points", panSur5Points);

        javax.swing.GroupLayout panSurfaceCLayout = new javax.swing.GroupLayout(panSurfaceC);
        panSurfaceC.setLayout(panSurfaceCLayout);
        panSurfaceCLayout.setHorizontalGroup(
            panSurfaceCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panSurC)
        );
        panSurfaceCLayout.setVerticalGroup(
            panSurfaceCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panSurC)
        );

        tabPrincipal1.addTab("Surface Calculator", panSurfaceC);

        jLabel1.setText("==================== \" LOS GPS \" ====================");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(tabPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCoordinatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCoordinatesActionPerformed

        GPS gps;
        double latDegrees;
        double latMinutes;
        double latSeconds;
        double lenDegrees;
        double lenMinutes;
        double lenSeconds;
        String save;

        latDegrees = Double.parseDouble(txtLatDegrees1.getText());
        latMinutes = Double.parseDouble(txtLatMinutes1.getText());
        latSeconds = Double.parseDouble(txtLatSeconds1.getText());
        lenDegrees = Double.parseDouble(txtLenDegrees1.getText());
        lenMinutes = Double.parseDouble(txtLenMinutes1.getText());
        lenSeconds = Double.parseDouble(txtLenSeconds1.getText());
        save = "Save Coordinates";

        gps = new GPS(latDegrees, latMinutes, latSeconds, lenDegrees, lenMinutes,
                lenSeconds);
        GPSController.save(gps);
        JOptionPane.showMessageDialog(rootPane, save);

    }//GEN-LAST:event_btnSaveCoordinatesActionPerformed

    private void txtLenSeconds1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLenSeconds1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLenSeconds1ActionPerformed

    private void btnShowCoordinatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCoordinatesActionPerformed

        GPSController gpsController = new GPSController();
        txtShowData.setText(GPSController.readCsv("D:\\Universidad\\4to Semestre\\Tareas\\Fundamentos de la Programacion\\Proyecto\\G4GPS\\Project\\PR01 Menu\\GPS.csv"));


    }//GEN-LAST:event_btnShowCoordinatesActionPerformed

    private void txtLenDegrees1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLenDegrees1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLenDegrees1ActionPerformed

    private void btnConvertCoordinateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertCoordinateActionPerformed

        String message;
        double latDegrees;
        double latMinutes;
        double latSeconds;
        double ddlat;
        double xLat;
        latDegrees = Double.parseDouble(txtLatDegrees1.getText());
        latMinutes = Double.parseDouble(txtLatMinutes1.getText());
        latSeconds = Double.parseDouble(txtLatSeconds1.getText());
        ddlat = GPSController.turnLatitudeDMStoDD(latDegrees, latMinutes, latSeconds);
        xLat = GPSController.turnLatitudDDtoUTM(ddlat);

        double lenDegrees;
        double lenMinutes;
        double lenSeconds;
        double ddlen;
        double yLen;
        lenDegrees = Double.parseDouble(txtLenDegrees1.getText());
        lenMinutes = Double.parseDouble(txtLenMinutes1.getText());
        lenSeconds = Double.parseDouble(txtLenSeconds1.getText());
        ddlen = GPSController.turnLongitudDMStoDD(lenDegrees, lenMinutes, lenSeconds);
        yLen = GPSController.turnLongitudDDtoUTM(ddlen);

        message = "Converted Latitude: " + "\n" + xLat + "\n" + "Converted Length: " + "\n" + yLen;
        JOptionPane.showMessageDialog(rootPane, message);

    }//GEN-LAST:event_btnConvertCoordinateActionPerformed

    private void btnCalPer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalPer3ActionPerformed

        String message;
        double per3Lat1;
        double per3Len1;
        double per3Lat2;
        double per3Len2;
        double per3Lat3;
        double per3Len3;
        double per;
        per3Lat1 = Double.parseDouble(txtPer3Lat1.getText());
        per3Len1 = Double.parseDouble(txtPer3Len1.getText());
        per3Lat2 = Double.parseDouble(txtPer3Lat2.getText());
        per3Len2 = Double.parseDouble(txtPer3Len2.getText());
        per3Lat3 = Double.parseDouble(txtPer3Lat3.getText());
        per3Len3 = Double.parseDouble(txtPer3Len3.getText());
        per = GPSController.computePerimeter3Points(per3Lat1, per3Lat2, per3Lat3,
                per3Len1, per3Len2, per3Len3);

        message = "The Perimeter is: " + "\n" + per;
        JOptionPane.showMessageDialog(rootPane, message);


    }//GEN-LAST:event_btnCalPer3ActionPerformed

    private void btnCalPer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalPer4ActionPerformed

        String message;
        double per4Lat1;
        double per4Len1;
        double per4Lat2;
        double per4Len2;
        double per4Lat3;
        double per4Len3;
        double per4Lat4;
        double per4Len4;
        double per;
        per4Lat1 = Double.parseDouble(txtPer4Lat1.getText());
        per4Len1 = Double.parseDouble(txtPer4Len1.getText());
        per4Lat2 = Double.parseDouble(txtPer4Lat2.getText());
        per4Len2 = Double.parseDouble(txtPer4Len2.getText());
        per4Lat3 = Double.parseDouble(txtPer4Lat3.getText());
        per4Len3 = Double.parseDouble(txtPer4Len3.getText());
        per4Lat4 = Double.parseDouble(txtPer4Lat4.getText());
        per4Len4 = Double.parseDouble(txtPer4Len4.getText());
        per = GPSController.computePerimeter4Points(per4Lat1, per4Lat2, per4Lat3,
                per4Lat4, per4Len1, per4Len2, per4Len3, per4Len4);

        message = "The Perimeter is: " + "\n" + per;
        JOptionPane.showMessageDialog(rootPane, message);

    }//GEN-LAST:event_btnCalPer4ActionPerformed

    private void btnCalPer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalPer5ActionPerformed

        String message;
        double per5Lat1;
        double per5Len1;
        double per5Lat2;
        double per5Len2;
        double per5Lat3;
        double per5Len3;
        double per5Lat4;
        double per5Len4;
        double per5Lat5;
        double per5Len5;
        double per;
        per5Lat1 = Double.parseDouble(txtPer5Lat1.getText());
        per5Len1 = Double.parseDouble(txtPer5Len1.getText());
        per5Lat2 = Double.parseDouble(txtPer5Lat2.getText());
        per5Len2 = Double.parseDouble(txtPer5Len2.getText());
        per5Lat3 = Double.parseDouble(txtPer5Lat3.getText());
        per5Len3 = Double.parseDouble(txtPer5Len3.getText());
        per5Lat4 = Double.parseDouble(txtPer5Lat4.getText());
        per5Len4 = Double.parseDouble(txtPer5Len4.getText());
        per5Lat5 = Double.parseDouble(txtPer5Lat5.getText());
        per5Len5 = Double.parseDouble(txtPer5Len5.getText());
        per = GPSController.computePerimeter5Points(per5Lat1, per5Lat2, per5Lat3,
                per5Lat4, per5Lat5, per5Len1, per5Len2, per5Len3, per5Len4, per5Len5);

        message = "The Perimeter is: " + "\n" + per;
        JOptionPane.showMessageDialog(rootPane, message);

    }//GEN-LAST:event_btnCalPer5ActionPerformed

    private void btnCalSur3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalSur3ActionPerformed

        String message;
        double sur3Lat1;
        double sur3Len1;
        double sur3Lat2;
        double sur3Len2;
        double sur3Lat3;
        double sur3Len3;
        double sur;
        sur3Lat1 = Double.parseDouble(txtSur3Lat1.getText());
        sur3Len1 = Double.parseDouble(txtSur3Len1.getText());
        sur3Lat2 = Double.parseDouble(txtSur3Lat2.getText());
        sur3Len2 = Double.parseDouble(txtSur3Len2.getText());
        sur3Lat3 = Double.parseDouble(txtSur3Lat3.getText());
        sur3Len3 = Double.parseDouble(txtSur3Len3.getText());
        sur = GPSController.computeArea3Points(sur3Lat1, sur3Lat2, sur3Lat3,
                sur3Len1, sur3Len2, sur3Len3);

        message = "The Surface is: " + "\n" + sur;
        JOptionPane.showMessageDialog(rootPane, message);

    }//GEN-LAST:event_btnCalSur3ActionPerformed

    private void btnCalSur4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalSur4ActionPerformed

        String message;
        double sur4Lat1;
        double sur4Len1;
        double sur4Lat2;
        double sur4Len2;
        double sur4Lat3;
        double sur4Len3;
        double sur4Lat4;
        double sur4Len4;
        double sur;
        sur4Lat1 = Double.parseDouble(txtSur4Lat1.getText());
        sur4Len1 = Double.parseDouble(txtSur4Len1.getText());
        sur4Lat2 = Double.parseDouble(txtSur4Lat2.getText());
        sur4Len2 = Double.parseDouble(txtSur4Len2.getText());
        sur4Lat3 = Double.parseDouble(txtSur4Lat3.getText());
        sur4Len3 = Double.parseDouble(txtSur4Len3.getText());
        sur4Lat4 = Double.parseDouble(txtSur4Lat4.getText());
        sur4Len4 = Double.parseDouble(txtSur4Len4.getText());
        sur = GPSController.computeArea4Points(sur4Lat1, sur4Lat2, sur4Lat3,
                sur4Lat4, sur4Len1, sur4Len2, sur4Len3, sur4Len4);
        
        message = "The Surface is: "+"\n"+sur; 
        JOptionPane.showMessageDialog(rootPane, message);
        
    }//GEN-LAST:event_btnCalSur4ActionPerformed

    private void btnCalSur5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalSur5ActionPerformed

        String message;
        double sur5Lat1;
        double sur5Len1;
        double sur5Lat2;
        double sur5Len2;
        double sur5Lat3;
        double sur5Len3;
        double sur5Lat4;
        double sur5Len4;
        double sur5Lat5;
        double sur5Len5;
        double sur;
        sur5Lat1 = Double.parseDouble(txtSur5Lat1.getText());
        sur5Len1 = Double.parseDouble(txtSur5Len1.getText());
        sur5Lat2 = Double.parseDouble(txtSur5Lat2.getText());
        sur5Len2 = Double.parseDouble(txtSur5Len2.getText());
        sur5Lat3 = Double.parseDouble(txtSur5Lat3.getText());
        sur5Len3 = Double.parseDouble(txtSur5Len3.getText());
        sur5Lat4 = Double.parseDouble(txtSur5Lat4.getText());
        sur5Len4 = Double.parseDouble(txtSur5Len4.getText());
        sur5Lat5 = Double.parseDouble(txtSur5Lat5.getText());
        sur5Len5 = Double.parseDouble(txtSur5Len5.getText());
        sur = GPSController.computeArea5Points(sur5Lat1, sur5Lat2, sur5Lat3,
                sur5Lat4, sur5Lat5, sur5Len1, sur5Len2, sur5Len3, sur5Len4, sur5Len5);
        
        message = "The Surface is: "+"\n"+sur; 
        JOptionPane.showMessageDialog(rootPane, message);
        
    }//GEN-LAST:event_btnCalSur5ActionPerformed

    private void txtSur3Lat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSur3Lat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSur3Lat3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalPer3;
    private javax.swing.JButton btnCalPer4;
    private javax.swing.JButton btnCalPer5;
    private javax.swing.JButton btnCalSur3;
    private javax.swing.JButton btnCalSur4;
    private javax.swing.JButton btnCalSur5;
    private javax.swing.JButton btnConvertCoordinate;
    private javax.swing.JButton btnSaveCoordinates;
    private javax.swing.JButton btnShowCoordinates;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panCC1;
    private javax.swing.JPanel panPer3Points;
    private javax.swing.JPanel panPer4Points;
    private javax.swing.JPanel panPer4Points1;
    private javax.swing.JPanel panPer4Points2;
    private javax.swing.JPanel panPer4Points3;
    private javax.swing.JPanel panPer4Points4;
    private javax.swing.JPanel panPer5Points;
    private javax.swing.JTabbedPane panPerimerterC;
    private javax.swing.JPanel panPerimeterC;
    private javax.swing.JPanel panSur3Points;
    private javax.swing.JPanel panSur4Points;
    private javax.swing.JPanel panSur5Points;
    private javax.swing.JTabbedPane panSurC;
    private javax.swing.JPanel panSurfaceC;
    private javax.swing.JTabbedPane tabPrincipal1;
    private javax.swing.JTextField txtLatDegrees1;
    private javax.swing.JTextField txtLatMinutes1;
    private javax.swing.JTextField txtLatSeconds1;
    private javax.swing.JTextField txtLenDegrees1;
    private javax.swing.JTextField txtLenMinutes1;
    private javax.swing.JTextField txtLenSeconds1;
    private javax.swing.JTextField txtPer3Lat1;
    private javax.swing.JTextField txtPer3Lat2;
    private javax.swing.JTextField txtPer3Lat3;
    private javax.swing.JTextField txtPer3Len1;
    private javax.swing.JTextField txtPer3Len2;
    private javax.swing.JTextField txtPer3Len3;
    private javax.swing.JTextField txtPer4Lat1;
    private javax.swing.JTextField txtPer4Lat2;
    private javax.swing.JTextField txtPer4Lat3;
    private javax.swing.JTextField txtPer4Lat4;
    private javax.swing.JTextField txtPer4Len1;
    private javax.swing.JTextField txtPer4Len2;
    private javax.swing.JTextField txtPer4Len3;
    private javax.swing.JTextField txtPer4Len4;
    private javax.swing.JTextField txtPer5Lat1;
    private javax.swing.JTextField txtPer5Lat2;
    private javax.swing.JTextField txtPer5Lat3;
    private javax.swing.JTextField txtPer5Lat4;
    private javax.swing.JTextField txtPer5Lat5;
    private javax.swing.JTextField txtPer5Len1;
    private javax.swing.JTextField txtPer5Len2;
    private javax.swing.JTextField txtPer5Len3;
    private javax.swing.JTextField txtPer5Len4;
    private javax.swing.JTextField txtPer5Len5;
    private javax.swing.JTextArea txtShowData;
    private javax.swing.JTextField txtSur3Lat1;
    private javax.swing.JTextField txtSur3Lat2;
    private javax.swing.JTextField txtSur3Lat3;
    private javax.swing.JTextField txtSur3Len1;
    private javax.swing.JTextField txtSur3Len2;
    private javax.swing.JTextField txtSur3Len3;
    private javax.swing.JTextField txtSur4Lat1;
    private javax.swing.JTextField txtSur4Lat2;
    private javax.swing.JTextField txtSur4Lat3;
    private javax.swing.JTextField txtSur4Lat4;
    private javax.swing.JTextField txtSur4Len1;
    private javax.swing.JTextField txtSur4Len2;
    private javax.swing.JTextField txtSur4Len3;
    private javax.swing.JTextField txtSur4Len4;
    private javax.swing.JTextField txtSur5Lat1;
    private javax.swing.JTextField txtSur5Lat2;
    private javax.swing.JTextField txtSur5Lat3;
    private javax.swing.JTextField txtSur5Lat4;
    private javax.swing.JTextField txtSur5Lat5;
    private javax.swing.JTextField txtSur5Len1;
    private javax.swing.JTextField txtSur5Len2;
    private javax.swing.JTextField txtSur5Len3;
    private javax.swing.JTextField txtSur5Len4;
    private javax.swing.JTextField txtSur5Len5;
    // End of variables declaration//GEN-END:variables
}
