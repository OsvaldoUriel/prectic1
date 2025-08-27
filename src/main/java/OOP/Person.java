package OOP;

public class Person {
    String name;
    int year;

    Person(String name, int year ){
        this.name = name;
        this.year = year;
    }
    void mostrarInfo(){
        System.out.println("Name: "+ name + "\n" + "Year: " + year);
    }

    public static void main(String[] args) {
    Person person1 = new Person("Ximena", 10);//Object
person1.mostrarInfo();


    }

}
