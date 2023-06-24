package Homework3;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Course student1 = new Course(new Date(2023, Calendar.MARCH, 24),"Alex");
        Course student2 = new Course(new Date(223+1900,Calendar.DECEMBER,12),"Bill");
        Course student3 = new Course(60,"Elly","Tereza");
        Course student4 = new Course(60,"Sem","Dick");
        Course student5 = new Course(60,"Karl","Bob");

        Student student6 = new Student("Soll",new Course[4]);
        Student student7 = new Student("Soll",new Course[3]);
        Student student8 = new Student("Lipovsky","lora",2);

        CollegeStudent student9 = new CollegeStudent("Rikky","Brown",5);
        CollegeStudent student10 = new CollegeStudent("Lily","Black",5);
        CollegeStudent student11 = new CollegeStudent("Sally","Mason",5,"Bellfist",12,25678);
        CollegeStudent student12 = new CollegeStudent("Rikky","Brown",5);
        SpecialStudent student13 = new SpecialStudent("algel","Yellou",5,"Oxford",15,145,222234);
    }
}
