package overloading;

public class Main02 {
	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해주시고
		// 다른 하나는 입력 없이 생성해주세요.
		
		Parttimer p1 = new Parttimer(true,15000,"도미노피자","박기도");
		System.out.println("---------------------------------------------------------");
		Parttimer p2 = new Parttimer(true,"롯데리아","김자바");
		System.out.println("---------------------------------------------------------");
		//시급 5000원을 넣고 파트타이머를 만들어보세요.
		Parttimer p3 = new Parttimer(false,1000,"미스터피자","이코딩");
	}
}
