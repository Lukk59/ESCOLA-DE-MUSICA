package com.mycompany.escolademusica;


public abstract class IntrumentoAbstrato {
    private String nome; 
    private String material;
    
    public IntrumentoAbstrato (String nome, String material){
        this.nome = nome;
        this.material = material;   
    }
    
    public abstract void tocar ();public void afinar (){
        System.out.println("Afinando " + getNome());
    }
    
    public void mostrarInfo(){
        System.out.println("Instrumento: " + getNome());
        System.out.println("Material: " + getMaterial());
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }
    
    
}




