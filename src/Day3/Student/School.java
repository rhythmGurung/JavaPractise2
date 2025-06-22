package Day3.Student;

import java.util.ArrayList;

public class School {

        public static void main(String[] args){
            Student s1 = new Student("Rhythm",21);
            Student s2 = new Student("Heaven",22);
            Student s3 = new Student("Parbesh",23);
            Student s4= new Student("Anush",24);
            Student s5 = new Student("Sunil",25);
            System.out.println(s1.name);
            s1.changeGrade(80);
            System.out.println(s1.getGrade());

            ArrayList<Student> studentDetails = new ArrayList<>();
            studentDetails.add(s1);
            studentDetails.add(s2);
            studentDetails.add(s3);
            studentDetails.add(s4);
            studentDetails.add(s5);

            ArrayList<Student> topper = new ArrayList<>();
            for(Student each : studentDetails){
                 String grade = each.getGrade();



            }
        }
    }

