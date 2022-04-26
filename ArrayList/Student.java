package ArrayList;

public class Student {
    private String studentNum;
    private String name;
    private int age;

    public Student(String s, String 小约翰, int i){

    }

    public Student(String studentNum, String name, int age,String tech) {
        this.studentNum = studentNum;
        this.name = name;
        this.age = age;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }
}
