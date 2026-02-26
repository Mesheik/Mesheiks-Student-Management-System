package students.mesheikbrown;

public class Student extends Person {

    private int gradeLevel;
    private double gpa;

    public Student(int id, String firstName, String lastName,String email, int gradeLevel,double gpa){

        super(id,firstName,lastName,email);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;

    }

    public String isOnHonorRoll(double gpa){
        if(gpa >= 3.2){
            return "Yes";
        }else {
            return "No";
        }

    }

    public int getgradeLevel() {
        return gradeLevel;
    }

    public double getgpa() {
        return gpa;
    }

    @Override
    public void getSummary(){
        System.out.println("Student " + super.getfirstName() + " " + super.getlastName() + " |" + " Grade Level: "
                + getgradeLevel() + " | " + "GPA: " + getgpa()  + " | " + "Honor Roll: " + isOnHonorRoll(getgpa()));
    }
} // ends class
