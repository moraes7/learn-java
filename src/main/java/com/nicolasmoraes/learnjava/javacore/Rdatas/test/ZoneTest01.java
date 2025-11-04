package com.nicolasmoraes.learnjava.javacore.Rdatas.test;

// Classes Utilitárias - ZonedDateTime, ZoneId, OffsetDateTime

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); // {AST=America/Anchorage, MST=-07:00, SST=Pacific/Guadalcanal, CTT=Asia/Shanghai, PRT=America/Puerto_Rico, ECT=Europe/Paris, EAT=Africa/Addis_Ababa, EST=-05:00, PNT=America/Phoenix, PLT=Asia/Karachi, CNT=America/St_Johns, IET=America/Indiana/Indianapolis, VST=Asia/Ho_Chi_Minh, JST=Asia/Tokyo, ART=Africa/Cairo, PST=America/Los_Angeles, BET=America/Sao_Paulo, MIT=Pacific/Apia, CAT=Africa/Harare, AGT=America/Argentina/Buenos_Aires, NET=Asia/Yerevan, CST=America/Chicago, IST=Asia/Kolkata, AET=Australia/Sydney, BST=Asia/Dhaka, ACT=Australia/Darwin, HST=-10:00, NST=Pacific/Auckland}

        System.out.println(ZoneId.systemDefault()); // America/Sao_Paulo

        // pegando a zona de Toquio
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone); // Asia/Tokyo
        LocalDateTime now = LocalDateTime.now();
        // passando a zona
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime); // 2025-07-21T10:56:59.105494100+09:00[Asia/Tokyo]

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2); // 2025-07-21T23:00:14.570655+09:00[Asia/Tokyo]

        // ZoneOffset
        System.out.println(ZoneOffset.MIN); // -18:00
        System.out.println(ZoneOffset.MAX); // +18:00

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1); // 2025-07-21T11:10:54.835571900-04:00
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2); // 2025-07-21T11:10:54.835571900-04:00

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3); // 2025-07-21T10:10:54.837606500-04:00

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate); // Japanese Reiwa 7-07-21
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 1, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra); // Japanese Meiji 33-01-01


    }
}
