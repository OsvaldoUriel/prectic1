package Static;

public class ChildClass extends ParentClass{
    static{
        System.out.println("Static Block #1 of the child class.");
    }
    public static String childStatic = setChildStatic();

    static {
        System.out.println("Static Block #2 of the child class.");
    }
    public String childNonStatic1 = setChildNonStatic1();
    {
        System.out.println("Initialization Block #1 of the child class.");
    }
    public String childNonStatic2 = setChildNonStatic2();

    {
        System.out.println("Initialization Block #22 of the child class.");
    }
    public ChildClass(){
        System.out.println("Constructor of the child class.");
    }
    private String setChildNonStatic2(){
        System.out.println("Non.static field of the child class #22.");
return "childNonStatic";
    }

    private static String setChildStatic(){
        System.out.println("Static field oof thee child class.");
return "childStatic";
    }

}