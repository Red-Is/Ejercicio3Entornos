/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.entornos;

import Alquiler.Alquiler;
import Excepciones.CadenaVaciaException;

/**
 *
 * @author Alejandro Ariza
 * @version 1
 */
public class Ejercicio3Entornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ciclo formativo: Desarrollo de Aplicaciones Multiplataforma
         * Módulo profesional: Programación 
         * Tema: 
         * Alumno: Alejandro Ariza Guerrero
         * Curso académico: 2016-2017
         * Poniente Formación
         */
        try {
            Alquiler a = new Alquiler(3);

            a.mostrarDatos();
        } catch(CadenaVaciaException e) {
            ES.printErr("Error: " + e);
        }
    }
    
}
