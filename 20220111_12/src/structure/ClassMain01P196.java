package structure;

public class ClassMain01P196 {
	//PersonClass를 조회할 메서드는 작성할 필요가 없다.
	//이미 PersonClass 내부에 필요한 메서드를 작성해놨기 때문이다.
	
	public static void main(String[] args) {
		//사람을 두 명 만들어보세요(personClass)
		PersonClass p1 = new PersonClass();
		p1.name = "박기도";
		p1.age = 30;
		p1.gender = "남";
		p1.pNum = "01012345678";
		p1.uNum = 1;
		
		PersonClass p2 = new PersonClass();
		p2.name = "박기범";
		p2.age = 28;
		p2.gender = "남";
		p2.pNum = "01012349999";
		p2.uNum = 2;
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		//*힌트 getInfo의 소속은?	
		p1.getInfo();
		System.out.println("=================================");
		p2.getInfo();
	
	
	
	}

	private static void getInfo(PersonClass p2) {
		// TODO Auto-generated method stub
		
	}
}
