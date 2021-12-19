import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {
        // 这个类用来测试ArrayLisy
        // 1创建对象 使用了无参构造底层会自动为你创建数组存对象并且数据的初始容量是10

        ArrayList<Integer> list = new ArrayList<Integer>();

        // 常用方法
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list.size());// 查看大小
        System.out.println(list.contains(100));// 是否包含
        System.out.println(list.lastIndexOf(200));// 获取指定元素最后一次出现的下标
        System.out.println(list.remove(1));// 删除下标为1的元素
        System.out.println(list.remove(Integer.valueOf("400")));
        System.out.println(list.set(2, 1000));// 置换元素
        System.out.println(list.indexOf(200));// 查看指定元素第一次出现的下标
        System.out.println(list.get(0)); // 获取指定下标的元素
        Object[] os = list.toArray();// 集合转成数组
        System.out.println(Arrays.toString(os));

        // 4种方法来迭代Arraylist
        for (int i = 0; i < list.size(); i++) {
            Integer in = list.get(i);
            System.out.println(in);
        }
        for(Integer a:list){
            System.out.println(a);
        }
        Iterator in = list.iterator();
        while (in.hasNext()) {
            System.out.println(in.next());
        }
        ListIterator in1 = list.listIterator();
        while (in1.hasNext()) {
            System.out.println(in1.next());
        }
     

    }
       
}
