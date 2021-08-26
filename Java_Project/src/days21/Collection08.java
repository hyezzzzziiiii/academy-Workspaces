package days21;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Collection08 {

	public static void main(String[] args) {
		// 로또 번호를 저장하기 위해서 HashSet클래스를 활용하는 예제
		// (중복을 허용하지 않는 특징을 활용)
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size()<6) {
			int temp = (int) (Math.random()*45 + 1);			
			// Math.random() :소수점 아래에서 랜덤한 숫자를 발행(0.456789456)
			// 45를 곱하면 소수점 위로 0~44 사이의 숫자가 올라옵니다.
			// 1을 더해서 1~45를 만들고 소수점 아래를 인트로 잘라냅니다.
			lotto.add(temp);
			
		}

		// Hashset 타입의 객체 내부를 순화하는 방법
		// 1. Iterator 객체를 사용하는 방법 // 방문자라고 할 수 있음
		// - Iterator객체는 컬렉션 내부의 데이터를 순회할 수 있는 객체
		Iterator <Integer> iter = lotto.iterator();
		while(iter.hasNext()) System.out.printf("%d ", iter.next()); //**
		// hasNext는 아직 값을 구하는 것은 아니고 next를 통해 값을 구함
		// 제어권을 넘겨받아서 위와 같이 한번 리스트를 모두 순회하면,
		// iter = lotto.iterator();를 통해서 다시 방문 필요할 떄 제어건을 다시 얻어내야합니다.
		
	   System.out.println();
	   // 2. for문을 사용하는 방법(개선된 형태)
	   // - for (자료형 변수명 : 순회할 수 있는 타입(배열, 컬렉션)
	   // 배열/ 컬렉션으로부터 추출한 변수를 사용하는 코드
	   for(Integer i : lotto) System.out.printf("%d ", i);
	   // Integer i 부분 : 오른쪽 배열이나 리스트의 아이템 하나를 저장할 변수 선언
	   // lotto 부분 : 왼쪽 변수에 차례를 하나씩 전달해 줄 수 있는 아이템을 보유한 컬렉션 또는 배열
	   // 오른쪽 리스트 또는 배열의 값을 차례로 하나씩 왼쪽 변수에 값을 전달하면서 1회의 반복실행을 진행합니다
	   System.out.println();
	   
	   // 해쉬세트 컬렉션에는 sort메서드가 없음 따라서 링크드 리스트
	   // 부모클래스인 List클래스에 전해줘서 리스트 변환과정을 거치고, 
	   // Collections.sort 로 정렬을 수행하여야합니다.
	   List list  = new LinkedList(lotto);
	   Collections.sort(list);
	   System.out.println(list);
	   
	   
	}

}
