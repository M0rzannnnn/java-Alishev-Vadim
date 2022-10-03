package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersNames1 = new ArrayList<>();
        membersNames1.add("����� ������");
        membersNames1.add("���� ������");

        MusicBand band1 = new MusicBand("�����", 2002, membersNames1);

        List<String> membersNames2 = new ArrayList<>();
        membersNames2.add("������ ������");
        membersNames2.add("����� �������");

        MusicBand band2 = new MusicBand("���������", 1998, membersNames2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();

    }
}
