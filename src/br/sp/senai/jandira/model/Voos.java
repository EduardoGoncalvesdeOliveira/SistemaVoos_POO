package br.sp.senai.jandira.model;

abstract class Voos {

    int numeroVoo, capacidadeVoo;

    String origemVoo, destinoVoo, dataPartidaVoo, horaPartidaVoo;

    public void Voo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}
