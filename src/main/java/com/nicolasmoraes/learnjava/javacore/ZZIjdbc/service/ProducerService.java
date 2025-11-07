package com.nicolasmoraes.learnjava.javacore.ZZIjdbc.service;

import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.domain.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    // insert
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    // delete
    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    // update
    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    // findAll
    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
