package utkarshpro2;

public class MaxvalueArray {

	public static void main(String[] args) {
       
	// MAXIMUM VALUE FIND
		
     int arr1[]= {10,52,107,25,26};	

        int max = arr1[0];
 
        for(int i=1; i<arr1.length;i++) {
        	
        	
        	if (arr1 [i]>max)
        	{
        		max=arr1[i]; 
        		
        	}
        	
        	
        }
    	System.out.println("The maximum value is  = " + max);
    	
    	System.out.println("*******************************************");


        // MINMUM VALUE FIND
    	
        int min = arr1[0];
        
        for(int i=1; i<arr1.length;i++) {
        	
        	
        	if (arr1 [i]<min)
        	{
        		min=arr1[i]; 
        	}
        
        }
    	System.out.println("The minimum value is  = " + min);

    	
    	System.out.println("*******************************************");
     
    	
    	// REVERSE ARRAY
    	
    	for(int i = 0;i<arr1.length;i++) {
    	
    	System.out.println("The original array is = "+ arr1[i]);}
    	
    	
    	System.out.println("*******************************************");

    	
    	
    	
    	for(int i=arr1.length-1;i>=0;i--)
    	{
    		System.out.println(" The new array structure is = " + arr1[i]);
    		
    	}
    	
    	
    	
    	
    	
    	
		
	}

}
