package com.mycompany.projeto2;
public class Projeto2 {

    public static void main(String[] args) {
        Cadeira cd1 = new Cadeira();
        cd1.cor = "Preta";
        cd1.modelo = "Escritorio";
        cd1.suporte = 2;
        cd1.status();
        cd1.sentado();
        cd1.sentar();
    }
}
