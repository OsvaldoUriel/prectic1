package ARRAYS;

public class ExamplesArrays {
    public static void main(String[] args) {

        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
System.out.println("------------");

        int [] matriz = new int[10];
        for (int i = 0; i < 10; i++) {
            matriz[i] = i;
        }
        for (int i : matriz) {
            System.out.print(i);
        }




    }
}
