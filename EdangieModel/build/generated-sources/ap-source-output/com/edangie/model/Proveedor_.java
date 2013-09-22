package com.edangie.model;

import com.edangie.model.Insumo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-22T17:43:29")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombre;
    public static volatile SingularAttribute<Proveedor, Integer> id;
    public static volatile SingularAttribute<Proveedor, String> contacto;
    public static volatile ListAttribute<Proveedor, Insumo> insumoList;
    public static volatile SingularAttribute<Proveedor, String> razonSocial;
    public static volatile SingularAttribute<Proveedor, Integer> ruc;
    public static volatile SingularAttribute<Proveedor, String> telefono;

}