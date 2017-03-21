/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo.Carga;

/**
 *
 * @author Alejandro Ariza
 * @version 1
 */
public class Camion extends VehiculoCarga {
    /**
     * Constructor por defecto de la clase
     */
    public Camion() {
        super();
    }
    /**
     * Constructor por parámetros de la clase
     * @param matricula Matrícula del camión
     * @param dias Dias de alquiler del camión
     * @param tara Tara del camion
     */
    public Camion(String matricula, int dias, int tara) {
        super(matricula, dias, tara);
    }
    /**
     * Método que imprime por pantalla la información del camión
     */
    @Override
    public void recibo() {
        System.out.println("--------------------\n" +
                           "CAMIÓN\n" +
                           "--------------------\n" +
                           "información\n");
        super.recibo();
    }
    /**
     * Método que calcula el importe del alquiler
     * @return Devuelve el importe del alquiler en un double
     */
    @Override
    public double importeAlquiler() {
        return (this.getDias_alquiler() * 50) + (this.getTara() * 20) + 40 ;
    }
}
