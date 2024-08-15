
package com.mycompany.projeto12;

public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
    @Override
    public void locomover(){
        System.out.println("Se locomove nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Se alimenta comendo substâncias");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("O peixe soltou varias bolhas");
    }
}
