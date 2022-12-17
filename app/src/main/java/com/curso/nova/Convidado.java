package com.curso.nova;

import android.support.annotation.NonNull;

public class Convidado {
    private final String nomeConvidado;
    private static int qtdConvidados = 0;

    public Convidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
        this.qtdConvidados +=1;
    }

    @NonNull
    @Override
    public String toString() {
        return nomeConvidado;
    }

    public static int getQtdConvidados() {
        return qtdConvidados;
    }
}
