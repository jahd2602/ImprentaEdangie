/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edangie.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jahd
 */
@Entity
@Table(name = "CLIENTE_JURIDICO")
@NamedQueries({
    @NamedQuery(name = "ClienteJuridico.findAll", query = "SELECT c FROM ClienteJuridico c"),
    @NamedQuery(name = "ClienteJuridico.findByRazonSocial", query = "SELECT c FROM ClienteJuridico c WHERE c.razonSocial = :razonSocial"),
    @NamedQuery(name = "ClienteJuridico.findByIdCliente", query = "SELECT c FROM ClienteJuridico c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "ClienteJuridico.findByRuc", query = "SELECT c FROM ClienteJuridico c WHERE c.ruc = :ruc")})
public class ClienteJuridico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "RUC")
    private String ruc;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Cliente cliente;

    public ClienteJuridico() {
    }

    public ClienteJuridico(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteJuridico)) {
            return false;
        }
        ClienteJuridico other = (ClienteJuridico) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edangie.model.ClienteJuridico[ idCliente=" + idCliente + " ]";
    }
}
