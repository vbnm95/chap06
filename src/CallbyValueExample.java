
public class CallbyValueExample {
	
	static void process(int num) {
		num = num + 10;
		System.out.println("num =" + num);
	}
	
	static void process(String str) {
		str = str.replace("A", "Z");
		System.out.println("str =" + str);
	}
	
	static void process(int[] nums) {
		nums[0] = 900;
		nums[1] = 800;
		for(int n : nums) {
			System.out.printf("%d\n", n);
		}
	}
	
	
	// Call by value
	public static void main(String[] args) {
		int num = 10;
		String str = new String("ABC");
		int[] nums = {10, 9, 8};
		
		process(num);
		process(str);
		process(nums);
		
		System.out.println("num main="+num);
		System.out.println("str main="+str);
		System.out.println("nums main="+nums);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
