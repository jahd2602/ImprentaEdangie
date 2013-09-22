package com.edangie.model;

import com.edangie.model.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-22T12:11:37")
@StaticMetamodel(Insumo.class)
public class Insumo_ { 

    public static volatile SingularAttribute<Insumo, String> nombre;
    public static volatile SingularAttribute<Insumo, Integer> id;
    public static volatile SingularAttribute<Insumo, Proveedor> proveedorId;
    public static volatile SingularAttribute<Insumo, String> medida;
    public static volatile SingularAttribute<Insumo, Double> costo;

}