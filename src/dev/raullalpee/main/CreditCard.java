package dev.raullalpee.main;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double saldo;
    private double limite;
    public List<Compras> compra;

    public CreditCard(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compra = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compra.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getCompras() {
        return compra;
    }
}