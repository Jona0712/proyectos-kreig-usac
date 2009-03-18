/*
 * MainWindow.java
 *
 * Created on October 5, 2007, 7:40 PM
 */

package validadorfacturas;

/**
 *
 * @author  Erik Giron
 */
public class MainWindow extends javax.swing.JFrame {
    private static VentanaReporteFechas vrf = new VentanaReporteFechas();
    private static VentanaReporteNumero vrn = new VentanaReporteNumero();
    private static About aboutw = new About();
    private static Query query = new Query();
    
    /**Devuelve objeto de interfaz de DB*/
    public static Query getQuery(){
        return query;
    }
    
    /** Creates new form MainWindow */
    public MainWindow() {        
        initComponents();
        query.conectar();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonClear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        jMenuItemReporte1 = new javax.swing.JMenuItem();
        jMenuItemReporte2 = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Validador de Facturas 1.0 Por Erik Giron");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText("Aqui se mostraran los resultados.\n\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButtonClear.setText("Limpiar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jMenuArchivo.setMnemonic('a');
        jMenuArchivo.setText("Archivo");
        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalir.setMnemonic('s');
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });

        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuReportes.setMnemonic('r');
        jMenuReportes.setText("Reportes");
        jMenuItemReporte1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReporte1.setMnemonic('c');
        jMenuItemReporte1.setText("Facturas Faltantes por Correlativo");
        jMenuItemReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReporte1ActionPerformed(evt);
            }
        });

        jMenuReportes.add(jMenuItemReporte1);

        jMenuItemReporte2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReporte2.setMnemonic('f');
        jMenuItemReporte2.setText("Facturas Faltantes por Fecha");
        jMenuItemReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReporte2ActionPerformed(evt);
            }
        });

        jMenuReportes.add(jMenuItemReporte2);

        jMenuBar1.add(jMenuReportes);

        jMenuHelp.setMnemonic('y');
        jMenuHelp.setText("Ayuda");
        jMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpActionPerformed(evt);
            }
        });

        jMenuItemAcercaDe.setMnemonic('a');
        jMenuItemAcercaDe.setText("Acerca De..");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });

        jMenuHelp.add(jMenuItemAcercaDe);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .add(jButtonClear)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonClear)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        aboutw.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReporte1ActionPerformed
        vrn.setVisible(true);
    }//GEN-LAST:event_jMenuItemReporte1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        if(query.estaConectado())
            query.desconectar();        
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReporte2ActionPerformed
        vrf.setVisible(true);
    }//GEN-LAST:event_jMenuItemReporte2ActionPerformed

    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuHelpActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    /**Escribe texto a JTextArea*/
    public static void print(String msg){
        jTextArea1.setText(jTextArea1.getText() + msg);
    }
    
    /**Escribe texto a JTextArea*/
    public static void println(String msg){
        jTextArea1.setText(jTextArea1.getText() + msg + "\n");
    }

        /**Limpia el JTextArea*/
    public static void clear(){
        jTextArea1.setText(null);
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemReporte1;
    private javax.swing.JMenuItem jMenuItemReporte2;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
}
