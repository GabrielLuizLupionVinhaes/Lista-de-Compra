package br.com.Alura.Classes;

import java.util.ArrayList;
import java.util.List;

public class Compra {


    private String produto;

    private double valorProduto;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "\nItem: " + this.getProduto() + "\nValor: " + this.getValorProduto() + "\n";
    }

}
