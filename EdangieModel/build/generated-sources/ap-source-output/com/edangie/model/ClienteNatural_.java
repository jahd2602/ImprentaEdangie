package com.edangie.model;

import com.edangie.model.Cliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-22T17:43:29")
@StaticMetamodel(ClienteNatural.class)
public class ClienteNatural_ { 

    public static volatile SingularAttribute<ClienteNatural, String> nombres;
    public static volatile SingularAttribute<ClienteNatural, Cliente> cliente;
    public static volatile SingularAttribute<ClienteNatural, Integer> idCliente;
    public static volatile SingularAttribute<ClienteNatural, String> apellidoPaterno;
    public static volatile SingularAttribute<ClienteNatural, String> apellidoMaterno;
    public static volatile SingularAttribute<ClienteNatural, Integer> dni;
    public static volatile SingularAttribute<ClienteNatural, Date> fechaNacimiento;

}