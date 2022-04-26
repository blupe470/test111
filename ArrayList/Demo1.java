package ArrayList;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();//等于ArrayList<Object>中间省略了Object
                                       //建议加Object
        list.add("java");
        list.add("wtf");
        list.add("jkl");
        System.out.println(list);

        list.add(0,"插入"); // 指定索引[0]插入 其他元素后退
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>(); //加<Interger>后只能add整型
        list2.add(5);



    }
}
