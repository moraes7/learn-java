package com.nicolasmoraes.learnjava.javacore.ZZJcrud.service;

import com.nicolasmoraes.learnjava.javacore.ZZJcrud.dominio.Anime;
import com.nicolasmoraes.learnjava.javacore.ZZJcrud.dominio.Producer;
import com.nicolasmoraes.learnjava.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    // menu
    public static void menu(int op) {
            switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    // find
    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name)
                .forEach(p -> System.out.printf("ID: %d | Name: %s | Episodes: %d | Producer: %s%n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }

    // delete
    private static void delete() {
        System.out.println("Type the id of the anime you want to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("Y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    // save
    private static void save() {
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    // update
    private static void update() {
        System.out.println("Type the id of the anime you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));

        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found.");
            return;
        }

        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found"+animeFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name)
                .build();

        AnimeRepository.update(animeToUpdate);
    }
}
