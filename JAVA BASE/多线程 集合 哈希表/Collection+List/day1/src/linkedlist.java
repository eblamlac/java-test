import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("杰克");
        list.add("肉丝");
        list.add("jack");
        list.add("fadad");
        list.add("fada1d");
        System.out.println(list);

        // 测试collection接口和List接口继承过来的共性方法
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.contains("100"));
        System.out.println(list.remove(1));
        System.out.println(list.remove(String.valueOf("jack")));
        System.out.println(list);
        System.out.println();
        // linkedlist的特有方法
        list.addFirst("第一");
        list.addLast("最后");
        System.out.println(list.getFirst());// 获取首元素
        System.out.println(list.getLast());// 获取尾元素
        System.out.println(list.removeFirst());//删除首元素
        System.out.println(list.removeLast());
        // 添加首元素

    }
}
