package days06;

public class ControllOP_For06 {

	public static void main(String[] args) {
		// 1부터 100사이의 홀수의 합을 계산하시오
		
		int i, sum = 0;
		// 방법1) 
	    for(i=1; i<=100; i++) {
	    	if(i%2==1) {
	    		sum = sum+i;
	    		System.out.println("1부터" + i +"까지의 홀수의 합 : " + sum );
	    	}
	    }

	    // 방법 2)
	    for(i=1; i<=100; i+=2) {   // i+=2 는 2씩늘어나는 것
	    		sum = sum+i;
	    		System.out.println("1부터" + i +"까지의 홀수의 합 : " + sum );
	    }
	   
	    // continue : 반복실행문 안에서 continue 라는 명령을 마나면, 현재 반복실행을 중단하고 
	    // 다음 반복실행으로 진행
	    // 반복실행 안에서의 break 명령 : 현재 진행중인 반복실행을 멈추고 다음의 추가적이 ㄴ반복실행도 종료
	    // 방법 3)
	    for(i=1;i<+100;i++) {
	    	if(i%2==0) continue;  //i가 짝수이면 더이상 현재 반복을 진행하지 말고 다음 반복진행
	    	sum = sum+i;
    		System.out.println("1부터" + i +"까지의 홀수의 합 : " + sum );
	    }
	}

}
