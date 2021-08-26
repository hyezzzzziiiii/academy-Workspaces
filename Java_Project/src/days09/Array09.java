package days09;

public class Array09 {

	public static void main(String[] args) {
		// 배열에 있는 값들 중 가장 큰값과 작은 값을 찾아서 출력하세요
		 /* int[] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
         int max=0; // 가장 큰 값을 저장할 변수
         for(int i=0; i<a.length; i++) { 
        	 if(max<a[i] ) max = a[i];
        	 System.out.printf("%d ", max);
         }// a.length = int[]에 저장된 숫자 수
         System.out.println("\n가장 큰값: " + max); */
         
         int[] a = {-56, -87, -96, -87, -45, -89, -69, -36, -13, -98};
         // int max=-210000000; 
         int max = a[0]; //첫번째 값으로 설정하고 2번째값부터 비교 ->가장큰값이 남게됨
         for(int i=1; i<a.length; i++) { 
        	 if(max<a[i] ) max = a[i];
        	 System.out.printf("%d ", max);
         }
         System.out.println("\n가장 큰값: " + max);  
         //0만 출력, max가 0인데 a가 음수
         // max를 설정한 값보다 작음 음수로 설정하면 값구할 수 있음
         // ex)-210000000
         
         int min = a[0];
         for(int i=1; i<a.length; i++) { 
        	 if(min>a[i] ) min = a[i];
        	 System.out.printf("%d ", min);
         }
         System.out.println("\n가장 작은 값: " + min);  
         
         // 배열의 값들을 오름차순 또는 내림차순으로 재배치(정렬)하시오
         // int []a =  {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
         // i 를 첨자로한 값과 그 뒤에 있는 j를 첨자로 한 값들을 모두 비교하여 i번째값보다 작은 숫자가 나오면
         // 그 둘의 값을 맞바꿔서 작은 값이 앞으로 오게 합니다.
         // j가 마지막 첨자까지 도달했을 떄 i번째 에는 가장 작은 숫자가 저장되어 있습니다.
         
         // a = 30; b=50;
         // a=b;  X ->  b값이 a에 대입되는 순간 a가 갖고 있떤 30은 사라집니다.
         // b=a;  X ->  a에는 50이 저장되어 있으므로, b에 대입하는 건 같은 값을 대입하는 동작입니다
         
         // t=a; a변수의 값 t에다가 복사
         // a=b;
         // b=t;
         
         int i, j, t;
         for(i=0; i<a.length; i++) { 
        	 for(j=i+1; j<a.length; j++) { 
        		 if(a[i] >a[j]) {
        			 t = a[i];
        			 a[i] = a[j];
        			 a[j] = t;
        	     }  // if문의 끝
              }  // j반복문의 끝
	       }  // i문의 끝
          for( i=0; i<a.length; i++)  System.out.printf("%d ", a[i]);
   }
}