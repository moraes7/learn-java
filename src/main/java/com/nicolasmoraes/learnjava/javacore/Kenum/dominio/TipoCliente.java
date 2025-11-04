package com.nicolasmoraes.learnjava.javacore.Kenum.dominio;

// enumeraçao é um tipo especial de classe onde todos os atributos são CONSTANTES
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // busca por atriutos
   public static TipoCliente tipoclientePorNomeRelatorio(String nomeRelatorio) {
       for (TipoCliente tipoCliente : values()) {
           if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
               return tipoCliente;
           }
       }
       return null;
   }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
