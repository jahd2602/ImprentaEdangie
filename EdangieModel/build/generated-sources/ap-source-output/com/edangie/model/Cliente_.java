package com.edangie.model;

import com.edangie.model.ClienteJuridico;
import com.edangie.model.ClienteNatural;
import com.edangie.model.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-22T17:43:29")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile ListAttribute<Cliente, Pedido> pedidoList;
    public static volatile SingularAttribute<Cliente, Character> tipo;
    public static volatile SingularAttribute<Cliente, ClienteJuridico> clienteJuridico;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, ClienteNatural> clienteNatural;

}