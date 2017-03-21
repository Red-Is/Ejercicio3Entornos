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
public class Coche extends VehiculoTransporte {
    /**
     * Constructor por defecto de la clase
     */
    public Coche() {
        super();
    }
    /**
     * Constructor por parámetros de la clase
     * @param matricula Matrícula del coche
     * @param dias Dias de alquiler del coche
     * @param plazas Plazas del coche
     */
    public Coche(String matricula, int dias, int plazas) {
        super(matricula, dias, plazas);
    }
    /**
     * Método que imprime por pantalla la información del coche
     */
    @Override
    public void recibo() {
        System.out.println("--------------------\n" +
                           "COCHE\n" +
                           "--------------------\n" +
                           "información\n");
        super.recibo();
    }
    /**
     * Método que calcula el importe del alquiler del coche
     * @return Devuelve el importe del alquiler en un double
     */
    @Override
    public double importeAlquiler(){
        return (this.getDias_alquiler() * 50) + (1.5 * this.getDias_alquiler() * this.getPlazas());
    }
}
