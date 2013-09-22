/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edangie.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Sistemas
 */
@Embeddable
public class InsumoPedidoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_PEDIDO")
    private int idPedido;
    @Basic(optional = false)
    @Column(name = "ID_INSUMO")
    private int idInsumo;

    public InsumoPedidoPK() {
    }

    public InsumoPedidoPK(int idPedido, int idInsumo) {
        this.idPedido = idPedido;
        this.idInsumo = idInsumo;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPedido;
        hash += (int) idInsumo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsumoPedidoPK)) {
            return false;
        }
        InsumoPedidoPK other = (InsumoPedidoPK) object;
        if (this.idPedido != other.idPedido) {
            return false;
        }
        if (this.idInsumo != other.idInsumo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edangie.model.InsumoPedidoPK[ idPedido=" + idPedido + ", idInsumo=" + idInsumo + " ]";
    }
    
}
