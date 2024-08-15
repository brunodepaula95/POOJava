package com.mycompany.projeto11;

public class Projeto11 {

    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1234);
        a1.setCurso("Informatica");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Maria");
        p1.setSexo("F");
        p1.setIdade(25);
        p1.receberAumento(500f);
        p1.setSalario(2500f);
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Marialva");
        t1.setSexo("F");
        t1.setIdade(25);
        t1.praticar();
        
        
        
    }
}
