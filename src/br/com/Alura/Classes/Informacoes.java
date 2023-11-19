package br.com.Alura.Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Informacoes{
    private double limiteCartao;

    private List<Compra> lista = new ArrayList<>();

    public Informacoes(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public List<Compra> getLista() {
        return lista;
    }

    public void setLista(Compra compra) {
        this.lista.add(compra);
        lista.sort(Comparator.comparing(Compra::getValorProduto));
    }

}
