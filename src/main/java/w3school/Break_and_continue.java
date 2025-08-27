package w3school;

public class Break_and_continue {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
System.out.println("🎈");

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        if (x == 4)
        break;
        }
System.out.println("\uD83C\uDF82");

        for(int i = 0; i < 10; i++) {
            if (i <= 4) {
                continue;
            }
            System.out.println(i);
        }
System.out.println("\uD83C\uDF81");

        while (x < 10){
            if(x >= 4){
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        }


    }
}
