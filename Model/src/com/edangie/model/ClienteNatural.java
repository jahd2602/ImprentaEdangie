/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edangie.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Sistemas
 */
@Entity
@Table(name = "CLIENTE_NATURAL", catalog = "", schema = "ISG")
@NamedQueries({
    @NamedQuery(name = "ClienteNatural.findAll", query = "SELECT c FROM ClienteNatural c"),
    @NamedQuery(name = "ClienteNatural.findByDni", query = "SELECT c FROM ClienteNatural c WHERE c.dni = :dni"),
    @NamedQuery(name = "ClienteNatural.findByApellidoPaterno", query = "SELECT c FROM ClienteNatural c WHERE c.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "ClienteNatural.findByApellidoMaterno", query = "SELECT c FROM ClienteNatural c WHERE c.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "ClienteNatural.findByNombres", query = "SELECT c FROM ClienteNatural c WHERE c.nombres = :nombres"),
    @NamedQuery(name = "ClienteNatural.findByFechaNacimiento", query = "SELECT c FROM ClienteNatural c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "ClienteNatural.findByIdCliente", query = "SELECT c FROM ClienteNatural c WHERE c.idCliente = :idCliente")})
public class ClienteNatural implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DNI")
    private Integer dni;
    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Cliente cliente;

    public ClienteNatural() {
    }

    public ClienteNatural(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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
        if (!(object instanceof ClienteNatural)) {
            return false;
        }
        ClienteNatural other = (ClienteNatural) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edangie.model.ClienteNatural[ idCliente=" + idCliente + " ]";
    }
    
}
