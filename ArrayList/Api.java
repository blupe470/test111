package ArrayList;
import java.util.ArrayList;

public class Api {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("冲");
        list1.add("asd");
        list1.add("删除专用1");
        list1.add("删除专用2");
//        System.out.println(list1.get(2));//1.获取索引处的元素值[2]

//        System.out.println(list1.size());//2.获取集合大小

//        for (int i = 0; i < list1.size(); i++) {//3.集合遍历
//            System.out.println(list1.get(i));
//        }

        System.out.println(list1.remove(3));//4.删除索引处的元素值并返回该值
        System.out.println(list1);

        System.out.println(list1.remove("删除专用2"));//5.删除特定的元素值，成功返回true，失败返回false
        System.out.println(list1);                     //6.只删除第一次出现的，即一次只删除一个元素

        System.out.println(list1);           //7.修改索引处的元素值
        list1.set(0,"c++");
        System.out.println(list1);
    }
}
