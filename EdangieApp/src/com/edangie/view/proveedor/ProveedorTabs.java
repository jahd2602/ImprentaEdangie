/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edangie.view.proveedor;

/**
 *
 * @author daustinsac
 */
public class ProveedorTabs extends javax.swing.JPanel {

    /**
     * Creates new form ProveedorTabs
     */
    public ProveedorTabs() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        proveedorListar1 = new com.edangie.view.proveedor.ProveedorListar();
        proveedorRegistrar1 = new com.edangie.view.proveedor.ProveedorRegistrar();

        jTabbedPane1.addTab("Listar Proveedores", proveedorListar1);
        jTabbedPane1.addTab("Registrar Proveedor", proveedorRegistrar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.edangie.view.proveedor.ProveedorListar proveedorListar1;
    private com.edangie.view.proveedor.ProveedorRegistrar proveedorRegistrar1;
    // End of variables declaration//GEN-END:variables
}
