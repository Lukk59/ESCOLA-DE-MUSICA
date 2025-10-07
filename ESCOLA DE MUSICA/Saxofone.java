/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

public class Saxofone extends IntrumentoAbstrato{
    private String tipo;
    
    public Saxofone (String nome, String material, String tipo){
        super(nome, material);   
        this.tipo = tipo;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando o intrumento " + getNome() + " do tipo " + tipo);
        System.out.println("piriripiri");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Afinando o saxofone");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo do Sax:" + tipo);
    }
}
