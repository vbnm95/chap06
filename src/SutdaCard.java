
public class SutdaCard {
	int num;
	boolean isKwang; //1, 3, 8, 11, 12
	
	public SutdaCard() {
		this.num = 1;
		this.isKwang = true;
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		if(isKwang == true) {
			return String.format("%dk", num);
		} else {
			return String.format("%d", num);
		}
	}
	
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}
}
