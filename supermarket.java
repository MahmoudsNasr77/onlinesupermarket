package pkgsuper;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nasr
 */
public class supermarket extends javax.swing.JFrame {
    private final int oilCost = 9, oiledCost = 35, teaCost = 30, coffeCost = 20, chesseCost = 15, milkCost = 14, beansCost = 6,
            fishCost = 22, chpessCost = 5, suceCost = 12, floorCost = 4, saltCost = 1, waterCost = 5, pepsiCost = 6, chocaltaCost = 10, bucatCost = 5;
    //initialize Counter
    private int oilCounter, oiledCounter, teaCounter, coffeCounter, chesseCounter, milkCounter, beansCounter,
            fishCounter, chpessCounter, suceCounter, floorCounter, saltCounter, waterCounter, pepsiCounter, chocaltaCounter, bucatCounter;
    //initialize price 
    private int oilPrice, oiledPrice, teaPrice, coffePrice, chessePrice, milkPrice, beansPrice,
            fishPrice, chpessPrice, sucePrice, floorPrice, saltPrice, waterPrice, pepsiPrice, chocaltaPrice, bucatPrice;

    private double total;
    private PrintWriter output;
    public supermarket() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSpinnerbeans = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabelbeanes = new javax.swing.JLabel();
        jButtonreset = new javax.swing.JButton();
        jSpinneroiled = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jButtoncalc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabeltotal = new javax.swing.JLabel();
        jLabelfise = new javax.swing.JLabel();
        jLabeloiled = new javax.swing.JLabel();
        jSpinnerchesse = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelchesse = new javax.swing.JLabel();
        jSpinnerfise = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSpinnertea = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabeltea = new javax.swing.JLabel();
        jSpinnermilk = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabelmilk = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinnercoffe = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelcoffe = new javax.swing.JLabel();
        jSpinnerfloor = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jLabelfloor = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);

        jSpinnerbeans.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerbeans.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerbeansStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("فول");

        jLabelbeanes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelbeanes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelbeanes.setText("0.0");

        jButtonreset.setBackground(new java.awt.Color(0, 0, 0));
        jButtonreset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonreset.setForeground(new java.awt.Color(255, 255, 255));
        jButtonreset.setText("اعاده تعين");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });

        jSpinneroiled.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinneroiled.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinneroiledStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("تونه");

        jButtoncalc.setBackground(new java.awt.Color(51, 153, 0));
        jButtoncalc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtoncalc.setForeground(new java.awt.Color(255, 255, 255));
        jButtoncalc.setText("حساب");
        jButtoncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncalcActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("الحساب الكلي");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("سمنه");

        jLabeltotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabeltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltotal.setText("0.0");

        jLabelfise.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelfise.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelfise.setText("0.0");

        jLabeloiled.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeloiled.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabeloiled.setText("0.0");

        jSpinnerchesse.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerchesse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerchesseStateChanged(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tea.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("جبنه");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coffe.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cheese.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jLabelchesse.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelchesse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelchesse.setText("0.0");

        jSpinnerfise.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerfise.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerfiseStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(this);
        jLabel2.setText("Welcome in Online Supermarket   ");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/milk (1).jpg"))); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/beans.jpg"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jSpinnertea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnertea.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerteaStateChanged(evt);
            }
        });
        jSpinnertea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinnerteaKeyTyped(evt);
            }
        });

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fish.jpg"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("شاي");

        jLabeltea.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeltea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabeltea.setText("0.0");

        jSpinnermilk.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnermilk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnermilkStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("حليب");

        jLabelmilk.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelmilk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelmilk.setText("0.0");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oiled.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jSpinnercoffe.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnercoffe.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnercoffeStateChanged(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flor.jpg"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("قهوه");

        jLabelcoffe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelcoffe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelcoffe.setText("0.0");

        jSpinnerfloor.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerfloor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerfloorStateChanged(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("دقيق");

        jLabelfloor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelfloor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelfloor.setText("0.0");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("طباعه");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("عربي");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("English");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Choose your products online");

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setEnabled(false);

        jMenu2.setText("Connect Us");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinnerbeans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelbeanes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinnerfise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabelfise, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinneroiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabeloiled, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinnerfloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabelfloor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(609, 609, 609)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtoncalc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonreset, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addComponent(jLabeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnertea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabeltea, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnercoffe, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelcoffe, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerchesse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelchesse, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnermilk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelmilk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton1)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnertea, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnermilk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabelmilk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnercoffe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabeltea)
                                .addComponent(jLabelcoffe))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerchesse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)
                                .addComponent(jLabelchesse)))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinnerfloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabelfloor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinnerbeans, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabelbeanes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerfise, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinneroiled)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabelfise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabeloiled, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtoncalc)
                    .addComponent(jButtonreset)
                    .addComponent(jLabeltotal)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
       jSpinnerbeans.setValue(0);
       jLabelbeanes.setText(null);

       
       jSpinnerchesse.setValue(0);
       jLabelchesse.setText(null); 
       
       
       jSpinnercoffe.setValue(0);
       jLabelcoffe.setText(null); 
       

       
       jSpinnerfloor.setValue(0);
       jLabelfloor.setText(null); 
       
       jSpinnerfise.setValue(0);
       jLabelfise.setText(null); 
       
       jSpinnerbeans.setValue(0);
       jLabelbeanes.setText(null); 

       
       jSpinneroiled.setValue(0);
       jLabeloiled.setText(null);
       
       jSpinnertea.setValue(0);
       jLabeltea.setText(null);
       
       jLabeltotal.setText(null);
   
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void jSpinnerchesseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerchesseStateChanged
        chesseCounter = (int) jSpinnerchesse.getValue();
        chessePrice = chesseCost * chesseCounter;
        jLabelchesse.setText(chessePrice + " LE");
    }//GEN-LAST:event_jSpinnerchesseStateChanged

    private void jSpinnerteaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerteaStateChanged
        teaCounter = (int) jSpinnertea.getValue();
        teaPrice = teaCost * teaCounter;
        jLabeltea.setText(teaPrice + " LE");
    }//GEN-LAST:event_jSpinnerteaStateChanged

    private void jSpinnermilkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnermilkStateChanged
        milkCounter = (int) jSpinnermilk.getValue();
        milkPrice = milkCost * milkCounter;
        jLabelmilk.setText(milkPrice + " LE");
    }//GEN-LAST:event_jSpinnermilkStateChanged

    private void jSpinnercoffeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnercoffeStateChanged
        // TODO add your handling code here:
        coffeCounter = (int) jSpinnercoffe.getValue();
        coffePrice = coffeCost * coffeCounter;
        jLabelcoffe.setText(coffePrice + " LE");
    }//GEN-LAST:event_jSpinnercoffeStateChanged

    private void jButtoncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncalcActionPerformed
       total=oiledPrice+teaPrice+coffePrice+chessePrice+milkPrice+beansPrice+
            fishPrice+floorPrice;
       JOptionPane.showMessageDialog(null, "Your Total Cost is : "+total+" LE");
       jLabeltotal.setText(total+" LE");
       
    }//GEN-LAST:event_jButtoncalcActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LocalDate Date = LocalDate.now();
        LocalTime Time = LocalTime.now();
        String Clock= "Date: "+Date+" Time:"+Time;
        
             
        try {
            if (total !=0){
            output =new PrintWriter("sales"+".txt");
            output.println("\t\t\t\t"+Clock);
            output.println("\t Online Supermarket");
            output.println("---------------------------------------------------");
          
            
            
            if (waterCounter !=0){
                output.println("Water No: "+ waterCounter +" Price :"+waterPrice);
            }
              if (oilCounter !=0){
                output.println("Oil No: "+ oiledCounter +" Price :"+oiledPrice);
            }
               if (oilCounter !=0){
               output.println("Water No: "+ oilCounter +" Price :"+oilPrice);
            }
               if (coffeCounter !=0){
                output.println("Coffee No: "+ coffeCounter +" Price :"+coffePrice);
            }
               if (teaCounter !=0){
                output.println("Tea No: "+ teaCounter +" Price :"+teaPrice);
            }
               if (chpessCounter !=0){
                output.println("Chipsy: No:"+ chpessCounter +" Price :"+chpessPrice);
            }
               if (chesseCounter !=0){
                output.println("Chesse No: "+ chesseCounter +" Price :"+chessePrice);
            }
            
            if (chocaltaCounter !=0){
                output.println("Chocolat No: "+ chocaltaCounter +" Price :"+chocaltaPrice);
            }
              if (pepsiCounter !=0){
                output.println("Pepsi No: "+ pepsiCounter +" Price :"+pepsiPrice);
            }
              if (saltCounter !=0){
                output.println("Salt No: "+ saltCounter +" Price :"+saltPrice);
            }
              if (beansCounter !=0){
                output.println("Bean No: "+ beansCounter +" Price :"+beansPrice);
            }
              if (fishCounter !=0){
                output.println("tuna fish No: "+ fishCounter +" Price :"+fishPrice);
            }
            output.println("---------------------------------------------------");
            output.println("TOTAL :"+total+" LE");
            output.println("Thank You ☺");
            }
            output.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File Not FOund");
        }
    JOptionPane.showMessageDialog(null, "The File Is printed");
           
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
      Connect a1=new Connect();
    
      a1.setLocationRelativeTo(null);
      a1.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    jLabel1.setText("شاي");
    jLabel9.setText("قهوه");
    jLabel22.setText("حبنه");
    jLabel4.setText("حليب");
    jLabel11.setText("فول");
    jLabel14.setText("تونه");
    jLabel15.setText("سمنه");
    jLabel48.setText("دقيق");
    jButton2.setText("طباعه");
    jButtoncalc.setText("حساب");
    jButtonreset.setText("اعاده تعين");
    jLabel6.setText("الحساب الكلي");


    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
            jLabel1.setText("Tea");
    jLabel9.setText("Coffee");
    jLabel22.setText("Cheese");
    jLabel4.setText("Milk");
    jLabel11.setText("Bean");
    jLabel14.setText("Tuna");
    jLabel15.setText("Ghee");
    jLabel48.setText("Flour");
    jButton2.setText("Print");
    jButtoncalc.setText("calculation");
    jButtonreset.setText("Reset");
    jLabel6.setText("Total");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jSpinnerteaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinnerteaKeyTyped
     
    }//GEN-LAST:event_jSpinnerteaKeyTyped

    private void jSpinnerfiseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerfiseStateChanged
        fishCounter = (int) jSpinnerfise.getValue();
        fishPrice = fishCost * fishCounter;
        jLabelfise.setText(fishPrice + " LE");
    }//GEN-LAST:event_jSpinnerfiseStateChanged

    private void jSpinnerfloorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerfloorStateChanged
        floorCounter = (int) jSpinnerfloor.getValue();
        floorPrice = floorCost * floorCounter;
        jLabelfloor.setText(floorPrice + " LE");
    }//GEN-LAST:event_jSpinnerfloorStateChanged

    private void jSpinnerbeansStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerbeansStateChanged
        beansCounter = (int) jSpinnerbeans.getValue();
        beansPrice = beansCost * beansCounter;
        jLabelbeanes.setText(beansPrice + " LE");
    }//GEN-LAST:event_jSpinnerbeansStateChanged

    private void jSpinneroiledStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinneroiledStateChanged
        oiledCounter = (int) jSpinneroiled.getValue();
        oiledPrice = oiledCost * oiledCounter;
        jLabeloiled.setText(oiledPrice + " LE");
    }//GEN-LAST:event_jSpinneroiledStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                supermarket s1=new supermarket();
           
                s1.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtoncalc;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelbeanes;
    private javax.swing.JLabel jLabelchesse;
    private javax.swing.JLabel jLabelcoffe;
    private javax.swing.JLabel jLabelfise;
    private javax.swing.JLabel jLabelfloor;
    private javax.swing.JLabel jLabelmilk;
    private javax.swing.JLabel jLabeloiled;
    private javax.swing.JLabel jLabeltea;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinnerbeans;
    private javax.swing.JSpinner jSpinnerchesse;
    private javax.swing.JSpinner jSpinnercoffe;
    private javax.swing.JSpinner jSpinnerfise;
    private javax.swing.JSpinner jSpinnerfloor;
    private javax.swing.JSpinner jSpinnermilk;
    private javax.swing.JSpinner jSpinneroiled;
    private javax.swing.JSpinner jSpinnertea;
    // End of variables declaration//GEN-END:variables
}
