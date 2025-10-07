/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author gustavo
 */
public class Bateria extends IntrumentoAbstrato{
    private int numeroDePeças;
    
    public Bateria (String nome, String material,int numeroDePeças){
        super(nome, material);   
        this.numeroDePeças = numeroDePeças;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando o intrumento " + getNome() + " com " + numeroDePeças + " pratos");
        System.out.println("PA TUM TUM BUM PA TSS");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Afinando tons");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de peças:" + numeroDePeças);
    }
}
