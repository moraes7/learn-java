package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.service;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateByNameJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateByNameJdbcRowSet(producer);
    }
}
