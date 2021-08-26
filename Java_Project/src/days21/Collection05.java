package days21;

import java.util.ArrayList;

// 컬렉션 프레임워크의 저장 방식
// 일반적으로 컬렉션 클래스의 객체에는 프로그램에서 처리 운영되는 데이터를 저장하게됩니다.
// 에러타입이 혼용되어 저장은 가능하지만, 실제로 혼용되어 저장되는 경우는 거의 없습니다.
// 컬렉션 클래스의 입력, 반환에 관련한 모든 메서드들은 Object타입을 기반으로 하기 때문에
// 컬렉션에서 데이터 인출(.get())시에 강제 형변환을 해야하는 불편함이 존재합니다.
// 이러한 문제점을 해결하기 휘애 JDK 1.5 버전 이후에는 제넥의 문법을 지원합니다.

// 제네릭 문법을 사용하지 않은 ArrayList의 사용
// ArrayList a = new ArrayList();
// a.add(100);
// Integer i = (Integer)a.get(0); // 다시 꺼내어 쓸떄 형변환이 반드시 필요

// 제네릭 문법
// 동일한 이름의 클래스이지만
// 객체 생성시점에 ... 자료형을 지정하여 서로 다른 자료형을 지원하는 클래스를 생성할 수 있는 문법
// (메서드 오버로딩과 유사한 문법)

// 제네릭 문법을 사용한 ArrayList 클래스의 객체 생성 예시
// ArralyList <Integer> a = new ArrayList<>();
// a.add(100);
// Integer i = a.get(0);

public class Collection05 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		// 제네릭을 쉽게 설명하면.. ArrayList에 저장될 자료형을 결정짓는 결정자라고 표현합니다.
		// 제네릭타입이 지정된 컬렉션 객체의 Object타입을 받는 메서드들은
		// 해당 자료형을 처리할 수 있는 입력/반환 메서드로 변경됩니다.
		a.add(10);
		int i0  = a.get(0);
		// a.add(1.1); x
		// a.add("Hello"); x
		System.out.printf("i0 ->%d\n", i0);

	}

}
