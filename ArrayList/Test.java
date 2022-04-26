package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentList =new ArrayList<>();
        studentList.add(new Student("20210010101","特朗普",3));
        studentList.add(new Student("20210010102","美稀宗",78));
        studentList.add(new Student("20210010103","小约翰",19));

        for (int i = 0; i < studentList.size(); i++) {
            Student s=studentList.get(i);
            System.out.println(s.getStudentNum()+"\t"+s.getName()+"\t"+s.getAge());
        }
        System.out.println("--------------------------------------");

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入学号进行查询：");
            String studyNumer=sc.next();
            Student s=getStudentById(studentList,studyNumer);
            if(s==null){
                System.out.println("查无此人");
            }else {
                System.out.println("查询信息如下");
                System.out.println(s.getStudentNum()+"\t"+s.getName()+"\t"+s.getAge());
            }
        }
    }
          // 下面方法的注释  解释方法的形参和返回值  敲/** 后直接回车
    /**
     * 根据学号查询学生对象并返回
     * @param students  存储全部学生的集合
     * @param studentNum   搜索的学生学号
     * @return  学生对象 || null
     */
    public static Student getStudentById(ArrayList<Student> students,String studentNum){
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            if (s.getStudentNum().equals(studentNum)){
                return s;
            }
        }
        //查无此人
        return null;
    }
}
