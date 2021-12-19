import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner b = new Scanner(System.in);
        String input = b.nextLine();
        // 根据下标获取对应的字符
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            // 统计出现的每个字符串的个数 存起来存map里
            Integer value = map.get(key);
            if (value == null) {
                map.put(key, 1);
            } else {
                map.put(key, value + 1);
            }

        }
        System.out.println(map);
        b.close();

    }
}
