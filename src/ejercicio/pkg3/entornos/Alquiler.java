/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.entornos;

import Vehiculo.Transporte.*;
import Vehiculo.Carga.*;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Ariza
 * @version 1
 */
public class Alquiler implements Datos {
    private ArrayList<Vehiculo> pedido;
    /**
     * Constructor por parámetros de la clase
     * @param nVehiculos Número de vehículos en el pedido
     */
    public Alquiler(int nVehiculos) {
        pedido = new ArrayList<>();
        
        for(int i = 0; i < nVehiculos; i++) {
            char tipo;
            String matricula="";
            int dias = 0, plazas = 0, tara = 0;
            ES.println("Introduce el tipo de vehiculo(C=coche, B=bus, F=furgoneta, T=camion): ");
            tipo = ES.getChar();
            ES.println("Introduce la matrícula del vehículo: ");
            tipo = ES.getChar();
            ES.println("Introduce la duración del alquiler: ");
            tipo = ES.getChar();
            
            switch(tipo) {
                case 'C':
                    ES.println("Introduce las plazas ocupadas: ");
                    plazas = ES.getInt();
                    Coche coche = new Coche(matricula, dias, plazas);
                    pedido.add(coche);
                    break;
                case 'B':
                    ES.println("Introduce las plazas ocupadas: ");
                    plazas = ES.getInt();
                    Bus bus = new Bus(matricula, dias, plazas);
                    pedido.add(bus);
                    break;
                case 'F':
                    ES.println("Introduce las toneladasque llevará el vehículo: ");
                    tara = ES.getInt();
                    Furgoneta furgoneta = new Furgoneta(matricula, dias, tara);
                    pedido.add(furgoneta);
                    break;
                case 'T':
                    ES.println("Introduce las toneladasque llevará el vehículo: ");
                    tara = ES.getInt();
                    Camion camion = new Camion(matricula, dias, tara);
                    pedido.add(camion);
                    break;
            }
        }
    }
    /**
     * Método que calcula el importe de todos los vehículos
     * @return Devuelve el importe en un double
     */
    public double importeTotal() {
        double importe = 0;
        
        for(int i = 0; i < pedido.size(); i++) {
            importe += pedido.get(i).importeAlquiler();
        }
        return importe;
    }
    /**
     * Método que calcula el importe de un vehículo del pedido
     * @param pos Posición del vehículo en el array
     * @return Devuelve el importe del vehículo en un double
     */
    public double importe(int pos) {
        return pedido.get(pos).importeAlquiler();
    }
    /**
     * Método que imprime por pantalla la información del pedido
     */
    @Override
    public void mostrarDatos() {
        System.out.println("Total alquiler: " + this.importeTotal() + "€\n" +
                           "----------------------------------\n" +
                           "DETALLE\n" +
                           "---------------------------------\n");
        for(int i = 0; i < pedido.size(); i++) {
            pedido.get(i).recibo();
        }
    }
}
