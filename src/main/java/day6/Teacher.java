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
        String evaluation = "";
        switch (assessment) {
            case 2:
                evaluation = "Неудовлетворительно";
                break;
            case 3:
                evaluation = "Удовлетворительно";
                break;
            case 4:
                evaluation = "Хорошо";
                break;
            case 5:
                evaluation = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценила студента с именем " + Student1.getName() + " по предмету " + subject + " на оценку" + evaluation);
    }
}
