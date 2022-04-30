package likou;

public class s1 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals(magazine)){
            return true;
        }
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] cnt = new int[26];
        for(char c:magazine.toCharArray()){
            cnt[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            cnt[c-'a']--;
            if(cnt[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}