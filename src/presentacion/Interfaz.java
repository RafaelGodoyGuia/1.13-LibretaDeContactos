package presentacion;

import control.Gestor;
import dominio.Agenda;

import java.util.Scanner;

public class Interfaz {
    public static void interfaz (Agenda agenda) {
        boolean continuar;
        do {
            continuar = menuPrincipal(agenda);
        }while(continuar);
    }

    public static boolean menuPrincipal (Agenda agenda) {
        int selector;
        Scanner sc = new Scanner(System.in);
        System.out.println("Opciones de la agenda molonga");
        System.out.println("-----------------------------");
        System.out.println("1.Establecer o modificar nombre");
        System.out.println("2. Añadir Contacto");
        System.out.println("3. Modificar Contacto");
        System.out.println("4. Borrar Contacto");
        System.out.println("5. Mostrar Contactos");
        System.out.println("6. Guardar y salir");
        selector = sc.nextInt();
        switch (selector) {
            case 1: {
                System.out.println("Establecer o modificar nombre de la agenda molonga");
                System.out.println("-------------------------------------------------");
                Gestor.establecerNombre(agenda);
                return (true);
            }
            case 2: {
                System.out.println("Añadir contacto a la agenda molonga");
                System.out.println("-----------------------------------");
                Gestor.annadirContacto(agenda);
                return (true);
            }
            case 3: {
                System.out.println("Modificar contacto de la agenda molonga");
                System.out.println("---------------------------------------");
                Gestor.modificarContacto(agenda);
                return (true);
            }
            case 4: {
                System.out.println("Borrar contacto de la agenda molonga");
                System.out.println("------------------------------------");
                Gestor.borrarContacto(agenda);
                return (true);
            }
            case 5: {
                System.out.println("Mostrar contactos de la agenda molonga");
                System.out.println("--------------------------------------");
                Gestor.mostrarContactos(agenda);
                return (true);
            }
            case 6: {
                System.out.println("Guardando y saliendo del programa...");
                return (false);
            }
            default: {
                System.out.println("Valor incorrecto, vuelva a introducir (1-6)");
                return (true);
            }
        }
    }
}
