package students.mesheikbrown;

public abstract class Person {

    private int id;
    private String fistName;
    private  String lastName;
    private String email;


    public Person(int id , String fistName, String lastName, String email){
        this.id = id;
        this.fistName = fistName;
        this .lastName = lastName;
        this.email = email;
    }

    //Getter
    public int getId() {
        return id;
    }

    public String getfirstName() {
        return fistName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.fistName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void getSummary();

}// end of class
