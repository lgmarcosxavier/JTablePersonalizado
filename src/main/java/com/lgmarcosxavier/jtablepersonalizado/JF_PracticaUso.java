package com.lgmarcosxavier.jtablepersonalizado;

/**
 *
 * @author lgmar
 */
public class JF_PracticaUso extends javax.swing.JFrame {

    public JF_PracticaUso() {
        initComponents();
        
        MiModeloTabla modelo = new MiModeloTabla();
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Teléfono");
        Object O[] = null;
        
        for (int i = 0; i < 3 ; i++ ){
            modelo.addRow(O);
            
            if ( i == 0 ){
                modelo.setValueAt("1", i, 0);
                modelo.setValueAt("Marcos", i, 1);
                modelo.setValueAt("Lopez", i, 2);
            }else if ( i == 1 ){
                modelo.setValueAt("2", i, 0);
                modelo.setValueAt("Xavier", i, 1);
                modelo.setValueAt("Lopez", i, 2);
            }else if ( i == 2 ){
                modelo.setValueAt("3", i, 0);
                modelo.setValueAt("lgmarcos", i, 1);
                modelo.setValueAt("demo", i, 2);
            }
        }
        
        jTablePersonalizado1.setModel(modelo);
        jTablePersonalizado1.repintar();
        OcultarColumnasTabla.ocultarColumna(jTablePersonalizado1, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonalizado1 = new com.lgmarcosxavier.jtablepersonalizado.JTablePersonalizado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablePersonalizado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTablePersonalizado1.setCOLOR_FILA_SELECCIONADA(new java.awt.Color(204, 204, 255));
        jTablePersonalizado1.setCOLOR_IMPARES(new java.awt.Color(153, 153, 255));
        jTablePersonalizado1.setCOLOR_PARES(new java.awt.Color(102, 153, 255));
        jTablePersonalizado1.setFONT_SIZE_CELDA(12);
        jTablePersonalizado1.setFONT_SIZE_ENCABEZADO(14);
        jScrollPane1.setViewportView(jTablePersonalizado1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_PracticaUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_PracticaUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_PracticaUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_PracticaUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_PracticaUso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.lgmarcosxavier.jtablepersonalizado.JTablePersonalizado jTablePersonalizado1;
    // End of variables declaration//GEN-END:variables
}
