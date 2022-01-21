package structure;

public class Structure03P190 {

	public static void getInfo(Cat c) {
		System.out.println(c.name + "의 정보입니다.");
		 System.out.println("이름 : " + c.name + ", 나이 :" + c.age + ", 색 : " + c.color);
	}
	public static void main(String[] args) {
		
		Cat a = new Cat();
		
		a.name = "네로";
		a.age = 1;
		a.color = "검은색";
		
		Cat b = new Cat();
		
		b.name = "시로";
		b.age = 5;
		b.color = "흰색";
	
		getInfo(a);
		System.out.println("-----------------");
		getInfo(b);
	}
	
}
