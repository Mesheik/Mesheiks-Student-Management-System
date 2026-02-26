package students.mesheikbrown;

import java.util.ArrayList;

public class Instructor extends Person{

    private String department;
   private ArrayList<Student> students;

   public Instructor(int id,String firstName,String lastName,String email,String department) {
    super(id,firstName,lastName,email);
    this.department = department;
    this.students = new ArrayList<>();
   }

    public String getDepartment() {
        return department;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void displayRoster() {
        System.out.println("[Instructor] Dr." + super.getfirstName() + "'s Roster:");
        for(Student student : students) {
            student.getSummary();
        }
        System.out.println("");
    }

    //returns whatever value is stored in method
    public void createAnnouncement(String message){
        System.out.println(message);
    }

    @Override
    public void getSummary(){
        System.out.println("[Instructor] Dr. " + super.getfirstName() + " | " + "Department: " + getDepartment());
    }

}
