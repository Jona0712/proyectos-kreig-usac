/*
 * Workplace.java
 *
 * Created on 6 de marzo de 2006, 07:43 PM
 * @TODO:
 * Hecho Asignar modelo de datos para la tabla
 * - Conectar el modelo de datos a la hoja creada
 * - Conectar lista de hojas con Tablist
 * - Eventos para almacenar datos desde tabla visual a tabla abstracta
 * - Eventos para que procese los datos de la tabla
 * 
 */

package electric_sheet;

import java.util.*;
import javax.swing.*;
import tda.*;
/**
 * Espacio de trabajo que anida el
 * listado de hojas
 * @author  Erik Giron
 */
public class Workplace extends javax.swing.JPanel {
    private LinkedList<Sheet> listaHojas;
    private Sheet tmpHoja;
    /** Creates new form Workplace */
    public Workplace() {
        initComponents();
        InicializarListaHojas();
    }
    public void InicializarListaHojas(){
        //Sheet hoja = new Sheet("Hoja 1");
        listaHojas = new LinkedList<Sheet>(); // crea lista de hojas
//        ListadoHojas.insertTab("Hoja1",null,new Sheet("hoja1",this),"1",0);
        
//        listaHojas.add(hoja); //agrega una nueva hoja
//        ListadoHojas.addTab(hoja.getName(),hoja); //inserta hoja en los tab
        this.setVisible(true);
 
    }
    /**Inserta una nueva hoja en la lista de hojas
     @return True si se logro insertar el elemento*/
    public boolean insertarHoja(String name){
        int numElem;
        boolean encontrado = false;
        int i = 0;
        if(!(listaHojas.isEmpty())){
            numElem = listaHojas.size();
            //tmpHoja =(Sheet) listaHojas.get(i);
            while(i <numElem && !encontrado){
                tmpHoja =(Sheet) listaHojas.get(i);
                if (tmpHoja.getId().equals(name))
                    encontrado = true;
                i++;
            }
            if (!encontrado){
                Sheet hoja = new Sheet(name,this);
                ListadoHojas.addTab(hoja.getId(),hoja); //inserta hoja en los tab
                listaHojas.addLast(hoja); //agrega una nueva hoja
                return true;
            }
        }
        else{
            Sheet hoja = new Sheet(name,this);
            ListadoHojas.addTab(hoja.getId(),hoja); //inserta hoja en los tab
            listaHojas.addLast(hoja); //agrega una nueva hoja
            return true;            
        }
        return false;
    }

    /**Elimina una hoja en la lista de hojas
     @return True si se logro eliminar el elemento*/
    public boolean eliminarHoja(String name){
        Sheet tmpLast;
        boolean encontrado = false;
        int i = 0;

        if(!(listaHojas.isEmpty())){
            tmpLast = (Sheet) listaHojas.getLast();
            tmpHoja =(Sheet) listaHojas.get(i);

            while(tmpLast.equals(tmpHoja) && !encontrado){
                tmpHoja =(Sheet) listaHojas.get(i);
                if (tmpHoja.getId().equals(name)){ 
                    encontrado = true;
                    listaHojas.remove(i);
                }
                i++;
            }
        }
        return encontrado;
    }
    /**Elimina la pestana seleccionada actualmente*/
    public void eliminarTabActual(){
        Sheet tablaActual = (Sheet) ListadoHojas.getSelectedComponent();
        if (tablaActual != null){
            eliminarHoja(tablaActual.getId());
            ListadoHojas.removeTabAt(ListadoHojas.getSelectedIndex());
        }
        
    }
    /**Cambia nombre a la hoja actual*/
    public void renameTabActual(String newName){
        String oldName = new String();
        Sheet tablaActual = (Sheet) ListadoHojas.getSelectedComponent();
        if (tablaActual != null){
            tablaActual.setId(new String(newName));
            ListadoHojas.setTitleAt(ListadoHojas.getSelectedIndex(),new String(newName));
        }
        
    }
    /** retorna una referencia a una hoja electronica con nombre idHoja*/
    public Sheet getSheet(String idHoja){
        int index = 0;
        Sheet tmpSheet = (Sheet) listaHojas.get(index);
        while(tmpSheet != null){
            //tmpSheet = listaHojas.get(index);
            if (tmpSheet != null && tmpSheet.getId().equalsIgnoreCase(idHoja))
                return tmpSheet;
            index++;
            tmpSheet = (Sheet) listaHojas.get(index);
        }
        return null;
    }
    /**Obtiene referencia a la hoja electronica actual*/
    public Sheet getActualSheet(){
        return (Sheet) this.ListadoHojas.getSelectedComponent();
    }
    /**Devuelve una lista enlazada con referencias a las hojas electronicas*/
    public LinkedList getListaHojas() {
        return this.listaHojas;
    }
            
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPopupMenu1 = new javax.swing.JPopupMenu();
        EliminarHoja = new javax.swing.JMenuItem();
        CambiarNombre = new javax.swing.JMenuItem();
        jDialogRename = new javax.swing.JDialog();
        jButtonCancelDR = new javax.swing.JButton();
        jButtonOKDR = new javax.swing.JButton();
        jTextFieldDR = new javax.swing.JTextField();
        jLabelDR = new javax.swing.JLabel();
        ListadoHojas = new javax.swing.JTabbedPane();

