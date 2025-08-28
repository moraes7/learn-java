package com.nicolasmoraes.learnjava.javacore.Ycolecoes.hashcode.dominio;

// Coleções pt 04 - hashCode pt 02

public class Smartphone02 {

    private String serialNumber;
    private String marca;

    public Smartphone02(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone02 smartphone = (Smartphone02) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // 1º Regra: se x.equals(y) == true, y.hashCode(x) tem que ser igual(==) x.hashCode()

    // 2º Regra: y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true

    // 3º Regra = se x.equals(y) == false, o hashCode() tem que ser diferente

    // 4º Regra = y.hashCode() != x.hashCode(), x.equals(y) deverá ser false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
