package gioco;

import java.awt.GraphicsEnvironment;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author NICOLA
 */
public class Gioco extends javax.swing.JFrame {

    public Gioco() {
        initComponents();
        super.setExtendedState(Gioco.MAXIMIZED_BOTH); 
        
        Tavolo1.setVisible(false);
        Tavolo2.setVisible(false);
        Opzioni.setVisible(false);
        Vittoria.setVisible(false);
        jGrafica.setVisible(false);
        jLabel5.setVisible(false);
        jTextArea4.setText("");
        
        jLogo.setIcon(new ImageIcon ("logo.png"));
        jIndietro.setIcon(new ImageIcon("indietro.png"));
        jIndietro1.setIcon(new ImageIcon("indietro.png"));
        jIndietro2.setIcon(new ImageIcon("indietro.png"));
        jAnnullaMossa.setIcon(new ImageIcon("annulla2.png"));
        jAnnullaMossa1.setIcon(new ImageIcon("annulla2.png"));
    }

    //Oggetti       
    Carte carte=new Carte();
    CPU cpu=new CPU();        
     
    //Variabili
    String[] mazzoFinale;
    String carteCorrenti[]=new String[12];
    static public String briscola;
    char semeBriscola;
    static public boolean difficile=false;
    String Grafica;
    String[] ultima=new String[4];
    int ultimoT;
    boolean scoperte=false;
    String risposta;
    int k;
    int turno;
    int punti1, punti2, briscolaTu=0, briscolaCPU=0, carichiTu=0, carichiCPU=0;
    boolean continua=false;
    String cartaCorrente;
    boolean modSingola;
    
    //Variabili solo mod Coppie
    String avversario;
    boolean continua2=false;
    String risposta1, risposta2, risposta3;
    static Set<String> carteCompagno1=new HashSet<>();
    static Set<String> carteCompagno2=new HashSet<>();
    Set<String> giaSegnate=new HashSet<>();
    static String[] situazione=new String[4];
    static int inizia;       
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Tavolo1 = new javax.swing.JPanel();
        jBriscola = new javax.swing.JButton();
        jCarta1 = new javax.swing.JButton();
        jMazzo = new javax.swing.JButton();
        jCarta6 = new javax.swing.JButton();
        jCartaGiocata1 = new javax.swing.JButton();
        jCartaGiocata2 = new javax.swing.JButton();
        jCarta4 = new javax.swing.JButton();
        Contatore = new javax.swing.JLabel();
        jCarta3 = new javax.swing.JButton();
        jCarta2 = new javax.swing.JButton();
        jCarta5 = new javax.swing.JButton();
        jIndietro1 = new javax.swing.JButton();
        jGuadagno1 = new javax.swing.JLabel();
        jGuadagno2 = new javax.swing.JLabel();
        jAnnullaMossa = new javax.swing.JButton();
        Tavolo2 = new javax.swing.JPanel();
        JCarta10 = new javax.swing.JButton();
        JCarta7 = new javax.swing.JButton();
        jIndietro2 = new javax.swing.JButton();
        JCarta8 = new javax.swing.JButton();
        JCarta6 = new javax.swing.JButton();
        JCarta9 = new javax.swing.JButton();
        JCarta5 = new javax.swing.JButton();
        JMazzo = new javax.swing.JButton();
        JCarta4 = new javax.swing.JButton();
        JBriscola = new javax.swing.JButton();
        JCarta1 = new javax.swing.JButton();
        JCartaGiocata1 = new javax.swing.JButton();
        JCarta2 = new javax.swing.JButton();
        JCartaGiocata3 = new javax.swing.JButton();
        JCarta3 = new javax.swing.JButton();
        JCartaGiocata4 = new javax.swing.JButton();
        JCarta12 = new javax.swing.JButton();
        JCartaGiocata2 = new javax.swing.JButton();
        JCarta11 = new javax.swing.JButton();
        Contatore1 = new javax.swing.JLabel();
        jSegno3 = new javax.swing.JLabel();
        jSegno33 = new javax.swing.JLabel();
        jSegno11 = new javax.swing.JLabel();
        jSegno1 = new javax.swing.JLabel();
        jAnnullaMossa1 = new javax.swing.JButton();
        jGuadagno00 = new javax.swing.JLabel();
        jGuadagno22 = new javax.swing.JLabel();
        jGuadagno11 = new javax.swing.JLabel();
        jGuadagno33 = new javax.swing.JLabel();
        jSegno2 = new javax.swing.JLabel();
        jSegno22 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jNuovaP = new javax.swing.JButton();
        jOpzioni = new javax.swing.JButton();
        jEsci = new javax.swing.JButton();
        jLogo = new javax.swing.JLabel();
        jBriscolaCoppia = new javax.swing.JButton();
        jContinua = new javax.swing.JButton();
        Opzioni = new javax.swing.JPanel();
        jGrafica = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScoperte = new javax.swing.JComboBox<>();
        jIndietro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDifficile = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jFullscreen = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        Vittoria = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPunti1 = new javax.swing.JLabel();
        jBriscoleTu = new javax.swing.JLabel();
        jCarichiTu = new javax.swing.JLabel();
        jVittoria = new javax.swing.JLabel();
        jPunti2 = new javax.swing.JLabel();
        jEsci1 = new javax.swing.JButton();
        jBriscoleCPU = new javax.swing.JLabel();
        jMenuPrincipale = new javax.swing.JButton();
        jCarichiCPU = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tavolo1.setBackground(new java.awt.Color(0, 102, 0));
        Tavolo1.setFocusable(false);

        jBriscola.setFocusPainted(false);
        jBriscola.setFocusable(false);

        jCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarta1ActionPerformed(evt);
            }
        });

        jMazzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMazzoActionPerformed(evt);
            }
        });

        jCartaGiocata1.setFocusable(false);

        jCartaGiocata2.setFocusable(false);

        Contatore.setBackground(new java.awt.Color(255, 255, 255));
        Contatore.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Contatore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contatore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jCarta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarta3ActionPerformed(evt);
            }
        });

        jCarta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarta2ActionPerformed(evt);
            }
        });

        jIndietro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIndietro1ActionPerformed(evt);
            }
        });

        jGuadagno1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jGuadagno2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jAnnullaMossa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jAnnullaMossa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnullaMossaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tavolo1Layout = new javax.swing.GroupLayout(Tavolo1);
        Tavolo1.setLayout(Tavolo1Layout);
        Tavolo1Layout.setHorizontalGroup(
            Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tavolo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Tavolo1Layout.createSequentialGroup()
                        .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jIndietro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAnnullaMossa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(811, 811, 811)
                        .addComponent(jCarta6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Tavolo1Layout.createSequentialGroup()
                        .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Tavolo1Layout.createSequentialGroup()
                                .addComponent(jGuadagno2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCartaGiocata2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Tavolo1Layout.createSequentialGroup()
                                .addComponent(jCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Tavolo1Layout.createSequentialGroup()
                                .addComponent(jGuadagno1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCartaGiocata1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(jBriscola, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMazzo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contatore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );
        Tavolo1Layout.setVerticalGroup(
            Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tavolo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tavolo1Layout.createSequentialGroup()
                        .addComponent(jIndietro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAnnullaMossa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jCarta6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tavolo1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Tavolo1Layout.createSequentialGroup()
                                .addComponent(jGuadagno2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jGuadagno1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Tavolo1Layout.createSequentialGroup()
                                .addComponent(jCartaGiocata2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCartaGiocata1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tavolo1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBriscola, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jMazzo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tavolo1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Contatore, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addGap(283, 283, 283)))
                .addGroup(Tavolo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCarta3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCarta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Tavolo2.setBackground(new java.awt.Color(0, 102, 0));
        Tavolo2.setFocusable(false);

        JCarta10.setToolTipText("");
        JCarta10.setFocusPainted(false);
        JCarta10.setFocusable(false);

        JCarta7.setToolTipText("");
        JCarta7.setFocusPainted(false);
        JCarta7.setFocusable(false);

        jIndietro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIndietro2ActionPerformed(evt);
            }
        });

        JCarta8.setToolTipText("");
        JCarta8.setFocusPainted(false);
        JCarta8.setFocusable(false);

        JCarta6.setFocusPainted(false);
        JCarta6.setFocusable(false);

        JCarta9.setToolTipText("");
        JCarta9.setFocusPainted(false);
        JCarta9.setFocusable(false);

        JCarta5.setFocusPainted(false);
        JCarta5.setFocusable(false);

        JMazzo.setFocusPainted(false);
        JMazzo.setFocusable(false);
        JMazzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMazzoActionPerformed(evt);
            }
        });

        JCarta4.setFocusPainted(false);
        JCarta4.setFocusable(false);

        JBriscola.setFocusPainted(false);
        JBriscola.setFocusable(false);

        JCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCarta1ActionPerformed(evt);
            }
        });

        JCarta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCarta2ActionPerformed(evt);
            }
        });

        JCartaGiocata3.setFocusPainted(false);
        JCartaGiocata3.setFocusable(false);

        JCarta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCarta3ActionPerformed(evt);
            }
        });

        JCartaGiocata4.setToolTipText("");
        JCartaGiocata4.setFocusPainted(false);
        JCartaGiocata4.setFocusable(false);

        JCarta12.setToolTipText("");
        JCarta12.setFocusPainted(false);
        JCarta12.setFocusable(false);

        JCartaGiocata2.setToolTipText("");
        JCartaGiocata2.setFocusPainted(false);
        JCartaGiocata2.setFocusable(false);

        JCarta11.setToolTipText("");
        JCarta11.setFocusPainted(false);
        JCarta11.setFocusable(false);

        Contatore1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Contatore1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Contatore1.setText("40");

        jSegno3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jSegno33.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jSegno11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jSegno1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jAnnullaMossa1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jAnnullaMossa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnullaMossa1ActionPerformed(evt);
            }
        });

        jGuadagno00.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jGuadagno22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jGuadagno11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jGuadagno33.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jSegno2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jSegno22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        javax.swing.GroupLayout Tavolo2Layout = new javax.swing.GroupLayout(Tavolo2);
        Tavolo2.setLayout(Tavolo2Layout);
        Tavolo2Layout.setHorizontalGroup(
            Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tavolo2Layout.createSequentialGroup()
                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tavolo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jAnnullaMossa1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Tavolo2Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JCarta7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCarta8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCarta9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JCartaGiocata4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGuadagno33, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tavolo2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jIndietro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 597, Short.MAX_VALUE)
                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Tavolo2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(JBriscola, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JMazzo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contatore1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                        .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jGuadagno11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCartaGiocata2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCarta10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCarta11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCarta12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tavolo2Layout.createSequentialGroup()
                        .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Tavolo2Layout.createSequentialGroup()
                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(jGuadagno00, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCartaGiocata1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(JCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Tavolo2Layout.createSequentialGroup()
                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(jGuadagno22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCartaGiocata3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(JCarta6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSegno2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSegno22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(Tavolo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSegno3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSegno33, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSegno1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSegno11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Tavolo2Layout.setVerticalGroup(
            Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tavolo2Layout.createSequentialGroup()
                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Tavolo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tavolo2Layout.createSequentialGroup()
                                .addComponent(jIndietro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAnnullaMossa1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(347, 347, 347)
                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(JCarta7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCarta8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCarta9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(JCarta12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCarta11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCarta10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(jSegno3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSegno33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addComponent(jSegno1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSegno11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tavolo2Layout.createSequentialGroup()
                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Tavolo2Layout.createSequentialGroup()
                                        .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Tavolo2Layout.createSequentialGroup()
                                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(JCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(JCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(JCarta6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jGuadagno22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JCartaGiocata3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jSegno2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Tavolo2Layout.createSequentialGroup()
                                                .addGap(178, 178, 178)
                                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JBriscola, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JMazzo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JCartaGiocata4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(Tavolo2Layout.createSequentialGroup()
                                                .addGap(238, 238, 238)
                                                .addComponent(Contatore1))))
                                    .addComponent(jSegno22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGuadagno33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCartaGiocata1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jGuadagno00, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Tavolo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JCarta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Tavolo2Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(JCartaGiocata2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGuadagno11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(0, 102, 0));
        Menu.setFocusable(false);

        jNuovaP.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jNuovaP.setText("Nuova Partita (Singolo)");
        jNuovaP.setFocusable(false);
        jNuovaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuovaPActionPerformed(evt);
            }
        });

        jOpzioni.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jOpzioni.setText("Opzioni");
        jOpzioni.setFocusable(false);
        jOpzioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpzioniActionPerformed(evt);
            }
        });

        jEsci.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jEsci.setText("Esci");
        jEsci.setFocusable(false);
        jEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEsciActionPerformed(evt);
            }
        });

        jBriscolaCoppia.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBriscolaCoppia.setText("Nuova Partita (Coppie)");
        jBriscolaCoppia.setFocusable(false);
        jBriscolaCoppia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBriscolaCoppiaActionPerformed(evt);
            }
        });

        jContinua.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jContinua.setText("Continua");
        jContinua.setFocusable(false);
        jContinua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContinuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(865, 865, 865)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jContinua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jOpzioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBriscolaCoppia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNuovaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEsci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(658, 658, 658)
                        .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(657, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jContinua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNuovaP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBriscolaCoppia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jOpzioni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEsci, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        Opzioni.setBackground(new java.awt.Color(0, 102, 0));
        Opzioni.setFocusable(false);

        jGrafica.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jGrafica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piacentine", "Bergamasche", "Abruzzesi", "Siciliane", "Napoletane" }));
        jGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGraficaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Difficoltà");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Grafica");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Carte Scoperte");

        jScoperte.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jScoperte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        jScoperte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jScoperteActionPerformed(evt);
            }
        });

        jIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIndietroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("OPZIONI");

        jDifficile.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jDifficile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normale", "Difficile" }));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 102, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("MODALITÀ SINGOLA\n\nLo scopo del gioco è totalizzare almeno 61 punti dei 120 disponibili. Il mazzo sarà randomizzato e ai due giocatori verrano distribuite le prime sei carte, tre ognuno. La settima sarà lasciata sul tavolo ed il suo seme stabilirà la briscola, questa carta sarà pescata per ultima. Al proprio turno (il primo sarà scelto casualmente) i giocatori devono giocare una delle proprie carte. Si aggiudicarà la mano il giocatore che ha giocato la briscola di valore maggire, o in caso non ne siano state giocate, il giocatore che ha giocato la carta di valore maggiore dello stesso seme della prima carta giocata. Il giocatore che vince la mano prende entrambe le carte e guadagna i punti corrispondenti (vedi in fondo). Quindi pesca la prima carta del mazzo seguito dall'altro giocatore e sarà il primo ad aprire la mano successiva . All'esaurimento del mazzo, la mani proseguno esaurendo le carte in mano.  \n\nAsso: 11 punti. \nTre: 10 punti.\nRe: 4 punti. \nCavallo: 3 punti. \nFante: 2 punti.\nScartini: 0 punti.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setFocusable(false);
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 102, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("MODALITÀ A COPPIE\n\nLe regole di base sono le stesse ma i giocatori saranno ora 4, 2 per squadra, ed il gioco proseguirà in senso antiorario partendo da uno di questi scelto casualmente. I membri della stessa squadra possono usare dei segni per dirsi che carte hanno in mano, cercando di non farsi vedere dagli avversari. Solitamente nel gioco a coppie c'è un giocatore che segna sempre solo le carte che ha in mano mentre l'altro, solitamente il più esperto, dirigerà il gioco dicendogli che carte giocare. In questa modalità la CPU tua alleata, posta di fronte a te, ti dirà ad ogni turno le proprie carte e tu potrai suggerirle quali giocare. Al suo turno la CPU aspetterà un suggerimento, se non vuoi dargliene nessuno premi la X. Allo stesso modo anche i giocatori avversari si comunicheranno vicendevolmente le proprie carte. La probabilità di notare i loro segni dipenderà dalla difficoltà scelta. All'esaurimento del mazzo, i membri di ogni squadra potranno vedere le carte in mano all'alleato. ");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 102, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("DIFFICOLTÀ\n\nNella modalità normale la CPU non si rende conto della situazione e le sue reazioni alle tue carte saranno predeterminate, questo sia in singolo che a coppie. In modalità difficile invece tali reazioni dipenderanno anche da quali carte sono rimaste nel mazzo e dalle altre carte che ha in mano. Eviterà di giocare di prima mano semi i cui carichi non sono ancora stati giocati, la precenza di una briscola varierà se questa è l'unica che attualmente possiede e se l'ultima carta è un asse o un tre farà di tutto per impossessarsene. Nella modalità a coppie inoltre avrai una possibilità su 3 di notare i segni dei due avversari giocando a difficoltà normale, altrimenti una 5.\n\nN.B. \nCambiare la difficoltà avrà effetto solo iniziando una nuova partita. Tutte le altre impostazioni invece potranno essere cambiate ed applicate in qualunque momento.\n\n\n");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Schermo Intero");

        jFullscreen.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jFullscreen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        jFullscreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFullscreenActionPerformed(evt);
            }
        });

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 102, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("PROBLEMI NOTI:\n• L'unica risoluzione supportata è 1920x1080\n• La modalità difficile non è stata implementata\n nel gioco a coppie per mancanza di tempo.\n• La modalità Schermo Intero non è compatibile \nsu tutti i dispositivi (?)\n");
        jScrollPane4.setViewportView(jTextArea4);

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(0, 102, 0));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout OpzioniLayout = new javax.swing.GroupLayout(Opzioni);
        Opzioni.setLayout(OpzioniLayout);
        OpzioniLayout.setHorizontalGroup(
            OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpzioniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpzioniLayout.createSequentialGroup()
                        .addComponent(jIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpzioniLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(857, 857, 857))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpzioniLayout.createSequentialGroup()
                .addContainerGap(432, Short.MAX_VALUE)
                .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpzioniLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OpzioniLayout.createSequentialGroup()
                                .addComponent(jFullscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(OpzioniLayout.createSequentialGroup()
                                .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDifficile, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jGrafica, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScoperte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpzioniLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addGap(356, 356, 356))))
        );
        OpzioniLayout.setVerticalGroup(
            OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpzioniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(120, 120, 120)
                .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpzioniLayout.createSequentialGroup()
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDifficile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScoperte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFullscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OpzioniLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Vittoria.setBackground(new java.awt.Color(0, 102, 0));
        Vittoria.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CPU");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Punti");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Briscole");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Carichi");

        jPunti1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jPunti1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPunti1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBriscoleTu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBriscoleTu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBriscoleTu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jCarichiTu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jCarichiTu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCarichiTu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jVittoria.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jVittoria.setForeground(new java.awt.Color(204, 204, 0));
        jVittoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVittoria.setText("Hai Vinto!");

        jPunti2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jPunti2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPunti2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jEsci1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jEsci1.setText(" Esci dal gioco");
        jEsci1.setToolTipText("");
        jEsci1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEsci1ActionPerformed(evt);
            }
        });

        jBriscoleCPU.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBriscoleCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBriscoleCPU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenuPrincipale.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jMenuPrincipale.setText("Menu Principale");
        jMenuPrincipale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrincipaleActionPerformed(evt);
            }
        });

        jCarichiCPU.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jCarichiCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCarichiCPU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Tu");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout VittoriaLayout = new javax.swing.GroupLayout(Vittoria);
        Vittoria.setLayout(VittoriaLayout);
        VittoriaLayout.setHorizontalGroup(
            VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VittoriaLayout.createSequentialGroup()
                .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VittoriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jEsci1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1691, Short.MAX_VALUE)
                        .addComponent(jMenuPrincipale))
                    .addGroup(VittoriaLayout.createSequentialGroup()
                        .addGap(685, 685, 685)
                        .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(45, 45, 45)
                        .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(VittoriaLayout.createSequentialGroup()
                                .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPunti1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBriscoleTu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCarichiTu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPunti2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBriscoleCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCarichiCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jVittoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        VittoriaLayout.setVerticalGroup(
            VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VittoriaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jVittoria)
                .addGap(84, 84, 84)
                .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(35, 35, 35)
                .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jPunti2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPunti1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(VittoriaLayout.createSequentialGroup()
                            .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jBriscoleTu, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addComponent(jLabel10))
                        .addGroup(VittoriaLayout.createSequentialGroup()
                            .addComponent(jBriscoleCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCarichiCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCarichiTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)
                .addGroup(VittoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEsci1)
                    .addComponent(jMenuPrincipale))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(Tavolo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tavolo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Menu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Opzioni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Vittoria, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tavolo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opzioni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Vittoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tavolo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tavolo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opzioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Vittoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tavolo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNuovaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuovaPActionPerformed
        Tavolo1.setVisible(true);
        Menu.setVisible(false);
        continua=true; continua2=false;
        punti1=0; punti2=0; briscolaTu=0; briscolaCPU=0; carichiTu=0; carichiCPU=0;
        modSingola=true;
        iniziaPartitaG();
    }//GEN-LAST:event_jNuovaPActionPerformed

    private void jOpzioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpzioniActionPerformed
        Opzioni.setVisible(true);
        Menu.setVisible(false);
    }//GEN-LAST:event_jOpzioniActionPerformed

    private void jEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEsciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jEsciActionPerformed

    private void jBriscolaCoppiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBriscolaCoppiaActionPerformed
        Menu.setVisible(false);
        Tavolo2.setVisible(true);
        continua2=true; continua=false;
        modSingola=false;
        carteCompagno1.removeAll(carteCompagno1);
        carteCompagno2.removeAll(carteCompagno2);
        iniziaPartitaG();
    }//GEN-LAST:event_jBriscolaCoppiaActionPerformed

    public String cambiaGrafica(String percorso)
    {
        percorso=percorso.replace("Piacentine", "");
        percorso=percorso.replace("Bergamasche", "");
        percorso=percorso.replace("Abruzzesi", "");
        percorso=percorso.replace("Siciliane", "");
        percorso=Grafica+"\\"+percorso;
        return percorso;
    }
    
    private void jContinuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContinuaActionPerformed
        if(continua==true)
        {
            Tavolo1.setVisible(true);
            Menu.setVisible(false);
            continua=false; 
            
            if(jCarta1.getIcon()!=null) jCarta1.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[0]+".png"));
            if(jCarta2.getIcon()!=null) jCarta2.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[1]+".png"));
            if(jCarta3.getIcon()!=null) jCarta3.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[2]+".png"));
            if(jCarta4.getIcon()!=null) jCarta4.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[3]+".png"));
            if(jCarta5.getIcon()!=null) jCarta5.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[4]+".png"));
            if(jCarta6.getIcon()!=null) jCarta6.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[5]+".png"));
            
            if(jCartaGiocata1.getIcon()!=null){
                String percorso=cambiaGrafica(String.valueOf(jCartaGiocata1.getIcon()));
                jCartaGiocata1.setIcon(new ImageIcon(percorso));}
            if(jCartaGiocata2.getIcon()!=null){
                String percorso=cambiaGrafica(String.valueOf(jCartaGiocata2.getIcon()));
            jCartaGiocata2.setIcon(new ImageIcon(percorso));}  
            jBriscola.setIcon(new ImageIcon(Grafica+"\\"+briscola+".png"));
            
            if(scoperte==false)
            {
                if((carteCorrenti[3]!=null)&&(!carteCorrenti[3].equals("00"))) jCarta4.setIcon(new ImageIcon("retro.png"));
                if((carteCorrenti[4]!=null)&&(!carteCorrenti[4].equals("00"))) jCarta5.setIcon(new ImageIcon("retro.png"));
                if((carteCorrenti[5]!=null)&&(!carteCorrenti[5].equals("00"))) jCarta6.setIcon(new ImageIcon("retro.png"));
            }
        }
        else if(continua2==true)
        {
            Tavolo2.setVisible(true);
            Menu.setVisible(false);
            continua2=false;
            
            if(JCarta1.getIcon()!=null) JCarta1.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[0]+".png"));
            if(JCarta2.getIcon()!=null) JCarta2.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[1]+".png"));
            if(JCarta3.getIcon()!=null) JCarta3.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[2]+".png"));
            if(JCarta4.getIcon()!=null) JCarta4.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[3]+".png"));
            if(JCarta5.getIcon()!=null) JCarta5.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[4]+".png"));
            if(JCarta6.getIcon()!=null) JCarta6.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[5]+".png"));
            if(JCarta7.getIcon()!=null) JCarta7.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[6]+".png"));
            if(JCarta8.getIcon()!=null) JCarta8.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[7]+".png"));
            if(JCarta9.getIcon()!=null) JCarta9.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[8]+".png"));
            if(JCarta10.getIcon()!=null) JCarta10.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[9]+".png"));
            if(JCarta11.getIcon()!=null) JCarta11.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[10]+".png"));
            if(JCarta12.getIcon()!=null) JCarta12.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[11]+".png"));
            
            if(JCartaGiocata1.getIcon()!=null){
                String percorso=cambiaGrafica(String.valueOf(JCartaGiocata1.getIcon()));
                JCartaGiocata1.setIcon(new ImageIcon(percorso));}
            if(JCartaGiocata3.getIcon()!=null){
                String percorso=cambiaGrafica(String.valueOf(JCartaGiocata3.getIcon()));
            JCartaGiocata3.setIcon(new ImageIcon(percorso));}  
            if(JCartaGiocata4.getIcon()!=null){
                String percorso=cambiaGrafica(String.valueOf(JCartaGiocata4.getIcon()));
                JCartaGiocata4.setIcon(new ImageIcon(percorso));}
            if(JCartaGiocata2.getIcon()!=null){
                String percorso=cambiaGrafica(String.valueOf(JCartaGiocata2.getIcon()));
            JCartaGiocata2.setIcon(new ImageIcon(percorso));}  
            JBriscola.setIcon(new ImageIcon(Grafica+"\\"+briscola+".png"));
            
            if(scoperte==false)
            {
                if((carteCorrenti[3]!=null)&&(!carteCorrenti[3].equals("00"))) JCarta4.setIcon(new ImageIcon("retro.png"));
                if((carteCorrenti[4]!=null)&&(!carteCorrenti[4].equals("00"))) JCarta5.setIcon(new ImageIcon("retro.png"));
                if((carteCorrenti[5]!=null)&&(!carteCorrenti[5].equals("00"))) JCarta6.setIcon(new ImageIcon("retro.png"));
                if((carteCorrenti[6]!=null)&&(!carteCorrenti[6].equals("00"))) JCarta7.setIcon(new ImageIcon("retro2.png"));
                if((carteCorrenti[7]!=null)&&(!carteCorrenti[7].equals("00"))) JCarta8.setIcon(new ImageIcon("retro2.png"));
                if((carteCorrenti[8]!=null)&&(!carteCorrenti[8].equals("00"))) JCarta9.setIcon(new ImageIcon("retro2.png"));
                if((carteCorrenti[9]!=null)&&(!carteCorrenti[9].equals("00"))) JCarta10.setIcon(new ImageIcon("retro2.png"));
                if((carteCorrenti[10]!=null)&&(!carteCorrenti[10].equals("00"))) JCarta11.setIcon(new ImageIcon("retro2.png"));
                if((carteCorrenti[11]!=null)&&(!carteCorrenti[11].equals("00"))) JCarta12.setIcon(new ImageIcon("retro2.png"));
            }
        }
    }//GEN-LAST:event_jContinuaActionPerformed

    private void jCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarta1ActionPerformed
        if(jCarta1.getIcon()!=null)
        {
            cartaCorrente=carteCorrenti[0];
            cartaPerformed(jCarta1, 0);
        }
    }//GEN-LAST:event_jCarta1ActionPerformed

    private void jMazzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMazzoActionPerformed
        if((jCartaGiocata1.getIcon()!=null)&&(jCartaGiocata2.getIcon()!=null))
        {
            jCartaGiocata1.setIcon(null);
            jCartaGiocata2.setIcon(null);
            if(jCarta1.getIcon()==null)carteCorrenti[0]="00";
            if(jCarta2.getIcon()==null)carteCorrenti[1]="00";
            if(jCarta3.getIcon()==null)carteCorrenti[2]="00";
            if(jCarta4.getIcon()==null)carteCorrenti[3]="00";
            if(jCarta5.getIcon()==null)carteCorrenti[4]="00";
            if(jCarta6.getIcon()==null)carteCorrenti[5]="00";
            
            jGuadagno1.setText("");
            jGuadagno2.setText("");
            
            vittoria();
            assegnaImmagini();
            
            if(turno==1)
            {
                giocaCPU1(0, null);
                eliminaDoppi(risposta, 0);
            }
        }
    }//GEN-LAST:event_jMazzoActionPerformed

    private void jCarta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarta3ActionPerformed
        if(jCarta3.getIcon()!=null)
        {
            cartaCorrente=carteCorrenti[2];
            cartaPerformed(jCarta3, 2);
        }
    }//GEN-LAST:event_jCarta3ActionPerformed

    private void jCarta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarta2ActionPerformed
        if(jCarta2.getIcon()!=null)
        {
            cartaCorrente=carteCorrenti[1];
            cartaPerformed(jCarta2, 1);
        }
    }//GEN-LAST:event_jCarta2ActionPerformed

    private void jIndietro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIndietro1ActionPerformed
        Tavolo1.setVisible(false);
        Menu.setVisible(true);
        continua=true;
    }//GEN-LAST:event_jIndietro1ActionPerformed

    private void jGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGraficaActionPerformed
        Grafica=String.valueOf(jGrafica.getSelectedItem());
    }//GEN-LAST:event_jGraficaActionPerformed

    private void jIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIndietroActionPerformed
        Opzioni.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_jIndietroActionPerformed

    private void jEsci1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEsci1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jEsci1ActionPerformed

    private void jMenuPrincipaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincipaleActionPerformed
        Vittoria.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_jMenuPrincipaleActionPerformed

    private void jIndietro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIndietro2ActionPerformed
        Tavolo2.setVisible(false);
        Menu.setVisible(true);
        continua2=true;
    }//GEN-LAST:event_jIndietro2ActionPerformed

    private void JMazzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMazzoActionPerformed
        if((JCartaGiocata1.getIcon()!=null)&&(JCartaGiocata2.getIcon()!=null)&&(JCartaGiocata3.getIcon()!=null)&&(JCartaGiocata4.getIcon()!=null))
        {
            jGuadagno00.setText("");
            jGuadagno11.setText("");
            jGuadagno22.setText("");
            jGuadagno33.setText("");
            
            jSegno1.setText("");
            jSegno11.setText("");
            jSegno2.setText("");
            jSegno22.setText("");
            jSegno3.setText("");
            jSegno33.setText("");
            
            JCartaGiocata1.setIcon(null);
            JCartaGiocata2.setIcon(null);
            JCartaGiocata3.setIcon(null);
            JCartaGiocata4.setIcon(null);
            if(JCarta1.getIcon()==null)carteCorrenti[0]="00";
            if(JCarta2.getIcon()==null)carteCorrenti[1]="00";
            if(JCarta3.getIcon()==null)carteCorrenti[2]="00";
            if(JCarta4.getIcon()==null)carteCorrenti[3]="00";
            if(JCarta5.getIcon()==null)carteCorrenti[4]="00";
            if(JCarta6.getIcon()==null)carteCorrenti[5]="00";
            if(JCarta7.getIcon()==null)carteCorrenti[6]="00";
            if(JCarta8.getIcon()==null)carteCorrenti[7]="00";
            if(JCarta9.getIcon()==null)carteCorrenti[8]="00";
            if(JCarta10.getIcon()==null)carteCorrenti[9]="00";
            if(JCarta11.getIcon()==null)carteCorrenti[10]="00";
            if(JCarta12.getIcon()==null)carteCorrenti[11]="00";
            
            vittoria();
            assegnaImmagini4();
            for(int i=0;i<4;i++)
                situazione[i]=null;
            
            segniAvversari(1, carteCompagno1);
            segniAvversari(2, carteCompagno2);
            segniAvversari(3, carteCompagno2);
            
            if(JBriscola.isEnabled()==false)
            {
                JCarta4.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[3]+".png"));
                JCarta5.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[4]+".png"));
                JCarta6.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[5]+".png"));
            }
            else if(scoperte==false)
            {
                JCarta4.setIcon(new ImageIcon("retro.png"));
                JCarta5.setIcon(new ImageIcon("retro.png"));
                JCarta6.setIcon(new ImageIcon("retro.png"));
            }
            
            if(inizia==1)
            {
                giocaCPU1(1, JCartaGiocata2);
                giocaCPU2(2, JCartaGiocata3);
                giocaCPU3(3, JCartaGiocata4);
            }
            else if(inizia==2)
            {
                giocaCPU1(2, JCartaGiocata3);
                giocaCPU2(3, JCartaGiocata4);
            }
            else if(inizia==3)
            {
                giocaCPU1(3, JCartaGiocata4);
            }
        }
    }//GEN-LAST:event_JMazzoActionPerformed

    private void jFullscreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFullscreenActionPerformed
        if(jFullscreen.getSelectedIndex()==0)
        {
             GraphicsEnvironment.getLocalGraphicsEnvironment()
            .getDefaultScreenDevice().setFullScreenWindow(null);
        }
        else
        {
            GraphicsEnvironment.getLocalGraphicsEnvironment()
            .getDefaultScreenDevice().setFullScreenWindow(this);
        }
    }//GEN-LAST:event_jFullscreenActionPerformed

    private void JCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCarta1ActionPerformed
        if(JCarta1.getIcon()!=null)
        {
            cartaCorrente=carteCorrenti[0];
            cartaPerformed4(JCarta1, 0);
        }
    }//GEN-LAST:event_JCarta1ActionPerformed

    private void JCarta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCarta2ActionPerformed
        if(JCarta2.getIcon()!=null)
        {
            cartaCorrente=carteCorrenti[1];
            cartaPerformed4(JCarta2, 1);
        }
    }//GEN-LAST:event_JCarta2ActionPerformed

    private void JCarta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCarta3ActionPerformed
        if(JCarta3.getIcon()!=null)
        {
            cartaCorrente=carteCorrenti[2];
            cartaPerformed4(JCarta3, 2);
        }
    }//GEN-LAST:event_JCarta3ActionPerformed

    private void jAnnullaMossaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnullaMossaActionPerformed
        if((jCartaGiocata1.getIcon()!=null)&&(jCartaGiocata2.getIcon()!=null))
        {
            riassegna2(jCarta1, jCartaGiocata1, 0, ultima[0]);
            riassegna2(jCarta2, jCartaGiocata1, 1, ultima[0]);
            riassegna2(jCarta3, jCartaGiocata1, 2, ultima[0]);
            riassegna2(jCarta4, jCartaGiocata2, 3, ultima[1]);
            riassegna2(jCarta5, jCartaGiocata2, 4, ultima[1]);
            riassegna2(jCarta6, jCartaGiocata2, 5, ultima[1]);
            
            if(scoperte==false)
            {
                jCarta4.setIcon(new ImageIcon("retro.png"));
                jCarta5.setIcon(new ImageIcon("retro.png"));
                jCarta6.setIcon(new ImageIcon("retro.png"));
            }
            
            if(!jGuadagno1.getText().equals("")) punti1=punti1-Integer.valueOf(jGuadagno1.getText().substring(1));
            else if(!jGuadagno2.getText().equals("")) punti2=punti2-Integer.valueOf(jGuadagno2.getText().substring(1));
            
            jGuadagno1.setText("");
            jGuadagno2.setText("");
            turno=ultimoT;
            jCartaGiocata1.setIcon(null);
            jCartaGiocata2.setIcon(null);
            
            if(turno==1) {giocaCPU1(0, null); eliminaDoppi(risposta, 0);}
        }
    }//GEN-LAST:event_jAnnullaMossaActionPerformed

    private void jAnnullaMossa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnullaMossa1ActionPerformed
        if((JCartaGiocata1.getIcon()!=null)&&(JCartaGiocata2.getIcon()!=null)&&(JCartaGiocata3.getIcon()!=null)&&(JCartaGiocata4.getIcon()!=null))
        {
            riassegna4(JCarta1, JCartaGiocata1, 0);
            riassegna4(JCarta2, JCartaGiocata1, 1);
            riassegna4(JCarta3, JCartaGiocata1, 2);
            riassegna4(JCarta4, JCartaGiocata3, 3);
            riassegna4(JCarta5, JCartaGiocata3, 4);
            riassegna4(JCarta6, JCartaGiocata3, 5);
            riassegna4(JCarta7, JCartaGiocata4, 6);
            riassegna4(JCarta8, JCartaGiocata4, 7);
            riassegna4(JCarta9, JCartaGiocata4, 8);
            riassegna4(JCarta10, JCartaGiocata2, 9);
            riassegna4(JCarta11, JCartaGiocata2, 10);
            riassegna4(JCarta12, JCartaGiocata2, 11);
            
            if(!jGuadagno00.getText().equals("")) punti1-=Integer.valueOf(jGuadagno00.getText().substring(1));
            if(!jGuadagno11.getText().equals("")) punti2-=Integer.valueOf(jGuadagno11.getText().substring(1));
            if(!jGuadagno22.getText().equals("")) punti1-=Integer.valueOf(jGuadagno22.getText().substring(1));
            if(!jGuadagno33.getText().equals("")) punti2-=Integer.valueOf(jGuadagno33.getText().substring(1));
            
            jGuadagno00.setText("");
            jGuadagno11.setText("");
            jGuadagno22.setText("");
            jGuadagno33.setText("");
            turno=ultimoT;
            inizia=ultimoT;
            JCartaGiocata1.setIcon(null);
            JCartaGiocata2.setIcon(null);
            JCartaGiocata3.setIcon(null);
            JCartaGiocata4.setIcon(null);
                
            for(int i=0;i<4;i++)
                situazione[i]=null;
            
            if(inizia==1)
            {
                giocaCPU1(1, JCartaGiocata2);
                giocaCPU2(2, JCartaGiocata3);
                giocaCPU3(3, JCartaGiocata4);
            }
            else if(inizia==2)
            {
                giocaCPU1(2, JCartaGiocata3);
                giocaCPU2(3, JCartaGiocata4);
            }
            else if(inizia==3)
            {
                giocaCPU1(3, JCartaGiocata4);
            }
        }
    }//GEN-LAST:event_jAnnullaMossa1ActionPerformed

    private void jScoperteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jScoperteActionPerformed
        scoperte = jScoperte.getSelectedIndex() != 0;
    }//GEN-LAST:event_jScoperteActionPerformed

    private void riassegna2(JButton carta, JButton cartaGiocata, int i, String ultimo)
    {
        if(carta.getIcon()==null)
            {
                carta.setIcon(cartaGiocata.getIcon());
                carteCorrenti[i]=ultimo;
            }
    }
    
    private void riassegna4(JButton carta, JButton cartaGiocata, int i)
    {
        if(carta.getIcon()==null)
            {
                int j=0;
                if((i<=5)&&(i>=3)) j=2;
                if((i<=11)&&(i>=9)) j=1;
                if((i<=8)&&(i>=6)) j=3;
                
                carta.setIcon(cartaGiocata.getIcon());
                carteCorrenti[i]=situazione[j];
            }
    }
    
    private void cartaPerformed(JButton jCarta, int pos)
    {
        if(((jCarta1.getIcon()!=null)&&(jCarta2.getIcon()!=null)&&(jCarta3.getIcon()!=null)&&(jCartaGiocata1.getIcon()==null))||((jMazzo.getIcon()==null)&&(jCartaGiocata1.getIcon()==null))){
            if(jCartaGiocata2.getIcon()==null)
            {
                jCartaGiocata1.setIcon(jCarta.getIcon());
                jCarta.setIcon(null);
                avversario=carteCorrenti[pos];
                risposta=cpu.scegliCarta2(carteCorrenti, avversario, 40-k );
                ultima[1]=risposta;
                jCartaGiocata2.setIcon(new ImageIcon(Grafica+"\\"+risposta+".png"));
                eliminaDoppi(risposta, 0);
            }
            else 
            {
                jCartaGiocata1.setIcon(jCarta.getIcon());
                jCarta.setIcon(null);
            }
            ultima[0]=carteCorrenti[pos];
            carteCorrenti[pos]=null; 
            ultimoT=turno;
            turno=scegliVincitore(turno, risposta, cartaCorrente);
            contaPunti(cartaCorrente.charAt(0), risposta.charAt(0), turno);
        }
    }
    
    private void cartaPerformed4(JButton jCarta, int pos)
    {
        if(JCartaGiocata1.getIcon()==null)
        {
            JCartaGiocata1.setIcon(jCarta.getIcon());
            jCarta.setIcon(null);
            situazione[0]=carteCorrenti[pos];
            carteCorrenti[pos]=null; 
            
            if((JCartaGiocata2.getIcon()==null)&&(JCartaGiocata3.getIcon()==null)&&(JCartaGiocata4.getIcon()==null))
            {
                giocaCPU2(1, JCartaGiocata2);    
                giocaCPU3(2, JCartaGiocata3);
                giocaCPU4(3, JCartaGiocata4);
            }
            else if ((JCartaGiocata2.getIcon()==null)&&(JCartaGiocata3.getIcon()==null))
            {
                giocaCPU3(1, JCartaGiocata2); 
                giocaCPU4(2, JCartaGiocata3);
            }
            else if (JCartaGiocata2.getIcon()==null)
            {
                giocaCPU4(1, JCartaGiocata2);
            } 
            ultimoT=inizia;
            inizia=scegliVincitore4();
            contaPunti4();     
        }
    }
    
    private int scegliVincitore(int n, String mossaC, String mossaG)
    {
        String Carta1=mossaG;
        String Carta2=mossaC;
               
        char seme1=Carta1.charAt(1);
        char seme2=Carta2.charAt(1);
        
        if((Carta1.charAt(1)==semeBriscola)&&(Carta2.charAt(1)!=semeBriscola)) return 0;
        else if((Carta1.charAt(1)!=semeBriscola)&&(Carta2.charAt(1)==semeBriscola)) return 1;
        else if (seme1==seme2)
        {
            int C1=cercaIndice(Carta1.charAt(0));
            int C2=cercaIndice(Carta2.charAt(0));   
            
            if(C1>C2)return 0;
            else return 1;
        }
        else if(n==0) return 0;
        else if(n==1) return 1;
        
        return 2;
    }
    
    private int scegliVincitore4()
    {     
        char seme=situazione[inizia].charAt(1);
        
        int[] indici=new int[4];
        indici[0]=cercaIndice(situazione[0].charAt(0));
        indici[1]=cercaIndice(situazione[1].charAt(0));
        indici[2]=cercaIndice(situazione[2].charAt(0));
        indici[3]=cercaIndice(situazione[3].charAt(0));
        
        int maggioreBriscola=-1;
        for(int i=0;i<4;i++)
            if((situazione[i].charAt(1)==semeBriscola)&&(indici[i]>maggioreBriscola)) maggioreBriscola=indici[i];
                
        for(int i=0;i<4;i++)
            if((situazione[i].charAt(1)==semeBriscola)&&(indici[i]==maggioreBriscola)) return i;
        
        int maggioreSeme=-1;
        for(int i=0;i<4;i++)
            if((situazione[i].charAt(1)==seme)&&(indici[i]>maggioreSeme)) maggioreSeme=indici[i];
        
       for(int i=0;i<4;i++)
            if ((situazione[i].charAt(1)==seme)&&(indici[i]==maggioreSeme)) return i;
       
        return -1;
    }
    
    private int cercaIndice(char Carta)
    {         
        char Ordine[]={'2','4','5','6','7','J','Q','K','3','1'};
        
        for(int i=0;i<10;i++)
            if(Ordine[i]==Carta) return i;
        return 0;
    }
    
    private void contaPunti(char c1, char c2, int vincitore)
    {
        int p;        
        if(c1=='1')p=11;
        else if(c1=='3')p=10;
        else if(c1=='K')p=4;
        else if(c1=='Q')p=3;
        else if(c1=='J')p=2;
        else p=0;
        
        if(c2=='1')p+=11;
        else if(c2=='3')p+=10;
        else if(c2=='K')p+=4;
        else if(c2=='Q')p+=3;
        else if(c2=='J')p+=2;
        else p+=0;
        
        if(vincitore==0) {punti1+=p; jGuadagno1.setText("+"+p);}
        else {punti2+=p; jGuadagno2.setText("+"+p);}
    }
    
    private void contaPunti4()
    {
        int p=0;  
        for(int i=0;i<4;i++)
        {    
            if(situazione[i].charAt(0)=='1')p+=11;
            else if(situazione[i].charAt(0)=='3')p+=10;
            else if(situazione[i].charAt(0)=='K')p+=4;
            else if(situazione[i].charAt(0)=='Q')p+=3;
            else if(situazione[i].charAt(0)=='J')p+=2;
        }
        if(inizia==0) {punti1+=p; jGuadagno00.setText("+"+p);}
        if(inizia==1) {punti2+=p; jGuadagno11.setText("+"+p);}
        if(inizia==2) {punti1+=p; jGuadagno22.setText("+"+p);}
        if(inizia==3) {punti2+=p; jGuadagno33.setText("+"+p);}
    }
    
    private void giocaCPU1 (int turno, JButton cartaGiocata)
    {
        risposta=cpu.scegliCarta1(carteCorrenti, 40-k);
        if(modSingola==false) 
        {
            cartaGiocata.setIcon(new ImageIcon(Grafica+"\\"+risposta+".png"));
            situazione[turno]=risposta;
            avversario=risposta;
            eliminaDoppi(risposta, turno);
            carteCompagno1.remove(risposta);
            carteCompagno2.remove(risposta);
        }
        else
        {
            jCartaGiocata2.setIcon(new ImageIcon(Grafica+"\\"+risposta+".png"));
            ultima[1]=risposta;
        }
    }
    
    private void giocaCPU2 (int turno, JButton cartaGiocata)
    {
        risposta=cpu.scegliCarta22(carteCorrenti, 40-k);
        cartaGiocata.setIcon(new ImageIcon(Grafica+"\\"+risposta+".png"));
        situazione[turno]=risposta;
        eliminaDoppi(risposta, turno);
        carteCompagno1.remove(risposta);
        carteCompagno2.remove(risposta);
    }
    
    private void giocaCPU3 (int turno, JButton cartaGiocata)
    {
        risposta=cpu.scegliCarta3(carteCorrenti);
        cartaGiocata.setIcon(new ImageIcon(Grafica+"\\"+risposta+".png"));
        situazione[turno]=risposta;
        eliminaDoppi(risposta, turno);
        carteCompagno1.remove(risposta);
        carteCompagno2.remove(risposta);
    }
    
    private void giocaCPU4 (int turno, JButton cartaGiocata)
    {
        risposta=cpu.scegliCarta4(carteCorrenti);
        cartaGiocata.setIcon(new ImageIcon(Grafica+"\\"+risposta+".png"));
        situazione[turno]=risposta;
        eliminaDoppi(risposta, turno);
        carteCompagno1.remove(risposta);
        carteCompagno2.remove(risposta);
    }
    
    private void eliminaDoppi(String risposta, int n)   // dove n è il turno su cui lavorare
    {
        if(modSingola==false)
        {
            int j=0; 
            if(n==1) j=9; 
            else if(n==2) j=3;
            else if(n==3) j=6; 
            int l=j+3;
            
            for(j=j;j<l;j++)
                    if(carteCorrenti[j].equals(situazione[n])) carteCorrenti[j]=null;
            
            if(carteCorrenti[0]==null) JCarta1.setIcon(null);
            if(carteCorrenti[1]==null) JCarta2.setIcon(null);
            if(carteCorrenti[2]==null) JCarta3.setIcon(null);
            if(carteCorrenti[3]==null) JCarta4.setIcon(null);
            if(carteCorrenti[4]==null) JCarta5.setIcon(null);
            if(carteCorrenti[5]==null) JCarta6.setIcon(null);
            if(carteCorrenti[6]==null) JCarta7.setIcon(null);
            if(carteCorrenti[7]==null) JCarta8.setIcon(null);
            if(carteCorrenti[8]==null) JCarta9.setIcon(null);
            if(carteCorrenti[9]==null) JCarta10.setIcon(null);
            if(carteCorrenti[10]==null) JCarta11.setIcon(null);
            if(carteCorrenti[11]==null) JCarta12.setIcon(null);
        }
        else
        {
            for(int i=0;i<6;i++)
                if(carteCorrenti[i].equals(risposta)) carteCorrenti[i]=null;
            
            if(carteCorrenti[0]==null) jCarta1.setIcon(null);
            if(carteCorrenti[1]==null) jCarta2.setIcon(null);
            if(carteCorrenti[2]==null) jCarta3.setIcon(null);
            if(carteCorrenti[3]==null) jCarta4.setIcon(null);
            if(carteCorrenti[4]==null) jCarta5.setIcon(null);
            if(carteCorrenti[5]==null) jCarta6.setIcon(null);
        }
    }
    
    private void assegnaImmagini()
    {
        if(k<39)       
        {     
            String icona1, icona2;
            
            icona1=mazzoFinale[k];
            k++;   
            icona2=mazzoFinale[k];
            k++;
            
            if(turno==1){String c=icona1; icona1=icona2; icona2=c;}
            
            ImageIcon ico1=new ImageIcon(Grafica+"\\"+icona1+".png");
            ImageIcon ico2=new ImageIcon(Grafica+"\\"+icona2+".png");
            
            contaCarte(icona1, 1);
            contaCarte(icona2, 2);
            
            if(jCarta1.getIcon()==null)
            {
                jCarta1.setIcon(ico1);
                carteCorrenti[0]=icona1;
            }
            else if(jCarta2.getIcon()==null)
            {
                jCarta2.setIcon(ico1);
                carteCorrenti[1]=icona1;
            }
            else if(jCarta3.getIcon()==null)
            {
                jCarta3.setIcon(ico1);
                carteCorrenti[2]=icona1;
            }
                   
            if(jCarta4.getIcon()==null)
            {
                if(scoperte==true)jCarta4.setIcon(ico2); 
                else jCarta4.setIcon(new ImageIcon("retro.png"));
                carteCorrenti[3]=icona2;
            }
            else if(jCarta5.getIcon()==null)
            {
                if(scoperte==true)jCarta5.setIcon(ico2); 
                else jCarta5.setIcon(new ImageIcon("retro.png"));
                carteCorrenti[4]=icona2;
            }
            else if(jCarta6.getIcon()==null)
            {
                if(scoperte==true) jCarta6.setIcon(ico2);
                else jCarta6.setIcon(new ImageIcon("retro.png"));
                carteCorrenti[5]=icona2;
            } 
             
            Contatore.setText(String.valueOf(40-k));
            if(Contatore.getText().equals("0")){jMazzo.setIcon(null); jBriscola.setEnabled(false);}
        }
    }
    
    private void assegnaImmagini4()
    {
        if(k<38)       
        {     
            ImageIcon[] ico=new ImageIcon[4];
            String[] icona=new String[4];
            int[] pos=new int[4];
            
            if(inizia==0) {pos[0]=0; pos[1]=1; pos[2]=2; pos[3]=3;}
            if(inizia==1) {pos[0]=3; pos[1]=0; pos[2]=1; pos[3]=2;}
            if(inizia==2) {pos[0]=2; pos[1]=3; pos[2]=0; pos[3]=1;}
            if(inizia==3) {pos[0]=1; pos[1]=2; pos[2]=3; pos[3]=0;}
            
            for(int i=0; i<4; i++)
                icona[i]=mazzoFinale[k+pos[i]];
            
            for(int i=0; i<4; i++)
                ico[i]=new ImageIcon(Grafica+"\\"+icona[i]+".png");
            
            int c=0, c1=1;
            if((inizia==1)||(inizia==3)) {c=1; c1=0;}
            contaCarte(icona[0], c);        
            contaCarte(icona[1], c1);
            contaCarte(icona[2], c);
            contaCarte(icona[3], c1);
            
            if(JCarta1.getIcon()==null)
            {
                JCarta1.setIcon(ico[0]);
                carteCorrenti[0]=icona[0];
            }
            else if(JCarta2.getIcon()==null)
            {
                JCarta2.setIcon(ico[0]);
                carteCorrenti[1]=icona[0];
            }
            else if(JCarta3.getIcon()==null)
            {
                JCarta3.setIcon(ico[0]);
                carteCorrenti[2]=icona[0];
            }
            if(JCarta10.getIcon()==null)
            {
                if(scoperte==true)JCarta10.setIcon(ico[1]); 
                else JCarta10.setIcon(new ImageIcon("retro2.png"));
                carteCorrenti[9]=icona[1];
            }
            else if(JCarta11.getIcon()==null)
            {
                if(scoperte==true)JCarta11.setIcon(ico[1]); 
                else JCarta11.setIcon(new ImageIcon("retro2.png"));
                carteCorrenti[10]=icona[1];
            }
            else if(JCarta12.getIcon()==null)
            {
                if(scoperte==true)JCarta12.setIcon(ico[1]); 
                else JCarta12.setIcon(new ImageIcon("retro2.png"));
                carteCorrenti[11]=icona[1];
            } 
            if(JCarta4.getIcon()==null)
            {
                if (scoperte==true)JCarta4.setIcon(ico[2]); 
                else JCarta4.setIcon(new ImageIcon("retro.png"));
                carteCorrenti[3]=icona[2];
            }
            else if(JCarta5.getIcon()==null)
            {
                if(scoperte==true)JCarta5.setIcon(ico[2]); 
                else JCarta5.setIcon(new ImageIcon("retro.png"));
                carteCorrenti[4]=icona[2];
            }
            else if(JCarta6.getIcon()==null)
            {
                if(scoperte==true)JCarta6.setIcon(ico[2]); 
                else JCarta6.setIcon(new ImageIcon("retro.png"));
                carteCorrenti[5]=icona[2];
            } 
            if(JCarta7.getIcon()==null)
            {
                if(scoperte==true)JCarta7.setIcon(ico[3]); 
                else JCarta7.setIcon(new ImageIcon("retro2.png"));
                carteCorrenti[6]=icona[3];
            }
            else if(JCarta8.getIcon()==null)
            {
                if(scoperte==true)JCarta8.setIcon(ico[3]); 
                else JCarta8.setIcon(new ImageIcon("retro2.png"));
                carteCorrenti[7]=icona[3];
            }
            else if(JCarta9.getIcon()==null)
            {
                if(scoperte==true)JCarta9.setIcon(ico[3]); 
                else JCarta9.setIcon(new ImageIcon("retro2.png"));
                carteCorrenti[8]=icona[3];
            }
             
            k+=4;
            Contatore1.setText(String.valueOf(40-k));
            if(Contatore1.getText().equals("0")){JMazzo.setIcon(null); JBriscola.setEnabled(false);}
        }
    }
    
    public void segniAvversari(int giocatore, Set<String> carteRisapute)
    {
                int i=6;
        if(giocatore==1) i=9;
        if(giocatore==2) i=3;
        int l=i+3;
        
        for(int j=i;j<l;j++)
            if(!giaSegnate.contains(carteCorrenti[j])) segno(carteCorrenti[j], giocatore, carteRisapute);
    }
        
    public void segno(String carta, int giocatore, Set<String> carteRisapute)
    {
        if(carta.charAt(1)==semeBriscola)
        {
            if(carta.charAt(0)=='1') attribuisciSegno("Asso", giocatore, carteRisapute, carta); 
            else if(carta.charAt(0)=='3') attribuisciSegno("Tre", giocatore, carteRisapute, carta); 
            else if(carta.charAt(0)=='K') attribuisciSegno("Re", giocatore, carteRisapute, carta); 
            else if(carta.charAt(0)=='Q') attribuisciSegno("Cavallo", giocatore, carteRisapute, carta); 
            else if(carta.charAt(0)=='J') attribuisciSegno("Fante", giocatore, carteRisapute, carta); 
        }
        else if((carta.charAt(0)=='1')||(carta.charAt(0)=='3')) attribuisciSegno("Carico", giocatore, carteRisapute, carta); 
    }
    
    public void attribuisciSegno(String segno, int giocatore, Set<String> carteRisapute, String carta)
    {
        boolean i=rand(3)==0;
        
        if(giocatore==1)
        {
            if(jSegno1.getText().equals("")) {
                if(i==true)
                    jSegno1.setText(segno); carteRisapute.add(segno); giaSegnate.add(carta);}
            else if(jSegno11.getText().equals("")) {jSegno11.setText(segno); carteRisapute.add(segno); giaSegnate.add(carta);}
        }
        else if(giocatore==3)
        {
            if(jSegno3.getText().equals("")) {
                if(i==true)
                    jSegno3.setText(segno); carteRisapute.add(segno); giaSegnate.add(carta);}
            else if(jSegno33.getText().equals("")) {jSegno33.setText(segno); carteRisapute.add(segno); giaSegnate.add(carta);}
        }
        else
        {
            if(jSegno2.getText().equals("")) {jSegno2.setText(segno); carteRisapute.add(segno); giaSegnate.add(carta);}
            else if(jSegno22.getText().equals("")) {jSegno22.setText(segno); carteRisapute.add(segno); giaSegnate.add(carta);}
        }
    }
    
    private void vittoria ()
    {
        if((modSingola==true)&&(jCarta1.getIcon()==null)&&(jCarta2.getIcon()==null)&&(jCarta3.getIcon()==null))
        {
            jLabel18.setText("Tu");
            jLabel17.setText("CPU");
            
            String line;
            if(punti1>60) line="Hai Vinto!";
            else if(punti1<60) line="Hai Perso...";
            else line="Pareggio";
            
            Tavolo1.setVisible(false);  
            Vittoria.setVisible(true);
            jVittoria.setText(line);
            jPunti1.setText(String.valueOf(punti1));
            jPunti2.setText(String.valueOf(punti2));
            jBriscoleTu.setText(String.valueOf(briscolaTu));
            jBriscoleCPU.setText(String.valueOf(briscolaCPU));
            jCarichiTu.setText(String.valueOf(carichiTu));
            jCarichiCPU.setText(String.valueOf(carichiCPU));
            continua=false;
        }
        else if ((modSingola==false)&&(JCarta1.getIcon()==null)&&(JCarta2.getIcon()==null)&&(JCarta3.getIcon()==null))
        {
            jLabel18.setText("La tua Squadra");
            jLabel17.setText("Squadra avversaria");
            
            String line;
            if(punti1>60) line="Hai Vinto!";
            else if(punti1<60) line="Hai Perso..."; 
            else line="Pareggio";
            
            Tavolo2.setVisible(false);  
            Vittoria.setVisible(true);
            jVittoria.setText(line);
            jPunti1.setText(String.valueOf(punti1));
            jPunti2.setText(String.valueOf(punti2));
            jBriscoleTu.setText(String.valueOf(briscolaTu));
            jBriscoleCPU.setText(String.valueOf(briscolaCPU));
            jCarichiTu.setText(String.valueOf(carichiTu));
            jCarichiCPU.setText(String.valueOf(carichiCPU));
            continua=false;
        }
    }    
    
    public void iniziaPartitaG()
    {
        difficile=jDifficile.getSelectedIndex()==1;
        cpu.carteAndate.removeAll(cpu.carteAndate);
        Grafica=String.valueOf(jGrafica.getSelectedItem());        
        if(jScoperte.getSelectedIndex()==0) scoperte=false;
        else scoperte=true;
        jBriscola.setEnabled(true);
        if(modSingola==true) k=6;
        else k=12;
        
        String mazzo=carte.creaMazzo();
        mazzo=mazzo.replace("]", "");
        mazzo=mazzo.replace("[", "");
        mazzoFinale=mazzo.split(", ");
        mazzoFinale=carte.corrispondenzaNomi(mazzoFinale);
                
        carteCorrenti[0]=mazzoFinale[0];
        carteCorrenti[1]=mazzoFinale[1];
        carteCorrenti[2]=mazzoFinale[2];
        carteCorrenti[3]=mazzoFinale[3];
        carteCorrenti[4]=mazzoFinale[4];
        carteCorrenti[5]=mazzoFinale[5];          
        briscola=mazzoFinale[39]; 
        semeBriscola=briscola.charAt(1);
        
        if(modSingola==true) iniziaPartita2();
        else iniziaPartita4();
    }
    
    public void iniziaPartita2()
    {
        turno=rand(2);
        ultimoT=turno;
        Contatore.setText(String.valueOf(40-k));
        
        jMazzo.setIcon(new ImageIcon("Retro.png"));
        jBriscola.setIcon(new ImageIcon(Grafica+"\\"+briscola+".png")); 
        jCarta1.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[0]+".png"));
        jCarta2.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[1]+".png"));
        jCarta3.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[2]+".png"));   
        jCartaGiocata1.setIcon(null);
        jCartaGiocata2.setIcon(null);
        
        if(scoperte==true)
        {
            jCarta4.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[3]+".png"));
            jCarta5.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[4]+".png"));
            jCarta6.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[5]+".png")); 
        }
        else
        {
            jCarta4.setIcon(new ImageIcon("retro.png"));
            jCarta5.setIcon(new ImageIcon("retro.png"));
            jCarta6.setIcon(new ImageIcon("retro.png"));
        }
        
        contaCarte(carteCorrenti[0],1);
        contaCarte(carteCorrenti[1],1);
        contaCarte(carteCorrenti[2],1);
        contaCarte(carteCorrenti[3],2);
        contaCarte(carteCorrenti[4],2);
        contaCarte(carteCorrenti[5],2);
        if(turno==1){giocaCPU1(0, null); eliminaDoppi(risposta, 0);}
    }
    
    public void iniziaPartita4()
    {
        turno=rand(4);     //rand(4)
        inizia=turno;
        ultimoT=turno;
        Contatore1.setText(String.valueOf(40-k));
        JBriscola.setEnabled(true);
        difficile=true;
                
        JMazzo.setIcon(new ImageIcon("Retro.png"));
        JBriscola.setIcon(new ImageIcon(Grafica+"\\"+briscola+".png")); 
        JCarta1.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[0]+".png"));
        JCarta2.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[1]+".png"));
        JCarta3.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[2]+".png"));   
        JCartaGiocata1.setIcon(null);
        JCartaGiocata2.setIcon(null);
        JCartaGiocata3.setIcon(null);
        JCartaGiocata4.setIcon(null);
        
        carteCorrenti[6]=mazzoFinale[6];
        carteCorrenti[7]=mazzoFinale[7];
        carteCorrenti[8]=mazzoFinale[8];
        carteCorrenti[9]=mazzoFinale[9];
        carteCorrenti[10]=mazzoFinale[10];
        carteCorrenti[11]=mazzoFinale[11];      
        
        
        if(scoperte==true)
        {
            JCarta4.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[3]+".png"));
            JCarta5.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[4]+".png"));
            JCarta6.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[5]+".png")); 
            JCarta7.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[6]+".png"));
            JCarta8.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[7]+".png"));
            JCarta9.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[8]+".png")); 
            JCarta10.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[9]+".png"));
            JCarta11.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[10]+".png"));
            JCarta12.setIcon(new ImageIcon(Grafica+"\\"+carteCorrenti[11]+".png")); 
        }
        else
        {
            JCarta4.setIcon(new ImageIcon("retro.png"));
            JCarta5.setIcon(new ImageIcon("retro.png"));
            JCarta6.setIcon(new ImageIcon("retro.png")); 
            JCarta7.setIcon(new ImageIcon("retro2.png"));
            JCarta8.setIcon(new ImageIcon("retro2.png"));
            JCarta9.setIcon(new ImageIcon("retro2.png")); 
            JCarta10.setIcon(new ImageIcon("retro2.png"));
            JCarta11.setIcon(new ImageIcon("retro2.png"));
            JCarta12.setIcon(new ImageIcon("retro2.png")); 
        }
        
        for(int i=0;i<6;i++)
            contaCarte(carteCorrenti[i],1);
        
        for(int i=6;i<12;i++)
            contaCarte(carteCorrenti[i],2);
        
        if(inizia==1)
        {
            giocaCPU1(1, JCartaGiocata2);
            giocaCPU2(2, JCartaGiocata3);
            giocaCPU3(3, JCartaGiocata4);
        }
        else if(inizia==2)
        {
            giocaCPU1(2, JCartaGiocata3);
            giocaCPU2(3, JCartaGiocata4);
        }
        else if(inizia==3)
        {
            giocaCPU1(3, JCartaGiocata4);
        }
    }
    
    public void contaCarte(String carta, int g)
    {
        if(carta.charAt(1)==semeBriscola)
        {
             if(g==1) briscolaTu++;
             else briscolaCPU++;      
        }
        else if((carta.charAt(0)=='1')||(carta.charAt(0)=='3'))
        {
             if(g==1) carichiTu++;
             else carichiCPU++;      
        }
    }
        
    public int rand (int massimo)
    {
        int n=(int)(Math.random()*massimo);
        return n;
    }
    
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
            java.util.logging.Logger.getLogger(Gioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gioco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Gioco().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contatore;
    private javax.swing.JLabel Contatore1;
    private javax.swing.JButton JBriscola;
    private javax.swing.JButton JCarta1;
    private javax.swing.JButton JCarta10;
    private javax.swing.JButton JCarta11;
    private javax.swing.JButton JCarta12;
    private javax.swing.JButton JCarta2;
    private javax.swing.JButton JCarta3;
    private javax.swing.JButton JCarta4;
    private javax.swing.JButton JCarta5;
    private javax.swing.JButton JCarta6;
    private javax.swing.JButton JCarta7;
    private javax.swing.JButton JCarta8;
    private javax.swing.JButton JCarta9;
    private javax.swing.JButton JCartaGiocata1;
    private javax.swing.JButton JCartaGiocata2;
    private javax.swing.JButton JCartaGiocata3;
    private javax.swing.JButton JCartaGiocata4;
    private javax.swing.JButton JMazzo;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Opzioni;
    private javax.swing.JPanel Tavolo1;
    private javax.swing.JPanel Tavolo2;
    private javax.swing.JPanel Vittoria;
    private javax.swing.JButton jAnnullaMossa;
    private javax.swing.JButton jAnnullaMossa1;
    private javax.swing.JButton jBriscola;
    private javax.swing.JButton jBriscolaCoppia;
    private javax.swing.JLabel jBriscoleCPU;
    private javax.swing.JLabel jBriscoleTu;
    private javax.swing.JLabel jCarichiCPU;
    private javax.swing.JLabel jCarichiTu;
    private javax.swing.JButton jCarta1;
    private javax.swing.JButton jCarta2;
    private javax.swing.JButton jCarta3;
    private javax.swing.JButton jCarta4;
    private javax.swing.JButton jCarta5;
    private javax.swing.JButton jCarta6;
    private javax.swing.JButton jCartaGiocata1;
    private javax.swing.JButton jCartaGiocata2;
    private javax.swing.JButton jContinua;
    private javax.swing.JComboBox<String> jDifficile;
    private javax.swing.JButton jEsci;
    private javax.swing.JButton jEsci1;
    private javax.swing.JComboBox<String> jFullscreen;
    private javax.swing.JComboBox<String> jGrafica;
    private javax.swing.JLabel jGuadagno00;
    private javax.swing.JLabel jGuadagno1;
    private javax.swing.JLabel jGuadagno11;
    private javax.swing.JLabel jGuadagno2;
    private javax.swing.JLabel jGuadagno22;
    private javax.swing.JLabel jGuadagno33;
    private javax.swing.JButton jIndietro;
    private javax.swing.JButton jIndietro1;
    private javax.swing.JButton jIndietro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLogo;
    private javax.swing.JButton jMazzo;
    private javax.swing.JButton jMenuPrincipale;
    private javax.swing.JButton jNuovaP;
    private javax.swing.JButton jOpzioni;
    private javax.swing.JLabel jPunti1;
    private javax.swing.JLabel jPunti2;
    private javax.swing.JComboBox<String> jScoperte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jSegno1;
    private javax.swing.JLabel jSegno11;
    private javax.swing.JLabel jSegno2;
    private javax.swing.JLabel jSegno22;
    private javax.swing.JLabel jSegno3;
    private javax.swing.JLabel jSegno33;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel jVittoria;
    // End of variables declaration//GEN-END:variables
}
