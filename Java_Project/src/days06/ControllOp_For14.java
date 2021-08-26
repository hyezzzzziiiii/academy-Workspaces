package days06;

public class ControllOp_For14 {

	public static void main(String[] args) {
           for(int i = 1; i <=10; i++) { 
				for(int j=1; j<=10; j++) {
					System.out.printf("#");  
				}
			System.out.println();
           } 
           // ------------------------------------------------------
           
           for(int i = 1; i <=10; i++) {   // 가로로 나열한 것을 새로로 10번 나열
			
			   for(int j=1; j<=i; j++) {  //가로로 나열
					System.out.printf("#");   
				}
			System.out.println(); 
	        }  
           // ------------------------------------------------------
           
           for(int i = 10; i <=1; i--) {   
   			
	    	   for(int j=1; j<=i; j++) {  
	    			System.out.printf("#");   
	    			}
    			System.out.println();
    	     } 
           // ------------------------------------------------------
           
           for(int i = 1; i <=10; i++) {   
      			
        	   for(int j=i; j<=10; j++) {  
        			System.out.printf("#");   
        			}
        			System.out.println();
        	  } 
        // ------------------------------------------------------
          
           for(int i = 10; i >=1; i--) {          	  
	        	   for(int j=1; j<=10; j++) { 
	        		   if(j<i) System.out.printf("  ");  //명령프롬프트로 확인
	        		   else System.out.printf("#");   
	   			       }
   			       System.out.println();
   	            }
         // ------------------------------------------------------ 
           for(int i = 1; i <=10; i++) {   
	        	   for(int j=1; j<=10; j++) { 
	        		   if(j<i) System.out.printf("  "); 
	        		   else System.out.printf("#");   
	   			       }
   			       System.out.println();
   	        }
        // ------------------------------------------------------         
           for(int i=10; i >=1; i--) {    
	            for(int j=1; j<=20-i; j++) { 
	    		   if(j<i) System.out.printf("  "); 
	    		   else System.out.printf("#");   
				       }
			       System.out.println();
	        }
   }
}
