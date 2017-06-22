/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

/**
 *
 * @author Manu
 */
public class Principal {
    
    
  public static void main(String... args){
      
      //creemos coches!!!
      
      Coche coche1=new Coche();
      Coche coche2=new Coche();
      
      
         
      
      coche1.color="Amarillo";
      
      coche1.esAndando=false;
      coche1.esEncendido=false;
      coche1.matricula="";
     
      coche1.potencia=0;
      
      
      //coche1.arrancar();
      //coche1.acelerar();
      //coche1.frenar();
      //coche1.apagar();
      coche1.bastidor="BA123456";
      coche2.bastidor="CA987654";
       coche1.modelo="Auris";
       coche2.modelo="Toledo";
      System.out.println(coche1.bastidor);
      System.out.println(coche2.bastidor);
      System.out.println(coche2.modelo);
      System.out.println(coche1.modelo);
      
      Coche coche3 =new Coche();
      System.out.println(coche3.modelo);
      coche3.modelo="Mercedes";
      
      System.out.println(coche1.modelo);
      System.out.println(coche2.modelo);
      System.out.println(coche3.modelo);
      
      
  }
    
    
}
