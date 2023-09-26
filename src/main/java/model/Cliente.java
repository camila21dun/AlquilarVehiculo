package model;
import lombok.*;

import java.util.ArrayList;

@Getter
public class Cliente {

    private String nombre,cedula,telefono,email,ciudad,residencia;
    public static ArrayList<Cliente> clientesRegistrados=new ArrayList<Cliente>();
    //Constructores


    public Cliente() {

    }

    public Cliente(String nombre, String cedula, String telefono, String email, String ciudad, String residencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.ciudad = ciudad;
        this.residencia = residencia;
    }

    //Metodos propios

    public void registrarCliente(String nombre, String cedula, String telefono, String email, String ciudad, String residencia) {
        boolean esta=BuscarCedula(cedula);
        if(esta==false)
        {
            Cliente e=new Cliente(nombre,cedula,telefono,email,ciudad,residencia);
            clientesRegistrados.add(e);
        }
        else
        {
            //Alerta de fx que diga "este cliente ya se encuentra registrado"
        }
    }

    public boolean BuscarCedula(String cedula) {
        boolean x=false;
        for(int i=0;i<clientesRegistrados.size();i++)
        {
            if(clientesRegistrados.get(i).equals(cedula))
            {
                x=true;
            }
        }
        return x;
    }
}
