package Object;

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

            switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Looking forward to the weekend");
        }


        int tem = 37;

        switch (tem){
            case 36: System.out.println("Low");
//            break;
            case 37: System.out.println("Normal");
//            break;
            case 38: System.out.println("High");
//            break;
        }



    }

}
