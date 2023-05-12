
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import vehiculos.Carro;
import vehiculos.Moto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Consecionario {

    static String seguir = "Si";
    static HashMap<String, Carro> listaCarros = new HashMap<>();
    static HashMap<String, Moto> listaMotos = new HashMap<>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido");
        int opcion;
        do {
            System.out.println("Que vehiculo desea adquirir");
            System.out.println("1. carro");
            System.out.println("2. Moto ");
            System.out.println("3. salir ");

            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    menuCarro();
                    break;

                case 2:
                  menuMoto();
                    break;
                case 3:

                case 4:
                    Iterator<String> motos = listaMotos.keySet().iterator();
                    while (motos.hasNext()) {
                        String serialMotos = motos.next();
                        System.out.println("Carro serial " + serialMotos);
                        System.out.println("Color " + listaMotos.get(serialMotos).color);
                        System.out.println("Marca " + listaMotos.get(serialMotos).marca);
                        System.out.println("Serial " + listaMotos.get(serialMotos).serial);
                        System.out.println("Modelo " + listaMotos.get(serialMotos).modelo);
                    }
                    break;
                default:
                    System.out.println("Error: Opcion incorrecta");
                    break;
            }
        } while (opcion != 3);
    }

    public static void menuCarro() {
        int opcion;
        String serial;
        do {

            System.out.println("Menu Carro");
            System.out.println("1.Crear Carro");
            System.out.println("2.Buscar Carro");
            System.out.println("3.Modificar Carro");
            System.out.println("4.Eliminar  Carro");
            System.out.println("5.Imprimir lista de Carro");
            System.out.println("6.Salir");
            opcion = Integer.parseInt(entrada.nextLine());

            Carro nuevoCarro = new Carro();

            switch (opcion) {
                case 1:
//                String accion = "Si";
                    do {
                        Carro nuevoCarroA = new Carro();
                        nuevoCarroA.crear();
                        listaCarros.put(String.valueOf(nuevoCarroA.serial), nuevoCarroA);
                        System.out.println("Carro agregado a la BD");

                        System.out.println("Desea agregar otro carro? Si o No");
//                    String accion = entrada.nextLine();
                    } while ("Si".equals(entrada.nextLine()));
                    break;
                case 2:
                    serial = String.valueOf(nuevoCarro.buscar());
                    System.out.println("NC:  " + serial);
                    if (listaCarros.containsKey(serial)) {
                        System.out.println("Carro con serial: " + serial);
                        System.out.println("Color:  " + listaCarros.get(serial).color);
                        System.out.println("Marca:  " + listaCarros.get(serial).marca);
                        System.out.println("Modelo:  " + listaCarros.get(serial).modelo);
                        System.out.println("Serial:  " + listaCarros.get(serial).serial);
                    } else {
                        System.out.println("Carro no existe en la BD");
                    }
                    break;
                case 3:
                    serial = String.valueOf(nuevoCarro.buscar());
//                        System.out.println("NCM" + serial);

                    if (listaCarros.containsKey(serial));
                     {
                        nuevoCarro.modificar();
                        listaCarros.put(String.valueOf(nuevoCarro.serial), nuevoCarro);
                        System.out.println("Carro modificado en la BD");
                    }
                    break;
                case 4:
                    serial = String.valueOf(nuevoCarro.buscar());
//                    nuevoCarro.eliminar();
                    if (listaCarros.containsKey(serial)) {
                        listaCarros.remove(serial);
                        System.out.println("Carro eliminado de la BD");
                    }
                    break;
                case 5:
                    if (!listaCarros.isEmpty()) {
                        Iterator<String> carros = listaCarros.keySet().iterator();
                        while (carros.hasNext()) {
                            String serialCarro = carros.next();
                            System.out.println("Carro serial:  " + serialCarro);
                            System.out.println("Color:  " + listaCarros.get(serialCarro).color);
                            System.out.println("Marca:  " + listaCarros.get(serialCarro).marca);
                            System.out.println("Modelo:  " + listaCarros.get(serialCarro).modelo);
                            System.out.println("Serial:  " + listaCarros.get(serialCarro).serial);/*el serial es un key() y guardo informacion de los carros de acuerdo a sus atributos*/
                        }
                    } else {
                        System.out.println("No hoy carros en la BD");
                    }
                    break;
                case 6:
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("");
        } while (opcion != 6);
    }

    public static void menuMoto() {

        int opcion;
        String serial;
        do {

            System.out.println("Menu Moto");
            System.out.println("1.Crear Moto");
            System.out.println("2.Buscar Moto");
            System.out.println("3.Modificar Moto");
            System.out.println("4.Eliminar  Moto");
            System.out.println("5.Imprimir lista de Moto");
            System.out.println("6.Salir");
            opcion = Integer.parseInt(entrada.nextLine());

            Moto nuevoMoto = new Moto();

            switch (opcion) {
                case 1:
//                String accion = "Si";
                    do {
                        Moto nuevoMotoA = new Moto();
                        nuevoMotoA.crear();
                        listaMotos.put(String.valueOf(nuevoMotoA.serial), nuevoMotoA);
                        System.out.println("Carro agregado a la BD");

                        System.out.println("Desea agregar otra Moto? Si o No");
//                    String accion = entrada.nextLine();
                    } while ("Si".equals(entrada.nextLine()));
                    break;
                case 2:
                    serial = String.valueOf(nuevoMoto.buscar());
                    System.out.println("NC:  " + serial);
                    if (listaMotos.containsKey(serial)) {
                        System.out.println("Moto con serial: " + serial);
                        System.out.println("Color:  " + listaMotos.get(serial).color);
                        System.out.println("Marca:  " + listaMotos.get(serial).marca);
                        System.out.println("Modelo:  " + listaMotos.get(serial).modelo);
                        System.out.println("Serial:  " + listaMotos.get(serial).serial);
                    } else {
                        System.out.println("Carro no existe en la BD");
                    }
                    break;
                case 3:
                    serial = String.valueOf(nuevoMoto.buscar());
//                        System.out.println("NCM" + serial);

                    if (listaMotos.containsKey(serial));
                     {
                        nuevoMoto.modificar();
                        listaMotos.put(String.valueOf(nuevoMoto.serial), nuevoMoto);
                        System.out.println("Carro modificado en la BD");
                    }
                    break;
                case 4:
                    serial = String.valueOf(nuevoMoto.buscar());
//                    nuevoCarro.eliminar();
                    if (listaMotos.containsKey(serial)) {
                        listaMotos.remove(serial);
                        System.out.println("Carro eliminado de la BD");
                    }
                    break;
                case 5:
                    if (!listaMotos.isEmpty()) {
                    
                        Iterator<String> motos = listaMotos.keySet().iterator();
                    
                        while (motos.hasNext()) {
                            String serialMoto = motos.next();
                            System.out.println("Carro serial:  " + serialMoto);
                            System.out.println("Color:  " + listaMotos.get(serialMoto).color);
                            System.out.println("Marca:  " + listaMotos.get(serialMoto).marca);
                            System.out.println("Modelo:  " + listaMotos.get(serialMoto).modelo);
                            System.out.println("Serial:  " + listaMotos.get(serialMoto).serial);/*el serial es un key() y guardo informacion de los carros de acuerdo a sus atributos*/
                        }
                    } else {
                        System.out.println("No hoy carros en la BD");
                    }
                    break;
                case 6:
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("");
        } while (opcion != 6);
    }
}
