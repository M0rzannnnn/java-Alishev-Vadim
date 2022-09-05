package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane SU25 = new Airplane("SU",2005, 18, 3500);
        Airplane SU35 = new Airplane("SU", 2011, 21, 3800);
        SU25.compareAirplanes(SU25,SU35);
        SU35.compareAirplanes(SU25,SU35);
    }
}