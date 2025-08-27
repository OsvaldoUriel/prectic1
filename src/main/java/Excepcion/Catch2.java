package Excepcion;

public class Catch2 {

    public static void main(String[] args) {
    System.out.println("Start of main method");

    try {
        calculate(0);
    }

    catch (ArithmeticException e ){
    System.out.println("Division by 0");
    }

    catch (Exception e){
    System.out.println("Caught some kind of exception");
    }

    System.out.println("End of main method");
    }

    public static void calculate(int n){
        System.out.println("Start of caculate method");
        System.out.println(2/n);
        System.out.println("End of calculate method: " + n);
    }


}