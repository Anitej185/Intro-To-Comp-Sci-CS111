// @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200


import java.util.Arrays;
public class TwoSmallest {

	public static void main(String[] args) {
		
		double a1;
		double a2;
		a1 = a2 = Double.MAX_VALUE;
		
		for(int i = 0; i < args.length; i++)
		{
			double num = Double.parseDouble(args[i]);
			if (num < a1)
			{
				a2 = a1;
				a1 = num;
				
			}
			else if(num < a2)
			{
				a2 = num;
			}
		}
		
		System.out.println(a1);
		System.out.println(a2);
	}
	
	

}
