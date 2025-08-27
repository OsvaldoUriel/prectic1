package w3school;

public class Private {
    private String fname = "John";
    private String lname = "Doe";
    private String email = "john@foe.com";
    private int age = 24;

    public static void main(String[] args) {
        Private myObj = new Private();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age );



    }
}
