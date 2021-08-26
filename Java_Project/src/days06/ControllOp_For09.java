package days06;

public class ControllOp_For09 {

	public static void main(String[] args) {
		// 1부터 100사이 : 이전 숫자와 다음숫자가 세트를 이루는 수열을 출력하세요.
		// 출력 예 : (0,1,2)  (1,2,3)  (2,3,4)
		int i;
		for(i=1; i<=100; i++) {	 
			System.out.printf("(%3d, %3d, %3d)",i-1,i,i+1); // 3을 쓰면 3칸뒤 오른쪽 정렬
			if(i%7 == 0) System.out.println();
		}

	}

}
