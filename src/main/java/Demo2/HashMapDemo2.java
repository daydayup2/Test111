package Demo2;

import java.util.HashMap;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/14
 *
 * 1、hashmap 线程不安全
 * 还没写
 */
public class HashMapDemo2 {
    public static void main(String[] args) {

        HashMap h1=new HashMap();
        //1、put 添加键值
        h1.put(null,"张三") ;
        h1.put("name","李四" );
        h1.put("age",null );

    }
}
