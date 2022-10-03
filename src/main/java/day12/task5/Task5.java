package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtist1 = new ArrayList<>();
        musicArtist1.add(new MusicArtist ("����� ������", 30));
        musicArtist1.add(new MusicArtist ("���� ������", 35));

        MusicBand band1 = new MusicBand("�����", 2002, musicArtist1);


        List<MusicArtist> musicArtist2 = new ArrayList<>();
        musicArtist2.add(new MusicArtist("������ ������", 45));
        musicArtist2.add(new MusicArtist("����� �������", 42));

        MusicBand band2 = new MusicBand("���������", 1998, musicArtist2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
