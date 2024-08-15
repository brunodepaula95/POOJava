
package com.mycompany.projeto12;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
    
    @Override
    public void locomover(){
        System.out.println("Se locomove voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Se alimenta de frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
}
