/*
 * Adrian Camilo Osorio Achipiz
 * Programa 04
 * 23/04/2018
 * Correlacion
 * Programa que permite hayar la regresion lineal, correlacion, coeficientes.
 */

//Importamos las librerias necesarias para el programa
package correlacion;

/**
 *
 * @author adrianosorio
 */
public class Principal {
    public static void main(String []args){
        //Objeto de tipo Correlacion que va a llevar los acumulados de las parejas
        Correlacion coCalculador = new Correlacion();
        
        //Imprimo los resultados de calculos
        coCalculador.Resultado();
    }
}