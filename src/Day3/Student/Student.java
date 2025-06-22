package Day3.Student;

public class Student {
     String name;
     private float grade;
     private int id;
     Student(String name,int id){
         this.name = name;
         this.id = id;
     }

     public void changeGrade(int grade) {
     this.grade =  grade;
     }
     public int getId() {
     return id;
     }
     public void setId(int id) {
     this.id = id;
     }
     public String getGrade() {
         if (this.grade >= 90) {
             return "A+";
         } else if ((this.grade >= 80) && (this.grade < 90)) {
             return "A";
         } else if ((this.grade >= 70) && (this.grade < 80)) {
             return "B+";
         } else if ((this.grade >= 60) && (this.grade < 60)) {
             return "B";
         } else if ((this.grade >= 50) && (this.grade < 60)) {
             return "B";
         } else if ((this.grade >= 40) && (this.grade < 50)) {
             return "C+";
         }
         if ((this.grade >= 35) && (this.grade < 40)) {
             return "NG";
         }
         return "Invalid input";
     }

     }

