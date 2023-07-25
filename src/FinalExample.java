import java.security.DomainCombiner;

public class FinalExample {
	static class Alpha {
		final int line;
		int column;
		
		Alpha() {
			line = 10;
			column = 20;
		}
	}
	
	public static void main(String[] args) {
		Alpha a = new Alpha();
//		a.line = 30;
		a.column = 20;
		
	}
}
