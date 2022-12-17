package com.curso.nova;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConvidadoDao {

    private final static List<Convidado> convidados = new ArrayList<>();

    public void salvar(Convidado convidadoCriado) {
        convidados.add(convidadoCriado);
    }

    public List<Convidado> listaConvidados() {
        return new ArrayList<>(convidados);
    }
}
