package likou;

public class sujinxin {
    public static void main(String[] args) {
       String a="abcdefg";
       String b="yuyegf";

       char[] cnt = new char[26];
       for(char c:a.toCharArray()){
           cnt[c-'a']++;
       }
       int flag=0;
       for (char c:b.toCharArray()){
           cnt[c-'a']--;
           if (cnt[c-'a']<0){
               flag++;
           }
       }
       if(flag>0){
           System.out.println("flase");
       }
       else{
           System.out.println("true");
       }
        if(a.equals(b)){
            System.out.println("111");
        }
    }
}
