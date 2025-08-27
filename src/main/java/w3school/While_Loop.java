package w3school;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String a = "Hola";
    while(i < 10){
        System.out.println(a);
    i++;
    }
    int countdown = 3;
    while(countdown > 0){
System.out.println(countdown);
countdown--;
    }
System.out.println("Happy New Year!!");

    int dice = 1;
    while(dice <= 6){
if(dice < 6) {
    System.out.println("No Yatzy");
}else{
    System.out.println("Yatzy");
}dice = dice + 1;

    }


    }
}
