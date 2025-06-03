package com.nicolasmoraes.learnjava.javacore.Kenum.dominio;

public class Cliente {
    // é possível enum dentro de uma classe (não é a melhor das opções, fica menos organizado
   /*
   public enum TipoPagamento {
       DEBITO, CREDITO
   }
   */
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                ", descontoPagamento=" + tipoPagamento.calcularDesconto(100) +
                '}';
    }
}
