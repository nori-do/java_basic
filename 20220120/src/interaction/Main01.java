package interaction;

public class Main01 {

	public static void main(String[] args) {
		//판매자 하나 생성
		Seller s1 = new Seller(1);
		// 판매자 정보 조회
		s1.showSeller();
		// 구매자 하나 생성
		Buyer b1 = new Buyer(1);
		//구매자 정보 조회
		b1.showBuyer();
		//구매자가 판매자를 지정해 망고 구매
		b1.buyMango(s1, 1);
		//구매 후 판매자 정보 조회
		s1.showSeller();
		//구매 후 구매자 정보 조회
		b1.showBuyer();
	}
}
