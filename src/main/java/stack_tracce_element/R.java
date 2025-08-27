package stack_tracce_element;

public class R {

    public static void main(String[] args) {
        test();
    }

public static void test(){
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

    for (var o : methods) {
        System.out.println(o);
    }

}


}
