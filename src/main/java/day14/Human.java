package day14;

public class Human {
    private int age;
    private String name;

    public Human(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{ name = "+ getName()+", age = " +getAge()+ "}";
    }
}
