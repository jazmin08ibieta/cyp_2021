/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulagneral_ibieta;

import java.util.Scanner;

/**
 *
 * @author ibiet
 */
public class FormulaGneral_IbietaMain {
    public static void main (String args[]) {
        //
        Scanner j = new Scanner (System.in);
      double a,b,c;
       double X1,X2;
       
       System.out.println ("Introduce el valor de a: ");
       a = j.nextDouble();
       System.out.println ("Introduce el valor de b: ");
       b = j.nextDouble ();
       System.out.println ("Introduce el valor de c: ");
       c = j.nextDouble();
       
   FormulaGneral_Ibieta datos = new FormulaGneral_Ibieta (a,b,c);
datos.RegresarDatos();  
    }
}
