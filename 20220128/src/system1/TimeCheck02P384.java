package system1;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		//try~catch구문의 소요시간을 구해주세요.
		//내부에는 여러분들이 원하는 속성의 예외를 발생시키세요.
		//throw로 발생시키면 됩니다.
		//시작 : start 끝 end 
		/*long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		
		try {
			//try 영역에 예외가 발생할 가능성이 있는 구문을 전부 때려넣습니다.
			System.out.println("실행시작!");
			System.out.println(start);//예외가 날 가능성이 존재하는 핵심 구문
			System.out.println("계산 끝!");
		}catch(Exception e) {
			System.out.println("오류가 발생하였습니다.");
		}finally {
			//끝나는지점
			long end = System.currentTimeMillis();
			System.out.println("수행시간: " + (end - start) + " ms");
		}
	}*/
	//시작시간 측정
		long start = System.currentTimeMillis();
		System.out.println("시작 시간 : " + start);
		try {
			throw new ArithmeticException();
		}catch(Exception e){
			e.printStackTrace();
		}
		//끝나는 시간 측정
		long end = System.currentTimeMillis();
		System.out.println("끝나는 시간 : " + end);
		System.out.println("소요시간 : " + (end = start));
	}
}
