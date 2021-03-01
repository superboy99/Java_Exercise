package Basic_01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();

        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaee");

        //Iterator<E> iterator():返回此集合中的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();

        //用while循环改进元素的判断和获取
        //next 返回迭代中的下一个元素
        //hasNext 如果迭代具有更多元素，则返回true
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
