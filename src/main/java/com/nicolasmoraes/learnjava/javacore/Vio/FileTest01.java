package com.nicolasmoraes.learnjava.javacore.Vio;

// Classes Utilitárias - IO pt 01 - File

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: "+isCreated); // true
            System.out.println("path: "+file.getPath()); // file.txt
            System.out.println("path absolute: "+file.getAbsolutePath());
            System.out.println("is directory: "+file.isDirectory()); // false
            System.out.println("is file: "+file.isFile()); // true
            System.out.println("is hidden: "+file.isHidden()); // false
            System.out.println("last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); // 2025-07-24T15:59:26.226
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted: "+file.delete()); // true
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
