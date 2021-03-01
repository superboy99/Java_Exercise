package Basic_01.Collection;

/*
    通过List集合的listIterator()方法得到，所以说它是List集合特有的迭代器
    用于允许程序员沿任一方向遍历的列表迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
