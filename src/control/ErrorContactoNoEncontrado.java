package control;

import dominio.Contacto;

public class ErrorContactoNoEncontrado extends Exception{
    private Contacto c;

    public ErrorContactoNoEncontrado(){}
    public ErrorContactoNoEncontrado(Contacto c){
        this.c = c;
    }
    public Contacto getContacto() {
        return c;
    }
}
