/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Image;
import javax.swing.ImageIcon;
import matest.Lenguaje;

/**
 *
 * @author gaspar
 */
public class frmHistorial extends javax.swing.JFrame {
    Lenguaje vg = new Lenguaje();
    
    public void setIdiomaSeleccionado(int idiomaSeleccionado) {
        vg.setIdiomaSeleccionado(idiomaSeleccionado);
        myInitComponents();
    }
    /**
     * Creates new form frmHistorial
     */
    public frmHistorial() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Image imgIconoApp = new ImageIcon("src/vistas/icon.png").getImage();
        setIconImage(imgIconoApp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpPrincipal = new javax.swing.JTabbedPane();
        pnlSumas = new javax.swing.JPanel();
        lblSumas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSumas = new javax.swing.JTable();
        pnlRestas = new javax.swing.JPanel();
        lblRestas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestas = new javax.swing.JTable();
        pnlMultiplicaciones = new javax.swing.JPanel();
        lblMultiplicaciones = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMultiplicaciones = new javax.swing.JTable();
        pnlDivisiones = new javax.swing.JPanel();
        lblDivisiones = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDivisiones = new javax.swing.JTable();
        pnlPorcentajes = new javax.swing.JPanel();
        lblPorcentajes = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPorcentajes = new javax.swing.JTable();
        lblHistorial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbpPrincipal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        lblSumas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblSumas.setText("$_Titulo");

        tblSumas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblSumas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSumas);

        javax.swing.GroupLayout pnlSumasLayout = new javax.swing.GroupLayout(pnlSumas);
        pnlSumas.setLayout(pnlSumasLayout);
        pnlSumasLayout.setHorizontalGroup(
            pnlSumasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSumasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSumas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        pnlSumasLayout.setVerticalGroup(
            pnlSumasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSumasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSumas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );

        tbpPrincipal.addTab("tab1", pnlSumas);

        lblRestas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblRestas.setText("$_Titulo");

        tblRestas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblRestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblRestas);

        javax.swing.GroupLayout pnlRestasLayout = new javax.swing.GroupLayout(pnlRestas);
        pnlRestas.setLayout(pnlRestasLayout);
        pnlRestasLayout.setHorizontalGroup(
            pnlRestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRestas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        pnlRestasLayout.setVerticalGroup(
            pnlRestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRestas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );

        tbpPrincipal.addTab("tab2", pnlRestas);

        lblMultiplicaciones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMultiplicaciones.setText("$_Titulo");

        tblMultiplicaciones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblMultiplicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblMultiplicaciones);

        javax.swing.GroupLayout pnlMultiplicacionesLayout = new javax.swing.GroupLayout(pnlMultiplicaciones);
        pnlMultiplicaciones.setLayout(pnlMultiplicacionesLayout);
        pnlMultiplicacionesLayout.setHorizontalGroup(
            pnlMultiplicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplicacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMultiplicaciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        pnlMultiplicacionesLayout.setVerticalGroup(
            pnlMultiplicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplicacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMultiplicaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );

        tbpPrincipal.addTab("tab3", pnlMultiplicaciones);

        lblDivisiones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblDivisiones.setText("$_Titulo");

        tblDivisiones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblDivisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblDivisiones);

        javax.swing.GroupLayout pnlDivisionesLayout = new javax.swing.GroupLayout(pnlDivisiones);
        pnlDivisiones.setLayout(pnlDivisionesLayout);
        pnlDivisionesLayout.setHorizontalGroup(
            pnlDivisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDivisiones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        pnlDivisionesLayout.setVerticalGroup(
            pnlDivisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDivisiones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );

        tbpPrincipal.addTab("tab4", pnlDivisiones);

        lblPorcentajes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPorcentajes.setText("$_Titulo");

        tblPorcentajes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblPorcentajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblPorcentajes);

        javax.swing.GroupLayout pnlPorcentajesLayout = new javax.swing.GroupLayout(pnlPorcentajes);
        pnlPorcentajes.setLayout(pnlPorcentajesLayout);
        pnlPorcentajesLayout.setHorizontalGroup(
            pnlPorcentajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorcentajesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPorcentajes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        pnlPorcentajesLayout.setVerticalGroup(
            pnlPorcentajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorcentajesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPorcentajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );

        tbpPrincipal.addTab("tab5", pnlPorcentajes);

        lblHistorial.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblHistorial.setText("$_Historial");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbpPrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHistorial)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHistorial().setVisible(true);
            }
        });
    }
    
    private void myInitComponents() {
        this.setTitle(vg.getHISTORIAL());
        
        lblHistorial.setText(vg.getHISTORIAL());
        
        tbpPrincipal.setTitleAt(0, vg.getSUMA());
        tbpPrincipal.setTitleAt(1, vg.getRESTA());
        tbpPrincipal.setTitleAt(2, vg.getMULTIPLICACION());
        tbpPrincipal.setTitleAt(3, vg.getDIVISION());
        tbpPrincipal.setTitleAt(4, vg.getPORCENTAGE());
        
        lblSumas.setText(vg.getSUMA());
        lblRestas.setText(vg.getRESTA());
        lblMultiplicaciones.setText(vg.getMULTIPLICACION());
        lblDivisiones.setText(vg.getDIVISION());
        lblPorcentajes.setText(vg.getPORCENTAGE());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblDivisiones;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblMultiplicaciones;
    private javax.swing.JLabel lblPorcentajes;
    private javax.swing.JLabel lblRestas;
    private javax.swing.JLabel lblSumas;
    private javax.swing.JPanel pnlDivisiones;
    private javax.swing.JPanel pnlMultiplicaciones;
    private javax.swing.JPanel pnlPorcentajes;
    private javax.swing.JPanel pnlRestas;
    private javax.swing.JPanel pnlSumas;
    private javax.swing.JTable tblDivisiones;
    private javax.swing.JTable tblMultiplicaciones;
    private javax.swing.JTable tblPorcentajes;
    private javax.swing.JTable tblRestas;
    private javax.swing.JTable tblSumas;
    private javax.swing.JTabbedPane tbpPrincipal;
    // End of variables declaration//GEN-END:variables
}
