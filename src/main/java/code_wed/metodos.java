package code_wed;

public class metodos {
     static void myMethod(){
System.out.println("La planta de la banda \"caos\"");
     }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        metodo("Romina");
        metodo("Katia");
        metodo("Azalia");
    metodos("Romina", 15);
    metodos("Amayrani", 16);
    metodos("Elisa", 12);

     }

    static void metodo(String fname){
      System.out.println(fname + " Refsnes");
    }

    static void metodos (String name,  int age){
System.out.println(name + "is" + age);
    }
        }