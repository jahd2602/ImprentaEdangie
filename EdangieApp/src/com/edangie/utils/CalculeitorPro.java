package com.edangie.utils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jahd
 */
public class CalculeitorPro implements java.io.Serializable {

    private int cantidad;
    private double precioUnitario;
    private double totalInsumo;
    private double porcentajeGanancias;
    private double subTotal;

    public CalculeitorPro() {
    }

    public CalculeitorPro(int cantidad, double precioUnitario, double totalInsumo, double porcentajeGanancias) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.totalInsumo = totalInsumo;
        this.porcentajeGanancias = porcentajeGanancias;
    }

    public void actualizarSubtotalDer() {
        setSubTotal(getCantidad() * getPrecioUnitario());
        setPorcentajeGanancias(getSubTotal() / getTotalInsumo());
    }

    public void actualizarSubtotalIzq() {
        setSubTotal(getPorcentajeGanancias() * getTotalInsumo());
        setPrecioUnitario(getSubTotal() / getCantidad());
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
//        actualizarSubtotalDer();
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
//        actualizarSubtotalDer();
    }

    /**
     * @return the totalInsumo
     */
    public double getTotalInsumo() {
        return totalInsumo;
    }

    /**
     * @param totalInsumo the totalInsumo to set
     */
    public void setTotalInsumo(double totalInsumo) {
        this.totalInsumo = totalInsumo;
//        actualizarSubtotalIzq();
    }

    /**
     * @return the porcentajeGanancias
     */
    public double getPorcentajeGanancias() {
        return porcentajeGanancias;
    }

    /**
     * @param porcentajeGanancias the porcentajeGanancias to set
     */
    public void setPorcentajeGanancias(double porcentajeGanancias) {
        this.porcentajeGanancias = porcentajeGanancias;
//        actualizarSubtotalIzq();
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
