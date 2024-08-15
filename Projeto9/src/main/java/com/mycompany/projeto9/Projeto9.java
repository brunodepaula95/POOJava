package com.mycompany.projeto9;
public class Projeto9 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("João", 26, "M");
        
        l[0] = new Livro("Java", "João Martins", 200, p[0]);
        l[1] = new Livro("POO", "José Silva", 300, p[1]);
        
        l[0].abrir();
        l[0].folhear(150);
        l[0].avançarPag();
        System.out.println(l[0].detalhes());
    }
    
}
