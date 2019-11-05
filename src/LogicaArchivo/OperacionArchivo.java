/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaArchivo;

import formulario.Objetos.Datos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asantos
 */
public class OperacionArchivo {

    public static final String NOMBRE_ARCHIVO = "RegistroDB.txt";

    //Nombre completo, nit, placa, marca, modelo, año, fecha y hora ingreso, fecha y hora egreso.
    //Crea el archivo, recibe como parametro una Array de Objetos tipo Datos
    public static void crearArchivo(Datos datos) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter(NOMBRE_ARCHIVO);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            //escribe los datos en el archivo
            bfwriter.write(datos.getNombre_completo() + ","
                    + datos.getNit() + ","
                    + datos.getPlaca() + ","
                    + datos.getMarca() + ","
                    + datos.getModelo() + ","
                    + datos.getAnio() + ","
                    + datos.getFecha_ingreso() + ","
                    + datos.getHora_ingreso() + ","
                    + datos.getFecha_salida() + ","
                    + datos.getHora_salida() + ","
                    + datos.getMonto() + "\n");
            //cierra el buffer
            bfwriter.close();
            JOptionPane.showMessageDialog(null, "Archivo creado con exito..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Leemos el archivo generado
    public static ArrayList<Datos> leerArchivo() {
        File file = new File(NOMBRE_ARCHIVO);
        ArrayList<Datos> listaDatos = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");

                Datos datos = new Datos();
                datos.setNombre_completo(delimitar.next());
                datos.setNit(delimitar.next());
                datos.setPlaca(delimitar.next());
                datos.setMarca(delimitar.next());
                datos.setModelo(delimitar.next());
                datos.setAnio(delimitar.nextInt());
                datos.setFecha_ingreso(delimitar.next());
                datos.setHora_ingreso(delimitar.next());
                datos.setFecha_salida(delimitar.next());
                datos.setHora_salida(delimitar.next());
                datos.setMonto(delimitar.nextDouble());
                listaDatos.add(datos);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listaDatos;
    }

    //añadir mas informacion a nuestro TXT sin reemplazar los existentes.
    public static void aniadirArchivo(Datos datos) {
        FileWriter flwriter = null;
        try {
            //además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            flwriter = new FileWriter(NOMBRE_ARCHIVO, true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            //escribe los datos en el archivo
            bfwriter.write(
                    datos.getNombre_completo() + ","
                    + datos.getNit() + ","
                    + datos.getPlaca() + ","
                    + datos.getMarca() + ","
                    + datos.getModelo() + ","
                    + datos.getAnio() + ","
                    + datos.getFecha_ingreso() + ","
                    + datos.getHora_ingreso() + ","
                    + datos.getFecha_salida() + ","
                    + datos.getHora_salida() + ","
                    + datos.getMonto() + "\n");
            
            bfwriter.close();

            JOptionPane.showMessageDialog(null, "Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
