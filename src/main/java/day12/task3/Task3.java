package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBand1 = new ArrayList<>();
        musicBand1.add(new MusicBand("Prodigy", 1991));
        musicBand1.add(new MusicBand("Uma2rman", 1999);
        musicBand1.add(new MusicBand("Братья Гримм", 2001));
        musicBand1.add(new MusicBand("Marcell", 2007));
        musicBand1.add(new MusicBand("Каспийский груз", 2012));
        musicBand1.add(new MusicBand("Звери", 2002));
        musicBand1.add(new MusicBand("Сплин", 1995));
        musicBand1.add(new MusicBand("Queen", 1965));
        musicBand1.add(new MusicBand("Ленинград", 1998));
        musicBand1.add(new MusicBand("Questpistols", 2008));
        Collections.shuffle(musicBand1);
    }
    public static List<MusicBand> groupsAfter2000 (List<MusicBand> bands){

    }
}
