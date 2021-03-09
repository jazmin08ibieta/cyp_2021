/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulagneral_ibieta;

/**
 *
 * @author ibiet
 */
public class FormulaGneral_Ibieta {
private double a, b, c, x1, x2, numero, X1;

public FormulaGneral_Ibieta (double a, double b, double c) {
    this.a=a;
    this.b=b;
    this.c=c;
}
public void Operaciones () {
    numero = (b*b) - (4*a*c);
     x1 = (-b + Math.sqrt(numero)) /2*a;
     x2 = (-b - Math.sqrt(numero)) /2*a;
      X1=   (-b) / 2*a;  
}
public void RegresarDatos () {
    Operaciones();
     if (numero >0) {
System.out.println ("LA ECUACION TIENE DOS SOLUCIONES ");
           System.out.println ("X1: "+ x1);
           System.out.println ("X2: "+ x2);
           } else {
           if (numero == 0) {
  System.out.println ("LA ECUACION TIENE UNA SOLUCION");
               System.out.println ("X1: "+ X1);
           } else {
               System.out.println("LA ECUACION NO TIENE SOLUCION");
           }


}
     
}}