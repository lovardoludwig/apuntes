/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoquince;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ProyectoQuince {

    /**
     * @param args the command line arguments
     * Se ingresa un importe, si supera los 100 pesos se le agrega un 23%, si es menor se le descuenta el 50%
     */
    public static void main(String[] args) {
        String DatoAux;
        Integer Importe;
        Scanner MiEscaner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe:");
        DatoAux = MiEscaner.next();
        Importe = Integer.parseInt(DatoAux);        
        
        if(Importe>100)
        {
           Importe+(Importe*23)/100;
        }else
        {
           Importe-(Importe*50)/100; 
        }
    }
    
}
