package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;
    public Teacher (String name,String subject){
        this.name = name;
        this.subject = subject;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void evaluate (Student Student1){
        Random rdn = new Random();
        int assessment = rdn.nextInt(4) + 2;
        switch (assessment) {
            case 2:
                System.out.println("������������� " + name + " ������� �������� � ������ " + Student1.name + " �� �������� " + subject + " �� ������ �������������������");
                break;
            case 3:
                System.out.println("������������� " + name + " ������� �������� � ������ " + Student1.name + " �� �������� " + subject + " �� ������ �����������������");
                break;
            case 4:
                System.out.println("������������� " + name + " ������� �������� � ������ " + Student1.name + " �� �������� " + subject + " �� ������ ������");
                break;
            case 5:
                System.out.println("������������� " + name + " ������� �������� � ������ " + Student1.name + " �� �������� " + subject + " �� ������ �������");
                break;
        }
    }
}
