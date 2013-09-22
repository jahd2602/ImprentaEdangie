package com.edangie.model;

import com.edangie.model.Cliente;
import com.edangie.model.Pago;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-22T12:11:37")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Double> precioUnitario;
    public static volatile SingularAttribute<Pedido, Integer> descuento;
    public static volatile ListAttribute<Pedido, Pago> pagoList;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;
    public static volatile SingularAttribute<Pedido, Cliente> idCliente;
    public static volatile SingularAttribute<Pedido, String> descripcion;
    public static volatile SingularAttribute<Pedido, Date> fechaEntregaEstimada;
    public static volatile SingularAttribute<Pedido, Date> fechaPedido;
    public static volatile SingularAttribute<Pedido, Date> fechaEntregaConfirmada;

}