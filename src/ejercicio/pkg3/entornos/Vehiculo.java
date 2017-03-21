package ejercicio.pkg3.entornos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Ariza
 * @version 1.01
 */
public abstract class Vehiculo {
    private String matricula;
    private int dias_alquiler;
    /**
     * Contructor por defecto de la clase
     */
    public Vehiculo() {
        matricula = "";
        dias_alquiler = 0;
    }
    /**
     * Contructor por parámetros de la clase
     * @param matricula Matrícula del vehículo
     * @param dias Dias de alquiler del vehículo
     */
    public Vehiculo(String matricula, int dias) {
        this.matricula = matricula;
        this.dias_alquiler = dias;
    }
    /**
     * Método que devuelve la matrícula del vehículo
     * @return Devuelve la matrícula del vehículo en un String
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * Método que devuelve los dias de alquiler del vehículo
     * @return Devuelve los dias de alquiler del vehículo en un entero
     */
    public int getDias_alquiler() {
        return dias_alquiler;
    }
    /**
     * Método que introduce la matrícula del vehículo
     * @param matricula Matrícula del vehículo
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * Método que introduce los dias de alquiler del vehículo
     * @param dias_alquiler Dias de alquiler del vehículo
     */
    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }
    /**
     * Método que calcula el importe del alquiler
     * @return Devuelve la cantidad del alquiler en un entero
     */
    public abstract double importeAlquiler();
    /**
     * Imprime por pantalla la información del vehículo
     */
    public abstract void recibo();
}
