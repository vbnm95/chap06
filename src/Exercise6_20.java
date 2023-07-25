
public class Exercise6_20 {
	
	static int[] shuffle(int[] arr) {
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			while(true) {
				int k = (int)(Math.random()*arr.length);
				if(arr2[k] == 0) {
					arr2[k] = arr[i];
					break;
				} else {
					continue;
				}
			}
		}
		
		return arr2;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}
}
