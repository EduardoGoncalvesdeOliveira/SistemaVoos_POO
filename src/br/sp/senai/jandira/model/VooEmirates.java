package br.sp.senai.jandira.model;

public class VooEmirates extends Voos {

    String nomeCompanhia = "VooEmirates";

    public void Voo(int numeroVoo, String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
        this.numeroVoo = numeroVoo;
    }

}
