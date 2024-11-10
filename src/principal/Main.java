package principal;

import control.Permanencia;
import dominio.Agenda;
import presentacion.Interfaz;

import java.io.File;

public class Main {
    public static void main (String[] argv) {
        File datos = new File("datos.ser");
        Permanencia.gestionExistenciaArchivo(datos);
        Agenda agenda = Permanencia.leerArchivo(datos);
        Interfaz.interfaz(agenda);
        Permanencia.escribirArchivo(agenda, datos);
    }
}
