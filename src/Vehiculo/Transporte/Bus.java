/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo.Transporte;

/**
 *
 * @author Alejandro Ariza
 * @version 1
 */
public class Bus extends VehiculoTransporte {
    /**
     * Constructor por defecto de la clase
     */
    public Bus() {
        super();
    }
    /**
     * Constructor por parámetros de la clase
     * @param matricula Matrícula del bus
     * @param dias Dias de alquiler del bus
     * @param plazas Plazas del bus
     */
    public Bus(String matricula, int dias, int plazas) {
        super(matricula, dias, plazas);
    }
    /**
     * Método que imprime por pantalla la información del bus
     */
    @Override
    public void recibo() {
        System.out.println("--------------------\n" +
                           "BUS\n" +
                           "--------------------\n" +
                           "información");
        super.recibo();
    }
    /**
     * Método que calcula el importe del alquiler
     * @return Devuelve el importe del alquiler en un double
     */
    @Override
    public double importeAlquiler() {
        return (this.getDias_alquiler() * 50) + (1.5 * this.getDias_alquiler() * this.getPlazas()) + (this.getPlazas() * 2);
    }
}
