package days07;

public class ControllOp_For15 {

	public static void main(String[] args) {
		//1부터 100사이에 있는 소수(prime number)를 출력하세요
		
		int i, j;
		int count = 0;
		
			// i변수에 대하여)
			// 1 : 1부터 1까지의 숫자를 이용하여 i값 1을 나눈 나머지를 계산하고 결과가 0인경우가 두번이었는지
			// 2 : 1부터 2까지의 숫자를 이용하여 i값 2로 나눈 나머지를 계산하고 결과가 0인경우가 두번이었는지
			// 3 : 1부터 3까지의 숫자를 이용하여 i값 3로 나눈 나머지를 계산하고 결과가 0인경우가 두번이었는지
			// ....
			// 100 : 1부터 2까지의 숫자를 이용하여 i값 100로 나눈 나머지를 계산하고 결과가 0인경우가 두번이었는지
			// 나눈 나머지 결과가 딱 2번이었던 숫자만 출력
		
		for(i=1; i <= 100; i++) {
			count = 0;  //새로운 i값이 등장했다면 처음부터 다시 카운트해야하므로 0을 대입
			for(j=1; j<=i; j++) {
				if(i%j == 0) count ++;
			}
			if(count == 2) System.out.printf("%d ", i);   // i 값이 두개인지 판단
			if(i % 100 == 0) System.out.println();
         } 
		
		
		 for(i=1; i <= 100; i++) {
			count = 0;  //새로운 i값이 등장했다면 처음부터 다시 카운트해야하므로 0을 대입
			for(j=2; j<=i-1; j++) {
				if(i%j == 0) count ++;
			}
			if(count == 0) System.out.printf("%d ", i);   
			if(i % 100 == 0) System.out.println();
         } 
		
		
		for(i=1; i <= 100; i++) {
			count = 0;  
				for(j=2; j<=i/2; j++) {
					if(i%j == 0) count ++;
				}
			if(count == 0) System.out.printf("%d ", i);   
			if(i % 100 == 0) System.out.println();
         }
	}

}
