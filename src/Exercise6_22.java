
public class Exercise6_22 {
	static boolean isNumber(String str) {
		boolean tf = false;
		
		int num = Integer.parseInt(str);
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
	
}
