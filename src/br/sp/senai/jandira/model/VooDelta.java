package br.sp.senai.jandira.model;

public class VooDelta extends Voos{

    String nomeCompanhia = "VooDelta";

    public void Voo(int numeroVoo, String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
        this.numeroVoo = numeroVoo;
    }
}
