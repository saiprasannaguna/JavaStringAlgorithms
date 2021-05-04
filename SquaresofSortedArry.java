public class SquaresofSortedArry {
	public static void main(String args[]){
	int[] nums={-4,-1,0,3,10};
	
	for( int n:squaresofSortedArray(nums)) {
		System.out.println(n);
	}
}

	private static int[] squaresofSortedArray(int[] nums) {
		int l = 0;
    int r = nums.length - 1;
    int[] ans = new int[nums.length];
    for (int i = nums.length - 1; i >= 0; i--) {
        int sqL = nums[l] * nums[l];
        int sqR = nums[r] * nums[r];
        if (sqL < sqR) {
            ans[i] = sqR;
            r--;
        } else {
            ans[i] = sqL;
            l++;
        }
    }
    return ans;
}}

/*
 * itr1
 * 
 * 16
 * 100
 * 
 * 16<100
 * 
 * 100,
 * 
 * itr1
 2
 * 
 * 
 * 
 * 
 * 
 */

