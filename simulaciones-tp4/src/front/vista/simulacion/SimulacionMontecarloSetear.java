/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.vista.simulacion;

import javax.swing.table.DefaultTableModel;
import objects.Calculator;
import objects.Controller;

/**
 *
 * @author federico
 */
public class SimulacionMontecarloSetear extends javax.swing.JFrame {

    /**
     * Creates new form SimulacionMontecarloSetear
     */
    Controller controller;
    int cantRondas=0; 
    int puntaje10PrimerTiro=0; 
    int puntaje10SegundoTiro=0; 
    int valorSuperar=0;
    Calculator calculator = new Calculator();
    
    public void setEspecificos(int cantRondas, int puntosPrimerTiro, int puntosSegundoTiro, int valorASuperar) {
        this.cantRondas = cantRondas;
        this.puntaje10PrimerTiro = puntosPrimerTiro;
        this.puntaje10SegundoTiro = puntosSegundoTiro;
        this.valorSuperar = valorASuperar;
    }
    
    public SimulacionMontecarloSetear(Controller cont) {
        controller = cont;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrimerTiro = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDespues8 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDespues9 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDespues7 = new javax.swing.JTable();
        _lblPrimerTiro = new javax.swing.JLabel();
        _lblDespues8 = new javax.swing.JLabel();
        lblDespues9 = new javax.swing.JLabel();
        _lbl7antes = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        _scpMontecarlo = new javax.swing.JScrollPane();
        _tblMontecarlo = new javax.swing.JTable();
        _lblTituloMontecarlo = new javax.swing.JLabel();
        _btnSimular = new javax.swing.JButton();
        btn_set = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        _txt10PrimerTiro = new javax.swing.JTextField();
        _txt10SegundoTiro = new javax.swing.JTextField();
        _txtRondas = new javax.swing.JTextField();
        _txtCantSim = new javax.swing.JTextField();
        _txtDesde = new javax.swing.JTextField();
        _txtHasta = new javax.swing.JTextField();
        _txtValorSuperar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        _btnLimpiar = new javax.swing.JButton();
        resultado_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Resultados");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1193, 472));
        jTabbedPane1.setRequestFocusEnabled(false);

        tblPrimerTiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(7), null, null},
                { new Integer(8), null, null},
                { new Integer(9), null, null},
                { new Integer(10), null, null}
            },
            new String [] {
                "# Pinos", "Probabilidad", "P. Acumulada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPrimerTiro);

        tblDespues8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), null, null},
                { new Integer(1), null, null},
                { new Integer(2), null, null},
                { new Integer(3), null, null}
            },
            new String [] {
                "# Pinos", "Probabilidad", "P. Acumulada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDespues8);

        tblDespues9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), null, null},
                { new Integer(1), null, null}
            },
            new String [] {
                "# Pinos", "Probabilidad", "P. Acumulada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDespues9);
        if (tblDespues9.getColumnModel().getColumnCount() > 0) {
            tblDespues9.getColumnModel().getColumn(2).setResizable(false);
        }

        tblDespues7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), null, null},
                { new Integer(1), null, null},
                { new Integer(2), null, null}
            },
            new String [] {
                "# Pinos", "Probabilidad", "P. Acumulada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblDespues7);

        _lblPrimerTiro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        _lblPrimerTiro.setForeground(new java.awt.Color(102, 102, 102));
        _lblPrimerTiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lblPrimerTiro.setText("Distribución - Cantidad de pinos tirados en el primer tiro");

        _lblDespues8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        _lblDespues8.setForeground(new java.awt.Color(102, 102, 102));
        _lblDespues8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lblDespues8.setText("Distribución - Cantidad de pinos tirados en el segundo tiro si se tiraron 8 antes");

        lblDespues9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDespues9.setForeground(new java.awt.Color(102, 102, 102));
        lblDespues9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDespues9.setText("Distribución - Cantidad de pinos tirados en el segundo tiro si se tiraron 9 antes");

        _lbl7antes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        _lbl7antes.setForeground(new java.awt.Color(102, 102, 102));
        _lbl7antes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lbl7antes.setText("Distribución - Cantidad de pinos tirados en el segundo tiro si se tiraron 7 antes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(_lblDespues8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(_lblPrimerTiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDespues9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_lbl7antes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lblPrimerTiro)
                    .addComponent(_lbl7antes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lblDespues8)
                    .addComponent(lblDespues9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Distribuciones de frecuencias", jPanel1);

        _tblMontecarlo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Simulación", "# Ronda", "RND1", "1° Tiro", "RND2", "2° Tiro", "Total Pinos", "Puntos totales", "Puntos acumulados", "Supera 120 (S|N)", "Acumulador Supera 120"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        _tblMontecarlo.getTableHeader().setReorderingAllowed(false);
        _scpMontecarlo.setViewportView(_tblMontecarlo);

        _lblTituloMontecarlo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        _lblTituloMontecarlo.setForeground(new java.awt.Color(102, 102, 102));
        _lblTituloMontecarlo.setText("Vector Estado - Montecarlo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1026, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(_scpMontecarlo, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                    .addGap(36, 36, 36)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(429, 429, 429)
                    .addComponent(_lblTituloMontecarlo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(429, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(_scpMontecarlo, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGap(33, 33, 33)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(214, 214, 214)
                    .addComponent(_lblTituloMontecarlo)
                    .addContainerGap(215, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Simulacion", jPanel2);

        _btnSimular.setText("Comenzar simulacion");
        _btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnSimularActionPerformed(evt);
            }
        });

        btn_set.setText("Setear valores");
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntaje de 10 pinos en el primer tiro");

        jLabel2.setText("Puntaje de 10 pinos en el segundo tiro");

        jLabel3.setText("Cantidad de rondas a simular");

        jLabel4.setText("Desde");

        jLabel5.setText("Hasta");

        jLabel6.setText("Cantidad de simulaciones");

        jLabel7.setText("Puntaje a superar");

        _btnLimpiar.setText("Limpiar Campos");
        _btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnLimpiarActionPerformed(evt);
            }
        });

        jLabel9.setText("La probabilidad de que supere es:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_txtRondas, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(_txt10SegundoTiro, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(_txt10PrimerTiro, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(_txtValorSuperar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_set)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_btnSimular))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(_txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(resultado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(_txtCantSim, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(_txtCantSim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6))
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(_txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(resultado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(_txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_btnSimular)
                            .addComponent(btn_set)
                            .addComponent(jButton2)
                            .addComponent(_btnLimpiar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_txt10PrimerTiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_txt10SegundoTiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_txtRondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_txtValorSuperar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnSimularActionPerformed
        DefaultTableModel model = (DefaultTableModel) _tblMontecarlo.getModel();
        model.setRowCount(0);
        calculator.especificoTablas(this, Integer.parseInt(_txtCantSim.getText()), Integer.parseInt(_txtDesde.getText()), Integer.parseInt(_txtHasta.getText()), cantRondas, puntaje10PrimerTiro, puntaje10SegundoTiro, valorSuperar);
       resultado_txt.setText(Double.toString((double)calculator.cantidadExperimentosValidos()/Double.parseDouble(_txtCantSim.getText())));
    }//GEN-LAST:event__btnSimularActionPerformed

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed
        float probAc = 0;
        
        for (int i = 0; i < tblPrimerTiro.getRowCount(); i++) {
            probAc += (float)tblPrimerTiro.getValueAt(i, 1);
            tblPrimerTiro.setValueAt((float)probAc, i, 2);
        }
        probAc = 0;
        for (int i = 0; i < tblDespues7.getRowCount(); i++) {
            probAc += (float)tblDespues7.getValueAt(i, 1);
            tblDespues7.setValueAt((float)probAc, i, 2);
        }
        
        probAc = 0;
        for (int i = 0; i < tblDespues8.getRowCount(); i++) {
            probAc += (float)tblDespues8.getValueAt(i, 1);
            tblDespues8.setValueAt((float)probAc, i, 2);
        }
        
        probAc = 0;
        for (int i = 0; i < tblDespues9.getRowCount(); i++) {
            probAc += (float)tblDespues9.getValueAt(i, 1);
            tblDespues9.setValueAt((float)probAc, i, 2);
        }
        
        setEspecificos(Integer.parseInt(_txtRondas.getText()), Integer.parseInt(_txt10PrimerTiro.getText()), Integer.parseInt(_txt10SegundoTiro.getText()), Integer.parseInt(_txtValorSuperar.getText()));
        
    }//GEN-LAST:event_btn_setActionPerformed

    private void _btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnLimpiarActionPerformed
        _txt10PrimerTiro.setText("");
        _txt10SegundoTiro.setText("");
        _txtCantSim.setText("");
        _txtDesde.setText("");
        _txtHasta.setText("");
        _txtRondas.setText("");
        _txtValorSuperar.setText("");
        
    }//GEN-LAST:event__btnLimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        controller.showMenu();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btnLimpiar;
    private javax.swing.JButton _btnSimular;
    private javax.swing.JLabel _lbl7antes;
    private javax.swing.JLabel _lblDespues8;
    private javax.swing.JLabel _lblPrimerTiro;
    private javax.swing.JLabel _lblTituloMontecarlo;
    private javax.swing.JScrollPane _scpMontecarlo;
    public javax.swing.JTable _tblMontecarlo;
    private javax.swing.JTextField _txt10PrimerTiro;
    private javax.swing.JTextField _txt10SegundoTiro;
    private javax.swing.JTextField _txtCantSim;
    private javax.swing.JTextField _txtDesde;
    private javax.swing.JTextField _txtHasta;
    private javax.swing.JTextField _txtRondas;
    private javax.swing.JTextField _txtValorSuperar;
    private javax.swing.JButton btn_set;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDespues9;
    private javax.swing.JTextField resultado_txt;
    public javax.swing.JTable tblDespues7;
    public javax.swing.JTable tblDespues8;
    public javax.swing.JTable tblDespues9;
    public javax.swing.JTable tblPrimerTiro;
    // End of variables declaration//GEN-END:variables
    

}
