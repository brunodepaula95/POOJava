
package com.mycompany.projeto12;

public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
    @Override
    public void locomover(){
        System.out.println("Se locomove rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Come vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de reptil");
    }
}
