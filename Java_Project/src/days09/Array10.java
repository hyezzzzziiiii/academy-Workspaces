package days09;

import java.util.Random;

public class Array10 {

	public static void main(String[] args) {
		Random rd = new Random();
		// int a = rd.nextInt();
		// System.out.println(a);
		int [] a = new int[6];
		int i, j, t;
		
		for(int k=1; k<=5; k++)	{ //5세트 나오게하는 반복실행문
			
		for(i=0; i<a.length; i++) {
			a[i] = rd.nextInt();
			if(a[i] < 0) a[i] = a[i]*-1;
			a[i] = a[i]% 45 +1;
			// 방금 추첨한 번호를 앞서 추첨한 번호들과 비교하기위한 반복실행
			for(j=0; j<=i-1; j++) {
				
				// i =0일때  j는 0부터 -1까지 이므로 한번도 실행하지않음
				// i =1일때  j는 0부터 0까지이므로  j=0일때 한번 실행
				// i =2일때  j는 0부터 1까지 이므로 j=0, j=1 일때 두번 실행
				//...
				if(a[j]==a[i]) break; // 반복실행동안 두 숫자를 비교하고 같은 값이 나오면 반복 멈춤
				
			} // 반복이 멈추는 경우는 앞선 추첨번호와 같은 값이 나왔거나, 반복실행이 끝까지 진행됬거나
			// 같은 추첨번호가 존재하지않아 끝까지 반복실행을 진행하고 반복을 멈춘 경우는 i==j
			// 같은 추첨번호가 존재해서 중간에 반복실행이 멈춘경우는 i !=j
			if(i != j) i--;  // 상당히 위험한 행동
			
		}
		
         for(i=0; i<a.length; i++) { 
        	 for(j=i+1; j<a.length; j++) { 
        		 if(a[i] > a[j]) {
        			 t = a[i];
        			 a[i] = a[j];
        			 a[j] = t;
        	     }  
              } 
	       }  
		
		for (i = 0; i<a.length; i++) 
				System.out.printf("%2d ", a[i]);
		        System.out.println();
		}
		
		/*int i, j, t;
        for(i=0; i<a.length; i++) { 
       	 for(j=i+1; j<a.length; j++) { 
       		 if(a[i] >a[j]) {
       			 t = a[i];
       			 a[i] = a[j];
       			 a[j] = t;
       	     }  
             }  
	       }  
         for( int p:a)  System.out.printf("%2d ", p);
         
		System.out.println(); */
	}

}
