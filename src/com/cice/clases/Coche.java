/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

import java.util.Date;

/**
 *
 * @author Manu
 */
public class Coche {

    //Atributos o variables de un coche
    //Caracteristicas
    static String modelo;
    String color;
    String matricula;
    String bastidor;
    int potencia;
    Date fecha;
    boolean esAndando;
    boolean esEncendido;

//Constructora DHL
    public Coche(){
        
    }

// Funciones 

    void acelerar() {
        System.out.println("Estoy acelerando");
    }

    void frenar() {
        System.out.println("Estoy frenando");
    }

    void arrancar() {
        System.out.println("Brum Brum");
    }
    void apagar(){
        System.out.println("Me estoy apagando...");
    }
}
