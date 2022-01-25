package Demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/17
 *
 * 1、hashmap 键值 可以为空
 * 2、hashtable键值 不能为空
 */
public class HashTableDemo1 {
    public static void main(String[] args) {
        HashMap<String,String> h1=new HashMap();
        Hashtable<String,String> h2=new Hashtable();
        //1、put 添加键值
        h1.put(null,"张三") ;
        h1.put("name","李四" );
        h1.put("age",null );


        for (String s1 :h1.keySet()) {
            //8、获取所有健的值
            System.out.println(s1+"："+h1.get(s1));
        }


    }
}
