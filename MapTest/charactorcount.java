package MapTest;

import java.util.HashMap;
import java.util.Set;

public class charactorcount {
    public static void main(String[] args) {
        //1.字符串
        String str = "*Constructs a new <tt>HashMap</tt> ⼩滴课堂 with the same mappings as the * ⼩滴课堂 specified <tt>Map</tt>. The <tt>HashMap</tt> is created with default load factor (0.75) and an initial capacity sufficient to*hold the mappings in the specified<tt>Map</tt>.";
        //2.把字符串转化为数组
        char[] charArray = str.toCharArray();
        //3.新建一个hashmap，用来存放数组中遍历的字符和相应的次数
        HashMap<Character, Integer> hashmap = new HashMap<>();
        //4.遍历数组，拿到每一个字符，如果数组中的值没有统计过，就计1，如果数组中的值被计入过key，那么在原来基础上+1
        for (int i=0; i<charArray.length;i++) {
            Integer value = hashmap.get(charArray[i]);
            if (value == null) {

                hashmap.put(charArray[i],1);
            } else {
                value = value + 1;
                hashmap.put(charArray[i],value);
            }
        }
        //5.遍历map，输出map中的字符和相应次数
        Set<HashMap.Entry<Character, Integer>> entrySet = hashmap.entrySet();
        for (HashMap.Entry<Character, Integer> entry : entrySet) {
            System.out.println("key=" + entry.getKey() + "value=" + entry.getValue());
        }

    }
}
