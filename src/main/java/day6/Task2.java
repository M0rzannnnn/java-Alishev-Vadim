package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane SU35 = new Airplane("SU", 2007, 18,2000);
        changeYearAndLength(SU35);
        SU35.fillUp (5);
        SU35.fillUp(100);
        SU35.info();
    }
    static void changeYearAndLength(Airplane a){
        a.setYear(2011);
        a.setLength(27);
    }
}
