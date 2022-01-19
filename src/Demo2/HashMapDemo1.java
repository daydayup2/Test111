package Demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/14
 * 1、hashmap api使用
 */
public class HashMapDemo1 {
    public static void main(String[] args) {

        HashMap h1=new HashMap();
        //1、put 添加键值
        h1.put("name","张三") ;
        h1.put("name","李四" );
        h1.put("age","18" );

        //2、清空map
        //h1.clear();

        //3、删除
        //h1.remove("name");

        //4、判断是否包含健
       boolean b1= h1.containsKey("name");
        //5、判断是否包含值
       boolean b2= h1.containsValue("name");

        //6、判断是否是空
        boolean b3= h1.isEmpty();

        //7、获取所有健的集合
        Set s12 =h1.keySet();
        for (Object s1:s12){
            System.out.println(s1);
        }
        //8、获取所有值的集合
        Collection c1 = h1.values();
        Iterator i1= c1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        //8、获取所有健的值
        System.out.println("获取name健的值:"+h1.get("name"));

    }
}
