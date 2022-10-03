package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> membersNames;
    public MusicBand(String name, int year, List<MusicArtist> membersNames){
        this.name = name;
        this.year = year;
        this.membersNames = membersNames;
        }
    public int getYear(){
        return year;
    }

    public List<MusicArtist> getMembersNames() {
        return membersNames;
    }
    public void setMembersNames (List<MusicArtist> membersNames){
        this.membersNames = membersNames;
    }

    @Override
    public String toString() {
        return name + " " + year;
    }
    public static void transferMembers(MusicBand bandA,MusicBand bandB) {
        for (MusicArtist band : bandA.getMembersNames())
            bandB.getMembersNames().add(band);
        bandA.getMembersNames().clear();
    }
    public void printMembers(){
        System.out.println(getMembersNames());
    }
}
