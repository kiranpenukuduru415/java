class Array {
	public static void main(String[] args) {

		int[] nums = new int[] { 20, 30, 50, 70, 40 };

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ,");
		}
		System.out.println();

		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ,");
		}
	}
}