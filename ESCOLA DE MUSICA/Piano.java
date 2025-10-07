/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author gustavo
 */
public class Piano extends IntrumentoAbstrato{
    private int numeroDeTeclas;
    
    public Piano (String nome, String material,int numeroDeTeclas){
        super(nome, material);   
        this.numeroDeTeclas = numeroDeTeclas;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando o intrumento " + getNome() + " com " + numeroDeTeclas + "teclas");
        System.out.println("PlimPlimPlom\nPlimPlimPlom\nPlimPlom");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Afinando o piano");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de teclas:" + numeroDeTeclas);
    }
}
