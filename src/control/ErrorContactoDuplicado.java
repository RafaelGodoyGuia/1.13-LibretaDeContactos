package control;

import dominio.Contacto;

public class ErrorContactoDuplicado extends Exception {
    private Contacto c;

    public ErrorContactoDuplicado(Contacto contacto){

        c = contacto;
    }
    public Contacto getContacto(){

        return c;
    }
}
