package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher("Татьяна Васильевна", "Алгебра");
        Student Student1 = new Student("Антон");
        Teacher1.evaluate(Student1);
    }
}
