package inheritance;

//person을 상속해서 Salaryman을 만들어보세요.
// 샐러리맨은 연봉(salary)를 가집니다.
// getSalaryInfo()로 상태를 조회할 수 있습니다.
public class Salartman extends Person{
	// 추가 변수(샐러리맨만 가지는 특성)
	public int salary; //연봉
	
	public void getSalaryInfo() {
		System.out.println("이름은 " + name + 
				", 나이는 " + age +
				", 연봉은 " + salary + "입니다.");
	}
}
