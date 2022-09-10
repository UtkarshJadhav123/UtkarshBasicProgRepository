package utkarshpro2;

public class StringReverse {

	public static void main(String[] args) {

		String str = "ABCDEFGH";
		
	    String	rev= " ";
		
		StringBuffer sc= new StringBuffer(str);
		
		System.out.println(sc.reverse());
		
	
	
	String str1 = "Aakruti";
	
    String	rev1= " ";
	
  int	len = str1.length();
	
	for(int i=len-1;i>=0;i-- )
	{
		rev1=rev1+str1.charAt(i);
	}
	
	System.out.println("The reverse string is :"+ rev1);

}}
