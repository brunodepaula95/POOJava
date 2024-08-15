package com.mycompany.projeto11;

public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar(){
        System.out.println(this.getNome() + " Esta no estagio no momento!");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
