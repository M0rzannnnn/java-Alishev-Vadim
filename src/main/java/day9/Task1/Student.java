package day9.Task1;

public class Student extends Human {
    String groupName;
    public Student(String groupName, String name){
        super (name);
        this.groupName = groupName;
    }
    public String getGroupName(){
        return groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("���� ������� � ������ " + name);
    }

}
