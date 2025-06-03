package com.nicolasmoraes.learnjava.javacore.Kenum.dominio;

public enum TipoPagamento {
    // facilitador, assim não precisa criar if
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // metodo abstrado que foi criado apenas para ser sobrescrito
    public abstract double calcularDesconto(double valor);


}