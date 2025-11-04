package com.nicolasmoraes.learnjava.javacore.Kenum.test;

import com.nicolasmoraes.learnjava.javacore.Kenum.dominio.Cliente;
import com.nicolasmoraes.learnjava.javacore.Kenum.dominio.TipoPagamento;
import com.nicolasmoraes.learnjava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Nicolas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Luffy", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente01);
        System.out.println(cliente02);

        // System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        // System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        // busca por atributos
        TipoCliente tipoCliente01 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente01.getNomeRelatorio());

        TipoCliente tipoCliente02 = TipoCliente.tipoclientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente02);

    }
}
