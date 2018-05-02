/*
 * Adrian Camilo Osorio Achipiz
 * Programa 04
 * 23/04/2018
 * Correlacion
 * Programa que permite hayar la regresion lineal, correlacion, coeficientes.
 */

//Importamos las librerias necesarias para el programa
package correlacion;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Adrian Osorio
 */
public class Correlacion {
    //Declaramos las variables
    double beta0, beta1;
    double fPromediox, fPromedioy;
    double fr, fr2;
    double fSumax, fSumay, fSumx2, fSumy2, fSumxy;
    double fxk,fyk;
    int nNumerosParejas, srcX, srcY, numero;
    
    public Correlacion(){
        //incializa todos sus valores en 0
        beta0= 0;
        beta1= 0;
        fPromediox=0; 
        fPromedioy=0;
        fr=0;
        fr2=0;
        fSumax=0;
        fSumay=0; 
        fSumx2=0;
        fSumy2=0;
        fSumxy=0;
        fxk=386;
        fyk=0;
        nNumerosParejas=0;
        numero=0;
    }    
    
    public void Resultado(){
           
        
        Scanner guardar = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea calcular: ");
        numero=guardar.nextInt();
        
        //Arreglo donde vamos a almacenar los numeros ingresados
        float srcX[] = new float[numero];
        float srcY[] = new float[numero];
        
        
        //Ingresamos los valores de la primera pareja de numeros
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("======Primer Pareja de Numeros======");
        System.out.println("=====================================");
        System.out.println("");
        for(int i=0;i<numero;i++){
            System.out.println("Ingrese primer listado de parejas de numeros: ");
            srcX [i] = guardar.nextFloat();
        }
        
        //Ingresamos los valores de la segunda pareja de numeros
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("======Segunda Pareja de Numeros======");
        System.out.println("=====================================");
        System.out.println("");
        
        for(int a=0;a<numero;a++){        
            System.out.println("Ingrese segundo listado de parejas de numeros: ");
            srcY[a]=guardar.nextFloat();
        }
        
        for (int i = 0; i <numero; i++) {
            fSumax = fSumax + srcX[i];
            fSumay = fSumay + srcY[i];
            fSumx2 = fSumx2 + (Math.pow(srcX[i], 2));
            fSumy2 = fSumy2 + (Math.pow(srcY[i], 2));
            fSumxy =  (srcX[i] * srcY[i]) + fSumxy;
        }
        
        fPromediox = fSumax / numero;
        fPromedioy = fSumay / numero;
        
        
        
        if((fSumx2-(numero*Math.pow(fPromediox, 2)))!=0){    
            beta1=(double) ((fSumxy-(numero*fPromediox*fPromedioy))/(fSumx2-(numero*Math.pow(fPromediox, 2))));
            beta0=fPromedioy-(beta1*fPromediox);
        }
        if((Math.sqrt((numero*fSumx2-Math.pow(fSumax, 2))*(numero*fSumy2-Math.pow(fSumay, 2))))!=0){
            fr = (double) ((numero*fSumxy-(fSumax*fSumay))/(Math.sqrt((numero*fSumx2-Math.pow(fSumax, 2))*(numero*fSumy2-Math.pow(fSumay, 2)))));
            fr2 = (double) Math.pow(fr, 2);
        }
        
 
	fyk = beta0 + beta1*fxk;
        
        
        //Imprimimos los resultados 
        System.out.println("");
        System.out.println("*** RESULTADO ***");
        System.out.println("N = "+ numero);
        System.out.println("xk = "+String.format("%.0f", fxk));
	System.out.println("r = "+String.format("%.5f", fr));
	System.out.println("r2 = "+String.format("%.5f", fr2));
	System.out.println("b0 = "+String.format("%.5f", beta0));
	System.out.println("b1 = "+String.format("%.5f", beta1));
	System.out.println("yk = "+String.format("%.5f", fyk));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    
}
