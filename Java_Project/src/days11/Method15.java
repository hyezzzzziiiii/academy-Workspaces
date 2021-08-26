package days11;

public class Method15 {

	public static void main(String[] args) {
         int [] a = {56,87,96,59,25,48,13};
         int tot = 0;
         double ave;
         tot = sum(a);
         ave = average(a);
         prn(tot, ave);
         
         int [] s = sort(a);
         System.out.println("\n원본 : ");
         for(int i =0; i<s.length; i++) System.out.printf("%d ", a[i]);
         System.out.println("\n사본 : ");
         for(int i =0; i<s.length; i++) System.out.printf("%d ", s[i]);
	}
	public static int [] sort(int [] k) {
		int [] k1 = new int[k.length];  //전달된 배열과 같은 크기의 배열생성
		for(int i =0; i < k.length; i++) k1[i] = k[i];  // 배열의 복사
		
		for(int i =0; i<k1.length; i++) {  //복사본을 이용한 정렬
			for(int j=i+1; i<k1.length; i++) {
				if(k1[i]<k1[j]) {
					int t = k1[i];  // k[i]
					k1[i] = k1[j];  
					k1[j] = t;
							
				}
			}
		}
		return k1;  //정렬된 복사본 리턴
	}
	public static int sum(int [] b) {
		int tot =0;		
		for(int i =0; i<b.length; i++)
			tot = tot + b[i];				
		return tot;
	}
    public static double average(int [] c) {
    	double ave = 0.0;
          ave = sum(c)/3.0;  	
    	return ave;
    	  			
    }
	public static void prn(int tot, double ave){
		System.out.printf("합계 : %d, 평균 : %.2f", tot, ave);
	}
}
