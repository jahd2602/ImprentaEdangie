/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edangie.view.pedido;

/**
 *
 * @author daustinsac
 */
public class PedidoTabs extends javax.swing.JPanel {

    /**
     * Creates new form PedidoTabs
     */
    public PedidoTabs() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        pedidoListar2 = new com.edangie.view.pedido.PedidoListar();
        pedidoRegistrar2 = new com.edangie.view.pedido.PedidoRegistrar();

        jTabbedPane2.addTab("Listar Pedidos", pedidoListar2);
        jTabbedPane2.addTab("Nuevo Pedido", pedidoRegistrar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane2;
    private com.edangie.view.pedido.PedidoListar pedidoListar2;
    private com.edangie.view.pedido.PedidoRegistrar pedidoRegistrar2;
    // End of variables declaration//GEN-END:variables
}
