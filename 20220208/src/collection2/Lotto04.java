package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto04 {
	public static void main(String[] args) {
		List<Integer> lotto =new ArrayList<>();
		List<Integer> lotto1 =new ArrayList<>();
		
		int getNum = 0;
		int getNum1 = 0;
		int count = 0;
		
		while(lotto.size() != 6) {
			getNum = (int)(Math.random()*45)+1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}Collections.sort(lotto);
			while(!lotto.equals(lotto1)) {
				lotto1.clear();
				count++;
				while(lotto1.size() != 6) {
					getNum1 = (int)(Math.random()*45)+1;
					if(!lotto1.contains(getNum1)) {
						lotto1.add(getNum1);
					}
				}Collections.sort(lotto1);
				System.out.println(""+lotto+lotto1);
				if(lotto.contains(lotto1)) {
					break;
				}
			}
			System.out.println("구매한 로또 복권의 개수 : " + count);
		}
	}
