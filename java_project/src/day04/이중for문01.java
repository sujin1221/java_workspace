package day04;

public class 이중for문01 {

	public static void main(String[] args) {
		/* 별찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 5 * 5로 별찍기
		 * 
		 * */
		for(int i=1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println( ); //줄바꿈용
		}
       System.out.println("-----------");
     
/* *
 * **
 * ***
 * ****
 * *****
 * */
     for(int i=1;i<=5;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     System.out.println("-----------");
     
     for(int i=1;i<=5;i++) {
    	 for(int j=1;j<=5;j++) {
    		 System.out.print("*");
    		 if(i==j) {
    			 break;
    		 }
    	 }
    	 System.out.println();
     }
     System.out.println("-----------");
     
   /*    * i=1,o=4,*=1
    *    ** i=2, o=3,*=2
    *   *** i=3, o=2, *=3
    *  ****  i=4, o=1,*=4        
    * ****** i=5,o=0, *=5
    * */    
     //if문을 이용하는 방법
       for(int i=1;i<=5;i++) {
    	   for(int j=1;j<=5;j++) {
    		       if(j<=5-i) {
    		    	   System.out.print(" ");
    		       } else {
    		    		   System.out.print("*");
    		    	   }   			  			  
    		  }
    	   }
    	   System.out.println();  	   
    	   
    //for문 이용하는 방법
//     for(int j=1;j<=5-i;j++) {
//    	 System.out.println("");
//    	 
//     }
//    for(int k=1;k<i;i++){ 
//    	System.out.print("*");
//    }
//     System.out.println(); //줄바꿈
     
     
     
       
       
       
       
       
	}

}
