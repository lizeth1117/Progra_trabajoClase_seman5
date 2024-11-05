/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progra_trabajoclase_s5;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class Progra_trabajoClase_S5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner entrada=new Scanner(System.in);
    int cantventas=1 ;
    float totalventas=0;
    
      System.out.println("Ingrese el numero de cantidad de ventas.");
      
        cantventas= entrada.nextInt();
        float ventas[]= new float [cantventas];
        for (int i = 0; i < cantventas; i++) {
            System.out.println("Ingrese la venta # "+(i+1));
            ventas[i]= entrada.nextFloat() ;
            totalventas= totalventas+ventas[i] ;
            
        }
        System.out.println("El total de las ventas es: "+totalventas);
        
    
    
    }
}
