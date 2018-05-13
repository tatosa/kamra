
package fülespanel;


import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Toolkit.getDefaultToolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.table.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableColumnModel;

public class FülesPanelGUI extends javax.swing.JFrame {
    private Dimension kép=getDefaultToolkit().getScreenSize();
    private Calendar ma;
    private static PreparedStatement pst=null;
    private static ResultSet rs=null;
    java.util.Date dátum2;
    
    
    


    
    


    public FülesPanelGUI() {
        initComponents();
        ma=DátumCombo.getDate();
        adatműveletek.megjelenít();

        
    }

   
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    kávé1Panel = new javax.swing.JPanel();
    kávé1Label = new javax.swing.JLabel();
    kávé1LétszámLabel = new javax.swing.JLabel();
    kávé1LétszámTxt = new javax.swing.JTextField();
    kávé1StartLabel = new javax.swing.JLabel();
    kávé1StartIdőTxt = new javax.swing.JFormattedTextField();
    kávé1EndLabel = new javax.swing.JLabel();
    kávé1EndIdőTxt = new javax.swing.JFormattedTextField();
    kávé1iMódLabel = new javax.swing.JLabel();
    kávé1Combo = new javax.swing.JComboBox<>();
    FülesPanel = new javax.swing.JTabbedPane();
    adatbevitel = new javax.swing.JPanel();
    szervezetválasztó = new javax.swing.JComboBox<>();
    mentésGomb = new javax.swing.JButton();
    mutasdGomb = new javax.swing.JButton();
    reggeliPanel = new javax.swing.JPanel();
    reggeliLabel = new javax.swing.JLabel();
    reggeliLétszámLabel = new javax.swing.JLabel();
    reggeliLétszámTxt = new javax.swing.JTextField();
    reggeliStartLabel = new javax.swing.JLabel();
    reggeliStartIdőTxt = new javax.swing.JFormattedTextField();
    reggeliEndLabel = new javax.swing.JLabel();
    reggeliEndIdőTxt = new javax.swing.JFormattedTextField();
    reggeliMódLabel = new javax.swing.JLabel();
    reggeliCombo = new javax.swing.JComboBox<>();
    kávé1Panel1 = new javax.swing.JPanel();
    kávé1Label1 = new javax.swing.JLabel();
    kávé1LétszámLabel1 = new javax.swing.JLabel();
    kávé1LétszámTxt1 = new javax.swing.JTextField();
    kávé1StartLabel1 = new javax.swing.JLabel();
    kávé1StartIdőTxt1 = new javax.swing.JFormattedTextField();
    kávé1EndLabel1 = new javax.swing.JLabel();
    kávé1EndIdőTxt1 = new javax.swing.JFormattedTextField();
    kávé1iMódLabel1 = new javax.swing.JLabel();
    kávé1Combo1 = new javax.swing.JComboBox<>();
    ebédPanel = new javax.swing.JPanel();
    ebédLabel = new javax.swing.JLabel();
    ebédLétszámLabel = new javax.swing.JLabel();
    ebédLétszámTxt = new javax.swing.JTextField();
    ebédStartLabel = new javax.swing.JLabel();
    ebédStartIdőTxt = new javax.swing.JFormattedTextField();
    ebédEndLabel = new javax.swing.JLabel();
    ebédEndIdőTxt = new javax.swing.JFormattedTextField();
    ebédiMódLabel = new javax.swing.JLabel();
    ebédCombo = new javax.swing.JComboBox<>();
    kávé2Panel = new javax.swing.JPanel();
    kávé2Label = new javax.swing.JLabel();
    kávé2LétszámLabel = new javax.swing.JLabel();
    kávé2LétszámTxt = new javax.swing.JTextField();
    kávé2StartLabel = new javax.swing.JLabel();
    kávé2StartIdőTxt = new javax.swing.JFormattedTextField();
    kávé2EndLabel = new javax.swing.JLabel();
    kávé2EndIdőTxt = new javax.swing.JFormattedTextField();
    kávé2MódLabel = new javax.swing.JLabel();
    kávé2Combo = new javax.swing.JComboBox<>();
    vacsoraPanel = new javax.swing.JPanel();
    vacsoraLabel = new javax.swing.JLabel();
    vacsoraLétszámLabel = new javax.swing.JLabel();
    vacsoraLétszámTxt = new javax.swing.JTextField();
    vacsoraStartLabel = new javax.swing.JLabel();
    vacsoraStartIdőTxt = new javax.swing.JFormattedTextField();
    vacsoraEndLabel = new javax.swing.JLabel();
    vacsoraEndIdőTxt = new javax.swing.JFormattedTextField();
    vacsoraMódLabel = new javax.swing.JLabel();
    vacsoraCombo = new javax.swing.JComboBox<>();
    DátumCombo = new org.gui.JCalendarCombo();
    névjegy = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();

    kávé1Panel.setBackground(new java.awt.Color(255, 255, 255));
    kávé1Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    kávé1Panel.setName(""); // NOI18N

    kávé1Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    kávé1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    kávé1Label.setText("Kávészünet");

    kávé1LétszámLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1LétszámLabel.setText("Létszám:");

    kávé1LétszámTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    kávé1LétszámTxt.setText("fő");

    kávé1StartLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1StartLabel.setText("Kezdés:");

