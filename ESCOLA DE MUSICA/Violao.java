/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author gustavo
 */
public class Violao extends IntrumentoAbstrato{
    private int numeroDeCordas;
    
    public Violao (String nome, String material, int numeroDeCordas){
        super(nome, material);   
        this.numeroDeCordas = numeroDeCordas;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando o intrumento " + getNome() + " com " + numeroDeCordas + " cordas");
        System.out.println("lalalalalla");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("afinando as cordas do violão");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Número de cordas" + numeroDeCordas);
    }
            
    
}
