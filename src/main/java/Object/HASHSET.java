package Object;

import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Hallo");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Ciao");
        set.add("Namaste");

        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            String str = it.next();
            System.out.println(str);
        }
    }
}
