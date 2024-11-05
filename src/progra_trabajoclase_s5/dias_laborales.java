/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra_trabajoclase_s5;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class dias_laborales {
      public static void main(String[] args) {
       
      Scanner entrada=new Scanner(System.in);
      String dia;
      boolean dialaboral ;
      int opcion ;
      String[] diaslaborales={"lunes","martes","jueves","viernes","sabado"};
      
      do {
          
          System.out.println("Selecciones una opcion:\n1. Verificar dias labprales \n2. Salir");
          opcion=entrada.nextInt();
        if (opcion==1) {         
        System.out.println("Ingrese el dia que desea verificar");
        dia= entrada.next();
        
        
            if (diaslaborales.equals(dia))
                dialaboral=true ;
             else
            dialaboral=false ;
                       
       
           if (dialaboral=true) 
               System.out.println("El dia "+dia+" si es un dia laboral");
           if (dialaboral=false)
               System.out.println("El dia "+dia+" no es un dia laboral");
        }
               
        
        System.out.println("Selecciones una opcion:\n1. Verificar dias labprales \n2. Salir");
          opcion=entrada.nextInt();
       
      } //fin de do
       
      while (opcion==1) ;
                
      
    }
    

}
