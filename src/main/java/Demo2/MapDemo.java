package Demo2;

import java.util.*;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/17
 * 一、集合遍历的五种方法
 * 1、先用迭代器 获取Map.Entry
 * 2、keyset
 * 3、直接 map.vaule 只能获取vaule
 * 4、直接迭代器
 * 5、直接遍历 Map.Entry
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> h1=new HashMap();


        h1.put(null,"张三") ;
        h1.put("name","李四" );
        h1.put("age",null );

        //1、先用迭代器 获取Map.Entry
        Iterator<Map.Entry<String,String>> i1= h1.entrySet().iterator();
        while(i1.hasNext()){
            Map.Entry<String,String>  entry =i1.next();
            System.out.println(entry.getKey()+entry.getValue());

        }
        System.out.println("--------------------");

        //2、keyset
        for (String s1 :h1.keySet()) {
            //8、获取所有健的值
            System.out.println(s1+"："+h1.get(s1));
        }
        System.out.println("--------------------");

        //3、直接迭代器
        Collection c1 = h1.values();
        Iterator i3= c1.iterator();
        while (i3.hasNext()){
            System.out.println(i3.next());

        }

        System.out.println("--------------------");
         //4、直接 map.vaule 只能获取vaule
        for (String s4 :h1.values()) {
            //8、获取所有健的值
            System.out.println(s4);
        }

        //直接通过Map.Entry 获取
        System.out.println("--------------------");
        for (Map.Entry<String,String> entry1 :h1.entrySet()) {
            //8、获取所有健的值
            System.out.println(entry1.getKey()+entry1.getValue());
        }

    }
}
