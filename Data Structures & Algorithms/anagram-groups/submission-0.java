class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			int[] count = new int[26];
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < strs[i].length(); j++) {
				char c = strs[i].charAt(j);
				if (c >= 'a' && c <= 'z') {
					count[c - 'a']++;
				}
			}
			for (int p = 0; p < 26; p++) {
				sb.append(count[p]);
				sb.append("#");
			}
			String key = sb.toString();
			if (map.containsKey(key)) {
				map.get(key).add(strs[i]);
			} else {
				ArrayList<String> word = new ArrayList<>();
				word.add(strs[i]);
				map.put(key, word);
			}
		}
		List<List<String>> res = new ArrayList<>(map.values());
		return res;
    }
}
