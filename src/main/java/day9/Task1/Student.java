package day9.Task1;


public class Student extends  Human{
    String groupName;


    public String getGroupName(){
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем " + super.name + "\n" + "Этот студент с именем " + name );
    }
}