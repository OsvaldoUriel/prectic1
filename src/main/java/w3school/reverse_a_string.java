package w3school;

public class reverse_a_string {
    public static void main(String[] args) {
        String original = "Hello";
        String reverse = "";

    for(int i = 0; i < original.length(); i++ )
        reverse = original.charAt(i) + reverse;
    System.out.println("Reversed string: " + reverse);
    }
}
