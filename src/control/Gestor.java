package control;

import dominio.Agenda;
import dominio.Contacto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestor {
    public static void establecerNombre (Agenda agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de la agenda: ");
        agenda.setNombre(sc.nextLine());
        System.out.println("Nombre guardado");

    }
    public static void annadirContacto (Agenda agenda) {
        Contacto contacto = new Contacto();
        Scanner sc = new Scanner(System.in);
        ArrayList<Contacto> contactos =new ArrayList<>();
        System.out.print("Introduce el nombre del contacto: ");
        contacto.setNombre(sc.nextLine());
        System.out.print("Introduce los apellidos del contacto: ");
        contacto.setApellidos(sc.nextLine());
        System.out.print("Introduce el teléfono del contacto: ");
        contacto.setTelefono(sc.nextLine());
        System.out.print("Introduce el email del contacto: ");
        contacto.setEmail(sc.nextLine());
        contactos.add(contacto);
        agenda.setContactos(contactos);
        System.out.println("Contacto añadido con éxito.");

    }

    public static void modificarContacto (Agenda agenda) {
        ArrayList<Contacto> contactos = agenda.getContactos();
        Contacto contacto = new Contacto();
        Scanner sc = new Scanner(System.in);
        Contacto contactoModificar;

        System.out.print("Introduce el nombre del contacto que quieres modificar: ");
        contacto.setNombre(sc.nextLine());
        System.out.print("Introduce los apellidos del contacto que quieres modificar: ");
        contacto.setApellidos(sc.nextLine());
        contactoModificar = buscarContacto(contactos, contacto);
        if (contactoModificar == null)
            return;
        System.out.print("Introduce el nuevo nombre: ");
        contactoModificar.setNombre(sc.nextLine());
        System.out.print("Introduce los nuevos apellidos: ");
        contactoModificar.setApellidos(sc.nextLine());
        System.out.print("Introduce el nuevo teléfono: ");
        contactoModificar.setTelefono(sc.nextLine());
        System.out.print("Introduce el nuevo email: ");
        contactoModificar.setEmail(sc.nextLine());
        System.out.println("Contacto modificado con éxito");
    }

    public static void borrarContacto (Agenda agenda) {
        ArrayList<Contacto> contactos = agenda.getContactos();
        Scanner sc = new Scanner(System.in);
        Contacto contacto = new Contacto();
        Contacto contactoBorrar;
        System.out.print("Introduce el nombre del contacto que quieres borrar: ");
        contacto.setNombre(sc.nextLine());
        System.out.print("Introduce los apellidos del contacto que quieres borrar: ");
        contacto.setApellidos(sc.nextLine());
        contactoBorrar = buscarContacto(contactos, contacto);
        if (contactoBorrar == null) {
            return;
        }
        contactos.remove(contactoBorrar);
        System.out.println("Contacto borrado con éxito");
    }

    public static void mostrarContactos (Agenda agenda) {
        ArrayList<Contacto> contactos = agenda.getContactos();
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }

    public static Contacto buscarContacto (ArrayList<Contacto> contactos, Contacto contacto) {
        for (Contacto contactoBusqueda: contactos) {
            if (contactoBusqueda.getNombre().equals(contacto.getNombre()) && contactoBusqueda.getApellidos().equals(contacto.getApellidos())) {
                return (contactoBusqueda);
            }
        }
        System.out.println("Contacto no encontrado");
        return (null);
    }
 }
