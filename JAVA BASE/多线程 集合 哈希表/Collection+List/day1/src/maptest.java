
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class maptest {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        // Map中的数据要符合映射规则 需要同时指定K和V的数据类型 到底指定成什么类型就看你到底需要什么
        // 常用方法
        map.put(990, "fox");
        map.put(991, "fox1");
        map.put(992, "fox2");
        map.put(993, "fox3");
        System.out.println(map.get(993));
        System.out.println(map.containsKey(993));
        System.out.println(map.containsValue("fox1"));
        System.out.println(map.equals("fox3"));
        System.out.println(map.isEmpty());
        System.out.println(map.remove(992));
        System.out.println(map.replace(992, "nani"));
        System.out.println(map.size());
        System.out.println(map.hashCode());
        Collection<String> vs = map.values();
        System.out.println(vs);

        // 遍历map中的数据,需要把mao集合转成Set集合
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + value);
        }

        Set<Entry<Integer, String>> set = map.entrySet();

        Iterator<Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()) {
            Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
    }

}
