package com.nicolasmoraes.learnjava.javacore.ZZDoptional.test;

// Optional pt 02

import com.nicolasmoraes.learnjava.javacore.ZZDoptional.dominio.Manga;
import com.nicolasmoraes.learnjava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        // procurar mangá por título, caso ele existir, atualizar o título
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        // procurar mangá por id, caso ele não existir, lançar uma exception
        Manga manga = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(manga);

        // procurar mangá por título, caso ele não exista, criar um novo título de mangá
        Manga newManga = MangaRepository.findByTitle("Dragon Ball").orElseGet(() -> new Manga(3, "Dragon Ball", 519));
        System.out.println(newManga);
    }
}
