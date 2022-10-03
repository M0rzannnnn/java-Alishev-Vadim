package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> membersNames;
    public MusicBand(String name, int year, List<String> membersNames){
        this.name = name;
        this.year = year;
        this.membersNames = membersNames;
        }
    public int getYear(){
        return year;
    }

    public List<String> getMembersNames() {
        return membersNames;
    }
    public void setMembersNames (List<String> membersNames){
        this.membersNames = membersNames;
    }

    @Override
    public String toString() {
        return name + " " + year;
    }
    public static void transferMembers(MusicBand bandA,MusicBand bandB) {
        for (String band : bandA.getMembersNames())
            bandB.getMembersNames().add(band);
        bandA.getMembersNames().clear();
    }
    public void printMembers(){
        System.out.println(getMembersNames());
    }
}
