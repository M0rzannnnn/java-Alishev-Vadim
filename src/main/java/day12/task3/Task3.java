package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBand1 = new ArrayList<>();
        musicBand1.add(new MusicBand("Prodigy", 1991));
        musicBand1.add(new MusicBand("Uma2rman", 1999));
        musicBand1.add(new MusicBand("Братья Гримм", 2001));
        musicBand1.add(new MusicBand("Marcell", 2007));
        musicBand1.add(new MusicBand("Каспийский груз", 2012));
        musicBand1.add(new MusicBand("Звери", 2002));
        musicBand1.add(new MusicBand("Сплин", 1995));
        musicBand1.add(new MusicBand("Queen", 1965));
        musicBand1.add(new MusicBand("Ленинград", 1998));
        musicBand1.add(new MusicBand("Quest pistols", 2008));
        System.out.println(musicBand1);
        Collections.shuffle(musicBand1);
        System.out.println(musicBand1);

        System.out.println(groupsAfter2000(musicBand1));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupAfter2000bands = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                groupAfter2000bands.add(band);

        }
        return groupAfter2000bands;
    }
}
