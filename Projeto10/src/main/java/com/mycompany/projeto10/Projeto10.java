
package com.mycompany.projeto10;

public class Projeto10 {

    public static void main(String[] args) {
        
        
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();
    Visitante p5 = new Visitante();
    
    
    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Claudio");
    p4.setNome("Fabiana");
    p5.setNome("José");
    
    p1.setSexo("M");
    p2.setSexo("F");
    p3.setSexo("M"); 
    p4.setSexo("F");
    p5.setSexo("M");
    
    
    p1.setIdade(22);
    p2.setIdade(32);
    p3.setIdade(42);
    p4.setIdade(52);
    p5.setIdade(25);
    
    p2.setCurso("Informatica");
    p3.setSalario(2500.75f);
    p4.setSetor("Estoque");
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    
    
    }
    
    
    
    
}
