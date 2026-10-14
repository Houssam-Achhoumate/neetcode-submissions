
// import java.util.HashSet;

public class Solution {

	public static boolean hasDuplicate(int[] nums) {
		HashSet<Integer> nv = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
//			boolean n=nv.add(nums[i]);
		    if(!nv.add(nums[i])) {
		    	return true;	
		    }
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 4 };
		System.out.println(hasDuplicate(nums));
	}
}
