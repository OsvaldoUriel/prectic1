package Integer;

import java.util.ArrayList;

public class objectmini {
    public static void main(String[] args) {
        Object[] objects = {10, "Hello", 3.14};
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof String){
                String s = (String )objects[i];
                System.out.println(s);
            }
        }
        ArrayList number = new ArrayList();
        for (int i = 0; i < 10; i++)
            number.add(i*10);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + (Integer) number.get(i);
        }
        System.out.println(sum);

        ArrayList number2 = new ArrayList();
        for (int i = 0; i < 10; i++)
            number2.add(i * 2.5);
        int sum1 = 0;
        for (int i = 0; i < 10; i++) {
            sum1 = sum1 + (Integer) number2.get(i);
        }
        System.out.println(sum1);
ArrayList<Integer> one = new ArrayList<Integer>();
one.add(2);
one.add(1);
    }
}
