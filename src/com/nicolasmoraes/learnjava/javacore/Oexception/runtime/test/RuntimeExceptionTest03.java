package com.nicolasmoraes.learnjava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO...");
        }
        return null;
    }

    // USANDO TRY FINALLY
    // NÃO É MUITO UTILIZADO
    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO...");
        }
    }

}
