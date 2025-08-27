package OOP;
//Encapsulation
public class Empleado {
    private String name;
    private double salary;

    public Empleado (String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
        else{
    System.out.println("The salary can't be negative");
        }
    }
    public void mostrarInfo(){
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Allison", 2000);
    empleado1.mostrarInfo();

    empleado1.setName("Travis");
    empleado1.setSalary(60000);

    System.out.println("\nAfter the update");
    empleado1.mostrarInfo();

    empleado1.setSalary(-500);
    }

}
