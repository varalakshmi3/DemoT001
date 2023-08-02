package java_practice;

public class Strins {

	public static void main(String[] args) {
		String str="vara lakshmi 23 565 devi";
		int sum=0;
		     String [] str1=str.split("\\s+");
				
				  for(int i=0;i<str1.length;i++) 
				  {
					  if(str1[i].matches("\\d+"))
					  {
				  sum=sum+Integer.parseInt(str1[i]);
				  }
					  }
				  System.out.println(sum);
				 
				/*
				 * for(String element:str1)
				 * 
				 * { if(element.matches("\\d+")) { sum+=Integer.parseInt(element); }
				 * 
				 * } System.out.println(sum);
				 */
	}

}
