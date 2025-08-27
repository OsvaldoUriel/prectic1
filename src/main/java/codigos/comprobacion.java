package codigos;

public class comprobacion {
    public static String string1 = "Amigo";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static <Scanner> void main(String[] args) {



        String same = "Las referencias a las cadenas son iguales";
        String different = "Las referencias a las cadenas son diferentes";
        if ( string1.equals( string2) == ( string2.equals( string3))){
            System.out.println(same);
        }else {
            System.out.println(different);
        }


    }
}






