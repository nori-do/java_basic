package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		//Person을 하나 먼저 생성해주시고, getInfo()로 조회까지 해보세요.
		
		Person p1 = new Person("박기도", 30, 100000, "무역");
	
		p1.getInfo();
		
		// Person을 하나 더 생성해주시고 getInfo()로 조회까지 해보세요.
		Person p2 = new Person("김자바", 20, 50000, "통계학");
		p2.getInfo();
	}
}
