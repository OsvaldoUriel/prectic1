package code_more_complet;

public class word_clue_this {
    public int count =0;
    public int sum = 0;

    public void add(int data){
int sum = data * 2;
this.sum = this.sum + data;
count++;
        System.out.println(this.sum);

    }
    public static int count2 =0;
    public static int sum2 = 0;

    public void add2(int data2){
        int sum = data2 * 2;
       word_clue_this.sum2 = word_clue_this.sum2 + data2;
       count2++;
    }
    public static void main(String[] args) {

     int a = 0;
    for(int i = 0; i < 10; i++){
        System.out.print(i + ",");
    }
    System.out.println("end");

    for(int i = 0; i < 10; i++){
    System.out.print(i + ",");
    }
    System.out.println("end");
}




}
