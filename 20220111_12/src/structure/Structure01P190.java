package structure;

public class Structure01P190 {

	public static void main(String[] args) {
		

	
		Person p1 = new Person();
		
		p1.name = "박기도";
		p1.age = 20;
		p1.pNum = "01012345678";
		p1.uNum = 32;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.pNum);
		System.out.println(p1.uNum);
		
		Person p2 = new Person();
		
		p2.name = "박기도2";
		p2.age = 22;
		p2.pNum = "01099998888";
		p2.uNum = 23;
		System.out.println(p2.name + "의 정보입니다.");
		System.out.println("이름 " + p2.name + ", 나이 : " + p2.age + ", 연락처 : " + p2.pNum + ", 번호 : " + p2.uNum);
	}
}
