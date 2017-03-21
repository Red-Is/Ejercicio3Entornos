/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo.Carga;

import Alquiler.Vehiculo;

/**
 *
 * @author Alejandro Ariza
 * @version 1.01
 */
public abstract class VehiculoCarga extends Vehiculo {
    private int tara;
    /**
     * Contructor por defecto de la clase
     */
    public VehiculoCarga() {
        super();
        tara = 0;
    }
    /**
     * Constructor por parámetros de la clase
     * @param matricula Matrícula del vehículo
     * @param dias Dias de alquiler del vehículo
     * @param tara Tara del vehículo
     */
    public VehiculoCarga(String matricula, int dias, int tara) {
        super(matricula, dias);
        this.tara = tara;
    }
    /**
     * Método que devuelve la tara del vehículo
     * @return Devuelve la tara del vehículo en un entero
     */
    public int getTara() {
        return tara;
    }
    /**
     * Método que introduce la tara del vehículo
     * @param tara Tara del vehículo
     */
    public void setTara(int tara) {
        this.tara = tara;
    }
    /**
     * Método que calcula el importe del alquiler
     * @return Devuelve el valor del alquiler en un double
     */
    @Override
    public abstract double importeAlquiler();
    /**
     * Método que imprime la información del vehiculo
     */
    @Override
    public void recibo() {
        System.out.println("Matrícula: " + this.getMatricula()
                         + "\nDuración: " + this.getDias_alquiler()
                         + "\nTara: " + this.getTara()
                         + "\nImporte: " + this.importeAlquiler());
    }
}
