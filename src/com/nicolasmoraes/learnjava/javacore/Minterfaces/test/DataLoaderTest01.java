package com.nicolasmoraes.learnjava.javacore.Minterfaces.test;

import com.nicolasmoraes.learnjava.javacore.Minterfaces.dominio.DataLoader;
import com.nicolasmoraes.learnjava.javacore.Minterfaces.dominio.DatabaseLoader;
import com.nicolasmoraes.learnjava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
