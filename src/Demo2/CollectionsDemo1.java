package Demo2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/5
 * 一、collections 工具类 常用方法
 * 1、reverse 方法  倒叙排序
 * 2、shuffl 方法，随机排序
 * 3、sort 升序
 * 4、swap 指定元素交换位置
 * 5、返回元素出现的次数
 * 6、复制集合  ,需要指定新集合容量（新数组下标越界）
 * 7、新值替换旧值
 */
public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList(); //
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        for(int i=0;i<arrayList.size();i++){
            System.out.println("第"+(i+1)+"次"+arrayList.get(i));
        }

        //Collections 无法实例化，静态构造方法，源码：抑制默认构造函数，确保不可实例化。
        //1、reverse 方法  倒叙排序
        Collections.reverse(arrayList);

        //2、shuffl 方法，随机排序
        Collections.shuffle(arrayList);

        //3、sort 升序
        Collections.sort(arrayList);
        //4、swap 指定元素交换位置
        Collections.swap(arrayList,1,2);
        //5、  返回元素出现的次数
        int i =Collections.frequency(arrayList,1);
        //6、复制集合  ,需要指定容量
        ArrayList<Integer> a2 =new ArrayList(Arrays.asList(new Integer[arrayList.size()]));// 数组下标越界，可能放不下
        Collections.copy(a2,arrayList);

        for(int n=0;n<a2.size();n++){
            System.out.println("复制后的集合A2 第"+(n+1)+"次"+a2.get(n));
        }
        //7、新值替换旧值
        Collections.replaceAll(a2,1,888);
        for(int n=0;n<a2.size();n++){
            System.out.println("复制后的集合A3 第"+(n+1)+"次"+a2.get(n));
        }
    }
}
