public class Main {
    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] charCount = new int[26]; 
        for (char c : str1.toCharArray()) {
            charCount[c - 'A']++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c - 'A']--;
            if (charCount[c - 'A'] < 0) return false;
        }

        return true; // All counts should be zero if they are anagrams
    }

    public static void main(String[] args) {
        System.out.println(checkAnagrams("INTEGER", "TEGERNI"));
    }
}
