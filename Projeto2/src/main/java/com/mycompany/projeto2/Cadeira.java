package com.mycompany.projeto2;

public class Cadeira {
    int suporte;
    String cor;
    String modelo;
    boolean sentado;
    
    
    void status(){
        
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Suporte: " + this.suporte);
    }
    
    void sentado(){
        if(this.sentado == true){
            System.out.println("Tem alguem usando");
        }else {
            System.out.println("Pode usar");
        }
    }
    
    
    void sentar (){
        this.sentado = true;
    }
            
}
