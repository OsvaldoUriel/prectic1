package Object;

import java.util.HashMap;

public class HASHMAP {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Eli", 21);
        map.put("David", 18);
        map.put("Lil", 22);
        map.put("Lamar", null);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
        System.out.println(key + "-->" + value);
        }


    }
}
