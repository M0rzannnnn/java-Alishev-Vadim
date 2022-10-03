package day12.task5;

public class MusicArtist {
    String name;
    int age;
    public MusicArtist (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getAge() + " ," + getName();
    }
}
