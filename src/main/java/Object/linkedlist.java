package Object;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mazda");
        cars.add(1, "vocho");

        cars.addFirst("Volvo");
        cars.addLast("Mercedes");
//        cars.removeFirst();
        System.out.println(cars);
        System.out.println(cars.getLast());


    }
}
