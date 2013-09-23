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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jahd
 */
@Entity
@Table(name = "INSUMO")
@NamedQueries({
    @NamedQuery(name = "Insumo.findAllMax", query = "SELECT MAX(i.id) FROM Insumo i"),
    @NamedQuery(name = "Insumo.findAll", query = "SELECT i FROM Insumo i"),
    @NamedQuery(name = "Insumo.findByNombre", query = "SELECT i FROM Insumo i WHERE i.nombre = :nombre"),
    @NamedQuery(name = "Insumo.findByCosto", query = "SELECT i FROM Insumo i WHERE i.costo = :costo"),
    @NamedQuery(name = "Insumo.findByMedida", query = "SELECT i FROM Insumo i WHERE i.medida = :medida"),
    @NamedQuery(name = "Insumo.findById", query = "SELECT i FROM Insumo i WHERE i.id = :id")})
public class Insumo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "COSTO")
    private double costo;
    @Basic(optional = false)
    @Column(name = "MEDIDA")
    private String medida;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Proveedor proveedorId;

    public Insumo() {
    }

    public Insumo(Integer id) {
        this.id = id;
    }

    public Insumo(Integer id, String nombre, double costo, String medida) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.medida = medida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Proveedor getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Proveedor proveedorId) {
        this.proveedorId = proveedorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumo)) {
            return false;
        }
        Insumo other = (Insumo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edangie.model.Insumo[ id=" + id + " ]";
    }
}
