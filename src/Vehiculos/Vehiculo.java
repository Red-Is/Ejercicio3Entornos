package Vehiculos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Ariza
 * @version 1
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
     * @return Devuelve un String que es la matrícula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * Método que devuelve los dias de alquiler del vehículo
     * @return Devuelve un entero que son los dias de alquiler del vehículo
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
     * @return Devuelve un entero que es la cantidad del alquiler
     */
    public abstract double importeAlquiler();
    /**
     * Imprime por pantalla la información del vehículo
     */
    public abstract void mostrarInfo();
}
