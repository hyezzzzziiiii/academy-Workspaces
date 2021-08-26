package days11;

public class Method21 {

	public static void main(String[] args) {
        int[] resultSort = sort("asc", 87,45,65,85,32,56,47);
        System.out.printf("정렬결과: ");
        for(int i = 0; i<resultSort.length; i++) 
        	System.out.printf("%d ", resultSort[i]);
        
        resultSort = sort("desc", 1,5,98,74,56,3,69,87,45,69,55,44);
        System.out.printf("\n정렬결과: ");
        for(int i = 0; i<resultSort.length; i++) 
        	System.out.printf("%d ", resultSort[i]);
	
	}
	public static int[] sort( String op, int...a) {
		if(op.equals("sort")) {
			for(int i =0; i<a.length; i++) {
				for(int j =i+1; j<a.length; j++) {
					if(a[i]>a[j]) { 
						int t =a [i];
						a[i] = a[j];
						a[j] = t;
						
					}
				}
			}			
       
		}
		return a;
}
}
