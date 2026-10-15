class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int fr = map.get(nums[i]);
				fr++;
				map.put(nums[i], fr);
			} else {
				map.put(nums[i], 1);
			}

		}
		int[] oc = new int[k];
		int count = 0;
		
		for (int key: map.keySet()) {
			if (count < k) {
				oc[count] = key;
				count++;
			} else {
				int minIndex=0;
				int min = map.get(oc[0]);
				for(int j =0;j<k;j++) {
					if(map.get(oc[j])<min) {
						min = map.get(oc[j]);
						minIndex=j;
					}
				}
				if(map.get(key)>min){
					oc[minIndex]=key;
				}
			}
		}
		return oc;
	}
    }

