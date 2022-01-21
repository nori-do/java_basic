package structure;

public class ClassMain02P196 {

	
	public static void main(String[] args) {
		// 차 2대 생성
		Car c1 = new Car();
		
		c1.model = "ps-1";
		c1.price = 50000000;
		c1.owner = "박기도";
		
		Car c2 = new Car();
		
		c2.model = "as-1";
		c2.price = 100000000;
		c2.owner = "박기범";
		// 콘솔에 정보 조회하기
		
		c1.getInfo();
		System.out.println("==========================================");
		c2.getInfo();
		
	}
}
