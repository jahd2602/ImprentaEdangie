/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edangie.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author daustinsac
 */
@Entity
@Table(name = "INSUMO_PEDIDO")
@NamedQueries({
    @NamedQuery(name = "InsumoPedido.findAll", query = "SELECT i FROM InsumoPedido i"),
    @NamedQuery(name = "InsumoPedido.findByCantidad", query = "SELECT i FROM InsumoPedido i WHERE i.cantidad = :cantidad"),
    @NamedQuery(name = "InsumoPedido.findByMedida", query = "SELECT i FROM InsumoPedido i WHERE i.medida = :medida"),
    @NamedQuery(name = "InsumoPedido.findByIdPedido", query = "SELECT i FROM InsumoPedido i WHERE i.insumoPedidoPK.idPedido = :idPedido"),
    @NamedQuery(name = "InsumoPedido.findByIdInsumo", query = "SELECT i FROM InsumoPedido i WHERE i.insumoPedidoPK.idInsumo = :idInsumo")})
public class InsumoPedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsumoPedidoPK insumoPedidoPK;
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private int cantidad;
    @Column(name = "MEDIDA")
    private String medida;

    public InsumoPedido() {
    }

    public InsumoPedido(InsumoPedidoPK insumoPedidoPK) {
        this.insumoPedidoPK = insumoPedidoPK;
    }

    public InsumoPedido(InsumoPedidoPK insumoPedidoPK, int cantidad) {
        this.insumoPedidoPK = insumoPedidoPK;
        this.cantidad = cantidad;
    }

    public InsumoPedido(int idPedido, int idInsumo) {
        this.insumoPedidoPK = new InsumoPedidoPK(idPedido, idInsumo);
    }

    public InsumoPedidoPK getInsumoPedidoPK() {
        return insumoPedidoPK;
    }

    public void setInsumoPedidoPK(InsumoPedidoPK insumoPedidoPK) {
        this.insumoPedidoPK = insumoPedidoPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insumoPedidoPK != null ? insumoPedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsumoPedido)) {
            return false;
        }
        InsumoPedido other = (InsumoPedido) object;
        if ((this.insumoPedidoPK == null && other.insumoPedidoPK != null) || (this.insumoPedidoPK != null && !this.insumoPedidoPK.equals(other.insumoPedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edangie.model.InsumoPedido[ insumoPedidoPK=" + insumoPedidoPK + " ]";
    }
    
}
