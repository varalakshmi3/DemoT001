package java_practice;

public class CharacterToNumberAddition {

	public static void main(String[] args) {
		String str="dfhasjfh56565fafds56gryr";
		char[] ch=str.toCharArray();
		int total=0;
		for(int i=0;i<ch.length;i++)
		{
			total=total+Character.getNumericValue(ch[i]);
		}
		System.out.println(total);

	}

}
