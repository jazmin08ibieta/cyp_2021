/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones_ibieta;

import java.util.Scanner;

/**
 *
 * @author ibiet
 */
public class ecuaciones_ibietamain {
    
       public static void Ecuacionesmain (String args []){
            
           Scanner j = new Scanner (System.in);
      double a,b,c;
       double X1,X2;
       
       System.out.println ("Introduce el valor de a: ");
       a = j.nextDouble();
       System.out.println ("Introduce el valor de b: ");
       b = j.nextDouble ();
       System.out.println ("Introduce el valor de c: ");
       c = j.nextDouble();
       
  Ecuaciones numeros = new Ecuaciones (a,b,c);
numeros.Imprimir();  
}
}
