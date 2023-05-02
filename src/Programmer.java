import java.time.LocalDate;
import java.time.Period;

public class Programmer {
    String name;
    String surName;
    LocalDate age;

    public Programmer(String name, String surName, LocalDate age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    public  void getInfo(){
        System.out.println("Name: "+name+ "\nsurName: "+surName+"\nyear of birth: "+age);
    }
    public void getAge(){
        System.out.println("year: "+Period.between(age, LocalDate.now()).getYears());
    }
}
