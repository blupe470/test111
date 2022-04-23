package string;

import java.util.Random;

public class yanzhenma {
    public static void main(String[] args) {
        String datas="qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM0123456789";
        Random r=new Random();
        String data = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(datas.length());
            char c =datas.charAt(index);
            data += c;
        }
        System.out.println(data);
    }
}
