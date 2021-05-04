import java.util.Arrays;

public class DuplicateZeros {
	
	public static void main(String args[]){
		int nums[]={1,0,2,3,0,4,5,0};
		System.out.println(Arrays.toString(dupicateZero(nums)));;

		
	}

	private static int[] dupicateZero(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 0) {
				for (int j = nums.length - 1; j >= i + 2; j--) {
					nums[j] = nums[j - 1];
				}
				nums[i + 1] = 0;
				i++;

			}

		}
		return nums;
	}	
	
	
	public void duplicateZeros(int[] arr) {

		int[] result = new int[arr.length];
		int lastIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (lastIndex == arr.length) {
				break;
			}
			if (arr[i] == 0) {
				result[lastIndex] = arr[i];
				if (lastIndex == arr.length - 1) {
					break;
				}
				result[lastIndex + 1] = arr[i];
				lastIndex++;
			}
			result[lastIndex] = arr[i];
			lastIndex++;
		}

		for (int i = 0; i < result.length; i++) {
			arr[i] = result[i];
		}

	}

}
