package control;

import dominio.Agenda;

import java.io.*;

public class Permanencia{
    public static void gestionExistenciaArchivo (File archivo) {
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException | SecurityException e) {
                e.printStackTrace();
            }
        }
    }

    public static Agenda leerArchivo(File archivo) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Agenda agenda = (Agenda)ois.readObject();
            if (agenda == null)
                agenda = new Agenda();
            fis.close();
            ois.close();
            return (agenda);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Agenda();
        }
    }

    public static void escribirArchivo (Agenda agenda, File archivo) {
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(agenda);
            fos.close();
            oos.close();
            System.out.println("Agenda guardada en el archivo " + archivo.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}