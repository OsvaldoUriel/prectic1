package w3school;

import java.util.Scanner;

public class Parameters {
    static void myMethod(String fname){
System.out.println(fname + " Refsnes");
    }
static void myMehotd2(String name, int age){
System.out.println(name + " is " + age + " años");
}
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        myMethod("Ximena");
        myMethod("Darling");
        myMethod("Allison");
        myMehotd2("Xime", 9);
        myMehotd2("Romina",15);
        myMehotd2("Elisa",12);
checkAgge(con.nextInt());
    }

    static void checkAgge(int age){
if (age < 18){
    System.out.println("Access denied - You're not old enough!");
}else{
System.out.println("Access granted - You're old enough!");
}

    }
}
