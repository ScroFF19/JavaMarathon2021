package day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String  subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void estimation(Student student){
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String eavaluation = "";
        switch (randomValue){
            case 2:
              eavaluation = "неудовлетворительно";
              break;
            case 3:
                eavaluation = "удовлетворительно";
                break;
            case 4:
                eavaluation = "хорошо";
                break;
            case 5:
                eavaluation = "отлично";
                break;
        }
        System.out.println("Преподаветель " + this.fio + " оценил студента с именем " + student.getFio() + " по предмету " + this.subject + " на оценку " + eavaluation);
    }
}
