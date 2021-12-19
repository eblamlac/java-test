import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List1 {

    // 这个类用来测试List接口
    public static void main(String[] args) {
        // 创建List接口对象
        List<String> list = new ArrayList();
        // 继承自Collection接口的方法
        list.add("TOM");
        list.add("COM");
        list.add("DOM");

        list.clear();// 清空集合

        System.out.println(list);
        list.add(0, "caixukun");// 在指定索引添加指定的元素
        list.add(1, "蔡徐坤");
        list.add(2, "是傻逼");
        // 常用方法
        System.out.println(list.contains("caixukun"));
        System.out.println(list.equals("蔡徐坤"));

        System.out.println(list.get(2));
        System.out.println(list.hashCode());
        System.out.println(list.indexOf("是傻逼")); // 获取指定元素第一次出现的下标值
        System.out.println(list.lastIndexOf("蔡徐坤"));// 获取指定元素最后一次出现的下表位置
        System.out.println(list.remove(1));
        System.out.println(list.set(0, "xiongda"));// 置换元素

        List<String> subList = list.subList(0, 2);// 截取子List
        System.out.println(subList);
        System.out.println(Arrays.toString(list.toArray()));

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        System.out.println(list.addAll(list2));// 把list2加到list中
        System.out.println(list.addAll(1, list2));// 在指定下标处添加元素
        System.out.println(list.contains(list2));// 是否包含list2
        System.out.println(list.remove(list2));// 删除list2
        System.out.println(list.retainAll(list2));// 删除list
        // 集合的迭代方法Interator()
        // List集合的迭代方式有多种

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);// 根据小标获取元素
            System.out.println(s);
        }
        // 方式2 普通for循环遍历的效率底 可以用foreach提高
        // for(1 2:3){} 1是遍历得到的数据类型 2是变量名 3是遍历得到的数据
        for (String str : list) {
            System.out.println(str);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strs = it.next();
            System.out.println(strs);
        }

        // 方法4 listItrator()是List接口特有方法
        // Iterator<E> Iterator()--父接口--hasNext --next() --remove
        // ListIterator<E> 子接口，拥有父接口的方法。也有自己特有的方法(逆向迭代)
        // public interface ListIterator<E> extends Iterator<E>
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()) {
            String s = it2.next();
            System.out.println(s);
        }

    }
    //总结:方法3和方法4有什么区别 --一个是符接口 一个是子接口 子接口拥有父接口的所有方法也有自己的特有方法
    //子接口的特有方法就是向前/逆向遍历
}
