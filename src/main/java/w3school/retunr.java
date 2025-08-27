package w3school;

public class retunr {
    static int method (int x){
        return 5 + x ;
    }
 static int Method(int x, int y){
return x + y;
}
static String Music(){
        return "Black Bleatles";
}
static String music(){
        String a = "Honest";
        return a;
}
static String cantante(String autor) {
return "Honest" + " " +  autor;
    }
    static String superman( String text1, String text2, String text3){

        return text1 +" " + text2 + " " + text3;}


    public static void main(String[] args) {
      String cancion = Music();
      String cancion2 = music();
      String autor = cantante("Baby Keen");
        System.out.println(method(3));
System.out.println(Method(15, 10));
System.out.println(cancion);
System.out.println(cancion2);
System.out.println(autor);
System.out.println(superman("Eminem", "y", "Dina Rae"));


    }

}
