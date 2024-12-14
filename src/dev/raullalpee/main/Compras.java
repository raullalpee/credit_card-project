package dev.raullalpee.main;

public class Compras {
    private  String descricao;
    private double valor;

    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras: descricao = " + descricao +
                " valor = " + valor;
    }
}
