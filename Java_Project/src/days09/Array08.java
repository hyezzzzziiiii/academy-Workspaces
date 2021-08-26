package days09;

public class Array08 {

	public static void main(String[] args) {
	     // 배열에 들어 있는 값들의 합계와 평균을 계산하여 출력하세요.
		 int[] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
		 int tot = 0;
		 double ave;
		 for (int i = 0; i <a.length; i++) tot = tot + a[i];
		
		 ave = tot/a.length;
         // 출력 
		 // 점수 : XX, XX, XX,,,,XX
		 // 총점 : xxx
		 // 평균 : XX.X (소수점 첫째자리까지)
		 System.out.printf("점수 :\t");
			for(int i=0; i<a.length; i++) 
				System.out.printf("%d ", a[i]);
			
         System.out.printf("\n총점 : %d\n", tot);
         System.out.printf("\n평균 : %.1f\n", ave);
	}
}
