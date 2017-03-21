/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo.Transporte;

import Alquiler.Vehiculo;

/**
 *
 * @author Alejandro Ariza
 * @version 1.01
 */
public abstract class VehiculoTransporte extends Vehiculo {
    private int plazas;
    
    /**
     * Contructor por defecto de la clase
     */
    public VehiculoTransporte() {
        super();
        plazas = 0;
    }
    /**
     * Constructor por parámetros de la clase
     * @param matricula Matrícula del vehículo
     * @param dias Dias de alquiler del vehículo
     * @param plazas Plazas del vehículo
     */
    public VehiculoTransporte(String matricula, int dias, int plazas) {
        super(matricula, dias);
        this.plazas = plazas;
    }
    /**
     * Método que devuelve las plazas del vehículo
     * @return Devuelve en forma de entero las plazas del vehículo
     */
    public int getPlazas() {
        return plazas;
    }
    /**
     * Método que introduce las plazas del vehículo
     * @param plazas Plazas del vehículo
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
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
                         + "\nPlazas: " + this.getPlazas()
                         + "\nImporte: " + this.importeAlquiler());
    }
}