        jPopupMenu1.setInvoker(ListadoHojas);
        jPopupMenu1.setMaximumSize(new java.awt.Dimension(400, 200));
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(200, 50));
        EliminarHoja.setText("Eliminar hoja actual");
        EliminarHoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EliminarHojaMouseReleased(evt);
            }
        });

        jPopupMenu1.add(EliminarHoja);

        CambiarNombre.setText("Renombrar Hoja Actual...");
        CambiarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CambiarNombreMouseReleased(evt);
            }
        });

        jPopupMenu1.add(CambiarNombre);

        jDialogRename.getContentPane().setLayout(null);

        jDialogRename.setTitle("Asignar nuevo nombre...");
        jDialogRename.setAlwaysOnTop(true);
        jDialogRename.setResizable(false);
        jDialogRename.getAccessibleContext().setAccessibleParent(null);
        jButtonCancelDR.setText("Cancelar");
        jButtonCancelDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelDRActionPerformed(evt);
            }
        });
        jButtonCancelDR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCancelDRMouseReleased(evt);
            }
        });

        jDialogRename.getContentPane().add(jButtonCancelDR);
        jButtonCancelDR.setBounds(180, 70, 110, 30);

        jButtonOKDR.setText("Aceptar");
        jButtonOKDR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonOKDRMouseReleased(evt);
            }
        });

        jDialogRename.getContentPane().add(jButtonOKDR);
        jButtonOKDR.setBounds(30, 70, 120, 30);

        jDialogRename.getContentPane().add(jTextFieldDR);
        jTextFieldDR.setBounds(170, 30, 130, 20);

        jLabelDR.setText("Ingrese nuevo nombre: ");
        jDialogRename.getContentPane().add(jLabelDR);
        jLabelDR.setBounds(10, 20, 150, 40);

        ListadoHojas.setComponentPopupMenu(jPopupMenu1);
        ListadoHojas.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ListadoHojas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, ListadoHojas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelDRActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelDRActionPerformed

    private void jButtonCancelDRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelDRMouseReleased
        jDialogRename.setVisible(false);
    }//GEN-LAST:event_jButtonCancelDRMouseReleased

    private void jButtonOKDRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOKDRMouseReleased
        if (jTextFieldDR.getText().length() > 0){
            this.renameTabActual(jTextFieldDR.getText());
            jDialogRename.setVisible(false);
        }
            
    }//GEN-LAST:event_jButtonOKDRMouseReleased

    private void CambiarNombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiarNombreMouseReleased
        jDialogRename.setBounds(100,100,350,200);
        
        jDialogRename.setVisible(true);
    }//GEN-LAST:event_CambiarNombreMouseReleased

    private void EliminarHojaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarHojaMouseReleased
        eliminarTabActual();
    }//GEN-LAST:event_EliminarHojaMouseReleased
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CambiarNombre;
    private javax.swing.JMenuItem EliminarHoja;
    private javax.swing.JTabbedPane ListadoHojas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelDR;
    private javax.swing.JButton jButtonOKDR;
    private javax.swing.JDialog jDialogRename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDR;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldDR;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    
}
