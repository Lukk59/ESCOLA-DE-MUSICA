package com.mycompany.escolademusica;

import java.util.Iterator;


public class EscolaDeMusica {

    public static void main(String[] args) {
        IntrumentoAbstrato[] banda = new IntrumentoAbstrato[4];
        
        banda[0] = new Piano("Piano foda", "Madeira", 40);
        banda[1] = new Saxofone ("Saxofone foda", "Metal", "Soprano");
        banda[2] = new Violao("Violão foda", "Madeira", 5);
        banda[3] = new Bateria("Bateria foda", "aço", 8);
        
        System.out.println("AFINANDO OS INSTRUMENTOS\n");
        for (IntrumentoAbstrato intrumento : banda) {
            intrumento.afinar();
            System.out.println("\n");
        }
        
        System.out.println("TOCANDO A MUSICA\n");
        for (IntrumentoAbstrato intrumento : banda) {
            intrumento.tocar();
            System.out.println("\n");
        }
        
        System.out.println("APRESENTANDO OS INSTRUMENTOS\n");
        for (IntrumentoAbstrato intrumento : banda) {
            intrumento.mostrarInfo();
            System.out.println("\n");
        }
    }
}
