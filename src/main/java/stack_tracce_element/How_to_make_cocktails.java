package stack_tracce_element;

public class How_to_make_cocktails {
    public static final String OUTPUT_FORMAT = "El método %s fue llamado en la línea %d de la %s clase en el archivo %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement element : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, element.getMethodName(), element.getLineNumber(), element.getClassName(),
                    element.getFileName());
        }


    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
