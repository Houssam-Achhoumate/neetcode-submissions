class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a'&&c<='z') {
				count[c-'a']++;
			}
		}
		int[] count2 = new int[26];
		for(int i = 0;i<t.length();i++) {
			char c = t.charAt(i);
			if(c>='a'&&c<='z') {
				count2[c-'a']++;
			}
		}
		if(Arrays.equals(count, count2)) {
			return true;
		}
		return false;

    }
}
