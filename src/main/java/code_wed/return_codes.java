package code_wed;

public class return_codes {
    static int heart(int x){

return 5 + x;
    }
    static int mylife(int x, int y){
        return x * y;
    }
    static int Arizmendi(int x, int y){


        return x / y;
    }
static String pao(){

        return "I want stay together to you";
    }
    static String can(String history){
      /* String a = "Stupid" + " "+ history + " " + "love";
        return a; //tambien se puede de este modo*/
        return "Stupid" + " "+ history + " " + "love";
    }
    static String why (String tex1, String tex2, String tex3){return tex1 + " " + tex2 + " " + tex3;}




    public static void main(String[] args) {
        int z =Arizmendi(10,3);
        String mesaje = pao();
        String can = can("historia");//
        System.out.println(heart(3));
        System.out.println(mylife(5, 3));
        System.out.println(z);
        System.out.println(mesaje);
        System.out.println(can);
// System.out.println(why("I" + ""));
    String a = why("I","need", "it" );
    }
}
