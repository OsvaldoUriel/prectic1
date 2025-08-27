package Static;

public class ParentClass {
    static {
        System.out.println("Static Block #1 of the parent class.");
    }
    public static String parentStatic = setParentStatic();
static {
    System.out.println("Static Block #2 of the parent class.");
}
{
    System.out.println("Initialization Block #1 of the parent class.");
}
public String parentNonStatic = setParentNonStatic();
    {
        System.out.println("Initialization Block #2 of the parent class.");
    }
public ParentClass(){
    System.out.println("Constructor of the parent class.");
}
private String setParentNonStatic(){
    System.out.println("Non-static field of the parent class.");
return "parentNonStatic";
}
private static String setParentStatic(){
    System.out.println("Static field if the parent class.");
return "parentStatic";
}
public String setChildNonStatic1(){
    System.out.println("Non-static field of the child class #1.");
return "childNonStatic2" + parentNonStatic;
}




}
