public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
//        for(int i=0;i<magazine.length();i++){
//            for(int j=0;j<ransomNote.length();j++){
//
//            }
//        }
//    }
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
