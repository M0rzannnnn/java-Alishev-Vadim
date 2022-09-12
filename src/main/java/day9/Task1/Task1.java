package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("ЭВ-510", "Антон");
        Teacher teacher1 = new Teacher("Валерий Семенович", "Римское право");
        System.out.println(student1.getGroupName());
        System.out.println(teacher1.getSubjectName());
        student1.printInfo();
        teacher1.printInfo();
    }
}
