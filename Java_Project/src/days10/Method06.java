package days10;

public class Method06 {
    // Call by Reference 방식의 메소드 호출
	// 메소드의 매개변수로, 참조 변수의 값을 넘겨주는 방식(배열 이름 변수 , String 참조 변수 , Class참조변수 등)
	// 호출된 메소드에서 참조값을 사용해 값을 변경하게 되면 호출한 곳이 가리키는 곳의 메모리에 직접 반영됩니다.
	// 따라서 호출된 메소드가 변경된 값은 main에서도 적용받게 되는 결과를 얻습니다.
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int[] arr = {111, 222, 333}; //heap영역에 저장		
		System.out.printf("\nmain 메소드 : ");
		for(int i= 0; i< arr.length; i++)
			System.out.printf("arr[%d] = %d\t", i, arr[i]);
		
		updateValue(arr); // arr=레퍼런스
		System.out.printf("\nmain 메소드 : ");
		for(int i= 0; i< arr.length; i++)
			System.out.printf("arr[%d] = %d\t", i, arr[i]);
		System.out.println("\n프로그램 종료");
	}// 레퍼런스 변수가 전달인수라면, 매개변수도 그 주소를 저장할 레퍼런스 변수이어야 합니다.
	 // 주소를 전달한 데이터들은 전달된 지역의 명령들에 자료를 공유또는 노출하는 것과 마찬가지 입니다.
	
	public static void updateValue(int[]brr) {
		brr[0]=100; brr[1]=200; brr[2]=300;
		System.out.printf("\nupdateValue 메소드 : ");
		for(int i= 0; i< brr.length; i++)
		System.out.printf("brr[%d] = %d\t", i, brr[i]);
	}
}
