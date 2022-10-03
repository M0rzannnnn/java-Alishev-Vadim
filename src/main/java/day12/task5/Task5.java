package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtist1 = new ArrayList<>();
        musicArtist1.add(new MusicArtist ("Роман Зверев", 30));
        musicArtist1.add(new MusicArtist ("Иван Иванов", 35));

        MusicBand band1 = new MusicBand("Звери", 2002, musicArtist1);


        List<MusicArtist> musicArtist2 = new ArrayList<>();
        musicArtist2.add(new MusicArtist("Сергей Шнуров", 45));
        musicArtist2.add(new MusicArtist("Семен Семенов", 42));

        MusicBand band2 = new MusicBand("Ленинград", 1998, musicArtist2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
