package Static;

public class MyClass {
    static {
        System.out.println("Stactic Block #1.");
    }

    public static String staticField = setStaticField();

    public MyClass(){
        System.out.println("constructor.");
    }

    static {
        System.out.println("Static Block #2.");
    }
    {
        System.out.println("Initialization Block #1.");
    }
    public String nonStaticField = setNonStaticField();{
        System.out.println("Initialization Block #2");
    }

    private String setNonStaticField(){
        System.out.println("Non-static field.");
return "staticField";
    }

    private static String setStaticField(){
        System.out.println("#Static field.");
return "staticField";
    }
    public static void print(){
        System.out.println("print() method.");

    }
}