    try {
      kávé1StartIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    kávé1StartIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    kávé1EndLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1EndLabel.setText("Befejezés:");

    try {
      kávé1EndIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    kávé1EndIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    kávé1iMódLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1iMódLabel.setText("Módja:");

    kávé1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "chafing", "tálcás", "hideg", "felszolgálás" }));

    javax.swing.GroupLayout kávé1PanelLayout = new javax.swing.GroupLayout(kávé1Panel);
    kávé1Panel.setLayout(kávé1PanelLayout);
    kávé1PanelLayout.setHorizontalGroup(
      kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kávé1PanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(kávé1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(kávé1PanelLayout.createSequentialGroup()
            .addGroup(kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(kávé1StartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(kávé1LétszámLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(kávé1EndLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(kávé1iMódLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(kávé1LétszámTxt)
              .addComponent(kávé1StartIdőTxt)
              .addComponent(kávé1Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(kávé1EndIdőTxt))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    kávé1PanelLayout.setVerticalGroup(
      kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kávé1PanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(kávé1Label)
        .addGap(18, 18, 18)
        .addGroup(kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1LétszámLabel)
          .addComponent(kávé1LétszámTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1StartLabel)
          .addComponent(kávé1StartIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1EndLabel)
          .addComponent(kávé1EndIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(kávé1iMódLabel))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Karaj 1.0");
    setLocation(kép.width/2-573, kép.height/2-183);
    setResizable(false);
    setSize(new java.awt.Dimension(0, 0));

    FülesPanel.setBackground(new java.awt.Color(204, 204, 204));
    FülesPanel.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        FülesPanelStateChanged(evt);
      }
    });

    adatbevitel.setBackground(new java.awt.Color(204, 204, 204));

    szervezetválasztó.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    szervezetválasztó.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "ILEA", "KERA", "CEPOL", "KTO", "NEMO", "Titkárság", "ICOFI", "KO", "Nyelv", "dr. Boda" }));
    szervezetválasztó.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        szervezetválasztóActionPerformed(evt);
      }
    });

    mentésGomb.setBackground(new java.awt.Color(255, 255, 255));
    mentésGomb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    mentésGomb.setForeground(new java.awt.Color(255, 0, 51));
    mentésGomb.setText("MENTÉS");
    mentésGomb.setEnabled(false);
    mentésGomb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        mentésGombActionPerformed(evt);
      }
    });

    mutasdGomb.setBackground(new java.awt.Color(255, 255, 255));
    mutasdGomb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    mutasdGomb.setForeground(new java.awt.Color(0, 102, 102));
    mutasdGomb.setText("MUTASD!");
    mutasdGomb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        mutasdGombActionPerformed(evt);
      }
    });

    reggeliPanel.setBackground(new java.awt.Color(255, 255, 255));
    reggeliPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    reggeliPanel.setName(""); // NOI18N
    reggeliPanel.setPreferredSize(new java.awt.Dimension(184, 303));

    reggeliLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    reggeliLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    reggeliLabel.setText("Reggeli");

    reggeliLétszámLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    reggeliLétszámLabel.setText("Létszám:");

    reggeliLétszámTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    reggeliLétszámTxt.setEnabled(false);

    reggeliStartLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    reggeliStartLabel.setText("Kezdés:");

    try {
      reggeliStartIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    reggeliStartIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    reggeliStartIdőTxt.setEnabled(false);

    reggeliEndLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    reggeliEndLabel.setText("Befejezés:");

    try {
      reggeliEndIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    reggeliEndIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    reggeliEndIdőTxt.setEnabled(false);

    reggeliMódLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    reggeliMódLabel.setText("Módja:");

    reggeliCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "chafing", "tálcás", "hideg", "felszolgálás" }));
    reggeliCombo.setEnabled(false);
    reggeliCombo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        reggeliComboActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout reggeliPanelLayout = new javax.swing.GroupLayout(reggeliPanel);
    reggeliPanel.setLayout(reggeliPanelLayout);
    reggeliPanelLayout.setHorizontalGroup(
      reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(reggeliPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(reggeliLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(reggeliPanelLayout.createSequentialGroup()
            .addGroup(reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(reggeliStartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(reggeliLétszámLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(reggeliEndLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(reggeliMódLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(reggeliLétszámTxt)
              .addComponent(reggeliStartIdőTxt)
              .addComponent(reggeliEndIdőTxt)
              .addComponent(reggeliCombo, 0, 85, Short.MAX_VALUE))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    reggeliPanelLayout.setVerticalGroup(
      reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(reggeliPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(reggeliLabel)
        .addGap(18, 18, 18)
        .addGroup(reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(reggeliLétszámLabel)
          .addComponent(reggeliLétszámTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(reggeliStartLabel)
          .addComponent(reggeliStartIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(reggeliEndLabel)
          .addComponent(reggeliEndIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(reggeliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(reggeliCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(reggeliMódLabel))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    kávé1Panel1.setBackground(new java.awt.Color(255, 255, 255));
    kávé1Panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    kávé1Panel1.setName(""); // NOI18N
    kávé1Panel1.setPreferredSize(new java.awt.Dimension(184, 303));

    kávé1Label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    kávé1Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    kávé1Label1.setText("Kávészünet");

    kávé1LétszámLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1LétszámLabel1.setText("Létszám:");

    kávé1LétszámTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    kávé1LétszámTxt1.setEnabled(false);

    kávé1StartLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1StartLabel1.setText("Kezdés:");

    try {
      kávé1StartIdőTxt1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    kávé1StartIdőTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    kávé1StartIdőTxt1.setEnabled(false);

    kávé1EndLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1EndLabel1.setText("Befejezés:");

    try {
      kávé1EndIdőTxt1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    kávé1EndIdőTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    kávé1EndIdőTxt1.setEnabled(false);

    kávé1iMódLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé1iMódLabel1.setText("Módja:");

    kávé1Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "chafing", "tálcás", "hideg", "felszolgálás" }));
    kávé1Combo1.setEnabled(false);
    kávé1Combo1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        kávé1Combo1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout kávé1Panel1Layout = new javax.swing.GroupLayout(kávé1Panel1);
    kávé1Panel1.setLayout(kávé1Panel1Layout);
    kávé1Panel1Layout.setHorizontalGroup(
      kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kávé1Panel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(kávé1Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(kávé1Panel1Layout.createSequentialGroup()
            .addGroup(kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(kávé1StartLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(kávé1LétszámLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(kávé1EndLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(kávé1iMódLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(kávé1Combo1, 0, 85, Short.MAX_VALUE)
              .addComponent(kávé1LétszámTxt1)
              .addComponent(kávé1StartIdőTxt1)
              .addComponent(kávé1EndIdőTxt1))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    kávé1Panel1Layout.setVerticalGroup(
      kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kávé1Panel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(kávé1Label1)
        .addGap(18, 18, 18)
        .addGroup(kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1LétszámLabel1)
          .addComponent(kávé1LétszámTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1StartLabel1)
          .addComponent(kávé1StartIdőTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1EndLabel1)
          .addComponent(kávé1EndIdőTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé1Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(kávé1iMódLabel1))
        .addContainerGap(140, Short.MAX_VALUE))
    );

    ebédPanel.setBackground(new java.awt.Color(255, 255, 255));
    ebédPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    ebédPanel.setPreferredSize(new java.awt.Dimension(184, 303));

    ebédLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    ebédLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    ebédLabel.setText("Ebéd");

    ebédLétszámLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    ebédLétszámLabel.setText("Létszám:");

    ebédLétszámTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    ebédLétszámTxt.setEnabled(false);

    ebédStartLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    ebédStartLabel.setText("Kezdés:");

    try {
      ebédStartIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    ebédStartIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    ebédStartIdőTxt.setEnabled(false);

    ebédEndLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    ebédEndLabel.setText("Befejezés:");

    try {
      ebédEndIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    ebédEndIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    ebédEndIdőTxt.setEnabled(false);

    ebédiMódLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    ebédiMódLabel.setText("Módja:");

    ebédCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "chafing", "tálcás", "hideg", "felszolgálás" }));
    ebédCombo.setEnabled(false);
    ebédCombo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ebédComboActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout ebédPanelLayout = new javax.swing.GroupLayout(ebédPanel);
    ebédPanel.setLayout(ebédPanelLayout);
    ebédPanelLayout.setHorizontalGroup(
      ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ebédPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(ebédLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(ebédPanelLayout.createSequentialGroup()
            .addGroup(ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(ebédStartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(ebédLétszámLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(ebédEndLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(ebédiMódLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
            .addGroup(ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(ebédStartIdőTxt)
              .addComponent(ebédEndIdőTxt)
              .addComponent(ebédCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(ebédLétszámTxt, javax.swing.GroupLayout.Alignment.TRAILING))))
        .addContainerGap())
    );
    ebédPanelLayout.setVerticalGroup(
      ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ebédPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(ebédLabel)
        .addGap(18, 18, 18)
        .addGroup(ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(ebédLétszámLabel)
          .addComponent(ebédLétszámTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(ebédStartLabel)
          .addComponent(ebédStartIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(ebédEndLabel)
          .addComponent(ebédEndIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(ebédPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(ebédCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ebédiMódLabel))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    kávé2Panel.setBackground(new java.awt.Color(255, 255, 255));
    kávé2Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    kávé2Panel.setName(""); // NOI18N
    kávé2Panel.setPreferredSize(new java.awt.Dimension(184, 303));

    kávé2Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    kávé2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    kávé2Label.setText("Kávészünet");

    kávé2LétszámLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé2LétszámLabel.setText("Létszám:");

    kávé2LétszámTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    kávé2LétszámTxt.setEnabled(false);

    kávé2StartLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé2StartLabel.setText("Kezdés:");

    try {
      kávé2StartIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    kávé2StartIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    kávé2StartIdőTxt.setEnabled(false);

    kávé2EndLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé2EndLabel.setText("Befejezés:");

    try {
      kávé2EndIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    kávé2EndIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    kávé2EndIdőTxt.setEnabled(false);

    kávé2MódLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    kávé2MódLabel.setText("Módja:");

    kávé2Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "chafing", "tálcás", "hideg", "felszolgálás" }));
    kávé2Combo.setEnabled(false);
    kávé2Combo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        kávé2ComboActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout kávé2PanelLayout = new javax.swing.GroupLayout(kávé2Panel);
    kávé2Panel.setLayout(kávé2PanelLayout);
    kávé2PanelLayout.setHorizontalGroup(
      kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kávé2PanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(kávé2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(kávé2PanelLayout.createSequentialGroup()
            .addGroup(kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(kávé2StartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(kávé2LétszámLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(kávé2EndLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(kávé2MódLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(kávé2EndIdőTxt, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(kávé2LétszámTxt, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(kávé2StartIdőTxt, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(kávé2Combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 89, Short.MAX_VALUE))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    kávé2PanelLayout.setVerticalGroup(
      kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kávé2PanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(kávé2Label)
        .addGap(18, 18, 18)
        .addGroup(kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé2LétszámLabel)
          .addComponent(kávé2LétszámTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé2StartLabel)
          .addComponent(kávé2StartIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé2EndLabel)
          .addComponent(kávé2EndIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(kávé2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(kávé2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(kávé2MódLabel))
        .addContainerGap(140, Short.MAX_VALUE))
    );

    vacsoraPanel.setBackground(new java.awt.Color(255, 255, 255));
    vacsoraPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    vacsoraPanel.setPreferredSize(new java.awt.Dimension(184, 303));

    vacsoraLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    vacsoraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    vacsoraLabel.setText("Vacsora");

    vacsoraLétszámLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    vacsoraLétszámLabel.setText("Létszám:");

    vacsoraLétszámTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    vacsoraLétszámTxt.setEnabled(false);

    vacsoraStartLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    vacsoraStartLabel.setText("Kezdés:");

    try {
      vacsoraStartIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    vacsoraStartIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    vacsoraStartIdőTxt.setEnabled(false);

    vacsoraEndLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    vacsoraEndLabel.setText("Befejezés:");

    try {
      vacsoraEndIdőTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    vacsoraEndIdőTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    vacsoraEndIdőTxt.setEnabled(false);

    vacsoraMódLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    vacsoraMódLabel.setText("Módja:");

    vacsoraCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "chafing", "tálcás", "hideg", "felszolgálás" }));
    vacsoraCombo.setEnabled(false);
    vacsoraCombo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        vacsoraComboActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout vacsoraPanelLayout = new javax.swing.GroupLayout(vacsoraPanel);
    vacsoraPanel.setLayout(vacsoraPanelLayout);
    vacsoraPanelLayout.setHorizontalGroup(
      vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(vacsoraPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(vacsoraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(vacsoraPanelLayout.createSequentialGroup()
            .addGroup(vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(vacsoraStartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(vacsoraLétszámLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(vacsoraEndLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(vacsoraMódLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(vacsoraLétszámTxt)
              .addComponent(vacsoraEndIdőTxt)
              .addComponent(vacsoraStartIdőTxt)
              .addComponent(vacsoraCombo, 0, 89, Short.MAX_VALUE))))
        .addContainerGap(18, Short.MAX_VALUE))
    );
    vacsoraPanelLayout.setVerticalGroup(
      vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(vacsoraPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(vacsoraLabel)
        .addGap(18, 18, 18)
        .addGroup(vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(vacsoraLétszámLabel)
          .addComponent(vacsoraLétszámTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(vacsoraStartLabel)
          .addComponent(vacsoraStartIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(vacsoraEndLabel)
          .addComponent(vacsoraEndIdőTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(vacsoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(vacsoraCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(vacsoraMódLabel))
        .addContainerGap(140, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout adatbevitelLayout = new javax.swing.GroupLayout(adatbevitel);
    adatbevitel.setLayout(adatbevitelLayout);
    adatbevitelLayout.setHorizontalGroup(
      adatbevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(adatbevitelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(adatbevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(szervezetválasztó, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(mentésGomb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(mutasdGomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(DátumCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(reggeliPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(kávé1Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(ebédPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(kávé2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(vacsoraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(30, Short.MAX_VALUE))
    );
    adatbevitelLayout.setVerticalGroup(
      adatbevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(adatbevitelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(adatbevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(kávé2Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ebédPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(reggeliPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adatbevitelLayout.createSequentialGroup()
            .addComponent(DátumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(2, 2, 2)
            .addComponent(szervezetválasztó, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(mentésGomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(mutasdGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(kávé1Panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(vacsoraPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    FülesPanel.addTab("Adatbevitel", adatbevitel);

    névjegy.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fülespanel/karaj.jpg"))); // NOI18N

    jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 102, 102));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("KARAJ 1.0");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 102, 102));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Ellátást segítő szoftver");

    javax.swing.GroupLayout névjegyLayout = new javax.swing.GroupLayout(névjegy);
    névjegy.setLayout(névjegyLayout);
    névjegyLayout.setHorizontalGroup(
      névjegyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, névjegyLayout.createSequentialGroup()
        .addContainerGap(746, Short.MAX_VALUE)
        .addGroup(névjegyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(35, 35, 35))
    );
    névjegyLayout.setVerticalGroup(
      névjegyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, névjegyLayout.createSequentialGroup()
        .addContainerGap(42, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(33, 33, 33))
    );

    FülesPanel.addTab("Névjegy", névjegy);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(FülesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(FülesPanel)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
//szervezetválasztó aktíválja a szövegmezőket, de a combot nem
    private void szervezetválasztóActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szervezetválasztóActionPerformed
        int szervezet;
        
           
        szervezet = szervezetválasztó.getSelectedIndex();
        //System.out.println(szervezet);
        
        switch (szervezet){
            case 0:
                reggeliPanel.setBackground(new Color(255,255,255));
                kávé1Panel1.setBackground(new Color(255,255,255));
                ebédPanel.setBackground(new Color(255,255,255));
                kávé2Panel.setBackground(new Color(255,255,255));
                vacsoraPanel.setBackground(new Color(255,255,255));
                mentésGomb.setEnabled(false);
                break;
            case 1: //ILEA
                reggeliPanel.setBackground(Color.ORANGE);
                kávé1Panel1.setBackground(Color.ORANGE);
                ebédPanel.setBackground(Color.ORANGE);
                kávé2Panel.setBackground(Color.ORANGE);
                vacsoraPanel.setBackground(Color.ORANGE);
                break;
            case 2: //KERA
                reggeliPanel.setBackground(Color.CYAN);
                kávé1Panel1.setBackground(Color.CYAN);
                ebédPanel.setBackground(Color.CYAN);
                kávé2Panel.setBackground(Color.CYAN);
                vacsoraPanel.setBackground(Color.CYAN);
                break;
            case 3:  //CEPOL
                reggeliPanel.setBackground(Color.MAGENTA);
                kávé1Panel1.setBackground(Color.MAGENTA);
                ebédPanel.setBackground(Color.MAGENTA);
                kávé2Panel.setBackground(Color.MAGENTA);
                vacsoraPanel.setBackground(Color.MAGENTA);
                break;
            case 4: //KTO
                reggeliPanel.setBackground(Color.YELLOW);
                kávé1Panel1.setBackground(Color.YELLOW);
                ebédPanel.setBackground(Color.YELLOW);
                kávé2Panel.setBackground(Color.YELLOW);
                vacsoraPanel.setBackground(Color.YELLOW);
                break;
            case 5: //NEMO
                reggeliPanel.setBackground(new Color(64,128,128));
                kávé1Panel1.setBackground(new Color(64,128,128));
                ebédPanel.setBackground(new Color(64,128,128));
                kávé2Panel.setBackground(new Color(64,128,128));
                vacsoraPanel.setBackground(new Color(64,128,128));
                break;
            case 6: //titkárság
                reggeliPanel.setBackground(Color.PINK);
                kávé1Panel1.setBackground(Color.PINK);
                ebédPanel.setBackground(Color.PINK);
                kávé2Panel.setBackground(Color.PINK);
                vacsoraPanel.setBackground(Color.PINK);
                break;
            case 7: //icofi
                reggeliPanel.setBackground(new Color(128,255,128));
                kávé1Panel1.setBackground(new Color(128,255,128));
                ebédPanel.setBackground(new Color(128,255,128));
                kávé2Panel.setBackground(new Color(128,255,128));
                vacsoraPanel.setBackground(new Color(128,255,128));
                break;
            case 8:  //ko
                reggeliPanel.setBackground(new Color(128,128,64));
                kávé1Panel1.setBackground(new Color(128,128,64));
                ebédPanel.setBackground(new Color(128,128,64));
                kávé2Panel.setBackground(new Color(128,128,64));
                vacsoraPanel.setBackground(new Color(128,128,64));
                break;
            case 9:  //nyelv
                reggeliPanel.setBackground(new Color(128,0,255));
                kávé1Panel1.setBackground(new Color(128,0,255));
                ebédPanel.setBackground(new Color(128,0,255));
                kávé2Panel.setBackground(new Color(128,0,255));
                vacsoraPanel.setBackground(new Color(128,0,255));
                break;
            case 10:  //dr. Boda
                reggeliPanel.setBackground(new Color(128,64,0));
                kávé1Panel1.setBackground(new Color(128,64,0));
                ebédPanel.setBackground(new Color(128,64,0));
                kávé2Panel.setBackground(new Color(128,64,0));
                vacsoraPanel.setBackground(new Color(128,64,0));
                break;
                   
        }
    
            if (szervezet>0){
                reggeliLétszámTxt.setEnabled(true); reggeliStartIdőTxt.setEnabled(true);reggeliEndIdőTxt.setEnabled(true);
                kávé1LétszámTxt1.setEnabled(true);kávé1StartIdőTxt1.setEnabled(true);kávé1EndIdőTxt1.setEnabled(true);
                ebédLétszámTxt.setEnabled(true);ebédStartIdőTxt.setEnabled(true);ebédEndIdőTxt.setEnabled(true);
                kávé2LétszámTxt.setEnabled(true);kávé2StartIdőTxt.setEnabled(true);kávé2EndIdőTxt.setEnabled(true);
                vacsoraLétszámTxt.setEnabled(true);vacsoraStartIdőTxt.setEnabled(true);vacsoraEndIdőTxt.setEnabled(true);             
            }else{
                alaphelyzet();
          }
            //létszámváltozáskor a Combo aktív marad és az indexét 0-ra állítja át
            reggeliLétszámTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent de) {
                reggeliCombo.setEnabled(true); 
                reggeliCombo.setSelectedIndex(0);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent de) {
                reggeliCombo.setEnabled(true); 
                reggeliCombo.setSelectedIndex(0);
                if (reggeliLétszámTxt.getText().equals("")){
                    reggeliCombo.setEnabled(false);
                    utolsóVizsgálat();
                }
           }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent de) {
           }
    
        });
            kávé1LétszámTxt1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent de) {
                kávé1Combo1.setEnabled(true); 
                kávé1Combo1.setSelectedIndex(0);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent de) {
                kávé1Combo1.setEnabled(true); 
                kávé1Combo1.setSelectedIndex(0);
                if (kávé1LétszámTxt1.getText().equals("")){
                    kávé1Combo1.setEnabled(false);
                    utolsóVizsgálat();
                }
           }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent de) {
           }
    
        });
            ebédLétszámTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent de) {
                ebédCombo.setEnabled(true); 
                ebédCombo.setSelectedIndex(0);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent de) {
                ebédCombo.setEnabled(true); 
                ebédCombo.setSelectedIndex(0);
                if (ebédLétszámTxt.getText().equals(""))ebédCombo.setEnabled(false);
           }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent de) {
           }
    
        });
            kávé2LétszámTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent de) {
                kávé2Combo.setEnabled(true); 
                kávé2Combo.setSelectedIndex(0);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent de) {
                kávé2Combo.setEnabled(true); 
                kávé2Combo.setSelectedIndex(0);
                if (kávé2LétszámTxt.getText().equals("")){
                    kávé2Combo.setEnabled(false);
                    utolsóVizsgálat();
                }
           }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent de) {
           }
    
        });
            vacsoraLétszámTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent de) {
                vacsoraCombo.setEnabled(true); 
                vacsoraCombo.setSelectedIndex(0);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent de) {
                vacsoraCombo.setEnabled(true); 
                vacsoraCombo.setSelectedIndex(0);
                if (vacsoraLétszámTxt.getText().equals("")){
                    vacsoraCombo.setEnabled(false);
                    utolsóVizsgálat();
                }
           }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent de) {
           }
    
        });
            
    
    
    }//GEN-LAST:event_szervezetválasztóActionPerformed

    
//az eljárás ellenőrzi, hogy stringben szám van vagy sem
    public static boolean isNumeric(String str){
          return str.matches("-?\\d+(\\.\\d+)?");
        }
//alaphelyzetbe állítja az űrlapot        
    public void alaphelyzet(){
                
                reggeliPanel.setBackground(new Color(255,255,255));
                kávé1Panel1.setBackground(new Color(255,255,255));
                ebédPanel.setBackground(new Color(255,255,255));
                kávé2Panel.setBackground(new Color(255,255,255));
                vacsoraPanel.setBackground(new Color(255,255,255));
                mentésGomb.setEnabled(false);
                
                DátumCombo.setDate(ma);
                szervezetválasztó.setSelectedIndex(0);
                
                reggeliLétszámTxt.setEnabled(false); reggeliStartIdőTxt.setEnabled(false);reggeliEndIdőTxt.setEnabled(false);reggeliCombo.setEnabled(false);
                kávé1LétszámTxt1.setEnabled(false);kávé1StartIdőTxt1.setEnabled(false);kávé1EndIdőTxt1.setEnabled(false);kávé1Combo1.setEnabled(false);
                ebédLétszámTxt.setEnabled(false);ebédStartIdőTxt.setEnabled(false);ebédEndIdőTxt.setEnabled(false);ebédCombo.setEnabled(false);
                kávé2LétszámTxt.setEnabled(false);kávé2StartIdőTxt.setEnabled(false);kávé2EndIdőTxt.setEnabled(false);kávé2Combo.setEnabled(false);
                vacsoraLétszámTxt.setEnabled(false);vacsoraStartIdőTxt.setEnabled(false);vacsoraEndIdőTxt.setEnabled(false);vacsoraCombo.setEnabled(false);             
                
                reggeliLétszámTxt.setText(""); reggeliStartIdőTxt.setText("");reggeliEndIdőTxt.setText("");
                kávé1LétszámTxt1.setText("");kávé1StartIdőTxt1.setText("");kávé1EndIdőTxt1.setText("");
                ebédLétszámTxt.setText("");ebédStartIdőTxt.setText("");ebédEndIdőTxt.setText("");
                kávé2LétszámTxt.setText("");kávé2StartIdőTxt.setText("");kávé2EndIdőTxt.setText("");
                vacsoraLétszámTxt.setText("");vacsoraStartIdőTxt.setText("");vacsoraEndIdőTxt.setText("");

        }
    
//ha legalább egy Combo aktív, akkor a mentés gomb engedélyeztté válik
    public void utolsóVizsgálat(){
            if (reggeliCombo.getSelectedIndex()>0 ||
                kávé1Combo1.getSelectedIndex()>0 ||
                ebédCombo.getSelectedIndex()>0 ||    
                kávé2Combo.getSelectedIndex()>0 ||
                vacsoraCombo.getSelectedIndex()>0
                ) mentésGomb.setEnabled(true);
    }
    
    
    private void mentésGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentésGombActionPerformed
        int regLétsz, kv1Létsz, ebeLétsz, kv2Létsz, vacsLétsz;
        
        adatműveletek.törlés();
        
        String dátum,szervezet,regSt,regE,regMod,
                                kv1St,kv1E,kv1Mod,
                                ebeSt,ebeE,ebeMod,
                                kv2St,kv2E,kv2Mod,
                                vacsSt,vacsE,vacsMod;
        
        
        //System.out.println("mentés");
        if (
            !isNumeric(reggeliLétszámTxt.getText()) &&
            !isNumeric(kávé1LétszámTxt1.getText())  &&
            !isNumeric(ebédLétszámTxt.getText())    &&
            !isNumeric(kávé2LétszámTxt.getText())   &&
            !isNumeric(vacsoraLétszámTxt.getText())
           )
        {new Hiba1(this, true);}
        else
        {//ez szám
            //mentésGomb.setEnabled(true);
            
            if (reggeliLétszámTxt.getText().equals(""))reggeliLétszámTxt.setText("0");
            if (kávé1LétszámTxt1.getText().equals(""))kávé1LétszámTxt1.setText("0");
            if (ebédLétszámTxt.getText().equals(""))ebédLétszámTxt.setText("0");
            if (kávé2LétszámTxt.getText().equals(""))kávé2LétszámTxt.setText("0");
            if (vacsoraLétszámTxt.getText().equals(""))vacsoraLétszámTxt.setText("0");
            
            
            dátum=DátumCombo.getSelectedDate();     //0
            szervezet=szervezetválasztó.getSelectedItem().toString();   //1

            regLétsz=Integer.parseInt(reggeliLétszámTxt.getText());     //2
            regSt=reggeliStartIdőTxt.getText();     //3
            regE=reggeliEndIdőTxt.getText();        //4
            regMod=reggeliCombo.getSelectedItem().toString();   //5

            
            kv1Létsz=Integer.parseInt(kávé1LétszámTxt1.getText());     //6
            kv1St=kávé1StartIdőTxt1.getText();    //7
            kv1E=kávé1EndIdőTxt1.getText();    //8
            kv1Mod=kávé1Combo1.getSelectedItem().toString();    //9
    
            
            ebeLétsz=Integer.parseInt(ebédLétszámTxt.getText());     //10
            ebeSt=ebédStartIdőTxt.getText();                        //11
            ebeE=ebédEndIdőTxt.getText();                           //12
            ebeMod=ebédCombo.getSelectedItem().toString();   //13
           
            
            kv2Létsz=Integer.parseInt(kávé2LétszámTxt.getText());     //14
            kv2St=kávé2StartIdőTxt.getText();    //15
            kv2E=kávé2EndIdőTxt.getText();    //16
            kv2Mod=kávé2Combo.getSelectedItem().toString();    //17

            vacsLétsz=Integer.parseInt(vacsoraLétszámTxt.getText());     //18
            vacsSt=vacsoraStartIdőTxt.getText();                        //19
            vacsE=vacsoraEndIdőTxt.getText();                           //20
            vacsMod=vacsoraCombo.getSelectedItem().toString();   //21
            
            
            adatműveletek.adatgyűjtés(dátum,szervezet,regLétsz,regSt,regE,regMod,
                                                      kv1Létsz,kv1St,kv1E,kv1Mod,
                                                      ebeLétsz,ebeSt,ebeE,ebeMod,
                                                      kv2Létsz,kv2St,kv2E,kv2Mod,
                                                      vacsLétsz,vacsSt,vacsE,vacsMod);
            adatműveletek.beszúr();
//            adatműveletek.eltűntet();
            new Mentés(this, true);
            alaphelyzet();
            
adatműveletek.megjelenít();
           
            


            
            
        }
    }//GEN-LAST:event_mentésGombActionPerformed

    //ha a combobox index nagyobb 0-nál és a létszám nagyobb 0-nál, akkor aktiválódik a Mentés gomb
    private void reggeliComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reggeliComboActionPerformed
        if (reggeliCombo.getSelectedIndex()>0 && isNumeric(reggeliLétszámTxt.getText()) && Integer.parseInt(reggeliLétszámTxt.getText())>0
            ){mentésGomb.setEnabled(true);}else{mentésGomb.setEnabled(false);}
    }//GEN-LAST:event_reggeliComboActionPerformed

    private void kávé1Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kávé1Combo1ActionPerformed
        if (kávé1Combo1.getSelectedIndex()>0 && isNumeric(kávé1LétszámTxt1.getText()) && Integer.parseInt(kávé1LétszámTxt1.getText())>0
            ){mentésGomb.setEnabled(true);}else{mentésGomb.setEnabled(false);}
    }//GEN-LAST:event_kávé1Combo1ActionPerformed

    private void ebédComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebédComboActionPerformed
        if (ebédCombo.getSelectedIndex()>0 && isNumeric(ebédLétszámTxt.getText()) && Integer.parseInt(ebédLétszámTxt.getText())>0
            ){mentésGomb.setEnabled(true);}else{mentésGomb.setEnabled(false);}
    }//GEN-LAST:event_ebédComboActionPerformed

    private void kávé2ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kávé2ComboActionPerformed
        if (kávé2Combo.getSelectedIndex()>0 && isNumeric(kávé2LétszámTxt.getText()) && Integer.parseInt(kávé2LétszámTxt.getText())>0
            ){mentésGomb.setEnabled(true);}else{mentésGomb.setEnabled(false);}
    }//GEN-LAST:event_kávé2ComboActionPerformed

    private void vacsoraComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacsoraComboActionPerformed
        if (vacsoraCombo.getSelectedIndex()>0 && isNumeric(vacsoraLétszámTxt.getText()) && Integer.parseInt(vacsoraLétszámTxt.getText())>0
            ){mentésGomb.setEnabled(true);}else{mentésGomb.setEnabled(false);}
    }//GEN-LAST:event_vacsoraComboActionPerformed

    private void FülesPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FülesPanelStateChanged
        
        
       
        
    }//GEN-LAST:event_FülesPanelStateChanged

    private void mutasdGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasdGombActionPerformed
//        ArrayList columnNames = new ArrayList();
//        ArrayList data = new ArrayList();
//
//        //  Connect to an MySQL Database, run query, get result set
//        String url = "jdbc:mysql://localhost:3306/madpilot";
//        String userid = "tatosa";
//        String password = "almagul";
//        String sql = "SELECT * FROM madpilot ORDER BY MPDATE ASC";
//            
//     
//        try (Connection connection = DriverManager.getConnection( url, userid, password );
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery( sql ))
//        {
//            ResultSetMetaData md = rs.getMetaData();
//            int columns = md.getColumnCount();
//            //System.out.println(columns);
//
//            //  Get column names
//            for (int i = 1; i <= columns; i++)
//            {
//                columnNames.add( /*md.getColumnName(i)*/i );
//            }
//
//            //  Get row data
//            while (rs.next())
//            {
//                ArrayList row = new ArrayList(columns);
//
//                for (int i = 1; i <= columns; i++)
//                {
//                    row.add( rs.getObject(i) );
//                    
//                }
//
//                data.add( row );
//            }
//        }
//        catch (SQLException e)
//        {
//            System.out.println( e.getMessage() );
//        }
        
//adatműveletek.megjelenít();

        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep 
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class


        //for (int i = 0; i < columnNames.size(); i++ )
        //columnNamesVector.add(columnNames.get(i));
        
      
        
        
        

        
        
        
        

    }//GEN-LAST:event_mutasdGombActionPerformed


   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FülesPanelGUI().setVisible(true);
                
            }
        });
    }

    
    
   
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private org.gui.JCalendarCombo DátumCombo;
  private javax.swing.JTabbedPane FülesPanel;
  private javax.swing.JPanel adatbevitel;
  private javax.swing.JComboBox<String> ebédCombo;
  private javax.swing.JFormattedTextField ebédEndIdőTxt;
  private javax.swing.JLabel ebédEndLabel;
  private javax.swing.JLabel ebédLabel;
  private javax.swing.JLabel ebédLétszámLabel;
  private javax.swing.JTextField ebédLétszámTxt;
  private javax.swing.JPanel ebédPanel;
  private javax.swing.JFormattedTextField ebédStartIdőTxt;
  private javax.swing.JLabel ebédStartLabel;
  private javax.swing.JLabel ebédiMódLabel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JComboBox<String> kávé1Combo;
  private javax.swing.JComboBox<String> kávé1Combo1;
  private javax.swing.JFormattedTextField kávé1EndIdőTxt;
  private javax.swing.JFormattedTextField kávé1EndIdőTxt1;
  private javax.swing.JLabel kávé1EndLabel;
  private javax.swing.JLabel kávé1EndLabel1;
  private javax.swing.JLabel kávé1Label;
  private javax.swing.JLabel kávé1Label1;
  private javax.swing.JLabel kávé1LétszámLabel;
  private javax.swing.JLabel kávé1LétszámLabel1;
  private javax.swing.JTextField kávé1LétszámTxt;
  private javax.swing.JTextField kávé1LétszámTxt1;
  private javax.swing.JPanel kávé1Panel;
  private javax.swing.JPanel kávé1Panel1;
  private javax.swing.JFormattedTextField kávé1StartIdőTxt;
  private javax.swing.JFormattedTextField kávé1StartIdőTxt1;
  private javax.swing.JLabel kávé1StartLabel;
  private javax.swing.JLabel kávé1StartLabel1;
  private javax.swing.JLabel kávé1iMódLabel;
  private javax.swing.JLabel kávé1iMódLabel1;
  private javax.swing.JComboBox<String> kávé2Combo;
  private javax.swing.JFormattedTextField kávé2EndIdőTxt;
  private javax.swing.JLabel kávé2EndLabel;
  private javax.swing.JLabel kávé2Label;
  private javax.swing.JLabel kávé2LétszámLabel;
  private javax.swing.JTextField kávé2LétszámTxt;
  private javax.swing.JLabel kávé2MódLabel;
  private javax.swing.JPanel kávé2Panel;
  private javax.swing.JFormattedTextField kávé2StartIdőTxt;
  private javax.swing.JLabel kávé2StartLabel;
  private javax.swing.JButton mentésGomb;
  private javax.swing.JButton mutasdGomb;
  private javax.swing.JPanel névjegy;
  private javax.swing.JComboBox<String> reggeliCombo;
  private javax.swing.JFormattedTextField reggeliEndIdőTxt;
  private javax.swing.JLabel reggeliEndLabel;
  private javax.swing.JLabel reggeliLabel;
  private javax.swing.JLabel reggeliLétszámLabel;
  private javax.swing.JTextField reggeliLétszámTxt;
  private javax.swing.JLabel reggeliMódLabel;
  private javax.swing.JPanel reggeliPanel;
  private javax.swing.JFormattedTextField reggeliStartIdőTxt;
  private javax.swing.JLabel reggeliStartLabel;
  private javax.swing.JComboBox<String> szervezetválasztó;
  private javax.swing.JComboBox<String> vacsoraCombo;
  private javax.swing.JFormattedTextField vacsoraEndIdőTxt;
  private javax.swing.JLabel vacsoraEndLabel;
  private javax.swing.JLabel vacsoraLabel;
  private javax.swing.JLabel vacsoraLétszámLabel;
  private javax.swing.JTextField vacsoraLétszámTxt;
  private javax.swing.JLabel vacsoraMódLabel;
  private javax.swing.JPanel vacsoraPanel;
  private javax.swing.JFormattedTextField vacsoraStartIdőTxt;
  private javax.swing.JLabel vacsoraStartLabel;
  // End of variables declaration//GEN-END:variables





    

    


}
