package Excepcion;

public class Division_por_cero {

    public static void main(String[] args) {
        System.out.println("Your attention, please!");
        endTheword();
        System.out.println("The world ended successfully");

    }

    public static void endTheword(){
        System.out.println("We're doing something important");
        doSomeWork(0);
        System.out.println("Everything is working well");

    }

    public static void doSomeWork(int n){
        System.out.println("Nothing terrible will happen: " + n);
        System.out.println(2/n);
        System.out.println("Nothing terrible happened: " + n);

    }

}
