package Integer;

public class Character {
    public static void main(String[] args) {
        String string = "I think this will be a new feature. " +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if(java.lang.Character.isDigit(string.charAt(i))){
                countDigits++;
            }
        }
        return countDigits;

    }

    public static int countLetters(String string) {
        int countLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (java.lang.Character.isLetter(string.charAt(i))){
                countLetters++;
            }
        }
        return countLetters;
    }

    public static int countSpaces(String string) {
        int countSpace = 0;
        for (int i = 0; i < string.length(); i++) {
            if (java.lang.Character.isSpace(string.charAt(i))){
                countSpace++;
            }
        }
        return countSpace;
    }


}
