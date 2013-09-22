package com.edangie.model;

import com.edangie.model.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-22T12:11:37")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Integer> id;
    public static volatile SingularAttribute<Pago, Pedido> idPedido;
    public static volatile SingularAttribute<Pago, Double> monto;

}