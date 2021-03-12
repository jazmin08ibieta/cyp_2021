/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

/**
 *
 * @author ibiet
 */
public class Ecuaciones_Ibieta {
     private double a, b, c, x1, x2;
    
    //constructor
    public Ecuaciones_Ibieta (int a,int b, int c){
   this.a = a;
   this.b= b;
   this.c= c;
    }
    //metodo
    public void Calculo (){
       double numero = (b*b) - (4*a*c);
       if (numero >0) {
           x1 = (-b + Math.sqrt(numero)) /2*a;
           x2 = (-b - Math.sqrt(numero)) /2*a;
          
       } else {
           if (numero == 0) {
               x1 = (-b) / 2*a;
               
         
       } 
}
       
    }
    
public void imprimir () {
    Calculo ();
     System.out.println ("LA ECUACION TIENE DOS SOLUCIONES ");
           System.out.println ("X1: "+ x1);
           System.out.println ("X2: "+ x2);
}
}
