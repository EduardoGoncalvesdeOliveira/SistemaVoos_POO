package br.sp.senai.jandira.model;

public class VooGol extends Voos {

    String nomeCompanhia = "VooGol";

    public void Voo(int numeroVoo, String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
        this.numeroVoo = numeroVoo;
    }

}
