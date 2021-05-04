
public class EvenNumberofDigits {
	public static void main(String args[]){
		
		int[] nums={12,345,2,6,7896};
		
		System.out.println(evenNumberofDigits(nums));
	}

	private static int evenNumberofDigits(int[] nums) {
		int count=0;
		for (int n : nums) {
			int noofdigits = 0;
			while (n > 0) {
				n = n / 10;
				noofdigits++;
			}
			if(noofdigits%2==0)
				count++;
		}
		
		return count;
	}
}
