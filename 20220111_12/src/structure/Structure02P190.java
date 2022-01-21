package structure;

public class Structure02P190 {

	// Person 내부의 정볼르 쉽게 조회하기 위한 메서드 생성
	 public static void getInfo(Person p) {
		 System.out.println(p.name + "의 정보입니다.");
		 System.out.println("이름 : " + p.name + ", 나이 :" + p.age + ", 연락처 : " + p.pNum + ", 번호 :" + p.uNum);
		 
	 }
	 public static void main(String[] args) {
		// 사람을 두 명 만들어보세요.(a, b)
		 	Person a = new Person();
		 	a.name = "비타민";
			a.age = 17;
			a.pNum = "01012344321";
			a.uNum = 20;
		 
			Person b = new Person();
			b.name = "미네랄";
			b.age = 28;
			b.pNum = "01067899876";
			b.uNum = 21;
			
			getInfo(a);
			System.out.println("--------------------");
			getInfo(b);
	}
}
