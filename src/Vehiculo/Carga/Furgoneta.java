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
public class Furgoneta extends VehiculoCarga {
    /**
     * Constructor por defecto de la clase
     */
    public Furgoneta() {
        super();
    }
    /**
     * Constructor por parámetros de la clase
     * @param matricula Matrícula de la furgoneta
     * @param dias Dias de alquiler de la furgoneta
     * @param tara Tara de la furgoneta
     */
    public Furgoneta(String matricula, int dias, int tara) {
        super(matricula, dias, tara);
    }
    /**
     * Método que imprime por pantalla la información de la furgoneta
     */
    @Override
    public void recibo() {
        System.out.println("--------------------\n" +
                           "FURGONETA\n" +
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
        return (this.getDias_alquiler() * 50) + (this.getTara() * 20) ;
    }
}
