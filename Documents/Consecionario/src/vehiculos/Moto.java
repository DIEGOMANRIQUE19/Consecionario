/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class Moto {


   public String marca;
   public String color;
   public int serial;
   public int modelo;
   
   public Scanner entrada = new Scanner(System.in);
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
   
    
 
    public void saludar() {
        System.out.println("Su vehiculo es el siguiente");
        System.out.println("Marca  " + marca);
        System.out.println("Color  " + color);
        System.out.println("Serial  " + serial);
        System.out.println("Modelo  " + modelo);

    }

    public void crear() {
        System.out.println("Cual color desea la moto");
        this.color = entrada.nextLine();
        System.out.println("Ingrese la marca de la moto");
        this.marca = entrada.nextLine();
        System.out.println("Ingrese el modelo de la moto");
        this.modelo = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el serial de la moto");
        this.serial = Integer.parseInt(entrada.nextLine());

    }

    public int buscar() {
        System.out.println("Digite el numero de serial de la Moto");
        this.serial = Integer.parseInt(entrada.nextLine());
        return this.serial;
    }

    public void modificar() {
        System.out.println("Digite el Nuevo Color del Carro");
        this.color = entrada.nextLine();
        System.out.println("Digite la Nuevo Marca del Carro");
        this.marca = entrada.nextLine();
        System.out.println("Digite el Nuevo Modelo del Carro");
        this.modelo = Integer.parseInt(entrada.nextLine());

    }

    public void eliminar() {

    }
}
