package ARRAYS;

public class Arraya {
    public static void main(String[] args) {
        int [] myArray = {1, 5, 10, 15, 20};
int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
System.out.println("This is the sum of myArray: " + sum);

    }

    public static class array2 {
    public static  int[][] MULRIPLICATION_TABLE;

        public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        public static int[] resultArray ;
        public static void main(String[] args) {


            int[] numeros = new int[5];
    int[] numerodos = {1, 2, 3, 4, 5, };//0 1 2 3 4
        System.out.println(numerodos.length);
         for (int i = 0; i < numerodos.length;i++){
             System.out.println("Elementos en inidce" + i+ ":" + numerodos[i]);
         }
         System.out.println("♦♦♦♦♦╝♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");

                resultArray = new int [firstArray.length + secondArray.length];
                for(int i = 0; i < firstArray.length; i++){
                    resultArray[i] = firstArray[i];
                }
                for(int i =0 ; i < secondArray.length; i++){
                    resultArray[i + firstArray.length] = secondArray[i];
                }

                for (int i = 0; i < resultArray.length; i++) {
                    System.out.print(resultArray[i] + ", ");
                }
                System.out.println(" ");
                System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");// alt + 3
    //int b = 110;
    int[] a = new int[10];
                a[2] = 9;
                a[7] = 4;
                int[]  b = a;
    a[9] = b[2] + a[7];
    for (int i = 0; i < a[7]; i++){
        System.out.println(a[i]);
    }// 5 6 7 71 9 19
              System.out.println("♣○♂♂♂♂♂♂♂♠");
      /*          Scanner con = new Scanner(System.in);
            int n = con.nextInt();
            int[] array = new int[n];

            for(int i = 0; i < n; i++){
                array[i] = con.nextInt();
            }
            if(n % 2 == 0){
                for( int i = array.length -1; i >= 0; i--){
                    System.out.println(array[i]);
                }
            }else {
                for (int i = 0 ; i < array.length; i++){
                    System.out.println(array[i]);
                }
            }*/
            System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");
            int x = 10;
            int y = 10;
            MULRIPLICATION_TABLE = new int [x][y];
            for(int i = 1; i<= 10; i++){
                for(int j = 1; j <= 10; j++){
                    MULRIPLICATION_TABLE[i - 1][ j - 1 ] = i*j;
                System.out.print(MULRIPLICATION_TABLE[i - 1][j-1]);
                System.out.println(" ");
                }
            System.out.println();
            }
    System.out.println("☺♠►►♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
    int [][] matrix = {
     {1, 2, 3, 4, 5, },
            {5, 4, 3, 2, 1 }
            };
    int[] tmp = matrix[0];
    matrix[0] = matrix[1];
    matrix[1] = tmp;
    System.out.println(matrix[1]);
    System.out.println("");



        }
    }//leught es para saber la cantidad del array
}
