package Demo2;

import java.util.LinkedHashMap;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/14
 */
public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> l1=new LinkedHashMap();
        l1.put("key1","v1");
        l1.put("key2","v2");
        l1.put("key3","v3");
        l1.put("key4","v4");

        for (String ii :l1.keySet()){
            System.out.println(ii+l1.get(ii));
        }

    }
}
