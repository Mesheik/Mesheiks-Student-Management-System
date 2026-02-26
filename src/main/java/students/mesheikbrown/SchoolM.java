package students.mesheikbrown;

public class SchoolM {

    public static void main(String[] args) {

        // Create Instructor
        Instructor instructor = new Instructor(
                100,
                "Mesheik",
                "Brown",
                "Mesheik@school.com",
                "Computer Science"
        );

        // Create Students
        Student student1 = new Student(
                1,
                "Jordan",
                "Smith",
                "jordan@school.com",
                2,
                3.8
        );

        Student student2 = new Student(
                2,
                "Marcus",
                "Brown",
                "marcus@school.com",
                1,
                2.9
        );

        // Add students to instructor roster
        instructor.addStudent(student1);
        instructor.addStudent(student2);

        // Print instructor summary
        instructor.getSummary();
        System.out.println();

        // Print roster
        instructor.displayRoster();

        // Create announcement
        instructor.createAnnouncement("Midterm exam is Friday. Study hard!!");

    }
}