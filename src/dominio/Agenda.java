package dominio;

import java.util.ArrayList;

public class Agenda {
    private String nombre;
    private ArrayList<Contacto> contactos;

    public Agenda setNombre (String nombre) {
        this.nombre = nombre;
        return (this);
    }

    public Agenda setContactos (ArrayList<Contacto> contactos) {
        this.contactos = contactos;
        return (this);
    }

    public String getNombre () {
        return (this.nombre);
    }

    public ArrayList<Contacto> getContactos () {
        return (this.contactos);
    }
}
