package code_more_complet;

public class Analizando_matricces {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("In the array: ");
        printArray(array);
        System.out.println("Minimum: " + getMinValue(array));
        System.out.println("Maximum: " + getMaxValue(array));

    }

    static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
}


    public static  int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥");
    }

    public int count =  0;
    public int sum = 0;
    public void add(int data){//este data es diferente al data de abajo pero comparten los mismos valorres
        sum = sum + data;
    count++;
    }
    public void remove(int data){//este data es diferente al data de arriba, comparte los mismo valores
        sum = sum - data;
        count--;
    }



}
