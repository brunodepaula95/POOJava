
package com.mycompany.projeto12;

public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
    
    
    @Override
    public void locomover(){
        System.out.println("Se locomove correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Se alimenta mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }
}
